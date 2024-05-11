package getLandEstate.stepDefinitions.api_stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class US10_DistrictsControllerStepDefinitions {

    Response response;
    JsonPath json;

    @Given("Ilceleri goruntulemek icin url belirlenir")
    public void ılceleriGoruntulemekIcinUrlBelirlenir() {
        spec.pathParams("first", "districts", "second", "search", "third", 4189);

    }

    @When("Get Ilceler icin GET request gonderilir ve response alinir")
    public void getIlcelerIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        json = response.jsonPath();
    }

    @Then("Get Ilceler icin Status kodunun {int} oldugu dogrulanir")
    public void getIlcelerIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Get Ilceler icin Response body dogrulanir")
    public void getIlcelerIcinResponseBodyDogrulanir() {
        List<Object> districts = json.getList("findAll{it.id > 49130}");
        assertEquals(6,districts.size());

        List<String> names1=json.getList("findAll{it.id >49130}.name");
        List<String> names2= Arrays.asList("Baykan","Eruh", "Kurtalan", "Pervari", "Siirt", "Şirvan");
        assertEquals(names2,names1);

        String baykan=json.getString("find{it.id ==49131}.name");
        assertEquals("Baykan",baykan);
    }

    @Given("Butun ilceleri goruntulemek icin url belirlenir")
    public void butunIlceleriGoruntulemekIcinUrlBelirlenir() {
        spec.pathParams("first", "districts", "second", "all");
    }


    @When("Get Butun ilceler icin GET request gonderilir ve Response body dogrulanir")
    public void getButunIlcelerIcinGETRequestGonderilirVeResponseBodyDogrulanir() {
        given(spec)
                .when()
                .get("{first}/{second}")
                .then().statusCode(200)
                .contentType(ContentType.JSON)
                .body("id",hasSize(6073))
                .body("name",hasItem("Baykan"))
                .body("name",hasItems("Çukurova","Kurtalan","Pendik"))
                .body("id",hasSize(greaterThan(0)))
                .body("id",hasSize(lessThan(6200)))
                .body("[0].id",equalTo(48315))
                .body("[2].name",equalTo("Çukurova"));
    }
}
