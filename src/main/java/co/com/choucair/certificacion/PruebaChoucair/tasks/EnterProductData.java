package co.com.choucair.certificacion.PruebaChoucair.tasks;

import co.com.choucair.certificacion.PruebaChoucair.interactions.UploadImage;
import co.com.choucair.certificacion.PruebaChoucair.models.ProductData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.certificacion.PruebaChoucair.userinterfaces.ProductCreations.*;

public class EnterProductData implements Task {

    private ProductData productData;

    public EnterProductData(ProductData productData) {this.productData = productData;}

    @Override
        public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(NORTHWIND));
        actor.attemptsTo(Click.on(PRODUCTS));
        actor.attemptsTo(Click.on(BTN_NEW_PRODUCTS));
        actor.attemptsTo(Enter.theValue(productData.getProductName()).into(TXT_NAME));
        actor.attemptsTo(UploadImage.uploadImage());
        actor.attemptsTo(Click.on(NEW_SUPPLIER));
        actor.attemptsTo(Enter.theValue(productData.getCompanyName()).into(TXT_COMPANY_NAME));
        actor.attemptsTo(Click.on(BTN_SAVE_COMPANY));
        actor.attemptsTo(Click.on(SELECT_CATEGORY));
        actor.attemptsTo(Enter.theValue(productData.getCategoryName()).into(SEARCH_CATEGORY));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(SEARCH_CATEGORY));
       // actor.attemptsTo(Enter.theValue(productData.getCategoryName()).into(TXT_CATEGORY_NAME));
        //actor.attemptsTo(Click.on(BTN_SAVE_CATEGORY));
        actor.attemptsTo(Enter.theValue(productData.getUnitsInStock()).into(STOCK));
        actor.attemptsTo(Enter.theValue(productData.getUnitsOrOrder()).into(ORDER));
        actor.attemptsTo(Enter.theValue(productData.getReorderLevel()).into(LEVEL));
        actor.attemptsTo(Scroll.to(BTN_SAVE_PRODUCT));
        actor.attemptsTo(WaitUntil.the(BTN_SAVE_PRODUCT, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(BTN_SAVE_PRODUCT));



    }
    public static EnterProductData enterProductData(ProductData productData){
        return Tasks.instrumented(EnterProductData.class, productData);
    }
}
