package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.CategoryPropertyKeyController.PropertyKeyPojo;
import getLandEstate.pojos.api_pojos.CategoryPropertyKeyController.PropertyKeyResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.*;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CategoryPropertyKeyControllerStepDefs {

    PropertyKeyPojo payload;
    Response response;
    PropertyKeyResponsePojo actualData;
    static int userId;
    PropertyKeyResponsePojo expectedData;
    Map<String, Object> actualResponse;

    @Given("Category Properties icin URL duzenlenir")
    public void categoryPropertiesIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/categoriesKey/{{userId}}/properties
        spec.pathParams("first", "categoriesKey", "second", 91, "third", "properties");
    }

    @And("Category Properties icin payload duzenlenir")
    public void categoryPropertiesIcinPayloadDuzenlenir() {
        payload = new PropertyKeyPojo("Yerden Isitma", "BOOLEAN", "null", "null");
    }

    @When("Category Properties icin POST request gonderilir ve Response alinir")
    public void categoryPropertiesIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}/{third}");
        actualData = response.as(PropertyKeyResponsePojo.class);
        userId = actualData.getId();
        response.prettyPrint();
    }

    @Then("Category Properties icin Status kodunun {int} oldugu dogrulanir")
    public void categoryPropertiesIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Category Properties icin Response body dogrulanir")
    public void categoryPropertiesIcinResponseBodyDogrulanir() {
        assertEquals(payload.getName(), actualData.getName());
        assertEquals(payload.getKeyType(), actualData.getKeyType());
        assertEquals(payload.getPrefix(), actualData.getPrefix());
        assertEquals(payload.getSuffix(), actualData.getSuffix());
    }

    @Given("Get Category Properties icin URL duzenlenir")
    public void getCategoryPropertiesIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/categoriesKey/85/properties
        spec.pathParams("first", "categoriesKey", "second", 91, "third", "properties");
    }

    @And("Get Category Properties icin expected data duzenlenir")
    public void getCategoryPropertiesIcinExpectedDataDuzenlenir() {
        expectedData = new PropertyKeyResponsePojo(userId, "Yerden Isitma", "BOOLEAN", "null", "null", false);
    }

    @When("Get Category Properties icin GET request gonderilir ve response alinir")
    public void getCategoryPropertiesIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualResponse = new HashMap<>();
        actualResponse.put("id", userId);
        actualResponse.put("name", "Yerden Isitma");
        actualResponse.put("keyType", "BOOLEAN");
        actualResponse.put("prefix", "null");
        actualResponse.put("suffix", "null");
        actualResponse.put("builtIn", false);
    }

    @Then("Get Category Properties icin Status kodunun {int} oldugu dogrulanir")
    public void getCategoryPropertiesIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get Category Properties icin Response body dogrulanir")
    public void getCategoryPropertiesIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(), actualResponse.get("id"));
        assertEquals(expectedData.getName(), actualResponse.get("name"));
        assertEquals(expectedData.getKeyType(), actualResponse.get("keyType"));
        assertEquals(expectedData.getPrefix(), actualResponse.get("prefix"));
        assertEquals(expectedData.getSuffix(), actualResponse.get("suffix"));
        assertEquals(expectedData.isBuiltIn(), actualResponse.get("builtIn"));
    }

    @Given("Put Category Properties icin URL duzenlenir")
    public void putCategoryPropertiesIcinURLDuzenlenir() {
        spec.pathParams("first", "categoriesKey", "second", "properties", "third", userId);
    }

    @And("Put Category Properties icin payload duzenlenir")
    public void putCategoryPropertiesIcinPayloadDuzenlenir() {
        payload = new PropertyKeyPojo("Bireysel Isitma", "BOOLEAN", "null", "null");
    }

    @When("Put Category Properties icin PUT request gonderilir ve response alinir")
    public void putCategoryPropertiesIcinPUTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().put("{first}/{second}/{third}");
        actualData = response.as(PropertyKeyResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Put Category Properties icin Status kodunun {int} oldugu dogrulanir")
    public void putCategoryPropertiesIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Put Category Properties icin Response body dogrulanir")
    public void putCategoryPropertiesIcinResponseBodyDogrulanir() {
        assertEquals(payload.getName(), actualData.getName());
        assertEquals(payload.getKeyType(), actualData.getKeyType());
        assertEquals(payload.getPrefix(), actualData.getPrefix());
        assertEquals(payload.getSuffix(), actualData.getSuffix());
    }

    @Given("Delete Category Properties icin URL duzenlenir")
    public void deleteCategoryPropertiesIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/categoriesKey/properties/userId
        spec.pathParams("first", "categoriesKey", "second", "properties", "third", userId);
    }

    @When("Delete Category Properties icin DELETE request gonderilir ve response alinir")
    public void deleteCategoryPropertiesIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
    }

    @Then("Delete Category Properties icin Status kodunun {int} oldugu dogrulanir")
    public void deleteCategoryPropertiesIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}
