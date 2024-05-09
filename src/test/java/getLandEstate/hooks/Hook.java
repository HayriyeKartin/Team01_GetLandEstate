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
    @Before("@ApiAdminMehmet")
    public void apiAdminM(){
        setUp(ConfigReader.getProperty("adminMailMehmet"), ConfigReader.getProperty("adminPasswordMehmet"));
    }
    @Before("@ApiManagerMehmet")
    public void apiManagerM(){
        setUp(ConfigReader.getProperty("managerMailMehmet"), ConfigReader.getProperty("managerPasswordMehmet"));
    }
    @Before("@ApiCustomerMehmet")
    public void apiCustomerM(){
        setUp(ConfigReader.getProperty("customerMailMehmet"), ConfigReader.getProperty("customerPasswordMehmet"));
    }







    //Akın155



















    //Süleyman175



















    //Bilal195



















    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}