package co.com.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.pruebatecnica.userinterfaces.HomePageObject.TITLE;

public class ValidateLoad implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());

        return true;
    }

    public static ValidateLoad page() {
        return new ValidateLoad();
    }
}
