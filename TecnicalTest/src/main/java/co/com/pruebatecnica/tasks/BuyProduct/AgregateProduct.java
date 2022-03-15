package co.com.pruebatecnica.tasks.BuyProduct;

import co.com.pruebatecnica.userinterfaces.HomePageObject;
import co.com.pruebatecnica.utils.Robote;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.awt.*;

import static co.com.pruebatecnica.utils.WaitAction.waitAction;

public class AgregateProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePageObject.PRODUCT, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        waitAction(2);
        try {
            for(int i=0; i<3; i++){
                Robote.clicMouse(1380,720);
            }
            waitAction(2);
            Robote.clicMouse(414,720);
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public static AgregateProduct toBuy() {
        return Tasks.instrumented(AgregateProduct.class);
    }


}
