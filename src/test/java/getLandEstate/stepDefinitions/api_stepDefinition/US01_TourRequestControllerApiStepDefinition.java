package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.TourRequestController.TourRequestPageResponsePojo;
import getLandEstate.pojos.api_pojos.TourRequestController.TourRequestPayloadPojo;
import getLandEstate.pojos.api_pojos.TourRequestController.TourRequestResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class US01_TourRequestControllerApiStepDefinition {

    TourRequestPayloadPojo payload;
    Response response;
    TourRequestResponsePojo actualData;
    TourRequestResponsePojo expectedData;
    TourRequestPageResponsePojo pageData;
    static int tourRequestId;
    static String tourDate;
    static String tourTime;
    static String status;
    String date = "2024-05-12";
    String timePost = "12:00";
    String timePut = "12:30";
    int deleteId = 567;// delete icin id dinamik degil iyilestirilebilir bu kod

    @Given("Tour Request Olusturmak icin URL duzenlenir")
    public void tourRequestOlusturmakIcinURLDuzenlenir() {
        spec.pathParam("first", "tour-requests");
    }

    @And("Tour Request Olusturmak icin payload duzenlenir")
    public void tourRequestOlusturmakIcinPayloadDuzenlenir() {
        payload = new TourRequestPayloadPojo(date, timePost, 92);
    }

    @When("Tour Request Olusturmak icin POST request gonderilir ve Response alinir")
    public void tourRequestOlusturmakIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}");
        actualData = response.as(TourRequestResponsePojo.class);
        tourRequestId = actualData.getId();
    }

    @Then("Tour Request Olusturmak icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestOlusturmakIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Tour Request Olusturmak icin Response body dogrulanir")
    public void tourRequestOlusturmakIcinResponseBodyDogrulanir() {
        assertEquals(payload.getTourDate(), actualData.getTourDate());
    }

    @Given("Tour Request Decline icin URL duzenlenir")
    public void tourRequestDeclineIcinURLDuzenlenir() {
        spec.pathParams("first", "tour-requests", "second", tourRequestId, "third", "decline");
    }

    @And("Tour Request Decline icin expected data duzenlenir")
    public void tourRequestDeclineIcinExpectedDataDuzenlenir() {
        expectedData = new TourRequestResponsePojo(tourRequestId, tourDate, tourTime, "DECLINED");
    }

    @When("Tour Request Decline icin GET request gonderilir ve response alinir")
    public void tourRequestDeclineIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(TourRequestResponsePojo.class);
    }

    @Then("Tour Request Decline icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestDeclineIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(200, response.statusCode());
    }

    @And("Tour Request Decline icin response body dogrulanir")
    public void tourRequestDeclineIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getTourDate(), actualData.getTourDate());
        assertEquals(expectedData.getTourTime(), actualData.getTourTime());
        assertEquals(expectedData.getStatus(), actualData.getStatus());
    }

    @Given("Tour Request Approve icin URL duzenlenir")
    public void tourRequestApproveIcinURLDuzenlenir() {
        spec.pathParams("first", "tour-requests", "second", tourRequestId, "third", "approve");
    }

    @And("Tour Request Approve icin expected data duzenlenir")
    public void tourRequestApproveIcinExpectedDataDuzenlenir() {
        expectedData = new TourRequestResponsePojo(tourRequestId, tourDate, tourTime, "APPROVED");
    }

    @When("Tour Request Approve icin GET request gonderilir ve response alinir")
    public void tourRequestApproveIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(TourRequestResponsePojo.class);
    }

    @Then("Tour Request Approve icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestApproveIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(200, response.statusCode());
    }

    @And("Tour Request Approve icin response body dogrulanir")
    public void tourRequestApproveIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getTourDate(), actualData.getTourDate());
        assertEquals(expectedData.getTourTime(), actualData.getTourTime());
        assertEquals(expectedData.getStatus(), actualData.getStatus());
    }

    @Given("Tour Request Cancel icin URL duzenlenir")
    public void tourRequestCancelIcinURLDuzenlenir() {
        spec.pathParams("first", "tour-requests", "second", tourRequestId, "third", "cancel");
    }

    @And("Tour Request Cancel icin expected data duzenlenir")
    public void tourRequestCancelIcinExpectedDataDuzenlenir() {
        expectedData = new TourRequestResponsePojo(tourRequestId, tourDate, tourTime, "CANCELED");
    }

    @When("Tour Request Cancel icin GET request gonderilir ve response alinir")
    public void tourRequestCancelIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(TourRequestResponsePojo.class);
    }

    @Then("Tour Request Cancel icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestCancelIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(200, response.statusCode());
    }

    @And("Tour Request Cancel icin response body dogrulanir")
    public void tourRequestCancelIcinResponseBodyDogrulanir() {
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getTourDate(), actualData.getTourDate());
        assertEquals(expectedData.getTourTime(), actualData.getTourTime());
        assertEquals(expectedData.getStatus(), actualData.getStatus());
    }

    @Given("Tour Request Delete icin URL duzenlenir")
    public void tourRequestDeleteIcinURLDuzenlenir() {
        spec.pathParams("first", "tour-requests", "second", deleteId);
    }

    @And("Tour Request Delete icin expected data duzenlenir")
    public void tourRequestDeleteIcinExpectedDataDuzenlenir() {
        expectedData = new TourRequestResponsePojo(deleteId, tourDate, timePut, "PENDING");
    }

    @When("Tour Request Delete icin Delete request gonderilir ve response alinir")
    public void tourRequestDeleteIcinDeleteRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}");
        actualData = response.as(TourRequestResponsePojo.class);
    }

    @Then("Tour Request Delete icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestDeleteIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(200, response.statusCode());
    }

    @And("Tour Request Delete icin response body dogrulanir")
    public void tourRequestDeleteIcinResponseBodyDogrulanir() {
        assertEquals(deleteId, actualData.getId());
        assertEquals(expectedData.getTourDate(), actualData.getTourDate());
    }

    @Given("Tour Request Put icin URL duzenlenir")
    public void tourRequestPutIcinURLDuzenlenir() {
        spec.pathParams("first", "tour-requests", "second", tourRequestId, "third", "auth");
    }

    @And("Tour Request Put icin payload duzenlenir")
    public void tourRequestPutIcinPayloadDuzenlenir() {
        payload = new TourRequestPayloadPojo(date, timePut, 92);
    }

    @When("Tour Request Put icin PUT request gonderilir ve Response alinir")
    public void tourRequestPutIcinPUTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().put("{first}/{second}/{third}");
        actualData = response.as(TourRequestResponsePojo.class);
        tourDate = actualData.getTourDate();
        tourTime = actualData.getTourTime();
        status = actualData.getStatus();
    }

    @Then("Tour Request Put icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestPutIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(200, response.statusCode());
    }

    @And("Tour Request Put icin Response body dogrulanir")
    public void tourRequestPutIcinResponseBodyDogrulanir() {
        assertEquals(payload.getTourDate(), actualData.getTourDate());
    }

    @Given("Tour Request Page icin URL duzenlenir")
    public void tourRequestPageIcinURLDuzenlenir() {
        spec.pathParams("first", "tour-requests", "second", "page", "third", 91)
                .queryParams("page", 0, "size", 10, "sort", "tourDate", "type", "DESC");
    }

    @When("Tour Request Page icin GET request gonderilir ve response alinir")
    public void tourRequestPageIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
    }

    @Then("Tour Request Page icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestPageIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(200, response.statusCode());
    }

    @And("Tour Request Page icin response body dogrulanir")
    public void tourRequestPageIcinResponseBodyDogrulanir() {
        assertFalse(response.body().asString().isEmpty());
    }

    @Given("Tour Request AdminCount icin URL duzenlenir")
    public void tourRequestAdminCountIcinURLDuzenlenir() {
        spec.pathParams("first", "tour-requests", "second", "admin", "third", "count");
    }

    @When("Tour Request AdminCount icin GET request gonderilir ve response alinir")
    public void tourRequestAdminCountIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
    }

    @Then("Tour Request AdminCount icin Status kodunun {int} oldugu dogrulanir")
    public void tourRequestAdminCountIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(200, response.statusCode());
    }

    @And("Tour Request AdminCount icin response body dogrulanir")
    public void tourRequestAdminCountIcinResponseBodyDogrulanir() {
        assertFalse(response.body().asString().isEmpty());
    }


}
