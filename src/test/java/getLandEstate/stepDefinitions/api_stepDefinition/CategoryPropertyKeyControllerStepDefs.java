package getLandEstate.stepDefinitions.api_stepDefinition;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import getLandEstate.pojos.api_pojos.CategoryPropertyKeyController.PropertyKeyPojo;
import getLandEstate.pojos.api_pojos.CategoryPropertyKeyController.PropertyKeyResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CategoryPropertyKeyControllerStepDefs {

    PropertyKeyPojo payload;
    Response response;
    PropertyKeyResponsePojo actualData;
    static int userId;
    PropertyKeyResponsePojo expectedData;
    Map<String, Object> actualData2;

    @Given("Category Properties icin URL duzenlenir")
    public void categoryPropertiesIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/categoriesKey/{{userId}}/properties
        spec.pathParams("first", "categoriesKey", "second", 85 , "third", "properties");
    }

    @And("Category Properties icin payload duzenlenir")
    public void categoryPropertiesIcinPayloadDuzenlenir() {
        payload = new PropertyKeyPojo("DenemePostu", "BOOLEAN", "null","null");
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
        //http://www.getlandestate.com:8092/categoriesKey/30/properties
        spec.pathParams("first", "categoriesKey", "second", userId, "third", "properties" );
    }

    @And("Get Category Properties icin expected data duzenlenir")
    public void getCategoryPropertiesIcinExpectedDataDuzenlenir() {
        expectedData = new PropertyKeyResponsePojo(userId, "DenemePostu", "BOOLEAN", "null", "null", true);
    }

    @When("Get Category Properties icin GET request gonderilir ve response alinir")
    public void getCategoryPropertiesIcinGETRequestGonderilirVeResponseAlinir(){
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(PropertyKeyResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Get Category Properties icin Status kodunun {int} oldugu dogrulanir")
    public void getCategoryPropertiesIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Get Category Properties icin Response body dogrulanir")
    public void getCategoryPropertiesIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getKeyType(), actualData.getKeyType());
        assertEquals(expectedData.getPrefix(), actualData.getPrefix());
        assertEquals(expectedData.getSuffix(), actualData.getSuffix());
        assertEquals(expectedData.isBuiltIn(), actualData.isBuiltIn());
    }

    @Given("Put Category Properties icin URL duzenlenir")
    public void putCategoryPropertiesIcinURLDuzenlenir() {
        spec.pathParams("first", "categoriesKey", "second", "properties", "third", userId );
    }

    @And("Put Category Properties icin payload duzenlenir")
    public void putCategoryPropertiesIcinPayloadDuzenlenir() {
        payload = new PropertyKeyPojo("DenemePutu", "BOOLEAN", "null", "null");
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
        spec.pathParams("first", "categoriesKey", "second", "properties", "third", userId );
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
