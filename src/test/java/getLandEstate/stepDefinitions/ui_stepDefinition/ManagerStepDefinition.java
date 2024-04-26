package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.ManagerPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ManagerStepDefinition {
    ManagerPage managerPage = new ManagerPage();


    @Given("Kullanici getLandEstate web sayfasina gider")
    public void kullaniciGetLandEstateWebSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        ReusableMethods.bekle(5);
        managerPage.loginButonu.click();
    }

    @Then("Kullanici {string} ve {string} ile login olur")
    public void kullaniciVeIleLoginOlur(String emaill, String passwordd) {
        ReusableMethods.bekle(5);
        managerPage.emaill.sendKeys(emaill);
        managerPage.passwordd.sendKeys(passwordd, Keys.ENTER);
    }

    @And("Kullanici profile sekmesine tiklar")
    public void kullaniciProfileSekmesineTiklar() {
        managerPage.profileButton.click();
    }

    @And("Kullanici ilanlarim sekmesine tiklar")
    public void kullaniciIlanlarimSekmesineTiklar() {
        managerPage.ilanlarim.click();
    }

    @And("Kullanici sayfada ilan oldugunu dogrular")
    public void kullaniciSayfadaIlanOldugunuDogrular() {
        Assert.assertTrue(managerPage.kayitliIlan.isDisplayed());
    }

    @And("Kullanici ilani guncelle sekmesine tiklar")
    public void kullaniciIlaniGuncelleSekmesineTiklar() {
        managerPage.guncelleikon.click();
    }

    @And("Kullanici ilani guncellendigini dogrular")
    public void kullaniciIlaniGuncellendiginiDogrular() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(managerPage.textMessage.isDisplayed());
    }

    @And("Kullanici ilani siler")
    public void kullaniciIlaniSiler() {
        managerPage.deleteButton.click();
    }

    @And("Kullanici ilanin silebildigini dogrular")
    public void kullaniciIlaninSilebildiginiDogrular() {
        managerPage.deleteYes.click();
        Assert.assertTrue(managerPage.deleteMessage.isDisplayed());
    }

    @And("Kullanici sayfanin Yayinlama Tarihi icerdigini dogrular")
    public void kullaniciSayfaninYayinlamaTarihiIcerdiginiDogrular() {
        Assert.assertTrue(managerPage.yayinlamaTarihi.isDisplayed());
    }

    @And("Kullanici sayfanin Durum icerdigini dogrular")
    public void kullaniciSayfaninDurumIcerdiginiDogrular() {
        Assert.assertTrue(managerPage.durumButonu.isDisplayed());
    }

    @And("Kullanici sayfanin Goruntuleme-Begeni-Tur icerdigini dogrular")
    public void kullaniciSayfaninGoruntulemeBegeniTurIcerdiginiDogrular() {
        Assert.assertTrue(managerPage.goruntulemeBegeniTur.isDisplayed());
    }
    //--------------------------US18------------------------------------------------

    @When("Sayfanin sag ust bolumundeki Login butonuna tiklayarak giris ekranina ulasir.")
    public void sayfaninSagUstBolumundekiLoginButonunaTiklayarakGirisEkraninaUlasir() {
       managerPage.loginButonu.click();
    }

    @Then("Kullanici ilgili alanlara Email ve Enter password bilgisini yazar ve giris yapar.")
    public void kullaniciIlgiliAlanlaraEmailVeEnterPasswordBilgisiniYazarVeGirisYapar() {
        managerPage.emailKutusu.sendKeys("iamhafsa94@gmail.com");
        managerPage.passwordKutusu.sendKeys("Hafsa.46");
    }

    @And("Acilan sayfada soldaki menuden Back to Site butonuna tiklar.")
    public void acilanSayfadaSoldakiMenudenBackToSiteButonunaTiklar() {
        managerPage.backToSiteButonu.click();
    }

    @And("Kullanici acilan sayfada Properties bolumune tiklar")
    public void kullaniciAcilanSayfadaPropertiesBolumuneTiklar() {
        managerPage.propertiesKutucugu.click();
    }

    @And("Kullanici acilan sayfada istedigi ilani secer")
    public void kullaniciAcilanSayfadaIstedigiIlaniSecer() {
        ReusableMethods.click(managerPage.cankayaAnkara);
        ReusableMethods.visibleWait(managerPage.cankayaAnkara, 5);
    }

    @And("Kullanici sayfanin sag kismindaki Schedule a tour bolumunden gun ay yil ve saat bolumlerini doldurur")
    public void kullaniciSayfaninSagKismindakiScheduleATourBolumundenGunAyYilVeSaatBolumleriniDoldurur() {
        managerPage.gunAyTarih.sendKeys("27042027", Keys.TAB, "1");
        ReusableMethods.bekle(2);
    }

    @And("islemler tamamlandiktan sonra Submit a tour request butonuna tiklar")
    public void islemlerTamamlandiktanSonraSubmitATourRequestButonunaTiklar() {
        managerPage.submitButonu.click();
        ReusableMethods.bekle(2);
    }

    @And("Kullanici bilgi mesajini aldigini dogrular")
    public void kullaniciBilgiMesajiniAldiginiDogrular() {
        Assert.assertTrue(managerPage.bilgiMesaji.isDisplayed());
    }

    @And("Kullanici sag ust kisimdaki profil bolumune tiklar ve My Tour Requests'e tiklar")
    public void kullaniciSagUstKisimdakiProfilBolumuneTiklarVeMyTourRequestsETiklar() {
        managerPage.profilBolumu.click();
        managerPage.myToRequest.click();
        ReusableMethods.bekle(5);
    }

    @And("Acilan pencerede My Responses bolumune tiklar")
    public void acilanPenceredeMyResponsesBolumuneTiklar() {
        managerPage.myResponses.click();
        Assert.assertTrue(managerPage.ilanDogrulama1.isDisplayed());
        ReusableMethods.bekle(5);
    }

    @And("Kullanici red butonunu dogrular")
    public void kullaniciRedButonunuDogrular() {
        Assert.assertTrue(managerPage.redButonu.isDisplayed());
    }

    @And("Kullanici onay butonunu dogrular")
    public void kullaniciOnayButonunuDogrular() {
        Assert.assertTrue(managerPage.onayButonu.isDisplayed());
    }
}


