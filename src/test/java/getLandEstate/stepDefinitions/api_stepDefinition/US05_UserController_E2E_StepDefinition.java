package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.UserController.UserE2EPatchResponsePojo;
import getLandEstate.pojos.api_pojos.UserController.UserE2EPayloadPojo;
import getLandEstate.pojos.api_pojos.UserController.UserPostResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.PatchUserPayloadPojo;
import techproed.pojos.UserPatchResponsePojo;
import techproed.pojos.UserPostResponsePojo;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.baseUrl.BaseUrl.spec;

public class US05_UserController_E2E_StepDefinition {

    UserE2EPayloadPojo payload;
    Response response;
    UserPostResponsePojo e2eActualData;
    UserE2EPatchResponsePojo actualData;
    static int userId;
    UserPostResponsePojo e2eExpectedData;

    @Given("Kayitli user ID bilgisi alinir")
    public void kayitliUserIDBilgisiAlinir() {
        spec.pathParams("first", "users", "second", "admin")
                .queryParams("size", 5, "sort", "id,desc");
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        userId = response.jsonPath().getInt("content.find{it.email=='tester@gulsum.com'}.id");
        System.out.println(userId);
    }

    @Given("Get user icin URL duzenlenir")
    public void getUserIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", userId, "third", "admin");
    }

    @And("Get user icin expected data duzenlenir")
    public void getUserIcinExpectedDataDuzenlenir() {
        e2eExpectedData = new UserPostResponsePojo(userId, "tester", "gulsum",
                "tester@gulsum.com", "(555) 777-9999");
    }

    @When("Get user icin GET request duzenlenir")
    public void getUserIcinGETRequestDuzenlenir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        e2eActualData = response.as(UserPostResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Get user icin Status kodunun {int} oldugu dogrulanir")
    public void getUserIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get user icin Response body dogrulanir")
    public void getUserIcinResponseBodyDogrulanir() {
        assertEquals(e2eExpectedData.getId(), e2eActualData.getId());
        assertEquals(e2eExpectedData.getFirstName(), e2eActualData.getFirstName());
        assertEquals(e2eExpectedData.getLastName(), e2eActualData.getLastName());
        assertEquals(e2eExpectedData.getPhone(), e2eActualData.getPhone());
        assertEquals(e2eExpectedData.getEmail(), e2eActualData.getEmail());
    }

    @Given("Patch user icin URL duzenlenir")
    public void patchUserIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", userId, "third", "role", "fourth", "admin");
    }

    @And("Patch user icin expected data duzenlenir")
    public void patchUserIcinExpectedDataDuzenlenir() {
        payload = new UserE2EPayloadPojo("ADMIN");
    }

    @When("Patch user icin PATCH request duzenlenir")
    public void patchUserIcinGETRequestDuzenlenir() {
        response = given(spec).body(payload).when().patch("{first}/{second}/{third}/{fourth}");
        actualData = response.as(UserE2EPatchResponsePojo.class);
        userId = actualData.getId();
        response.prettyPrint();
    }

    @Then("Patch user icin Status kodunun {int} oldugu dogrulanir")
    public void patchUserIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Patch user icin Response body dogrulanir")
    public void patchUserIcinResponseBodyDogrulanir() {
        assertEquals(payload.getRole(), actualData.getRole());
    }


    @Given("Kayitli hesabi silmek icin URL duzenlenir")
    public void kayitliHesabiSilmekIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", userId, "third", "admin");
    }

    @When("Kayitli hesabi silmek icin DELETE request gonderilir ve response alinir")
    public void kayitliHesabiSilmekIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Kayitli hesabi silmek icin Status kodunun {int} oldugu dogrulanir")
    public void kayitliHesabiSilmekIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}
