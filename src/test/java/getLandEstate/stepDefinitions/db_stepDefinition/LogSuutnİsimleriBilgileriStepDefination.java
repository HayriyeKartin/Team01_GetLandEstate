package getLandEstate.stepDefinitions.db_stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class LogSuutnİsimleriBilgileriStepDefination {
    List<String> expectedLog=new ArrayList<>();


    ResultSet resultSetLog1;
    ResultSet resultSetLog2;
    List<String> jdbcColumnNameslog=new ArrayList<>();
    @And("Sutun isimleri datasi duzenlenir")
    public void sutunIsimleriDatasiDuzenlenir() {
        expectedLog= Arrays.asList("advert_id", "created_at", "id", "user_id", "message");




    }

    @When("Sutun İsimleri datasini almak icin query gonderilir")
    public void sutunİsimleriDatasiniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = CountrySutunİsimleriBilgileriStepDefination.connection.createStatement();
        resultSetLog1 = statement.executeQuery("select * from logs");
        ResultSetMetaData metaData = resultSetLog1.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            jdbcColumnNameslog.add(metaData.getColumnName(i));
        }
        System.out.println(jdbcColumnNameslog);
    }

    @Then("Sutun isimleri dogrulanir")
    public void sutunIsimleriDogrulanir() {
        Assert.assertEquals(expectedLog,jdbcColumnNameslog);
    }

    @And("Sutun Bilgileri datasi duzenlenir")
    public void sutunBilgileriDatasiDuzenlenir() {
    }

    @When("Sutun bilgileri datasini almak icin query gonderilir")
    public void sutunBilgileriDatasiniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = CountrySutunİsimleriBilgileriStepDefination.connection.createStatement();
        resultSetLog2=statement.executeQuery("select * from logs where user_id =208");

        while ( resultSetLog2.next()){

            System.out.println("advert_id= "+resultSetLog2.getInt("advert_id"));
            System.out.println("created_at= "+resultSetLog2.getString("created_at"));
            System.out.println("id= "+resultSetLog2.getInt("id"));
            System.out.println("user_id= "+resultSetLog2.getInt("user_id"));
            System.out.println("message= "+resultSetLog2.getString("message"));
        }
    }

    @Then("Sutun bilgileri dogrulanir")
    public void sutunBilgileriDogrulanir() {
    }
}
