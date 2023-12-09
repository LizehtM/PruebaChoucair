package co.com.choucair.certificacion.PruebaChoucair.interactions;

import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.ProductCreations;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.File;

import static co.com.choucair.certificacion.PruebaChoucair.userinterfaces.ProductCreations.*;


public class UploadImage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        File file = new File("C:\\Users\\Lizeht M\\Pictures\\camisa.png");
        String path =file.getAbsolutePath();
        actor.attemptsTo(Enter.theValue(path).into(IMG_ADD_PRODUCTS));


    }

    public static UploadImage uploadImage(){
        return Tasks.instrumented(UploadImage.class);
    }}
