package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.FavoriController.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US09_FavoritesControllerStepDefs {
    AdvertTypePojo advertTypePojo;
    CategoryPojo categoryPojo;
    CityPojo cityPojo;
    CountryPojo countryPojo;
    DistrictPojo districtPojo;
    LocationPojo locationPojo1;
    LocationPojo locationPojo2;
    LocationPojo locationPojo3;
    LocationPojo locationPojo4;
    FavoritesResponsePojo expectedData;
    Response response;
    JsonPath actualData;
    static int favoriteId;

    @Given("Get Favorites icin URL duzenlenir")
    public void getFavoritesIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/favorites/id/auth
        spec.pathParams("first", "favorites", "second", 4, "third", "auth");
    }

    @And("Get Favorites icin expected data duzenlenir")
    public void getFavoritesIcinExpectedDataDuzenlenir() {
        advertTypePojo = new AdvertTypePojo(2, "Sale", true);
        categoryPojo = new CategoryPojo(4, "Villa");
        cityPojo = new CityPojo(4131, "Aydın", locationPojo3);
        countryPojo = new CountryPojo(223, "Türkiye", locationPojo2);
        districtPojo = new DistrictPojo(48441, "Didim", locationPojo4);
        locationPojo1 = new LocationPojo(37.3769167, 27.2668129);
        locationPojo2 = new LocationPojo(38.9597594, 34.9249659);
        locationPojo3 = new LocationPojo(37.7405798, 28.0676404);
        locationPojo4 = new LocationPojo(37.3769167, 27.2668129);
        expectedData = new FavoritesResponsePojo(favoriteId, 4, "Villa with sea and forest views in Didim", 400000.0, locationPojo1, advertTypePojo, countryPojo, cityPojo, districtPojo, categoryPojo);
    }

    @When("Get Favorites icin GET request gonderilir ve response alinir")
    public void getFavoritesIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.jsonPath();
        System.out.println("actualData : " + actualData);
    }

    @Then("Get Favorites icin Status kodunun {int} oldugu dogrulanir")
    public void getFavoritesIcinStatusKodununOlduguDogrulanir(int statusCode) {
            assertEquals(statusCode, response.statusCode());
        }

    @And("Get Favorites icin Response body dogrulanir")
    public void getFavoritesIcinResponseBodyDogrulanir() {
            assertEquals(expectedData.getAdvertId(), actualData.getInt("advertId"));
            assertEquals(expectedData.getTitle(), actualData.getString("title"));
            assertEquals(expectedData.getPrice(), actualData.getDouble("price"));
            assertEquals(expectedData.getCountry().getId(), actualData.getInt("country.id"));
            assertEquals(expectedData.getCountry().getName(), actualData.getString("country.name"));
            assertEquals(expectedData.getCity().getId(), actualData.getInt("city.id"));
            assertEquals(expectedData.getCity().getName(), actualData.getString("city.name"));
            assertEquals(expectedData.getDistrict().getId(), actualData.getInt("district.id"));
            assertEquals(expectedData.getDistrict().getName(), actualData.getString("district.name"));
        }


    @Given("Delete Favorites icin URL duzenlenir")
    public void deleteFavoritesIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/favorites/admin/delete/0
        spec.pathParams("first", "favorites", "second", "admin", "third", "delete", "fourth", 4);
    }

    @When("Delete Favorites icin DELETE request gonderilir ve response alinir")
    public void deleteFavoritesIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();
    }

    @Then("Delete Favorites icin Status kodunun {int} oldugu dogrulanir")
    public void deleteFavoritesIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}
