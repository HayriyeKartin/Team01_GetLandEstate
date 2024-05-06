package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CategoryPropertyValueStepDefs {
    Connection connection;
    static String sqlQuery;
    List<String> valueColumn;
    ResultSet resultSet;
    int advert_id;
    int category_property_key_id;
    int id;
    String value;

    @Given("Category Property Value icin database baglantisi kurulur")
    public void categoryPropertyValueIcinDatabaseBaglantisiKurulur() {
        connection = DB_Utilty.createConnection();
    }

    @When("Category Property Value sutun isimlerini almak icin query gonderilir")
    public void categoryPropertyValueSutunIsimleriniAlmakIcinQueryGonderilir() throws SQLException {
        sqlQuery = "select * from category_property_values";
        valueColumn = DB_Utilty.getColumnNames(sqlQuery);
    }

    @Then("Category Property Value sutun isimleri dogrulanir")
    public void categoryPropertyValueSutunIsimleriDogrulanir() throws SQLException {
        assertEquals("advert_id", valueColumn.get(0));
        assertEquals("category_property_key_id", valueColumn.get(1));
        assertEquals("id", valueColumn.get(2));
        assertEquals("value", valueColumn.get(3));
    }

    @When("Category Property Value sutun bilgilerini almak icin query gonderilir")
    public void categoryPropertyValueSutunBilgileriniAlmakIcinQueryGonderilir() {
        sqlQuery = "select * from category_property_values where id = 36";
        resultSet = DB_Utilty.executeQuery(sqlQuery);
    }

    @Then("Category Property Value sutun bilgilerini dogrulanir")
    public void categoryPropertyValueSutunBilgileriniDogrulanir() throws SQLException {
        resultSet.next();
        advert_id = 5;
        category_property_key_id = 36;
        id = 36;
        value = "Farmland";
        assertEquals(advert_id, resultSet.getInt("advert_id"));
        assertEquals(category_property_key_id, resultSet.getInt("category_property_key_id"));
        assertEquals(id, resultSet.getInt("id"));
        assertEquals(value, resultSet.getString("value"));
    }
}
