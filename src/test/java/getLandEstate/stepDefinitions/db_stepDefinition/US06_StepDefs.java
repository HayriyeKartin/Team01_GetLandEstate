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

    public class US06_StepDefs {
        Map<String,Object>actualData;
        List<String> actualColumnNames;
        List<String>expectedColumnNames;
        Map<String,Object> expectedData;

        @Given("US06 DataBase baglantisi  kurulur")
        public void databaseBaglantisiKurulur() {
            DB_Utilty.createConnection();
        }

        @And("US06 Beklenen categories datalari duzenlenir")
        public void beklenenCategoriesDatalariDuzenlenir() {
            expectedColumnNames=new ArrayList<>();
            expectedColumnNames.add("lat");
            expectedColumnNames.add("lng");
            expectedColumnNames.add("country_id");
            expectedColumnNames.add("id");
            expectedColumnNames.add("name");


            expectedData=new HashMap<>();
            expectedData.put("lat",36.9863599);
            expectedData.put("lng",35.3252861);
            expectedData.put("country_id",223L);
            expectedData.put("id",4121L);
            expectedData.put("name","Adana");

        }

        @When("US06 Kayitli cities datalari icin query gonderilir")
        public void kayitliCategoriesDatalariIcinQueryGonderilir() {
            actualColumnNames=DB_Utilty.getColumnNames("select * from cities");
            System.out.println(actualColumnNames);

            actualData=DB_Utilty.getRowMap("select * from cities where name= 'Adana'");
            System.out.println(actualData);

        }

        @Then("US06 Kayitli categories sutun isimleri ve bilgileri dogrulanir")
        public void kayitliCategoriesSutunIsimleriVeBilgileriDogrulanir() {
            assertEquals(expectedColumnNames.get(0),actualColumnNames.get(0));
            assertEquals(expectedColumnNames.get(1),actualColumnNames.get(1));

            assertEquals(expectedData.get("lat"),actualData.get("lat"));
            assertEquals(expectedData.get("lng"),actualData.get("lng"));
            assertEquals(expectedData.get("country_id"),actualData.get("country_id"));
            assertEquals(expectedData.get("id"),actualData.get("id"));
            assertEquals(expectedData.get("name"),actualData.get("name"));

        }

    }
