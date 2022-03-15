package co.com.pruebatecnica.stepdefinitions.BuyProduct;

import co.com.pruebatecnica.questions.BuyProduct.ValidateIncreasesStok;
import co.com.pruebatecnica.questions.BuyProduct.ValidateRemoveItem;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.pruebatecnica.questions.BuyProduct.ValidateShoppingCar;
import co.com.pruebatecnica.tasks.BuyProduct.AgregateProduct;
import co.com.pruebatecnica.tasks.BuyProduct.SelectOption;
import co.com.pruebatecnica.tasks.OpenPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyProductStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user");
    }

    @Given("the user enter page CLOTHESSTORE")
    public void theUserEnterPageCLOTHESSTORE() {
        theActorInTheSpotlight().attemptsTo(OpenPage.clothesstore());
    }

    @When("the user enter the option Hombres")
    public void theUserEnterTheOptionHombres() {
        theActorInTheSpotlight().attemptsTo(SelectOption.toBuy());
    }

    @When("the user select de product")
    public void theUserSelectDeProduct() {
        theActorInTheSpotlight().attemptsTo(AgregateProduct.toBuy());
    }

    @Then("the page displays a message informing that the purchase was added to the cart")
    public void thePageDisplaysAMessageInformingThatThePurchaseWasAddedToTheCart() {
        theActorInTheSpotlight().should(seeThat(ValidateShoppingCar.page()));
    }

    @Then("the user increases in {string} the stok to buy and TOTAL increases too to double")
    public void theUserIncreasesInTheStokToBuyAndTOTALIncreasesTooToDouble(String stock) {
        theActorInTheSpotlight().should(seeThat(ValidateIncreasesStok.page(stock)));
    }

    @Then("the user remove el item of the shopping car and view the message {string}")
    public void theUserRemoveElItemOfTheShoppingCarAndViewTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(ValidateRemoveItem.page(message)));
    }
}
