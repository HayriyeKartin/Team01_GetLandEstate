package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.pojos.api_pojos.CountriesController.CountryPojo;
import getLandEstate.pojos.api_pojos.CountriesController.LocationPojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountrySutunİsimleriBilgileriStepDefination {
   static Connection connection;
    List<String> expectedCountry=new ArrayList<>();
    ResultSet resultSetCountry1;
    ResultSet resultSetCountry2;

    List<String> jdbcColumnNamescountry=new ArrayList<>();


    CountryPojo  expectedcountry1D;
    CountryPojo   expectedcountry2D;
    CountryPojo   expectedcountry3D;
    CountryPojo   expectedcountry4D;
    CountryPojo   expectedcountry5D;

    List<Double> lat=new ArrayList<>();
    List<Double> lng=new ArrayList<>();

    List<String> name=new ArrayList<>();
    List<Object> id=new ArrayList<>();



    @Given("Database baglantisi kurulur suleyman")
    public void databaseBaglantisiKurulurSuleyman() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://64.227.123.49:5432/prettierhomes", "tech_pro_edu", "testingIsFun");

    }

    @And("Country isimleri datasi duzenlenir")
    public void countryIsimleriDatasiDuzenlenir() {
        expectedCountry= Arrays.asList("lat","lng","id","name");


    }

    @When("Country İsimleri datasini almak icin query gonderilir")
    public void countryİsimleriDatasiniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSetCountry1 = statement.executeQuery("select * from countries");
        ResultSetMetaData metaData = resultSetCountry1.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            jdbcColumnNamescountry.add(metaData.getColumnName(i));
        }

    }

    @Then("Country isimleri dogrulanir")
    public void countryIsimleriDogrulanir() {
        Assert.assertEquals(expectedCountry,jdbcColumnNamescountry);
    }

    @And("Country Bilgileri datasi duzenlenir")
    public void countryBilgileriDatasiDuzenlenir() {
        LocationPojo locationData1D=new LocationPojo(10.4478313,51.1638175);
        expectedcountry1D=new CountryPojo("Deutschland",locationData1D,82);
        LocationPojo locationData2D=new LocationPojo(-3.2765753,54.7023545);
        expectedcountry2D=new CountryPojo("United Kingdom",locationData2D,230);
        LocationPojo locationData3D=new LocationPojo(-4.8379791,39.3260685);
        expectedcountry3D=new CountryPojo("Espana",locationData3D,205);
        LocationPojo locationData4D=new LocationPojo(1.8883335,46.603354);
        expectedcountry4D=new CountryPojo("France",locationData4D,75);
        LocationPojo locationData5D=new LocationPojo(34.9249659,38.9597594);
        expectedcountry5D=new CountryPojo("Türkiye",locationData5D,223);
    }

    @When("Country bilgileri datasini almak icin query gonderilir")
    public void countryBilgileriDatasiniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
       resultSetCountry2=statement.executeQuery("select * from countries");


        while (resultSetCountry2.next()){

            lat.add(resultSetCountry2.getDouble("lat"));
            lng.add(resultSetCountry2.getDouble("lng"));
            id.add(resultSetCountry2.getLong("id"));
            name.add(resultSetCountry2.getString("name"));

        }



    }

    @Then("Country bilgileri dogrulanir")
    public void countryBilgileriDogrulanir()  {

        Assert.assertEquals(expectedcountry1D.getLocation().getLat(),lat.get(0));
        Assert.assertEquals(expectedcountry2D.getLocation().getLat(),lat.get(1));
        Assert.assertEquals(expectedcountry3D.getLocation().getLat(),lat.get(2));
        Assert.assertEquals(expectedcountry4D.getLocation().getLat(),lat.get(3));
        Assert.assertEquals(expectedcountry5D.getLocation().getLat(),lat.get(4));



        Assert.assertEquals(expectedcountry1D.getLocation().getLng(),lng.get(0));
        Assert.assertEquals(expectedcountry2D.getLocation().getLng(),lng.get(1));
        Assert.assertEquals(expectedcountry3D.getLocation().getLng(),lng.get(2));
        Assert.assertEquals(expectedcountry4D.getLocation().getLng(),lng.get(3));
        Assert.assertEquals(expectedcountry5D.getLocation().getLng(),lng.get(4));

       // Assert.assertEquals(expectedcountry1D.getId(),id.get(0));
       // Assert.assertEquals(expectedcountry2D.getId(),id.get(1));
        //Assert.assertEquals(expectedcountry3D.getId(),id.get(2));
        //Assert.assertEquals(expectedcountry4D.getId(),id.get(3));
       // Assert.assertEquals(expectedcountry5D.getId(),id.get(4));



        Assert.assertEquals(expectedcountry1D.getName(),name.get(0));
        Assert.assertEquals(expectedcountry2D.getName(),name.get(1));
        Assert.assertEquals(expectedcountry3D.getName(),name.get(2));
        Assert.assertEquals(expectedcountry4D.getName(),name.get(3));
        Assert.assertEquals(expectedcountry5D.getName(),name.get(4));






    }


}
