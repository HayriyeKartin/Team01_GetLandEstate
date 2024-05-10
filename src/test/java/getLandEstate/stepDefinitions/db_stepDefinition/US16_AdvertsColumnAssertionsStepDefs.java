package getLandEstate.stepDefinitions.db_stepDefinition;


import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US16_AdvertsColumnAssertionsStepDefs{
    static List<String> actualDatas;

    static ResultSet actualAdvertData;



    @And("Adverts sutun isimleri icin query gönderilir")
    public void advertsSutunIsimleriIcinQueryGönderilir() {
        actualDatas =DB_Utilty.getColumnNames("select * from adverts");
        System.out.println(actualDatas);
    }

    @Then("Adverts sutun isimleri dogrulanir")
    public void advertsSutunIsimleriDogrulanir() {
        // expected Datas :{built_in, is_active, lat, lng, price, status_for_advert, view_count, advert_type_id, category_id, city_id, country_id, created_at, district_id, id, updated_at, user_id, address, description, slug, title}
        assertEquals("built_in",actualDatas.get(0));
        assertEquals("is_active",actualDatas.get(1));
        assertEquals("lat",actualDatas.get(2));
        assertEquals("lng",actualDatas.get(3));
        assertEquals("price",actualDatas.get(4));
        assertEquals("status_for_advert",actualDatas.get(5));
        assertEquals("view_count",actualDatas.get(6));
        assertEquals("advert_type_id",actualDatas.get(7));
        assertEquals("category_id",actualDatas.get(8));
        assertEquals("city_id",actualDatas.get(9));
        assertEquals("country_id",actualDatas.get(10));
        assertEquals("created_at",actualDatas.get(11));
        assertEquals("district_id",actualDatas.get(12));
        assertEquals("id",actualDatas.get(13));
        assertEquals("updated_at",actualDatas.get(14));
        assertEquals("user_id",actualDatas.get(15));
        assertEquals("address",actualDatas.get(16));
        assertEquals("description",actualDatas.get(17));
        assertEquals("slug",actualDatas.get(18));
        assertEquals("title",actualDatas.get(19));

    }

    @And("Kayitli Advert datasini almak icin query gönderilir")
    public void kayitliAdvertDatasiniAlmakIcinQueryGönderilir() {
        actualAdvertData = DB_Utilty.executeQuery("select * from adverts where id=40");
    }

    @Then("Kayitli Advert datasinin bilgilileri dogrulanir")
    public void kayitliAdvertDatasininBilgilileriDogrulanir() throws SQLException {
        // {true , true , 41,946571350097656 , 34,58787155151367 , 480000,	1 , 4 , 2 , 4 , 4190 , 223, 14 Nis 2024 , 16:25:47 , 49137 , 40 , 16 Nis 2024 18:34:39 , 8 , Ayancık Mah. 1234. St. No: 6 , Experience luxury villa living in the tranquil atmosphere of Ayancık. With luxurious details, this villa offers a comfortable and relaxing lifestyle amidst nature's embrace. , 1713111947833-villa-life-in-ayancik , 	Villa Life in Ayancik }

        String expectedAdress ="Ayancık Mah. 1234. St. No: 6";
        String expectedDescription ="Experience luxury villa living in the tranquil atmosphere of Ayancık. With luxurious details, this villa offers a comfortable and relaxing lifestyle amidst nature's embrace.";

        actualAdvertData.next();
        assertEquals(expectedAdress,actualAdvertData.getString("address"));
        assertEquals(expectedDescription,actualAdvertData.getString("description"));
    }
}