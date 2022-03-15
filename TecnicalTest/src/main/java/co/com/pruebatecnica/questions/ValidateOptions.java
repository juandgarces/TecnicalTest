package co.com.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.pruebatecnica.userinterfaces.HomePageObject;

import java.util.logging.Logger;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.TITLE;

public class ValidateOptions implements Question<Boolean> {

    private static String option1;
    private static String option2;
    private static final Logger LOGGER = Logger.getLogger(ValidateOptions.class.getName());

    public ValidateOptions(String option1, String option2){
        this.option1 = option1;
        this.option2 = option2;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        return ((Text.of(HomePageObject.MODA_INFANTILE).viewedBy(actor).asString().equals(option1)
                && Text.of(HomePageObject.PROTECCION).viewedBy(actor).asString().equals(option2)));
    }

    public static ValidateOptions present(String option1, String option2) {
                return new ValidateOptions(option1,option2);
    }
}
