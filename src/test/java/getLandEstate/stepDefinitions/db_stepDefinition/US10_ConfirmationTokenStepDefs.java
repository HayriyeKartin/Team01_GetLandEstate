package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US10_ConfirmationTokenStepDefs {
    static String sqlQuery;
    List<String> confirmation_tokenSutunNames;
    ResultSet resultSetSutunInfo;

    static String created_time;
    static int id;
    static int user_id;
    static String confirmation_token;


    @Given("Database baglantisi kurulur")
    public void databaseBaglantisiKurulur() {
        DB_Utilty.createConnection();
    }

    @And("Kayitli confirmation_token sutun isimlerini almak icin query gonderilir")
    public void kayitliConfirmation_tokenSutunIsimleriniAlmakIcinQueryGonderilir() throws SQLException {
        sqlQuery="select * from confirmation_token";
        confirmation_tokenSutunNames=DB_Utilty.getColumnNames(sqlQuery);
    }

    @Then("Kayitli confirmation_token sutun isimleri dogrulanir")
    public void kayitliConfirmation_tokenSutunIsimleriDogrulanir() {
        assertEquals("created_time",confirmation_tokenSutunNames.get(0));
        assertEquals("id",confirmation_tokenSutunNames.get(1));
        assertEquals("user_id",confirmation_tokenSutunNames.get(2));
        assertEquals("confirmation_token",confirmation_tokenSutunNames.get(3));


    }

    @And("Kayitli confirmation_token sutun bilgilerini almak icin query gonderilir")
    public void kayitliConfirmation_tokenSutunBilgileriniAlmakIcinQueryGonderilir() throws SQLException {
        sqlQuery="select * from confirmation_token where id=5";
        resultSetSutunInfo = DB_Utilty.executeQuery(sqlQuery);


    }

    @Then("Kayitli confirmation_token sutun bilgileri dogrulanir")
    public void kayitliConfirmation_tokenSutunBilgileriDogrulanir() throws SQLException {
        created_time="2024-04-15 17:45:09.366454";
        // Tabloda tarih "15 Nis 2024 17:45:09" olarak yazdigi halde, intellij konsolda testin sonucunu "2024-04-15 17:45:09.366454" olarak veriyor
        // Tarih dogru oldugu halde format olarak uymasi icin tarih olarak "Expected : 2024-04-15 17:45:09.366454" olarak kabul edildi

        /*
        org.junit.ComparisonFailure:
        Expected :15 Nis 2024 17:45:09
        Actual   :2024-04-15 17:45:09.366454
         */

        id=5;
        user_id=16;
        confirmation_token="1e2ecd17-4a60-491a-9a34-878fabc77608";
        resultSetSutunInfo.next();

        assertEquals(created_time,resultSetSutunInfo.getString("created_time"));
        assertEquals(id,resultSetSutunInfo.getInt("id"));
        assertEquals(user_id,resultSetSutunInfo.getInt("user_id"));
        assertEquals(confirmation_token,resultSetSutunInfo.getString("confirmation_token"));


    }
}

