package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.ManagerPage;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ManagerStepDefinition {
   ManagerPage managerPage = new ManagerPage();

//    @Given("Kullanici {string} sayfasina gider")
//    public void kullanici_sayfasina_gider(String url) {
//        Driver.getDriver().get(url);
//
//    }
    @When("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        managerPage.girisButonu.click();
    }

    @Then("Kullanici {string} ve {string} ile login olur")
    public void kullaniciVeIleLoginOlur(String emaill, String passwordd) {
        ReusableMethods.bekle(5);
        managerPage.emaill.sendKeys(emaill);
        managerPage.passwordd.sendKeys(passwordd, Keys.ENTER);
    }

    @And("Kullanici siteye geri don sekmesine tiklar")
    public void kullanici_siteye_geri_don_sekmesine_tiklar() {
        managerPage.backToSite.click();

    }
    @And("Kullanici profile sekmesine tiklar")
    public void kullanici_profile_sekmesine_tiklar() {
        managerPage.profileButton.click();

    }
    @And("Kullanici ilanlarim sekmesine tiklar")
    public void kullanici_ilanlarim_sekmesine_tiklar() {
       managerPage.ilanlarim.click();

    }
    @And("Kullanici sayfada ilan oldugunu dogrular")
    public void kullanici_sayfada_ilan_oldugunu_dogrular() {
        Assert.assertTrue(managerPage.kayitliIlan.isDisplayed());

    }
    @And("Kullanici ilani guncelle sekmesine tiklar")
    public void kullanici_ilani_guncelle_sekmesine_tiklar() {
        managerPage.guncelleikon.click();

    }
    @And("Kullanici ilani guncellendigini dogrular")
    public void kullanici_ilani_guncellendigini_dogrular() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(managerPage.textMessage.isDisplayed());

    }
    @And("Kullanici ilani siler")
    public void kullanici_ilani_siler() {
        managerPage.deleteButton.click();

    }
    @And("Kullanici ilanin silebildigini dogrular")
    public void kullanici_ilanin_silebildigini_dogrular() {
        managerPage.deleteYes.click();
        Assert.assertTrue(managerPage.deleteMessage.isDisplayed());

    }
     @And("sayfayi kapatir")
   public void sayfayi_kapatir() {

    }

    @And("Kullanici sayfanin Yayinlama Tarihi icerdigini dogrular")
    public void kullanici_sayfanin_yayinlama_tarihi_icerdigini_dogrular() {
        Assert.assertTrue(managerPage.yayinlamaTarihi.isDisplayed());

    }
    @And("Kullanici sayfanin Durum icerdigini dogrular")
    public void kullanici_sayfanin_durum_icerdigini_dogrular() {
        Assert.assertTrue(managerPage.durumButonu.isDisplayed());

    }
    @And("Kullanici sayfanin Goruntuleme-Begeni-Tur icerdigini dogrular")
    public void kullanici_sayfanin_goruntuleme_begeni_tur_icerdigini_dogrular() {
        Assert.assertTrue(managerPage.goruntulemeBegeniTur.isDisplayed());

    }

    // ------------------------ US18-------------------------------------------------------

    @And("Kullanici ev kategorisine tiklar")
    public void kullaniciEvKategorisineTiklar() {
        managerPage.evKategori.click();
    }


    @And("Kullanici liste de sekizinci ilana tiklar")
    public void kullaniciListeDeSekizinciIlanaTiklar() {
        managerPage.sekizinciIlan.click();
    }



    @And("Kullanici sayfanin tur ayarla icerdigini test eder")
    public void kullaniciSayfaninTurAyarlaIcerdiginiTestEder(String TurAyarla) {
        Assert.assertTrue(managerPage.turAyarla.getText().contains(TurAyarla));
    }


    @And("Kullanici tarih alanina deger girer")
    public void kullaniciTarihAlaninaDegerGirer() {
        managerPage.tarihAlani.sendKeys("26.06.2024");
    }

    @And("Kullanici saat alanina deger girer")
    public void kullaniciSaatAlaninaDegerGirer() {
        managerPage.saatAlani.sendKeys("2");
    }

    @And("Kullanici Tur talebi gönder butonuna tiklar")
    public void kullaniciTurTalebiGönderButonunaTiklar() {
        managerPage.turTalebiGonder.click();

    }


    @And("Kullanici  bilgi mesajı alir")
    public void kullaniciBilgiMesajıAlir() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(managerPage.turTalebiBilgiMesaji.isDisplayed());

    }


    @And("Kullanici Tur taleplerim  sekmesine tiklar")
    public void kullaniciTurTaleplerimSekmesineTiklar() {
        managerPage.turTaleblerim.click();
    }

    @And("Kullanici Tur cevaplarim sekmesine tiklar")
    public void kullaniciTurCevaplarimSekmesineTiklar() {
        managerPage.turCevaplarim.click();

    }
    @And("Kullanici ilan istegini gorebilmeli")
    public void kullaniciIlanIsteginiGorebilmeli() {
        Assert.assertTrue(managerPage.ilanistegi.isDisplayed());
    }

    @And("Kullanici red butonunu dogrular")
    public void kullaniciRedButonunuDogrular() {
        Assert.assertTrue(managerPage.redButonu.isDisplayed());
    }

    @And("Kullanici kabul butonunu dogrular")
    public void kullaniciKabulButonunuDogrular() {
        Assert.assertTrue(managerPage.onayButonu.isDisplayed());


    }}