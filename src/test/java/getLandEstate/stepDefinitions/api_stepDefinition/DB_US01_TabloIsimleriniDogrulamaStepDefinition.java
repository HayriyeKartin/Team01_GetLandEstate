package getLandEstate.stepDefinitions.api_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DB_US01_TabloIsimleriniDogrulamaStepDefinition {

    ResultSet resultSet;
    List<String > actualData;
    List<String> expectedData;
    @And("Beklenen Tablo isimleri datalari duzenlenir")
    public void beklenenTabloIsimleriDatalariDuzenlenir() {
        expectedData= Arrays.asList("categories","category_property_values","contacts","daily_reports","cities","countries","districts","category_property_keys","confirmation_token","logs","images","profile_photos","tour_requests","advert_types","adverts","users","favorites");
    }

    @When("Kayitli Tablo isimleri  datalari icin query gonderilir")
    public void kayitliTabloIsimleriDatalariIcinQueryGonderilir() throws SQLException {
        resultSet = DB_Utilty.executeQuery("SELECT table_name \n" +
                "FROM information_schema.tables \n" +
                "WHERE table_schema='public' AND table_type='BASE TABLE'");
        actualData=new ArrayList<>();

        while (resultSet.next()){
            String categoriesName = resultSet.getString("table_name");
            actualData.add(categoriesName);
        }
        System.out.println(actualData);

    }

    @Then("Kayitli Tablo isimleri dogrulanir")
    public void kayitliTabloIsimleriDogrulanir() {
        assertEquals(expectedData,actualData);
    }
}
