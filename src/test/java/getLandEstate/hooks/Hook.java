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

    @Before("@ApiAdminGulsum")
    public void apiAdminGulsum() {
        setUp("admin@gulsum.com", "Gulsum61!");
    }

    @Before("@ApiCustomerGulsum")
    public void apiCustomerGulsum() {
        setUp("customer@gulsum.com", "Gulsum61!");
    }

    @Before("@ApiManagerGulsum")
    public void apiManagerGulsum() {
        setUp("manager@gulsum.com", "Gulsumm61!");
    }




    //Hafsa55



















    //Fatih75



















    //Selahattin95



















    //Arzu115
    @Before("@ApiAdminArzu")
    public void apiAdminArzu(){
        setUp("admin@arzu.com","Arzub01*");
    }

    @Before("@ApiCustomerArzu")
    public void apiCustomerArzu(){
        setUp("customer@arzu.com","Arzub01*");
    }










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