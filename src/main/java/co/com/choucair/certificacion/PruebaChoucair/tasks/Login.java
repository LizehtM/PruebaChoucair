package co.com.choucair.certificacion.PruebaChoucair.tasks;

import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.ProductCreations;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.choucair.certificacion.PruebaChoucair.utils.constants.Urls.urlStartSharp;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url(urlStartSharp));
        actor.attemptsTo((Click.on(ProductCreations.BTN_LOGIN)));
        actor.attemptsTo(Ensure.that(ProductCreations.DASHBOARD).isEnabled());
    }
     public static Login login(){
        return Tasks.instrumented(Login.class);
     }
}
