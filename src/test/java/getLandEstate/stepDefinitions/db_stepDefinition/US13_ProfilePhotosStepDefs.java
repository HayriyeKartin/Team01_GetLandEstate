package getLandEstate.stepDefinitions.db_stepDefinition;


import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class US13_ProfilePhotosStepDefs {
    List<String> expectedColumnNames;
    List<String> actualColumnNames;
    Map<String, Object> expectedBilgiMap;
    Map<String, Object> actualBilgiMap;


    @Given("Database baglantisi kurulur.")
    public void databaseBaglantisiKurulur() {
        DB_Utilty.createConnection();
        // connection = DriverManager.getConnection("jdbc:postgresql://64.227.123.49:5432/prettierhomes", "tech_pro_edu", "testingIsFun");

    }


    @And("Profile_photos Beklenen sutun isimleri ve bilgilerin datasi duzenlenir")
    public void profile_photosBeklenenSutunIsimleriVeBilgilerinDatasiDuzenlenir() {
        // Beklenen tablo başlıklarını bir listeye ekleme (örneğin
        expectedColumnNames = new ArrayList<>();

        expectedColumnNames.add("id");
        expectedColumnNames.add("name");
        expectedColumnNames.add("type");
        expectedColumnNames.add("data");


        expectedBilgiMap = new HashMap<>();
        expectedBilgiMap.put("id", 1L);
        expectedBilgiMap.put("name", "cropped-image.jpg");
        expectedBilgiMap.put("type", "image/jpeg");
        expectedBilgiMap.put("data", 51513L);
    }

    @When("Profile_photos Tablo sutun isimlerini ve bilgilerini almak icin query gonderilir")
    public void profile_photosTabloSutunIsimleriniVeBilgileriniAlmakIcinQueryGonderilir() {
        actualColumnNames = DB_Utilty.getColumnNames("SELECT * FROM profile_photos");
        actualBilgiMap = DB_Utilty.getRowMap("select * from  profile_photos where id=1");
    }

    @Then("Profile_photos Sutun isimleri dogrulanir")
    public void profile_photosSutunIsimleriDogrulanir() {
        // Beklenen tablo başlıklarıyla JDBC'den alınan tablo başlıklarını karşılaştırma
        assertEquals(expectedColumnNames.get(0), actualColumnNames.get(0));
        assertEquals(expectedColumnNames.get(1), actualColumnNames.get(1));
        assertEquals(expectedColumnNames.get(2), actualColumnNames.get(2));
        assertEquals(expectedColumnNames.get(3), actualColumnNames.get(3));
    }

    @Then("Profile_photos Bilgileri dogrulanir")
    public void profile_photosBilgileriDogrulanir() {
        assertEquals(expectedBilgiMap.get("data"), actualBilgiMap.get("data"));
        assertEquals(expectedBilgiMap.get("name"), actualBilgiMap.get("name"));
        assertEquals(expectedBilgiMap.get("id"), actualBilgiMap.get("id"));
        assertEquals(expectedBilgiMap.get("type"), actualBilgiMap.get("type"));


    }
}