package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.AdminPage;
import getLandEstate.pages.UnRegisteredPage;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class UnRegisteredStepDefinition {

    UnRegisteredPage unRegisteredPage = new UnRegisteredPage();

    AdminPage adminPage = new AdminPage();

    @When("kullanici contact butonuna tiklar")
    public void kullaniciContactButonunaTiklar() {
        unRegisteredPage.contactMenuButton.click();
    }

    @When("kullanici istenilen bilgileri girer {string},{string},{string},{string}")
    public void kullaniciIstenilenBilgileriGirer(String firstname, String lastname, String email, String message) {
        unRegisteredPage.firstNameInput.sendKeys(firstname,
                Keys.TAB,lastname,
                Keys.TAB,email,
                Keys.TAB,message
        );
    }

    @And("ben robot degilim kutucuguna tiklar")
    public void benRobotDegilimKutucugunaTiklar() {
        ReusableMethods.visibleWait(unRegisteredPage.notRobotIframe,3);
        Driver.getDriver().switchTo().frame(1);
        unRegisteredPage.notRobotCheckBox.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().defaultContent();
    }

    @And("send butonuna tiklar")
    public void sendButonunaTiklar() {
        ReusableMethods.click(unRegisteredPage.contactMessageSendButton);
    }

    @Then("mesajin gonderildigi dogrulanir")
    public void mesajinGonderildigiDogrulanir() {
        ReusableMethods.visibleWait(unRegisteredPage.contactMessageSuccess,3);
        String expectedData = "Success";
        String actualData = unRegisteredPage.contactMessageSuccess.getText();
        ReusableMethods.bekle(3);
        Assert.assertEquals(expectedData, actualData);
    }

    @Then("firstname alanina iki karakterden kucuk bir deger girer ve uyari alindigi dogrulanir")
    public void firstnameAlaninaIkiKarakterdenKucukBirDegerGirerVeUyariAlindigiDogrulanir() {
        ReusableMethods.bekle(5);
        unRegisteredPage.firstNameInput.sendKeys("a", Keys.TAB);
        ReusableMethods.bekle(5);
        String expectedData = "At least 2 characters";
        String actualData = unRegisteredPage.messageWarningText.getText();
        Assert.assertEquals(expectedData, actualData);
    }

    @And("lastname alanina iki karakterden kucuk bir deger girer ve uyari alindigi dogrulanir")
    public void lastnameAlaninaIkiKarakterdenKucukBirDegerGirerVeUyariAlindigiDogrulanir() {
        ReusableMethods.bekle(5);
        unRegisteredPage.lastNameInput.sendKeys("a", Keys.TAB);
        ReusableMethods.bekle(5);
        String expectedData = "At least 2 characters";
        String actualData = unRegisteredPage.messageWarningText.getText();
        Assert.assertEquals(expectedData, actualData);
    }

    @And("email formatina uygun mail adresi girilmediginde uyari metninin goruntulendigi dogrulanir")
    public void emailFormatinaUygunMailAdresiGirilmedigindeUyariMetnininGoruntulendigiDogrulanir() {
        unRegisteredPage.emailInput.sendKeys("abcabccom", Keys.TAB);
        String expectedData = "Invalid email";
        String actualData = unRegisteredPage.messageInvalidEmail.getText();
        Assert.assertEquals(expectedData, actualData);
    }

    @Then("kuyruklu a sembolu kullanilmadan email girildiginde uyari metninin goruntulendigi dogrulanir")
    public void kuyrukluASemboluKullanilmadanEmailGirildigindeUyariMetnininGoruntulendigiDogrulanir() {
        unRegisteredPage.emailInput.sendKeys("abcabc.com", Keys.TAB);
        Assert.assertTrue(unRegisteredPage.messageInvalidEmail.isDisplayed());
    }

    @Then("nokta sembolu kullanilmadan email girildiginde uyari metninin goruntulendigi dogrulanir")
    public void noktaSemboluKullanilmadanEmailGirildigindeUyariMetnininGoruntulendigiDogrulanir() {
        unRegisteredPage.emailInput.sendKeys("abc@abccom", Keys.TAB);
        Assert.assertTrue(unRegisteredPage.messageInvalidEmail.isDisplayed());
    }

    @When("Rent secenegini secer")
    public void rentSeceneginiSecer() {
        ReusableMethods.visibleWait(unRegisteredPage.rentButton, 5);
        unRegisteredPage.rentButton.click();
    }

    @And("arama kutusuna {string} girer")
    public void aramaKutusunaGirer(String str) {
        unRegisteredPage.searchBox.sendKeys(str);
    }

    @And("emlak tipi olarak House secer")
    public void emlakTipiOlarakHouseSecer() {
        ReusableMethods.visibleWait(unRegisteredPage.houseButton, 5);
        ReusableMethods.click(unRegisteredPage.houseButton);
    }

    @And("search iconuna tiklar")
    public void searchIconunaTiklar() {
        unRegisteredPage.searchIcon.click();
    }

    @Then("ilgili kiralik ilan sonuclarinin geldigini dogrular")
    public void ilgiliKiralikIlanSonuclarininGeldiginiDogrular() {
        ReusableMethods.visibleWait(unRegisteredPage.searchIcon, 5);
        unRegisteredPage.searchIcon.click();
        assertTrue(unRegisteredPage.firstAdvert.isDisplayed());
    }

    @And("emlak tipi olarak APARTMENT secer")
    public void emlakTipiOlarakAPARTMENTSecer() {
        unRegisteredPage.apartmentButton.click();
    }

    @And("emlak tipi olarak OFFICE secer")
    public void emlakTipiOlarakOFFICESecer() {
        unRegisteredPage.officeButton.click();
    }

    @When("Sale secenegini secer")
    public void saleSeceneginiSecer() {
        unRegisteredPage.saleButton.click();
    }

    @And("emlak tipi olarak VILLA secer")
    public void emlakTipiOlarakVILLASecer() {
        unRegisteredPage.villaButton.click();
    }

    @And("emlak tipi olarak LAND secer")
    public void emlakTipiOlarakLANDSecer() {
        unRegisteredPage.landButton.click();
    }

    @And("kullanici emlak tipi olarak SHOP secer")
    public void kullaniciEmlakTipiOlarakSHOPSecer() {
        unRegisteredPage.shopButton.click();
    }

    @And("price range degerlerini girer")
    public void priceRangeDegerleriniGirer() {
        unRegisteredPage.priceRangeMin.sendKeys("0", Keys.ENTER, "500000");
    }

    @And("ilan arama kategorilerini doldurur {string}, {string}, {string}, {string}, {string}")
    public void ilanAramaKategorileriniDoldurur(String type, String category, String country, String city, String district) {
        ReusableMethods.ddmVisibleText(unRegisteredPage.advertTypeMenu, type);
        ReusableMethods.ddmVisibleText(unRegisteredPage.categoryMenu, category);
        ReusableMethods.ddmVisibleText(unRegisteredPage.countryMenu, country);
        ReusableMethods.ddmVisibleText(unRegisteredPage.cityMenu, city);
        ReusableMethods.ddmVisibleText(unRegisteredPage.disctrictMenu, district);
    }

    @And("search butonuna tiklar")
    public void searchButonunaTiklar() {
        ReusableMethods.visibleWait(unRegisteredPage.submitSearch,5);
        unRegisteredPage.submitSearch.click();
    }

    @Then("ozel arama yapilarak ilanin goruldugunu dogrular")
    public void ozelAramaYapilarakIlaninGoruldugunuDogrular() {
        ReusableMethods.visibleWait(unRegisteredPage.firstAdvert, 5);
        assertTrue(unRegisteredPage.firstAdvert.isDisplayed());
    }

    @When("kullanici emlak tipi secer")
    public void kullaniciEmlakTipiSecer() {
        unRegisteredPage.saleButton.click();
    }

    @And("cikan ilk ilana tiklar")
    public void cikanIlkIlanaTiklar() {
        ReusableMethods.visibleWait(unRegisteredPage.firstAdvert,20);
        unRegisteredPage.firstAdvert.click();
    }

    @And("ilan resmini goruntuler")
    public void ilanResminiGoruntuler() {
        assertTrue(unRegisteredPage.estatePicture.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("description bilgilerini goruntuler")
    public void descriptionBilgileriniGoruntuler() {
        assertTrue(unRegisteredPage.estateDescription.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("details bilgilerini goruntuler")
    public void detailsBilgileriniGoruntuler() {
        assertTrue(unRegisteredPage.detailsSizeInfo.isDisplayed());
    }


    @Then("location bilgileri goruldugunu dogrular")
    public void locationBilgileriGoruldugunuDogrular() {
        assertFalse(unRegisteredPage.locationAddressInfo.getText().isEmpty());
    }

    @When("Rent secenegine tiklar ve emlak tipini secer")
    public void rentSecenegineTiklarVeEmlakTipiniSecer() {
        adminPage.multipleClick(unRegisteredPage.rentButton, unRegisteredPage.officeButton);
    }

    @And("price range bilgilerini girer")
    public void priceRangeBilgileriniGirer() {
        unRegisteredPage.priceRangeMin.sendKeys("1", Keys.TAB, "50000");
    }

    @And("contact number ve send mail kutusunda goz sembolune tiklar")
    public void contactNumberVeSendMailKutusundaGozSemboluneTiklar() {
        adminPage.multipleClick(unRegisteredPage.contactNumberEyeIcon, unRegisteredPage.sendMailEyeIcon);
    }

    @Then("{string} metnini gordugunu dogrular")
    public void metniniGordugunuDogrular(String text) {
        assertEquals(text, unRegisteredPage.createAccountPopUpText.getText());
    }

    @When("Sale secenegine tiklar ve emlak tipini secer")
    public void saleSecenegineTiklarVeEmlakTipiniSecer() {
        adminPage.multipleClick(unRegisteredPage.saleButton, unRegisteredPage.villaButton);
    }

    @And("Tour Date kutusuna tarih girilir")
    public void tourDateKutusunaTarihGirilir() {
        unRegisteredPage.tourDateMenu.sendKeys("10.10.2030");
    }

    @And("Tour Time kutusunda saat secilir")
    public void tourTimeKutusundaSaatSecilir() {
        ReusableMethods.ddmValue(unRegisteredPage.tourTimeMenu,"09:00");
    }

    @And("Submit a tour request butonuna tiklar")
    public void submitATourRequestButonunaTiklar() {
        unRegisteredPage.submitButton.click();
    }

    @And("{string} ve {string} uyari mesajlarini goruntuler")
    public void veUyariMesajlariniGoruntuler(String text1, String text2) {
        assertTrue(text1,unRegisteredPage.tourRequestPopUpText.isDisplayed());
        assertTrue(text2,unRegisteredPage.createAccountPopUpText.isDisplayed());
    }

    @Then("Kayit yapilmadan randevu istegi yapilamadigini dogrular")
    public void kayitYapilmadanRandevuIstegiYapilamadiginiDogrular() {
        assertEquals("Create one now!",unRegisteredPage.createOneNowText.getText());
        ReusableMethods.bekle(5);
    }

    @And("Create one now metnine tiklar")
    public void createOneNowMetnineTiklar() {
        unRegisteredPage.createOneNowText.click();
    }

    @Then("register sayfasinin acildigini dogrular")
    public void registerSayfasininAcildiginiDogrular() {
        ReusableMethods.bekle(5);
        assertTrue(unRegisteredPage.registerButton.isDisplayed());
    }
}
