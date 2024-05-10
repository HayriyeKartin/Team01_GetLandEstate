package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DBDailyReportsStepDefinetions {

    static List<String> dailyReportsSutunName;
    static String sqlQuery;
    ResultSet dailyReportsBilgiler;
    long number_of_contact_message=22;
    long number_of_favorites=11;
    long number_of_rent_adverts=44;
    long number_of_sale_adverts=50;
    long number_of_tour_requests=145;
    long number_of_users=373;
    long id=18;



    @And("Kayitli daily_reports sutun isimleri almak icin query gonderilir")
    public void kayitliDaily_reportsSutunIsimleriAlmakIcinQueryGonderilir() {
        sqlQuery="select *from daily_reports";
        dailyReportsSutunName=DB_Utilty.getColumnNames(sqlQuery);
    }

    @Then("Daily_Reports sutun isimleri dogrulanir")
    public void daily_reportsSutunIsimleriDogrulanir() {

        assertEquals("date",dailyReportsSutunName.get(0));
        assertEquals("number_of_contact_message",dailyReportsSutunName.get(1));
        assertEquals("number_of_favorites",dailyReportsSutunName.get(2));
        assertEquals("number_of_rent_adverts",dailyReportsSutunName.get(3));
        assertEquals("number_of_sale_adverts",dailyReportsSutunName.get(4));
        assertEquals("number_of_tour_requests",dailyReportsSutunName.get(5));
        assertEquals("number_of_users",dailyReportsSutunName.get(6));
        assertEquals("id",dailyReportsSutunName.get(7));

    }

    @And("Kayitli daily_reports bilgilerini almak icin query gonderilir")
    public void kayitliDaily_reportsBilgileriniAlmakIcinQueryGonderilir() {
        sqlQuery="select *from daily_reports where id=18";
        dailyReportsBilgiler=DB_Utilty.executeQuery(sqlQuery);
    }

    @Then("Daily_Reports bilgiler  dogrulanir")
    public void daily_reportsBilgilerDogrulanir() throws SQLException {
        dailyReportsBilgiler.next();

        assertEquals(number_of_contact_message,dailyReportsBilgiler.getLong("number_of_contact_message"));
        assertEquals(number_of_favorites,dailyReportsBilgiler.getLong("number_of_favorites"));
        assertEquals(number_of_rent_adverts,dailyReportsBilgiler.getLong("number_of_rent_adverts"));
        assertEquals(number_of_sale_adverts,dailyReportsBilgiler.getLong("number_of_sale_adverts"));
        assertEquals(number_of_tour_requests,dailyReportsBilgiler.getLong("number_of_tour_requests"));
        assertEquals(number_of_users,dailyReportsBilgiler.getLong("number_of_users"));
        assertEquals(id,dailyReportsBilgiler.getLong("id"));
    }
}
