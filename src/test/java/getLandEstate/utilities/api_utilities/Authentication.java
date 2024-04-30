package getLandEstate.utilities.api_utilities;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String token(String email, String password){
        String url = "http://www.getlandestate.com:8092/users/login";
        String body = "{\"email\": \""+email+"\",\"password\": \""+password+"\"}";

        return given()
                .when()
                .body(body)
                .contentType(ContentType.JSON)
                .post(url)
                .jsonPath()
                .getString("token");
    }
}
