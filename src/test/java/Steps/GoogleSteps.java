package Steps;

import Pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^dado que estoy en Google$")
    public void navigateToGoogle(){
    google.navigateToGoogle();
    }


    @When("^realizo una busqueda$")
    public void searchTerm(){

    }



    @And("click en Buscar$")
    public void clickSearch(){

    }



    @Then("^Then  obtengo los resultados")
    public void results(){

    }
}
