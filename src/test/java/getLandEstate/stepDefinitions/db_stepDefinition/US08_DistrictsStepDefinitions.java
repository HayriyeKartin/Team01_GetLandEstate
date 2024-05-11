package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static getLandEstate.stepDefinitions.db_stepDefinition.US05_DailyReportsStepDefinetions.sqlQuery;
import static org.junit.Assert.assertEquals;

public class US08_DistrictsStepDefinitions {
    List<String> districtsSutunName;
    ResultSet districtsBilgiler;


    @And("Kayitli districts sutun isimleri almak icin query gonderilir")
    public void kayitliDistrictsSutunIsimleriAlmakIcinQueryGonderilir() {
        sqlQuery="select *from districts";
        districtsSutunName= DB_Utilty.getColumnNames(sqlQuery);
    }

    @Then("Districts sutun isimleri dogrulanir")
    public void districtsSutunIsimleriDogrulanir() {
        assertEquals("lat",districtsSutunName.get(0));
        assertEquals("lng",districtsSutunName.get(1));
        assertEquals("city_id",districtsSutunName.get(2));
        assertEquals("id",districtsSutunName.get(3));
        assertEquals("name",districtsSutunName.get(4));

    }

    @And("Kayitli districts bilgilerini almak icin query gonderilir")
    public void kayitliDistrictsBilgileriniAlmakIcinQueryGonderilir() {
        sqlQuery="select *from districts where id =49131";
        districtsBilgiler=DB_Utilty.executeQuery(sqlQuery);

    }

    @Then("Districts bilgiler  dogrulanir")
    public void districtsBilgilerDogrulanir() throws SQLException {
        districtsBilgiler.next();
        double lat=38.162873;
        double lng=41.7856854;
        long city_id=4189;
        long id=49131;
        String name="Baykan";

        assertEquals(lat,districtsBilgiler.getLong("lat"),0.162873);
        assertEquals(lng,districtsBilgiler.getLong("lng"),0.7856854);
        assertEquals(city_id,districtsBilgiler.getLong("city_id"));
        assertEquals(id,districtsBilgiler.getLong("id"));
        //assertEquals(name,districtsBilgiler.getLong("name"));



    }
}
