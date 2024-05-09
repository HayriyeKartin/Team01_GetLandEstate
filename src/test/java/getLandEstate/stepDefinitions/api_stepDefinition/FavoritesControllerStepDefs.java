package getLandEstate.stepDefinitions.api_stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FavoritesControllerStepDefs {
    @Given("Get Favorites icin URL duzenlenir")
    public void getFavoritesIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/favorites/auth

    }

    @And("Get Favorites icin expected data duzenlenir")
    public void getFavoritesIcinExpectedDataDuzenlenir() {
    }

    @When("Get Favorites icin GET request gonderilir ve response alinir")
    public void getFavoritesIcinGETRequestGonderilirVeResponseAlinir() {
    }

    @Then("Get Favorites icin Status kodunun {int} oldugu dogrulanir")
    public void getFavoritesIcinStatusKodununOlduguDogrulanir(int arg0) {
    }

    @And("Get Favorites icin Response body dogrulanir")
    public void getFavoritesIcinResponseBodyDogrulanir() {
    }

    @Given("Delete Favorites icin URL duzenlenir")
    public void deleteFavoritesIcinURLDuzenlenir() {
    }

    @When("Delete Favorites icin DELETE request gonderilir ve response alinir")
    public void deleteFavoritesIcinDELETERequestGonderilirVeResponseAlinir() {
    }

    @Then("Delete Favorites icin Status kodunun {int} oldugu dogrulanir")
    public void deleteFavoritesIcinStatusKodununOlduguDogrulanir(int arg0) {
    }
}
