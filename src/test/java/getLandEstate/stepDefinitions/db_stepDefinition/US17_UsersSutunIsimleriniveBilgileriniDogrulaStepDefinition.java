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

public class US17_UsersSutunIsimleriniveBilgileriniDogrulaStepDefinition {
    Map<String,Object>actualData;
    List<String> actualColumnNames;
    List<String>expectedColumnNames;
    Map<String,Object> expectedData;


    @Given("DataBase baglantisi  kurulur")
    public void databaseBaglantisiKurulur() {
        DB_Utilty.createConnection();

    }

    @And("Beklenen USERS datalari duzenlenir")
    public void beklenenUSERSDatalariDuzenlenir() {
     expectedColumnNames = new ArrayList<>();

        expectedColumnNames.add("built_in");
        expectedColumnNames.add("enabled");
        expectedColumnNames.add("locked");
        expectedColumnNames.add("created_at");
        expectedColumnNames.add("id");
        expectedColumnNames.add("picture_id");
        expectedColumnNames.add("updated_id");
        expectedColumnNames.add("phone");
        expectedColumnNames.add("first_name");
        expectedColumnNames.add("last_name");
        expectedColumnNames.add("role");
        expectedColumnNames.add("email");
        expectedColumnNames.add("password_hash");
        expectedColumnNames.add("reset_password_code");

        expectedData = new HashMap<>();
        expectedData.put("built_in",false);
        expectedData.put("enabled",false);
        expectedData.put("locked",false);
        expectedData.put("created_at","2024-04-20 10:26:59.099231");
        expectedData.put("id",493);
        expectedData.put("picture_id",null);
        expectedData.put("updated_id","2024-04-20 10:26:59.102564");
        expectedData.put("phone","(012) 012-0120");
        expectedData.put("first_name","S");
        expectedData.put("last_name","Yasar");
        expectedData.put("role","CUSTOMER");
        expectedData.put("email","syasarit@gmail.com");
        expectedData.put("password_hash","$2a$10$/vDkM.8FBGgrh52pRLT.GOto3rPkaHuzIS9C0Yay5hEaE7FwQJEQG");
        expectedData.put("reset_password_code",null);


    }

    @When("Kayitli USERS  datalari icin query gonderilir")
    public void kayitliUSERSDatalariIcinQueryGonderilir() {

        actualColumnNames = DB_Utilty.getColumnNames("select * from users");
        System.out.println("actualColumnNames = " + actualColumnNames);

        actualData = DB_Utilty.getRowMap("select * from users where email = 'syasarit@gmail.com' ");
        System.out.println("actualData = " + actualData);
    }

    @Then("Kayitli USERS  sutun isimleri ve bilgileri dogrulanir")
    public void kayitliUSERSSutunIsimleriVeBilgileriDogrulanir()  {

    assertEquals(expectedColumnNames.get(0),actualColumnNames.get(0));
    assertEquals(expectedData.get("built_in"),actualData.get("built_in"));
    assertEquals(expectedData.get("last_name"),actualData.get("last_name"));


    }
}