package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.CountriesController.CountryPojo;
import getLandEstate.pojos.api_pojos.CountriesController.LocationPojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;


public class CountriesControllerStepDefination {

    Response response;
   Response responseCustomer;
   Response responseManager;
    JsonPath actualData;
    CountryPojo  expectedcountry1;
    CountryPojo  expectedcountry2;
    CountryPojo  expectedcountry3;
    CountryPojo  expectedcountry4;
    CountryPojo  expectedcountry5;


    @Given("Admin Countries kontroller icin URL düzenler")
    public void adminCountriesKontrollerIcinURLDüzenler() {

        spec.pathParams("first","countries","second","all");

    }

    @And("Admin Countries kontroller için expected data düzenler")
    public void adminCountriesKontrollerIçinExpectedDataDüzenler() {
        LocationPojo locationData1=new LocationPojo(10.447831,51.16382);
       expectedcountry1=new CountryPojo("Deutschland",locationData1,82);
        LocationPojo locationData2=new LocationPojo(-3.2765753,54.702354);
        expectedcountry2=new CountryPojo("United Kingdom",locationData2,230);
        LocationPojo locationData3=new LocationPojo(-4.8379793,39.32607);
        expectedcountry3=new CountryPojo("Espana",locationData3,205);
        LocationPojo locationData4=new LocationPojo(1.8883336,46.603355);
        expectedcountry4=new CountryPojo("France",locationData4,75);
        LocationPojo locationData5=new LocationPojo(34.924965,38.95976);
        expectedcountry5=new CountryPojo("Türkiye",locationData5,223);


    }

    @When("Admin Countries kontroller icin GET request gönderir")
    public void adminCountriesKontrollerIcinGETRequestGönderir() {
        Response response =given(spec).when().get("{first}/{second}");
        actualData=response.jsonPath();
    }

    @Then("Admin Counries kontroller icin Response Body doğrular")
    public void adminCounriesKontrollerIcinResponseBodyDoğrular() {

        Assert.assertEquals(expectedcountry1.getLocation().getLat(),actualData.getDouble("[0].location.lat"));
        Assert.assertEquals(expectedcountry1.getLocation().getLng(),actualData.getDouble("[0].location.lng"));
        Assert.assertEquals(expectedcountry1.getId(),actualData.getInt("[0].id"));
        Assert.assertEquals(expectedcountry1.getName(),actualData.getString("[0].name"));


        Assert.assertEquals(expectedcountry2.getLocation().getLat(),actualData.getDouble("[1].location.lat"));
        Assert.assertEquals(expectedcountry2.getLocation().getLng(),actualData.getDouble("[1].location.lng"));
        Assert.assertEquals(expectedcountry2.getId(),actualData.getInt("[1].id"));
        Assert.assertEquals(expectedcountry2.getName(),actualData.getString("[1].name"));




        Assert.assertEquals(expectedcountry3.getLocation().getLat(),actualData.getDouble("[2].location.lat"));
        Assert.assertEquals(expectedcountry3.getLocation().getLng(),actualData.getDouble("[2].location.lng"));
        Assert.assertEquals(expectedcountry3.getId(),actualData.getInt("[2].id"));
        Assert.assertEquals(expectedcountry3.getName(),actualData.getString("[2].name"));

        Assert.assertEquals(expectedcountry4.getLocation().getLat(),actualData.getDouble("[3].location.lat"));
        Assert.assertEquals(expectedcountry4.getLocation().getLng(),actualData.getDouble("[3].location.lng"));
        Assert.assertEquals(expectedcountry4.getId(),actualData.getInt("[3].id"));
        Assert.assertEquals(expectedcountry4.getName(),actualData.getString("[3].name"));

        Assert.assertEquals(expectedcountry5.getLocation().getLat(),actualData.getDouble("[4].location.lat"));
        Assert.assertEquals(expectedcountry5.getLocation().getLng(),actualData.getDouble("[4].location.lng"));
        Assert.assertEquals(expectedcountry5.getId(),actualData.getInt("[4].id"));
        Assert.assertEquals(expectedcountry5.getName(),actualData.getString("[4].name"));
    }

    @Given("Customer Countries kontroller icin URL düzenler")
    public void customerCountriesKontrollerIcinURLDüzenler() {
        spec.pathParams("first","countries","second","all");
    }

    @And("Customer Countries kontroller için expected data düzenler")
    public void customerCountriesKontrollerIçinExpectedDataDüzenler() {
    }

    @When("Customer Countries kontroller icin GET request gönderir")
    public void customerCountriesKontrollerIcinGETRequestGönderir() {
        responseCustomer=given(spec).when().get("{first}/{second}");
    }

    @Then("Customer Countries kontroller icin status code doğrulaması yapar")
    public void customerCountriesKontrollerIcinStatusCodeDoğrulamasıYapar() {
        Assert.assertEquals(401,responseCustomer.statusCode());
    }

    @Given("Mangager Countries kontroller icin URL düzenler")
    public void mangagerCountriesKontrollerIcinURLDüzenler() {
        spec.pathParams("first","countries","second","all");
    }

    @And("Manager Countries kontroller için expected data düzenler")
    public void managerCountriesKontrollerIçinExpectedDataDüzenler() {
    }

    @When("Manager Countries kontroller icin GET request gönderir")
    public void managerCountriesKontrollerIcinGETRequestGönderir() {
        responseManager=given(spec).when().get("{first}/{second}");
    }

    @Then("Manager Countries kontroller icin status code doğrulaması yapar")
    public void managerCountriesKontrollerIcinStatusCodeDoğrulamasıYapar() {
        Assert.assertEquals(200,responseManager.statusCode());
    }
}
