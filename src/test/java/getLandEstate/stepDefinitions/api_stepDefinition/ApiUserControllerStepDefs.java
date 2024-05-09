package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.UserController.UserPayloadPojo;
import getLandEstate.pojos.api_pojos.UserController.UserPostResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class ApiUserControllerStepDefs {
    UserPayloadPojo payload;
    UserPostResponsePojo actualData;
    Response response;
    static int userId;
    UserPostResponsePojo expectedData;

    @Given("User Register icin URL duzenlenir")
    public void userRegisterIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", "register");
    }

    @And("User Register icin payload duzenlenir")
    public void userRegisterIcinPayloadDuzenlenir() {
        payload = new UserPayloadPojo("Customer", "Selahattin", "(555) 888-4441", "Password1*", "admin2@selahattin.com");
    }

    @When("User Register icin POST request gonderilir ve Response alinir")
    public void userRegisterIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(UserPostResponsePojo.class);
        response.prettyPrint();
    }

    @Then("User Register icin Status kodunun {int} oldugu dogrulanir")
    public void userRegisterIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("User Register icin Response body dogrulanir")
    public void userRegisterIcinResponseBodyDogrulanir() {
        assertEquals(payload.getFirstName(), actualData.getFirstName());
        assertEquals(payload.getLastName(), actualData.getLastName());
        assertEquals(payload.getPhone(), actualData.getPhone());
        assertEquals(payload.getEmail(), actualData.getEmail());
    }

    @Given("Get User icin URL duzenlenir")
    public void getUserIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", userId, "third", "admin");
    }

    @And("Get User icin expected data duzenlenir")
    public void getUserIcinExpectedDataDuzenlenir() {
        expectedData = new UserPostResponsePojo(userId, "Customer", "Selahattin", "admin2@selahattin.com", "(555) 888-4441");

    }

    @When("Get User icin GET request duzenlenir")
    public void getUserIcinGETRequestDuzenlenir() {
        response = given(spec).when().get("{first}/{second}/{third}"); //var olan response u kullandık
        actualData = response.as(UserPostResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Get User icin Status kodunun {int} oldugu dogrulanir")
    public void getUserIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get User icin Response body dogrulanir")
    public void getUserIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        assertEquals(expectedData.getLastName(), actualData.getLastName());
        assertEquals(expectedData.getPhone(), actualData.getPhone());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
    }

    @Given("Kendi hesabini silmek icin URL duzenlenir")
    public void kendiHesabiniSilmekIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", "auth");
    }

    @When("Kendi hesabini silmek icin DELETE request gonderilir ve response alinir")
    public void kendiHesabiniSilmekIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Kendi hesabini silmek icin Status kodunun {int} oldugu dogrulanir")
    public void kendiHesabiniSilmekIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}