package getLandEstate.hooks;

import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static getLandEstate.baseUrl.BaseUrl.setUp;

public class Hook {

    //Hayriye
    @Before("@ApiAdminHayriye")
    public void apiAdmin(){
        setUp(ConfigReader.getProperty("adminMailHayriye"), ConfigReader.getProperty("adminPasswordHayriye"));
    }















    //Gülsüm



















    //Hafsa



















    //Fatih



















    //Selahattin



















    //Arzu



















    //Mehmet



















    //Akın



















    //Süleyman



















    //Bilal





    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}