package co.com.pruebatecnica.tasks.BuyProduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.pruebatecnica.userinterfaces.HomePageObject;

public class SelectOption implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePageObject.HOMBRE_OPTION, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        actor.attemptsTo(Click.on(HomePageObject.HOMBRE_OPTION));
    }

    public static SelectOption toBuy() {
        return Tasks.instrumented(SelectOption.class);
    }
}
