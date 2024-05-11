package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class US14_TourRequestStepDefinition {

    String sqlQuery;
    List<String> columnNames;
    ResultSet resultSet;
    int advert_id;
    int guest_user_id;
    int id;

    @When("Kayitli tour request sutun isimlerini almak icin query gonderilir")
    public void kayitliTourRequestSutunIsimleriniAlmakIcinQueryGonderilir() {
        sqlQuery = "select * from tour_requests";
        columnNames = DB_Utilty.getColumnNames(sqlQuery);
    }

    @Then("Kayitli tour request sutun isimleri dogrulpanir")
    public void kayitliTourRequestSutunIsimleriDogrulpanir() {
        assertEquals("status",columnNames.get(0));
        assertEquals("tour_date",columnNames.get(1));
        assertEquals("advert_id",columnNames.get(3));
        assertEquals("owner_user_id",columnNames.get(7));
        assertEquals("id",columnNames.get(6));
    }

    @When("Kayitli tour request sutun bilgilerini almak icin query gonderilir")
    public void kayitliTourRequestSutunBilgileriniAlmakIcinQueryGonderilir() {
        sqlQuery = "select * from tour_requests where id=436";
        resultSet = DB_Utilty.executeQuery(sqlQuery);
    }

    @Then("Kayitli tour request sutun bilgileri dogrulanir")
    public void kayitliTourRequestSutunBilgileriDogrulanir() throws SQLException {
         advert_id = 91;
        guest_user_id = 229;
         id = 436;
        resultSet.next();
        assertEquals(advert_id,resultSet.getLong("advert_id"));
        assertEquals(advert_id,resultSet.getLong("guest_user_id"));
        assertEquals(advert_id,resultSet.getLong("id"));

    }
}

