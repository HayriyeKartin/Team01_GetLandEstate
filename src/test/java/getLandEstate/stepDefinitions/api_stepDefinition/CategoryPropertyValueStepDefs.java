package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.pojos.api_pojos.CategoryPropertyKeyController.PropertyKeyResponsePojo;
import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CategoryPropertyValueStepDefs {
    Connection connection;
    ResultSet resultSet;
    PropertyKeyResponsePojo expectedData;
    static String sqlQuery;
    List<String> propertiesValueColumn;
    ResultSet propertiesValueRowInfo;
    boolean built_in;
    String prefix;
    String suffix;
    int category_id;
    int id;
    String key_type;
    String name;

    @Given("Category Property Value icin database baglantisi kurulur")
    public void categoryPropertyValueIcinDatabaseBaglantisiKurulur() throws SQLException {
        //DB_Utilty.createConnection();
        connection = DriverManager.getConnection("jdbc:postgresql://64.227.123.49:5432/prettierhomes","tech_pro_edu","testingIsFun");
    }

    @When("Category Property Value sutun isimlerini almak icin query gonderilir")
    public void categoryPropertyValueSutunIsimleriniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from category_property_keys");

    }

    @And("Category Property Value sutun isimleri icin data duzenlenir")
    public void categoryPropertyValueSutunIsimleriIcinDataDuzenlenir() {
        PropertyKeyResponsePojo expectedData = new PropertyKeyResponsePojo();
    }

    @Then("Category Property Value sutun isimleri dogrulanir")
    public void categoryPropertyValueSutunIsimleriDogrulanir() throws SQLException {
        resultSet.next();
        assertEquals("built_in", propertiesValueColumn.get(0));
        assertEquals("prefix", propertiesValueColumn.get(1));
        assertEquals("suffix", propertiesValueColumn.get(2));
        assertEquals("category_id", propertiesValueColumn.get(3));
        assertEquals("id", propertiesValueColumn.get(4));
        assertEquals("key_type", propertiesValueColumn.get(5));
        assertEquals("name", propertiesValueColumn.get(6));
    }

    @When("Category Property Value sutun bilgilerini almak icin query gonderilir")
    public void categoryPropertyValueSutunBilgileriniAlmakIcinQueryGonderilir() {
        sqlQuery = "select * from category_property_keys where id = 55";
        propertiesValueRowInfo = DB_Utilty.executeQuery(sqlQuery);
    }

    @Then("Category Property Value sutun bilgilerini dogrulanir")
    public void categoryPropertyValueSutunBilgileriniDogrulanir() throws SQLException {
        built_in = false;
        prefix = null;
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
