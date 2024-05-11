package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static getLandEstate.utilities.DB_Utilty.*;
import static org.junit.Assert.assertEquals;


public class US02_CategoryControllerStepDefinition {

    ResultSet resultSet;
    Map<String,Object>actualData;
    List<String> expectedData;


    @And("Beklenen categories datalari duzenlenir")
    public void beklenenCategoriesDatalariDuzenlenir() {

        expectedData =new ArrayList<>();
        expectedData.add("built_in");
        expectedData.add("is_active");
        expectedData.add("seg");
        expectedData.add("created_at");
        expectedData.add("id");
        expectedData.add("updated_at");
        expectedData.add("icon");
        expectedData.add("title");
        expectedData.add("slug");

        System.out.println(getRowList("select * from categories where title = 'Palace'"));
    }

    @When("Kayitli categories datalari icin query gonderilir")
    public void kayitliCategoriesDatalariIcinQueryGonderilir() throws SQLException {
        try (Statement statement = DB_Utilty.createStatement()) {
            resultSet = statement.executeQuery("select * from categories where id = 84");
        }
        System.out.println(getRowMap("select * from categories where id = 84")); // ilk satırdaki sutun isimleri ve dataları getiririr
    }

    @Then("Kayitli categories sutun isimleri ve bilgileri dogrulanir")
    public void kayitliCategoriesSutunIsimleriVeBilgileriDogrulanir() {

        actualData = getRowMap("select * from categories where title = 'Palace'");
        assertEquals(false, actualData.get("built_in"));
        assertEquals(true, actualData.get("is_active"));
        assertEquals(7, actualData.get("seq"));
        assertEquals("2024-05-03 21:57:32.123442", actualData.get("created_at").toString());
        assertEquals("84", actualData.get("id").toString());
        assertEquals("2024-05-03 21:59:45.091084", actualData.get("updated_at").toString());
        assertEquals("place-of-worship", actualData.get("icon"));
        assertEquals("Palace", actualData.get("title"));
        assertEquals("1714773585086-palace", actualData.get("slug"));

    }
}
