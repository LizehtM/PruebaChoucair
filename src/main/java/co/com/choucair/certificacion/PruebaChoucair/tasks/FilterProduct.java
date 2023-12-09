package co.com.choucair.certificacion.PruebaChoucair.tasks;

import co.com.choucair.certificacion.PruebaChoucair.models.ProductData;
import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.FilterProducts;
import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.ProductCreations;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certificacion.PruebaChoucair.userinterfaces.ProductCreations.NORTHWIND;
import static co.com.choucair.certificacion.PruebaChoucair.userinterfaces.ProductCreations.SEARCH_CATEGORY;


public class FilterProduct implements Task {

    private ProductData productData;

    public FilterProduct(ProductData productData) {this.productData = productData;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(FilterProducts.FILTER_PRODUCTS_ORGANIZED));
        actor.attemptsTo(Enter.theValue(productData.getProductName()).into(FilterProducts.SEARCH_FILTER_PRODUCTS));

    }


    public static  FilterProduct filterProduct(ProductData productData){
        return Tasks.instrumented(FilterProduct.class, productData);
    }
}
