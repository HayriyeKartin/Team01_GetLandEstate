package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.pojos.api_pojos.CategoryPropertyKeyController.PropertyKeyResponsePojo;
import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.*;

public class CategoryPropertyKeyStepDefs {
    Connection connection;
    ResultSet resultSet;
    PropertyKeyResponsePojo expectedData;
    static String sqlQuery;
    ResultSet propertiesValueRowInfo;
    boolean built_in;
    String prefix;
    String suffix;
    int category_id;
    int id;
    String key_type;
    String name;

    @Given("Database baglantisi kurulur")
    public void databaseBaglantisiKurulur() throws SQLException {
        connection = DB_Utilty.createConnection();
    }

    @When("Category Property Key sutun isimlerini almak icin query gonderilir")
    public void categoryPropertyKeySutunIsimleriniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from category_property_keys");

    }

    @And("Category Property Key sutun isimleri icin data duzenlenir")
    public void categoryPropertyKeySutunIsimleriIcinDataDuzenlenir() {
        expectedData = new PropertyKeyResponsePojo(1, "Size", "NUMBER", null,"m²", true);
    }

    @Then("Category Property Key sutun isimleri dogrulanir")
    public void categoryPropertyKeySutunIsimleriDogrulanir() throws SQLException {
        resultSet.next();
        assertEquals(expectedData.getId(), resultSet.getInt("id"));
        assertEquals(expectedData.getName(), resultSet.getString("name"));
        assertEquals(expectedData.getKeyType(), resultSet.getString("key_type"));
        assertEquals(expectedData.getPrefix(), resultSet.getString("prefix"));
        assertEquals(expectedData.getSuffix(), resultSet.getString("suffix"));
    }

    @When("Category Property Key sutun bilgilerini almak icin query gonderilir")
    public void categoryPropertyKeySutunBilgileriniAlmakIcinQueryGonderilir() {
        sqlQuery = "select * from category_property_keys where id = 55";
        propertiesValueRowInfo = DB_Utilty.executeQuery(sqlQuery);
    }

    @Then("Category Property Key sutun bilgilerini dogrulanir")
    public void categoryPropertyKeySutunBilgileriniDogrulanir() throws SQLException {
        built_in = false;
        prefix = "null";
        suffix = "m2";
        category_id = 21;
        id = 55;
        key_type = "NUMBER";
        name = "Kıs Bahcesi";
        propertiesValueRowInfo.next();
        assertEquals(built_in, propertiesValueRowInfo.getBoolean("built_in"));
        assertEquals(prefix, propertiesValueRowInfo.getString("prefix"));
        assertEquals(suffix, propertiesValueRowInfo.getString("suffix"));
        assertEquals(category_id, propertiesValueRowInfo.getInt("category_id"));
        assertEquals(id, propertiesValueRowInfo.getInt("id"));
        assertEquals(key_type, propertiesValueRowInfo.getString("key_type"));
        assertEquals(name, propertiesValueRowInfo.getString("name"));
    }
}
