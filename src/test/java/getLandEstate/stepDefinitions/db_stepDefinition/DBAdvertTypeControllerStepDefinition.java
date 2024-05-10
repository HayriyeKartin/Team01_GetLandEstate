package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static getLandEstate.utilities.DB_Utilty.*;
import static org.junit.Assert.assertEquals;

public class DBAdvertTypeControllerStepDefinition {

    ResultSet resultSet;
    Map<String, Object> actualData;
    List<String> actualColumnNames;
    List<String> expectedColumnNames;

    @Given("Database connection kurulur")
    public void databaseConnectionKurulur() {
        createConnection();
    }

    @And("Beklenen Advert Type datasi duzenlenir")
    public void beklenenAdvertTypeDatasiDuzenlenir() {
        // expectedData = new AdvertTypePostResponsePojo(140, "Bungalov", "false");
        expectedColumnNames = new ArrayList<>();
        expectedColumnNames.add("built_in");
        expectedColumnNames.add("id");
        expectedColumnNames.add("title");
        System.out.println(getRowList("select * from advert_types where title = 'Bungalov'"));
    }

    @When("Kayitli Advert Type datasini almak icin query gonderilir")
    public void kayitliAdvertTypeDatasiniAlmakIcinQueryGonderilir() throws SQLException {
        try (Statement statement = DB_Utilty.createStatement()) {
            resultSet = statement.executeQuery("select * from advert_types where id = 156");
        }

        //ResultSeti actualColumnames list'ine donustur
        actualColumnNames = new ArrayList<>();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            actualColumnNames.add(columnName);
            // resultSet.close();
        }
    }

    @Then("Kayitli Advert Type datasi dogrulanir")
    public void kayitliAdvertTypeDatasiDogrulanir() {

        assertEquals(expectedColumnNames.get(0), actualColumnNames.get(0));
        assertEquals(expectedColumnNames.get(1), actualColumnNames.get(1));
        // ilk satırdaki sutun isimleri ve dataları getiririr
        actualData = getRowMap("select * from advert_types where title = 'Bungalov'");
        assertEquals(false, actualData.get("built_in"));
        assertEquals(156, ((Long) actualData.get("id")).intValue());
        assertEquals("Bungalov", actualData.get("title"));


    }

    @Given("DataBase baglantisi kurulur")
    public void databaseBaglantisiKurulur() {
    }

    @And("Beklenen User datalari duzenlenir")
    public void beklenenUserDatalariDuzenlenir() {
    }

    @When("Kayitli User datalari icin query gonderilir")
    public void kayitliUserDatalariIcinQueryGonderilir() {
    }

    @Then("Kayitli User sutun isimleri ve bilgileri dogrulanir")
    public void kayitliUserSutunIsimleriVeBilgileriDogrulanir() {
    }
}
