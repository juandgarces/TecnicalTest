package co.com.pruebatecnica.questions.BuyProduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.*;
import static co.com.pruebatecnica.userinterfaces.ShoppingCar.*;
import static co.com.pruebatecnica.userinterfaces.ShoppingCar.TITLE;
import static co.com.pruebatecnica.utils.WaitAction.waitAction;

public class ValidateShoppingCar implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        waitAction(4);
        actor.attemptsTo(Click.on(CART_SHOPPING));
        actor.attemptsTo(WaitUntil.the(DESCRIPTION, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(PRICE, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(REMOVE_ITEM, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(TITLE, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(SUBTOTAL, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(TOTAL, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(TO_PAY, WebElementStateMatchers.isPresent()));
        return true;
    }

    public static ValidateShoppingCar page() {
        return new ValidateShoppingCar();
    }
}
