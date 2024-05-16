package getLandEstate.stepDefinitions.api_stepDefinition;
import getLandEstate.baseUrl.BaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static getLandEstate.baseUrl.BaseUrl.spec;
import static org.junit.Assert.assertEquals;


public class US13_CityControllerStepDefinition {
    Response response;
    JsonPath jsonPath;
    int expectedId;
    String expectedCityName;
    double expectedLat;
    double expectedLng;
    int actualId;
    String actualCityName;
    double actualLat;
    double actualLng;

    @Given("UserOnÜç Giriş bilgileri alınır")
    public void useronüçGirişBilgileriAlınır() {
        BaseUrl getCounty = new BaseUrl();
    }

    @When("UserOnÜç GET Cities icin URL duzenlenir")
    public void useronüçGETCitiesIcinURLDuzenlenir() {
        spec.pathParams("first", "cities", "second", "all");

    }

    @And("UserOnÜç Beklenen veriler duzenlenir")
    public void useronüçBeklenenVerilerDuzenlenir() {
        expectedId = 4122;
        expectedCityName = "Adıyaman";
        expectedLat = 37.78936;
        expectedLng = 38.3141101;

    }

    @When("UserOnÜç GET Cities Request sorgusu yapilir")
    public void useronüçGETCitiesRequestSorgusuYapilir() {
        actualId = jsonPath.getInt("find { it.name == 'Adıyaman' }.id");
        actualCityName = jsonPath.getString("find { it.name == 'Adıyaman' }.name");
        actualLat = jsonPath.getDouble("find { it.name == 'Adıyaman' }.location.lat");
        actualLng = jsonPath.getDouble("find { it.name == 'Adıyaman' }.location.lng");

    }

    @Then("UserOnÜç Veriler dogrulanir")
    public void useronüçVerilerDogrulanir() {
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedCityName,actualCityName);
        assertEquals(expectedId,actualId);
        assertEquals(expectedLat,actualLat);
        assertEquals(expectedLng,actualLng);
    }
}
