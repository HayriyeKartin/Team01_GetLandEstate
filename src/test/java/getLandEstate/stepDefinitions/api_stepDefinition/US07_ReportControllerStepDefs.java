package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.ReportController.UserPostResponsePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US07_ReportControllerStepDefs {
    Response response;
    UserPostResponsePojo actualData;

    @Given("Report Controller icin URL duzenlenir")
    public void reportControllerIcinURLDuzenlenir() {
        spec.pathParams("first", "report");
    }




    @When("Report Controller icin GET request gonderilir ve response alinir")
    public void reportControllerIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}");
        actualData = response.as(UserPostResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Report Controller icin Status kodunun {int} oldugu dogrulanir")
    public void reportControllerIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());

    }
}
