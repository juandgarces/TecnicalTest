package co.com.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.pruebatecnica.userinterfaces.HomePageObject;

import static co.com.pruebatecnica.userinterfaces.HomePageObject.TITLE;

public class ValidateOptionMenu implements Question<Boolean> {

    private String Hombre;
    private String Mujer;
    private String Junior;
    private String Ninos;
    private String Accesorios;
    private String Ofertas;

    public ValidateOptionMenu(String Hombre, String Mujer, String Junior, String Ninos, String Accesorios, String Ofertas){
        this.Hombre = Hombre;
        this.Mujer = Mujer;
        this.Junior = Junior;
        this.Ninos = Ninos;
        this.Accesorios = Accesorios;
        this.Ofertas = Ofertas;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());

        boolean checkone =((Text.of(HomePageObject.HOMBRE_OPTION).viewedBy(actor).asString().equals(Hombre)
                && Text.of(HomePageObject.MUJER_OPTION).viewedBy(actor).asString().equals(Mujer)
                && Text.of(HomePageObject.JNIOR_OPTION).viewedBy(actor).asString().equals(Junior)));
        return ((checkone && Text.of(HomePageObject.NINOS_OPTION).viewedBy(actor).asString().equals(Ninos)
                && Text.of(HomePageObject.ACCESORIOS_OPTION).viewedBy(actor).asString().equals(Accesorios)
                && Text.of(HomePageObject.OFERTAS_OPTION).viewedBy(actor).asString().equals(Ofertas)));
    }

    public static ValidateOptionMenu isPresent(String Hombre, String Mujer, String Junior, String Ninos, String Accesorios, String Ofertas) {
        return new ValidateOptionMenu(Hombre,Mujer,Junior,Ninos,Accesorios,Ofertas);
    }
}
