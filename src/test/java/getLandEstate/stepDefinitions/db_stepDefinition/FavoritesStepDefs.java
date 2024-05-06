package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FavoritesStepDefs {
    String selectQuery;
    List<String> favoritesColumn;
    ResultSet favoritesSutunInfo;
    int advert_id;
    String created_at;
    int id;
    int user_id;

    @When("Favori ilanlarin sutun isimlerini almak icin query gonderilir")
    public void favoriIlanlarinSutunIsimleriniAlmakIcinQueryGonderilir() {
        selectQuery = "select * from favorites";
        favoritesColumn = DB_Utilty.getColumnNames(selectQuery);
    }

    @Then("Favori ilanlarin sutun isimleri dogrulanir")
    public void favoriIlanlarinSutunIsimleriDogrulanir() {
        assertEquals("advert_id", favoritesColumn.get(0));
        assertEquals("created_at", favoritesColumn.get(1));
        assertEquals("id", favoritesColumn.get(2));
        assertEquals("updated_at", favoritesColumn.get(3));
        assertEquals("user_id", favoritesColumn.get(4));
    }

    @When("Favori ilanlarin sutun bilgilerini almak icin query gonderilir")
    public void favoriIlanlarinSutunBilgileriniAlmakIcinQueryGonderilir() {
        selectQuery = "select * from favorites where id = 10";
        favoritesSutunInfo = DB_Utilty.executeQuery(selectQuery);
    }

    @Then("Favori ilanlarin sutun bilgileri dogrulanir")
    public void favoriIlanlarinSutunBilgileriDogrulanir() throws SQLException {
        favoritesSutunInfo.next();
        advert_id = 5;
        created_at = "2024-04-20 09:58:15.423062";
        id = 10;
        user_id = 183;
        assertEquals(advert_id, favoritesSutunInfo.getInt("advert_id"));
        assertEquals(created_at, favoritesSutunInfo.getString("created_at"));
        assertEquals(id, favoritesSutunInfo.getInt("id"));
        assertEquals(user_id , favoritesSutunInfo.getInt("user_id"));
    }
}
