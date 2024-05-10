package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.ContactController.ContactMessagesPostPojo;
import getLandEstate.pojos.api_pojos.ContactController.ContactMessagesGetidResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;



        /*
        curl -X 'POST'
  'http://www.getlandestate.com:8092/contact-messages' \

   -H 'Content-Type: application/json' \
  -d '{
        "firstName": "Arzu",
        "lastName": "Postman",
        "email": "arzu@postman.com",
        "message": "API testi için message",
        "status": true
        }'

        {
  "firstName": "string",
  "lastName": "string",
  "email": "string",
  "message": "string",
  "status": true
        }

        Resposse body:
        Contact message saved successfully.
         */

public class US06_ContactControllerStepDefs {
    ContactMessagesPostPojo payload;
    String postActualData;
    Response response;
    static int getId;
    ContactMessagesGetidResponsePojo actualgetIDResponsePojo;
    ContactMessagesGetidResponsePojo expectedgetIdPojo;
    static Map<String,Object> actualDataList;
    static JsonPath jsonPath;

    @Given("Mesaj olusturmak icin Url duzenlenir")
    public void mesajOlusturmakIcinUrlDuzenlenir() {
        spec.pathParam("first","contact-messages");
    }

    @And("Yeni mesaj icin payload duzenlenir")
    public void yeniMesajIcinPayloadDuzenlenir() {
        payload = new ContactMessagesPostPojo("Arzu", "Contact", "arzu@contact.com", "API testi icin message", true);
    }

    @When("Yeni mesaj icin POST request gonderilir ve Response alinir")
    public void yeniMesajIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}");
        postActualData = response.getBody().asString();
        System.out.println(postActualData);
    }

    @Then("Yeni mesaj icin Status kodunun {int} oldugu dogrulanir")
    public void yeniMesajIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Yeni mesaj icin Response body dogrulanir")
    public void yeniMesajIcinResponseBodyDogrulanir() {
        String expectedMessage="Contact message saved successfully.";
        assertEquals(expectedMessage,postActualData);
    }


    @Given("Mesaji cagirmak icin Url duzenlenir")
    public void mesajiCagirmakIcinUrlDuzenlenir() {
        spec.pathParams("first","contact-messages","second",getId);

    }

    @And("Mesaji cagirmak icin GET request gönderilir ve Response alinir")
    public void mesajiCagirmakIcinGETRequestGönderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        actualgetIDResponsePojo=response.as(ContactMessagesGetidResponsePojo.class);
        response.prettyPrint();

    }


    @Then("Gelen mesaj icin Status kodun {int} oldugu dogrulanir")
    public void gelenMesajIcinStatusKodunOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }


    @And("Gelen mesajin Response body si dogrulanir")
    public void gelenMesajinResponseBodySiDogrulanir() {
        expectedgetIdPojo=new ContactMessagesGetidResponsePojo(getId,"Arzu","Contact","arzu@contact.com","API testi icin message",true,"2024-05-03T22:21:46.582329");
        assertEquals(expectedgetIdPojo.getId(),actualgetIDResponsePojo.getId());
        assertEquals(expectedgetIdPojo.getFirstName(),actualgetIDResponsePojo.getFirstName());
        assertEquals(expectedgetIdPojo.getLastName(),actualgetIDResponsePojo.getLastName());
        assertEquals(expectedgetIdPojo.getEmail(),actualgetIDResponsePojo.getEmail());
        assertEquals(expectedgetIdPojo.getMessage(),actualgetIDResponsePojo.getMessage());
    }

    @Given("Mesajlari cagirmak icin Url duzenlenir")
    public void mesajlariCagirmakIcinUrlDuzenlenir() {
        spec.pathParam("first","contact-messages");
    }

    @Given("Mesajlari cagirmak icin request gönderilir ve Response alinir")
    public void mesajlariCagirmakIcinRequestGönderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}");
        actualDataList =response.as(HashMap.class);
        jsonPath = response.jsonPath();

    }

    @Then("Gelen mesajlar arasindan bir önceki post isleminde gonderilen mesaj bulunur dogrulanir id si alinir")
    public void gelenMesajlarArasindanBirÖncekiPostIslemindeGonderilenMesajBulunurDogrulanirIdSiAlinir() {
        assertEquals("Arzu",jsonPath.getString("content[0].firstName"));
        assertEquals("Contact",jsonPath.getString("content[0].lastName"));
        assertEquals("arzu@contact.com",jsonPath.getString("content[0].email"));
        getId = Integer.parseInt(jsonPath.getString("content[0].id"));
    }

    @Given("Mesaji silmek icin URL duzenlenir")
    public void mesajiSilmekIcinURLDuzenlenir() {
        spec.pathParams("first","contact-messages","second",getId);
    }

    @And("Mesaji silmek icin DELETE request gonderilir")
    public void mesajiSilmekIcinDELETERequestGonderilir() {
        response = given(spec).when().delete("{first}/{second}");
    }

    @And("Body ile gelen {string} yazisi dogrulanir")
    public void bodyIleGelenYazisiDogrulanir(String expectedMessage) {
        assertEquals(expectedMessage,response.getBody().asString());
    }
}

