package co.com.choucair.certificacion.PruebaChoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterProducts {
    public static final Target FILTER_PRODUCTS_ORGANIZED = Target.the("Filter products organized").located(By.xpath("//span[contains(text(),'Product Name')]"));
    public static final Target  SEARCH_FILTER_PRODUCTS = Target.the("Search filter Products").located(By.id("Serenity_Demo_Northwind_ProductGrid0_QuickSearchInput"));
    public static final Target VALIDATE_PRODUCT = Target.the("Validate filter").located(By.xpath("//a[contains(@class,'s-EditLink ')]"));
}
