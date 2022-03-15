package co.com.pruebatecnica.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.pruebatecnica.questions.*;
import co.com.pruebatecnica.tasks.OpenPage;

import java.util.function.Predicate;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.pruebatecnica.userinterfaces.HomePageObject.BANNER_1;

public class HomePageStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user");
    }

    @When("the user enter the aplicative")
    public void theUserEnterTheAplicative() {
        theActorInTheSpotlight().attemptsTo(OpenPage.clothesstore());
    }

    @When("the user enter the page CLOTHESSTORE")
    public void theUserEnterThePageCLOTHESSTORE() {
        theActorInTheSpotlight().attemptsTo(OpenPage.clothesstore());
    }


    @Then("loade the page CLOTHESSTORE")
    public void loadeThePageCLOTHESSTORE() {
        theActorInTheSpotlight().should(seeThat(ValidateLoad.page(), Predicate.isEqual(true)));
    }

    @Then("view the option menu {string}, {string}, {string}, {string}, {string} and {string}")
    public void viewTheOptionMenuAnd(String Hombre, String Mujer, String Junior, String Ninos, String Accesorios, String Ofertas) {
        theActorInTheSpotlight().should(seeThat(ValidateOptionMenu.isPresent(Hombre,Mujer,Junior,Ninos,Accesorios,Ofertas)));
    }


    @Then("view the option {string} and {string}")
    public void viewTheOptionAnd(String option1, String option2) {
        theActorInTheSpotlight().should(seeThat(ValidateOptions.present(option1,option2),Predicate.isEqual(true)));
    }

    @Then("view the option {string}")
    public void viewTheOption(String otheroptions) {
        theActorInTheSpotlight().should(seeThat(ValidateOtherOptions.present(otheroptions)));
    }

    @Then("view the search option, shopping cart, profile and login")
    public void viewTheSearchOptionShoppingCartProfileAndLogin() {
        theActorInTheSpotlight().should(seeThat(ValidateFuntions.page(), Predicate.isEqual(true)));
    }
}
