package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.ContactController.ContactMessagePayloadPojo;
import getLandEstate.pojos.api_pojos.ContactController.ContactMessageResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class API_ContactControllerStepDefs {

    ContactMessageResponsePojo payload;
    Response response;
    String actualData;
    ContactMessagePayloadPojo expectedData;
    ContactMessagePayloadPojo actualData1;
    ContactMessagePayloadPojo expectedData1;

    @Given("Contact Message icin URL duzenlenir")
    public void contactMessageIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/contact-messages
        spec.pathParam("first", "contact-messages");
    }

    @And("Contact Message icin payload duzenlenir")
    public void contactMessageIcinPayloadDuzenlenir() {
        payload = new ContactMessageResponsePojo("Arzu", "Contact", "arzu@contact.com", "API testi için message2", true);
    }

    @When("Contact Message icin POST request gonderilir ve Response alinir")
    public void contactMessageIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}");
        actualData = response.getBody().asString();
        System.out.println(actualData);

    }

    @Then("Contact Message icin Status kodunun {int} oldugu dogrulanir")
    public void contactMessageIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Contact Message icin Response body dogrulanir")
    public void contactMessageIcinResponseBodyDogrulanir() {
        assertEquals("Contact message saved successfully.", actualData);

    }

    @Given("Get Contact Message icin URL duzenlenir")
    public void getContactMessageIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/contact-messages/344
        spec.pathParams("first", "contact-messages", "second", 344);
    }

    @And("Get Contact Message icin expected data duzenlenir")
    public void getContactMessageIcinExpectedDataDuzenlenir() {
        expectedData=new ContactMessagePayloadPojo(344,"Arzu","Contact","arzu@contact.com","API testi için message2",true,"2024-05-05T14:46:15.248273");
    }

    /*
    {
    "id": 344,
    "firstName": "Arzu",
    "lastName": "Contact",
    "email": "arzu@contact.com",
    "message": "API testi için message2",
    "status": true,
    "createdAt": "2024-05-05T14:46:15.248273"
}
     */


    @When("Get Contact Message icin GET request gonderilir ve response alinir")
    public void getContactMessageIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        actualData1 = response.as(ContactMessagePayloadPojo.class);
        response.prettyPrint();
    }

    @Then("Get Contact Message icin Status kodunun {int} oldugu dogrulanir")
    public void getContactMessageIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Get Contact Message icin Response body dogrulanir")
    public void getContactMessageIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(),actualData1.getId());
        assertEquals(expectedData.getFirstName(),actualData1.getFirstName());
        assertEquals(expectedData.getLastName(),actualData1.getLastName());
        assertEquals(expectedData.getEmail(),actualData1.getEmail());
        assertEquals(expectedData.getMessage(),actualData1.getMessage());
        assertEquals(expectedData.getCreatedAt(),actualData1.getCreatedAt());
    }

    @Given("Patch Contact Message icin URL duzenlenir")
    public void patchContactMessageIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/contact-messages/344
        spec.pathParams("first","contact-messages","second",344);
    }

    @And("Patch Contact Message icin expected data duzenlenir")
    public void patchContactMessageIcinExpectedDataDuzenlenir() {
        expectedData1 = new ContactMessagePayloadPojo(344,"Arzu","Contact","arzu@contact.com","API testi için message2",false,"2024-05-05T14:46:15.248273");
    }

    @When("Patch Contact Message icin GET request gonderilir ve response alinir")
    public void patchContactMessageIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().patch("{first}/{second}");
        actualData1 = response.as(ContactMessagePayloadPojo.class);
        response.prettyPrint();
    }

    @Then("Patch Contact Message icin Status kodunun {int} oldugu dogrulanir")
    public void patchContactMessageIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Patch Contact Message icin Response body dogrulanir")
    public void patchContactMessageIcinResponseBodyDogrulanir() {
        assertEquals(expectedData1.getId(),actualData1.getId());
        assertEquals(expectedData1.getFirstName(),actualData1.getFirstName());
        assertEquals(expectedData1.getLastName(),actualData1.getLastName());
        assertEquals(expectedData1.getEmail(),actualData1.getEmail());
        assertEquals(expectedData1.getMessage(),actualData1.getMessage());
        assertEquals(expectedData1.getCreatedAt(),actualData1.getCreatedAt());
    }

    @Given("Delete Contact Message icin URL duzenlenir")
    public void deleteContactMessageIcinURLDuzenlenir() {
        //http://www.getlandestate.com:8092/contact-messages/312
        spec.pathParams("first","contact-messages","second",344);
    }


    @When("Delete Contact Message icin GET request gonderilir ve response alinir")
    public void deleteContactMessageIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}");
        actualData = response.getBody().asString();
        System.out.println(actualData);
    }

    @Then("Delete Contact Message icin Status kodunun {int} oldugu dogrulanir")
    public void deleteContactMessageIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Delete Contact Message icin Response body dogrulanir")
    public void deleteContactMessageIcinResponseBodyDogrulanir() {
        //Contact message deleted successfully.
        assertEquals("Contact message deleted successfully.",actualData);
    }
}

