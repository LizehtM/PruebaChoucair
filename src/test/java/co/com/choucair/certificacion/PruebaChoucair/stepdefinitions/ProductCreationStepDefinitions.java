package co.com.choucair.certificacion.PruebaChoucair.stepdefinitions;

import co.com.choucair.certificacion.PruebaChoucair.models.ProductData;
import co.com.choucair.certificacion.PruebaChoucair.questions.ValidateProductEssent;
import co.com.choucair.certificacion.PruebaChoucair.tasks.EnterProductData;
import co.com.choucair.certificacion.PruebaChoucair.tasks.FilterProduct;
import co.com.choucair.certificacion.PruebaChoucair.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ProductCreationStepDefinitions {

    @Before
    public void SetUp() {
        OnStage.setTheStage(new OnlineCast()); //preparando el escenario donde realizaran las pruebas
        OnStage.theActorCalled("Actor"); // definiendo el actor
    }

    @Given("the user enters the StartSharp page and logs in")
    public void theUserEntersTheStartSharpPageAndLogsIn() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.login());


    }

    @When("the user creates a product")
    public void theUserCreatesAProduct(DataTable productData) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterProductData.enterProductData(new ProductData(productData)));
        OnStage.theActorInTheSpotlight().attemptsTo(FilterProduct.filterProduct(new ProductData(productData)));
    }

    @Then("validate that the creation of the product is successful")
    public void validateThatTheCreationOfTheProductIsSuccessful() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateProductEssent.validateProductEssent()));


    }
}
