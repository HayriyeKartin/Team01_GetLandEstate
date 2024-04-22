package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.AdminPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminStepDefinition {

    AdminPage adminPage = new AdminPage();

    //US_21 Selahattin
    @Given("kullanici URL e gider")
    public void kullaniciURLEgider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar(){
        adminPage.loginButton.click();
    }

    @And("Email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur(){
        adminPage.AdEmail.sendKeys(ConfigReader.getProperty("AdLoginEmail"));
        adminPage.AdPassword.sendKeys(ConfigReader.getProperty("AdLoginPassword"));
        adminPage.submitLogin.click();
    }

    @And("Contact messages sayfasına gider")
    public void contactMessagesSayfasinaGider() {
        adminPage.contactMessages.click();
    }

    @And("Mesaj listesi goruntulenir")
    public void mesajListesiGoruntulenir() {
        adminPage.firstMessage.isDisplayed();
    }

    @And("Bir mesaji secer ve siler")
    public void birMesajiSecerVeSiler(){
        adminPage.test5Message.click();
        adminPage.deleteMessage.click();
    }

    @And("Mesajin silindigini dogrular")
    public void mesajinSilindiginiDogrular() {
        Assert.assertFalse(adminPage.test5Message.isDisplayed());
    }

    @And("Okunmamis mesajlari kontrol eder")
    public void okunmamisMesajlariKontrolEder(){
        adminPage.contactMessages.click();
        adminPage.filterButton.click();
        adminPage.unReadMessages.click();
        adminPage.applyFilters.click();


    }
    @And("Bir mesaji secer ve okundu olarak isaretler")
    public void birMesajiSecerVeOkunduOlarakIsaretler(){
        adminPage.message4.click();
        adminPage.markAsRead.click();
    }

    @Then("Mesajin okundu olarak isaretlendigini dogrular")
    public void mesajinOkunduOlarakIsaretlendiginiDogrular(){
        adminPage.contactMessages.click();
        adminPage.filterButton.click();
        adminPage.readMessages.click();
        adminPage.message4.isDisplayed();
    }



}