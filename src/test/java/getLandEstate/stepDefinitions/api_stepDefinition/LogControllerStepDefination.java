package getLandEstate.stepDefinitions.api_stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class LogControllerStepDefination {

    Map<String,Object> map=new HashMap<>();
    String actualE2e;


    Response responseAdmin;
    Response responseCustomer;
    Response responseManager1;
    Response responseManager2;


    JsonPath actualAdmin;
    String expectedE2e;
    @Given("Admin log kontroller icin URL düzenler")
    public void adminLogKontrollerIcinURLDüzenler() {
        spec.pathParams("first","logs","second","208");




    }

    @And("Admin log kontroller için expected data düzenler")
    public void adminLogKontrollerIçinExpectedDataDüzenler() {
    }

    @When("Admin log kontroller icin GET request gönderir")
    public void adminLogKontrollerIcinGETRequestGönderir() {
        responseAdmin=given(spec).when().get("{first}/{second}");
        responseAdmin.prettyPrint();
        actualAdmin=responseAdmin.jsonPath();





    }

    @Then("Admin log kontroller icin Response Body doğrular")
    public void adminLogKontrollerIcinResponseBodyDoğrular() {
        System.out.println("id="+actualAdmin.getInt("content[0].id"));
        System.out.println("message="+actualAdmin.getString("content[0].message"));
        System.out.println("createdAt="+actualAdmin.getString("content[0].createdAt"));


    }

    @Given("Customer log kontroller icin URL düzenler")
    public void customerLogKontrollerIcinURLDüzenler() {
        spec.pathParams("first","logs","second","478");
    }

    @And("Customer log kontroller için expected data düzenler")
    public void customerLogKontrollerIçinExpectedDataDüzenler() {


    }

    @When("Customer log kontroller icin GET request gönderir")
    public void customerLogKontrollerIcinGETRequestGönderir() {
        responseCustomer=given(spec).when().get("{first}/{second}");
    }

    @Then("Customer log kontroller icin status kod doğrulaması yapar")
    public void customerLogKontrollerIcinStatusKodDoğrulamasıYapar() {
        Assert.assertEquals(401,responseCustomer.statusCode());
    }

    @Given("Manager kendi log kayıtları icin URL düzenler")
    public void managerKendiLogKayıtlarıIcinURLDüzenler() {
        spec.pathParams("first","logs","second","545");

    }

    @And("Manager kendi log kayıtları için expected data düzenler")
    public void managerKendiLogKayıtlarıIçinExpectedDataDüzenler() {
    }

    @When("Manager kendi log kayıtları icin GET request gönderir")
    public void managerKendiLogKayıtlarıIcinGETRequestGönderir() {
        responseManager1=given(spec).when().get("{first}/{second}");
    }

    @Then("Manager kendi log kayıtları icin status code doğrular")
    public void managerKendiLogKayıtlarıIcinStatusCodeDoğrular() {
        System.out.println(responseManager1.statusCode());
        Assert.assertEquals(200,responseManager1.statusCode());
    }

    @Given("Manager başkasının log kayıtları icin URL düzenler")
    public void managerBaşkasınınLogKayıtlarıIcinURLDüzenler() {
        spec.pathParams("first","logs","second","208");
    }

    @And("Manager başkasının log kayıtları için expected data düzenler")
    public void managerBaşkasınınLogKayıtlarıIçinExpectedDataDüzenler() {
    }

    @When("Manager başkasının log kayıtları icin GET request gönderir")
    public void managerBaşkasınınLogKayıtlarıIcinGETRequestGönderir() {
        responseManager2=given(spec).when().get("{first}/{second}");
    }

    @Then("Manager başkasının log kayıtları icin status code doğrular")
    public void managerBaşkasınınLogKayıtlarıIcinStatusCodeDoğrular() {
        System.out.println(responseManager2.statusCode());
        Assert.assertEquals(401,responseManager2.statusCode());
    }

    @Given("Admin Adverts kontroller icin URL düzenler")
    public void adminAdvertsKontrollerIcinURLDüzenler() {
        spec.pathParams("first","adverts","second","admin").queryParam("q","satilik ev");
    }

    @And("Admin Adverts kontroller için expected data düzenler")
    public void adminAdvertsKontrollerIçinExpectedDataDüzenler() {
        expectedE2e="REJECTED";
    }

    @When("Admin Adverts kontroller icin GET request gönderir")
    public void adminAdvertsKontrollerIcinGETRequestGönderir() {
       Response responseE2e=given(spec).when().get("{first}/{second}");
        actualE2e=responseE2e.jsonPath().getString("content[0].statusForAdvert");
        System.out.println(actualE2e);


    }

    @Then("Admin Adverts kontroller icin Response Body doğrular")
    public void adminAdvertsKontrollerIcinResponseBodyDoğrular() {


        Assert.assertEquals(expectedE2e,actualE2e);


    }


}
