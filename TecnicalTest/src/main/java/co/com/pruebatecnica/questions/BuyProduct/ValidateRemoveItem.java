package co.com.pruebatecnica.questions.BuyProduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.CART_SHOPPING;
import static co.com.pruebatecnica.userinterfaces.ShoppingCar.*;
import static co.com.pruebatecnica.utils.WaitAction.waitAction;

public class ValidateRemoveItem implements Question<Boolean> {

    private static String message;

    public ValidateRemoveItem(String message){
        this.message = message;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        waitAction(2);
        actor.attemptsTo(Click.on(CART_SHOPPING));
        actor.attemptsTo(Click.on(REMOVE_ITEM));
        actor.attemptsTo(Click.on(CONFIRMATION));
        Text.of(MESSAGE_REMOVE).viewedBy(actor).asString().equals(message);
        return true;
    }

    public static ValidateRemoveItem page(String message) {
        return new ValidateRemoveItem(message);
    }
}
