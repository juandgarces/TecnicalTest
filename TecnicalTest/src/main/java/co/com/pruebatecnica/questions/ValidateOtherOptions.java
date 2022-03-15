package co.com.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.pruebatecnica.userinterfaces.HomePageObject;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.TITLE;

public class ValidateOtherOptions implements Question<Boolean> {

    private static String otheroptions;

    private ValidateOtherOptions(String otheroptions){
        this.otheroptions = otheroptions;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        return (Text.of(HomePageObject.OTHER_OPTIONS).viewedBy(actor).asString().equals(otheroptions));
    }

    public static ValidateOtherOptions present(String otheroptions) {
        return new ValidateOtherOptions(otheroptions);
    }
}
