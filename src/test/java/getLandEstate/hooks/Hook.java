package getLandEstate.hooks;

import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static getLandEstate.baseUrl.BaseUrl.setUp;

public class Hook {

    //Hayriye15
    @Before("@ApiAdminHayriye")
    public void apiAdmin(){
        setUp(ConfigReader.getProperty("adminMailHayriye"), ConfigReader.getProperty("adminPasswordHayriye"));
    }















    //Gülsüm35



















    //Hafsa55



















    //Fatih75



















    //Selahattin95



















    //Arzu115



















    //Mehmet135



















    //Akın155



















    //Süleyman175



















    //Bilal195





























    @After //225.satırda
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}
