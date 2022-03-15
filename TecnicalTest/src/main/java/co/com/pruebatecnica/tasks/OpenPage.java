package co.com.pruebatecnica.tasks;

import co.com.pruebatecnica.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

    private HomePage HOMEPAGE;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(HOMEPAGE));
    }

    public static OpenPage clothesstore() {
        return Tasks.instrumented(OpenPage.class);
    }

}
