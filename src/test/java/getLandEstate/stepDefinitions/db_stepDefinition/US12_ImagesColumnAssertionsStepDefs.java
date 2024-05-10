package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class US12_ImagesColumnAssertionsStepDefs {
    Map<String,Object> actualData;
    List<String> actualColumnNames;
    List<String>expectedColumnNames;
    Map<String,Object> expectedData;
    @And("Beklenen images datalari duzenlenir")
    public void beklenenImagesDatalariDuzenlenir() {
        expectedColumnNames=new ArrayList<>();
        expectedColumnNames.add("featured");
        expectedColumnNames.add("advert_id");
        expectedColumnNames.add("id");
        expectedColumnNames.add("name");
        expectedColumnNames.add("type");
        expectedColumnNames.add("data");
        expectedData=new HashMap<>();
        expectedData.put("featured",true);
        expectedData.put("id",(long)17);
        expectedData.put("name","Investment opportunity Land in Darıca");
        expectedData.put("type","image/jpg");
        expectedData.put("data",(long)51419);

    }

    @When("Kayitli images datalari icin query gonderilir")
    public void kayitliImagesDatalariIcinQueryGonderilir() {

        actualColumnNames= DB_Utilty.getColumnNames("select * from images");
        System.out.println(actualColumnNames);

        actualData= DB_Utilty.getRowMap("select * from images where advert_id=17");
        System.out.println(actualData);
    }

    @Then("Kayitli images sutun isimleri ve bilgileri dogrulanir")
    public void kayitliImagesSutunIsimleriVeBilgileriDogrulanir() {
        assertEquals(expectedColumnNames.get(0),actualColumnNames.get(0));
        assertEquals(expectedColumnNames.get(1),actualColumnNames.get(1));

        assertEquals(expectedData.get("featured"),actualData.get("featured"));
        assertEquals(expectedData.get("id"),actualData.get("id"));
        assertEquals(expectedData.get("name"),actualData.get("name"));
        assertEquals(expectedData.get("type"),actualData.get("type"));
        assertEquals(expectedData.get("data"),actualData.get("data"));


    }
}
