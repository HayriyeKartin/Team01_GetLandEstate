package getLandEstate.hooks;

import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.time.Duration;
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
    @Before("@FatihAdmin")
    public void apiAdminFatih(){setUp("juniel.nova@foodfarms.net","asdFG123456.");
    }

    @Before("@FatihCustomer")
    public void apiCustomerFatih(){
        setUp("abdulmohsen.octavis@foodfarms.net","asdFG123456.");
    }











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
    @Before("@ApiUS08LogControllerAdmin")
    public void ApiUS08LogControllerAdmin(){
        setUp("suleymanakgun1710@gmail.com","12345Sa.");
    }
    @Before("@ApiUS12CountryControllerAdmin")
    public void ApiUS12CountryControllerAdmin() {
        setUp("suleymanakgun1710@gmail.com","12345Sa.");
    }



    @Before("@ApiUS08LogControllerCustomer")
    public void ApiUS08LogControllerCustomer(){
        setUp("abc@gmail.com","12345Sa.");
    }


    @Before("@ApiUS12CountryControllerCustomer")
    public void ApiUS12CountryControllerCustomer(){
        setUp("abc@gmail.com","12345Sa.");
    }

    //Bilal195

    @Before("@ApiAdminBilal")
    public void apiAdminBilal() {
        setUp("payiz@gmail.com", "Payiz23.");
    }











   
  
  
  
  
  
  
  
  
  
  @After //225.satırda
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }

















   
  
  
  
  
  //Süleyman255 devamı
    @Before("@ApiUS08LogControllerManagerTC03")
    public void ApiUS08LogControllerManagerTC03(){
        setUp("hij@gmail.com","12345Sa.");
    }
    @Before("@ApiUS08LogControllerManagerTC04")
    public void ApiUS08LogControllerManager(){
        setUp("hij@gmail.com","12345Sa.");
    }
    @Before("@ApiUS12CountryControllerManager")
    public void ApiUS12CountryControllerManager(){
        setUp("hij@gmail.com","12345Sa.");
    }
    @Before("@US09AdvertE2ETC02")
    public void US09AdvertE2ETC0(){
        //setUp(ConfigReader.getProperty("adminMail"), ConfigReader.getProperty("sifre"));
        setUp("suleymanakgun1710@gmail.com","12345Sa.");
    }


}