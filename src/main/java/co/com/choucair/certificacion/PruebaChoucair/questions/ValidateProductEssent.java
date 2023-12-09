package co.com.choucair.certificacion.PruebaChoucair.questions;

import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.FilterProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certificacion.PruebaChoucair.questions.ElementIsPresent.elementIsPresent;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidateProductEssent implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThat(elementIsPresent(FilterProducts.VALIDATE_PRODUCT)));
        return true;
    }
public static ValidateProductEssent validateProductEssent(){
        return new ValidateProductEssent();
}

}
