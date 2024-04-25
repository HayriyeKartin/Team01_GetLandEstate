package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.AdminPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminStepDefinition {

    AdminPage adminPage = new AdminPage();














































































































































































































































































    //US_21 Selahattin - 286
    //TC_01
    @Given("kullanici URL e gider")
    public void kullaniciURLEgider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        ReusableMethods.click(adminPage.loginButton);
    }

    @And("Email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        adminPage.AdEmail.sendKeys(ConfigReader.getProperty("AdLoginEmail"));
        adminPage.AdPassword.sendKeys(ConfigReader.getProperty("AdLoginPassword"));
        ReusableMethods.click(adminPage.submitLogin);
    }

    @And("Contact messages sayfasına gider")
    public void contactMessagesSayfasinaGider() {
        ReusableMethods.click(adminPage.contactMessages);
    }

    @And("Mesaj listesi goruntulenir")
    public void mesajListesiGoruntulenir() {
        adminPage.inComingMessage.click();
        ReusableMethods.bekle(2);
        String expectedData = "Admin Mesaj Testi";
        String actualData = adminPage.inComingMessageText.getText();
        Assert.assertEquals(expectedData, actualData);
        ReusableMethods.bekle(2);
    }
    @And("Bir mesaji secer ve siler")
    public void birMesajiSecerVeSiler() {
        adminPage.deleteMessageIcon.click();
        ReusableMethods.bekle(3);
    }

    @Then("Mesajin silindigini dogrular")
    public void mesajinSilindiginiDogrular() {
        Assert.assertTrue(adminPage.inComingMessageText.isDisplayed());
    }

    //TC_02
    @And("Okunmamis mesajlari kontrol eder")
    public void okunmamisMesajlariKontrolEder(){
        ReusableMethods.click(adminPage.contactMessages);
        ReusableMethods.click(adminPage.filterButton);
        ReusableMethods.click(adminPage.unReadMessages);
        ReusableMethods.click(adminPage.applyFilters);

    }
    @And("Bir mesaji secer ve okundu olarak isaretler")
    public void birMesajiSecerVeOkunduOlarakIsaretler(){
        ReusableMethods.click(adminPage.inComingMessage);
        ReusableMethods.click(adminPage.markAsReadIcon);

    }

    @Then("Mesajin okundu olarak isaretlendigini dogrular")
    public void mesajinOkunduOlarakIsaretlendiginiDogrular(){
        ReusableMethods.click(adminPage.contactMessages);
        ReusableMethods.click(adminPage.filterButton);
        ReusableMethods.click(adminPage.readMessages);
        ReusableMethods.click(adminPage.applyFilters);
        String expText = "Mark as unread";
        String actText = adminPage.markAsUnreadIcon.getAttribute("title");
        Assert.assertEquals(expText,actText);

    }
    //TC_03
    @And("Arama cubuguna gecerli bir sorgu girer")
    public void aramaCubugunaGecerliBirSorguGirer() {
        ReusableMethods.click(adminPage.contactMessages);
        adminPage.searchBox.sendKeys("Admin test4");
    }

    @And("Arama butonuna tiklar")
    public void aramaButonunaTiklar() {
        ReusableMethods.click(adminPage.searchButton);
    }

    @Then("Arama sonuclari goruntulenir")
    public void aramaSonuclariGoruntulenir() {
        adminPage.message4.isDisplayed();
    }
    //TC_04
    @And("Filtre ikonuna tiklar")
    public void filtreIkonunaTiklar() {
        ReusableMethods.click(adminPage.filterButton);
    }

    @And("Bir tarih araligi secer")
    public void birTarihAraligiSecer() {
        adminPage.startDate.sendKeys("16.04.2024");
        adminPage.endDate.sendKeys("25.04.2024");
    }

    @And("Apply Filters butonuna tiklar")
    public void applyFiltersButonunaTiklar() {
        ReusableMethods.click(adminPage.applyFilters);
    }
    @Then("Sonuclar goruntulenir")
    public void sonuclarGoruntulenir() {
        Assert.assertTrue(adminPage.firstMessage.isDisplayed());
    }

}
















































































































