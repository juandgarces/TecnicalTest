package co.com.pruebatecnica.questions.BuyProduct;

import co.com.pruebatecnica.userinterfaces.HomePageObject;
import co.com.pruebatecnica.userinterfaces.ShoppingCar;
import co.com.pruebatecnica.utils.Robote;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.awt.*;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.CART_SHOPPING;
import static co.com.pruebatecnica.userinterfaces.ShoppingCar.*;
import static co.com.pruebatecnica.utils.WaitAction.waitAction;

public class ValidateIncreasesStok implements Question<Boolean> {

    private static String stock;

    public ValidateIncreasesStok(String stock){
        this.stock = stock;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        waitAction(4);
        actor.attemptsTo(Click.on(CART_SHOPPING));
        actor.attemptsTo(WaitUntil.the(DESCRIPTION, WebElementStateMatchers.isPresent()));
        double value = Double.valueOf(Text.of(SUBTOTAL_VALUE).viewedBy(actor).asString().substring(1));
        try {
            waitAction(2);
            Robote.clicMouse(710,535);
            Robote.clicMouse(710,533);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        String val = String.valueOf(value*2);
        Text.of(SUBTOTAL_VALUE).viewedBy(actor).asString().equals(val);

        return true;
    }

    public static ValidateIncreasesStok page(String stock) {
        return new ValidateIncreasesStok(stock);
    }

}
