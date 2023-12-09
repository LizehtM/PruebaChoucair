package co.com.choucair.certificacion.PruebaChoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductCreations {

    public static final Target BTN_LOGIN = Target.the("login button").located(By.id("LoginPanel0_LoginButton"));
    public static final Target DASHBOARD = Target.the("dashboard").located(By.xpath("//section[@class='content-header']/h1"));
    public static final Target NORTHWIND = Target.the("NorthWind section").located(By.xpath("//span[contains(text(),'Northwind')]"));
    public static final Target PRODUCTS = Target.the("btn products").located(By.xpath("//ul[@id='nav_menu1_2_1']/li//span[contains(text(),'Products')]"));
    public static final Target BTN_NEW_PRODUCTS = Target.the("btn new products").located(By.xpath("//span[contains(text(),'New Product')]"));
    public static final Target TXT_NAME = Target.the("name").located(By.id("Serenity_Demo_Northwind_ProductDialog9_ProductName"));
    public static final Target IMG_ADD_PRODUCTS  = Target.the("add products").located(By.xpath("//div[@data-action='add-file']//input"));
    //div[@id='Serenity_Demo_Northwind_ProductDialog9_ProductImage']//div[@data-action='add-file']
    public static final Target  NEW_SUPPLIER = Target.the("btn new provider").located(By.xpath("//div[@class='field SupplierID']/a"));
    public static final Target  TXT_COMPANY_NAME = Target.the("company name").located(By.id("Serenity_Demo_Northwind_SupplierDialog48_CompanyName"));
    public static final Target  BTN_SAVE_COMPANY = Target.the("btn save company").located(By.xpath("//div[@id='Serenity_Demo_Northwind_SupplierDialog48_Toolbar']//span[contains(text(),'Save')]"));
    public static final Target  SELECT_CATEGORY = Target.the("select category").located(By.id("select2-chosen-5"));
    public static final Target  SEARCH_CATEGORY = Target.the("search category").located(By.id("s2id_autogen5_search"));

    public static final Target TXT_CATEGORY_NAME = Target.the( "name category").located(By.xpath("Serenity_Demo_Northwind_CategoryDialog48_CategoryName"));
    public static final Target  NEW_CATEGORY = Target.the("btn new category").located(By.xpath("//div[@class='field CategoryID']/a"));
    public static final Target  BTN_SAVE_CATEGORY = Target.the("btn save category").located(By.xpath("//div[@id='Serenity_Demo_Northwind_CategoryDialog170_Toolbar']//span[contains(text(),'Save')]"));
    public static final Target  STOCK = Target.the("stock").located(By.id("Serenity_Demo_Northwind_ProductDialog9_UnitsInStock"));
    public static final Target  ORDER = Target.the("order").located(By.id("Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder"));
    public static final Target  LEVEL = Target.the("level").located(By.id("Serenity_Demo_Northwind_ProductDialog9_ReorderLevel"));
    public static final Target  BTN_SAVE_PRODUCT = Target.the("tn save product").located(By.xpath("//div[@data-action='save-and-close']//span"));




}
