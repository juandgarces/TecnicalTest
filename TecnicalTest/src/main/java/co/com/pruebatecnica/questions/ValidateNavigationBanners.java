package co.com.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.*;

public class ValidateNavigationBanners implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(BUTTON_NEXT, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        actor.attemptsTo(Click.on(BUTTON_NEXT));
        actor.attemptsTo(WaitUntil.the(BANNER_2, WebElementStateMatchers.isPresent()));
        return true;
    }

    public static ValidateNavigationBanners page() {
        return new ValidateNavigationBanners();
    }
}
