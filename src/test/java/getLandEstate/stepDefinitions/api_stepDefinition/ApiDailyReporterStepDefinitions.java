package getLandEstate.stepDefinitions.api_stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class ApiDailyReporterStepDefinitions {
    @Given("Get Daily reporter goruntulemek icin url belirlenir")
    public void getDailyReporterGoruntulemekIcinUrlBelirlenir() {
        spec.pathParams("first","daily-report");
    }

    @Then("Get Daily reporter icin GET request gonderilir ve Response body dogrulanir")
    public void getDailyReporterIcinGETRequestGonderilirVeResponseBodyDogrulanir() {
        given(spec)
                .when()
                .get("{first}")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body( containsString("ContactMessages"))
                .body( containsString("Favorites"))
                .body( containsString("RentAdverts"))
                .body( containsString("SaleAdverts"))
                .body( containsString("TourRequests"))
                .body( containsString("Users"));
    }
}
