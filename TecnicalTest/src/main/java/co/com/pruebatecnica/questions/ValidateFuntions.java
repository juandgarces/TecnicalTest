package co.com.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.*;

public class ValidateFuntions implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        actor.attemptsTo(WaitUntil.the(SEARCH_OPTIONS, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(CART_SHOPPING, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(PROFILE, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(WaitUntil.the(LOGIN, WebElementStateMatchers.isPresent()));
        return true;
    }

    public static ValidateFuntions page() {
        return new ValidateFuntions();
    }
}
