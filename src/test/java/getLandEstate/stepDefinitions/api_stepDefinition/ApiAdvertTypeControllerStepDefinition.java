package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.AdvertTypeController.AdvertTypePayloadPojo;
import getLandEstate.pojos.api_pojos.AdvertTypeController.AdvertTypePostResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class ApiAdvertTypeControllerStepDefinition {

    AdvertTypePayloadPojo payload;
    Response response;
    AdvertTypePostResponsePojo actualData;
    static int advertTypeId;
    AdvertTypePostResponsePojo expectedData;


    @Given("Create Advert Type icin URL duzenlenir")
    public void createAdvertTypeIcinURLDuzenlenir() {
        spec.pathParam("first", "advert-types");
    } //http://www.getlandestate.com:8092/advert-types

    @And("Create Advert Type icin payload duzenlenir")
    public void createAdvertTypeIcinPayloadDuzenlenir() {
        payload = new AdvertTypePayloadPojo("Akilli Ev");
    }

    @When("Create Advert Type icin POST request gonderilir ve Response alinir")
    public void createAdvertTypeIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}");
        actualData = response.as(AdvertTypePostResponsePojo.class);
        advertTypeId = actualData.getId();
        response.prettyPrint();
    }

    @Then("Create Advert Type icin Status kodunun {int} oldugu dogrulanir")
    public void createAdvertTypeIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Create Advert Type icin Response body dogrulanir")
    public void createAdvertTypeIcinResponseBodyDogrulanir() {
        assertEquals(payload.getTitle(), actualData.getTitle());
    }

    @Given("Get Advert Type icin URL duzenlenir")
    public void getAdvertTypeIcinURLDuzenlenir() {
        spec.pathParams("first", "advert-types", "second", advertTypeId);
    }

    @And("Get Advert Type icin expected data duzenlenir")
    public void getAdvertTypeIcinExpectedDataDuzenlenir() {
        expectedData = new AdvertTypePostResponsePojo(advertTypeId, "Akilli Ev", "false");
    } /*{"id": 140, "title": "Bungalov","builtIn": false} */


    @When("Get Advert Type icin GET request gonderilir ve Response alinir")
    public void getAdvertTypeIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        actualData = response.as(AdvertTypePostResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Get Advert Type icin Status kodunun {int} oldugu dogrulanir")
    public void getAdvertTypeIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get Advert Type icin Response body dogrulanir")
    public void getAdvertTypeIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getTitle(), actualData.getTitle());
        assertEquals(expectedData.isBuiltIn(), actualData.isBuiltIn());
    }

    @Given("Put Advert Type icin URL duzenlenir")
    public void putAdvertTypeIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/advert-types/82
        System.out.println(advertTypeId);
        spec.pathParams("first", "advert-types", "second", advertTypeId);
    }

    @And("Put Advert Type icin payload duzenlenir")
    public void putAdvertTypeIcinPayloadDuzenlenir() {
        payload = new AdvertTypePayloadPojo("Bungalov");
    }

    @When("Put Advert Type icin PUT request gonderilir ve Response alinir")
    public void putAdvertTypeIcinPUTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().put("{first}/{second}");
        actualData = response.as(AdvertTypePostResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Put Advert Type icin Status kodunun {int} oldugu dogrulanir")
    public void putAdvertTypeIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Put Advert Type icin Response body dogrulanir")
    public void putAdvertTypeIcinResponseBodyDogrulanir() {
        assertEquals(payload.getTitle(), actualData.getTitle());
    }

    @Given("Delete Advert Types icin URL duzenlenir")
    public void deleteAdvertTypesIcinURLDuzenlenir() {
        spec.pathParams("first", "advert-types", "second", advertTypeId);
    }

    @When("Delete Advert Types icin DELETE request gonderilir ve Response alinir")
    public void deleteAdvertTypesIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Delete Advert Types icin Status kodunun {int} oldugu dogrulanir")
    public void deleteAdvertTypesIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

}
