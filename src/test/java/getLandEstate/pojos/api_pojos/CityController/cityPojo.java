package getLandEstate.pojos.api_pojos.CityController;
import getLandEstate.baseUrl.BaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.Response;
import org.junit.Test;

import static getLandEstate.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class cityPojo {
    Response response;
    @Test
    void cities() {

        BaseUrl baseUrl = new BaseUrl();

        spec.pathParams("first", "cities", "second", "all");


        response = given(spec).when().get("{first}/{second}");
        //response.prettyPrint();
        // JSON yanıtını String olarak al
        //  String jsonString = response.getBody().asString();

        // JSONPath'i yapılandırarak yuvarlama yapmasını engelleme
        JsonPath jsonPath = response.jsonPath().using(new JsonPathConfig(JsonPathConfig.NumberReturnType.DOUBLE));

        // Beklenen veriler

        int expectedId = 4122;
        String expectedCityName = "Adıyaman";
        double expectedLat = 37.78936;
        double expectedLng = 38.3141101;


        int actualId = jsonPath.getInt("find { it.name == 'Adıyaman' }.id");
        String actualCityName = jsonPath.getString("find { it.name == 'Adıyaman' }.name");
        double actualLat = jsonPath.getDouble("find { it.name == 'Adıyaman' }.location.lat");
        double actualLng = jsonPath.getDouble("find { it.name == 'Adıyaman' }.location.lng");

        assertEquals(200, response.getStatusCode());
        assertEquals(expectedCityName,actualCityName);
        assertEquals(expectedId,actualId);
        assertEquals(expectedLat,actualLat);
        assertEquals(expectedLng,actualLng);

    }


}