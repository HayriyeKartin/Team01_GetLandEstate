package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.ManagerPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

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

    @Given("kullanici web sayfasina gider")
    public void kullaniciWebSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("kullanici email ve password bilgileriylen login olur")
    public void kullaniciEmailVePasswordBilgileriylenLoginOlur() {
        ReusableMethods.bekle(5);
        managerPage.eMail.sendKeys(ConfigReader.getProperty("manageremail"));
        managerPage.paswordd.sendKeys(ConfigReader.getProperty("managerpassword"));
        managerPage.Login.click();
    }

    @And("Back to Site butonuna tiklar")
    public void backToSiteButonunaTiklar() {
        managerPage.backToSiteButtonn.click();
    }

    @And("kullanici profil sekmesine tiklar")
    public void kullaniciProfilSekmesineTiklar() {
        managerPage.profileButtonn.click();
    }

    @And("kullanici tur istekleri sekmesine tiklar")
    public void kullaniciTurIstekleriSekmesineTiklar() {
        managerPage.myTourRequests.click();
    }

    @And("kullanici my responses basligina tiklar")
    public void kullaniciMyResponsesBasliginaTiklar() {
        managerPage.myResponsess.click();
    }

    @Then("kullanici randevu isteginin goruntulendigini dogrular")
    public void kullaniciRandevuIstegininGoruntulendiginiDogrular() {
        Assert.assertTrue(managerPage.randevuIstekGoruntuleme.isDisplayed());
    }

    //TC02

    @And("kullanici randevu istegini reddeder")
    public void kullaniciRandevuIsteginiReddeder() {
        managerPage.randevuRed.click();
    }

    @And("kullanici randevu isteginin reddini onaylar")
    public void kullaniciRandevuIstegininReddiniOnaylar() {
        managerPage.randevuRedOnay.click();
    }

    @Then("kullanici randevu isteginin reddini dogrular")
    public void kullaniciRandevuIstegininReddiniDogrular() {
        Assert.assertEquals(managerPage.randevuRedDogrulama.getText(),"DECLINED");
    }

    @And("kullanici randevu istegini kabul eder")
    public void kullaniciRandevuIsteginiKabulEder() {
        managerPage.randevuKabul.click();
    }

    @And("kullanici randevu isteginin kabulunu onaylar")
    public void kullaniciRandevuIstegininKabulunuOnaylar() {
        managerPage.randevuKabulOnay.click();
    }

    @Then("kullanici randevu isteginin kabulunu dogrular")
    public void kullaniciRandevuIstegininKabulunuDogrular() {
        Assert.assertEquals(managerPage.randevuKabulDogrulama.getText(),"APPROVED");
    }

    @And("kullanici menuden tour request sekmesine tiklar")
    public void kullaniciMenudenTourRequestSekmesineTiklar() {
        managerPage.tourRequest.click();
    }

    @And("kullanici arama kutusuna tur talabi gonderilicek ilani yazar")
    public void kullaniciAramaKutusunaTurTalabiGonderilicekIlaniYazar() {
        managerPage.searchBox.sendKeys("Best 210");
    }

    @And("kullanici arama butonuna tiklar")
    public void kullaniciAramaButonunaTiklar() {
        managerPage.searchBoxForClick.click();
    }

    @And("kullanici tur talebi gonderilecek ilani secer")
    public void kullaniciTurTalebiGonderilecekIlaniSecer() {
        managerPage.ilanSec.click();
    }

    @And("kullanici tur tarihi ve tur suresini secer")
    public void kullaniciTurTarihiVeTurSuresiniSecer() {
        managerPage.turTarihSec.sendKeys("26.06.2024");
        ReusableMethods.ddmValue(managerPage.turSaatSec,"02:00");
    }

    @And("kullanici submit a tour request butonuna tiklar")
    public void kullaniciSubmitATourRequestButonunaTiklar() {
        managerPage.submitTourRequest.click();
    }

    @Then("kullanici tur talebinin gonderildigini dogrular")
    public void kullaniciTurTalebininGonderildiginiDogrular() {
        ReusableMethods.visibleWait(managerPage.talepDogrulama,3);
        Assert.assertTrue(managerPage.talepDogrulama.isDisplayed());
    }

    @And("kullanici My Requests basligina tiklar")
    public void kullaniciMyRequestsBasliginaTiklar() {
        managerPage.MyRequests.click();
    }

    @Then("kullanici tur talebinin onaylanip onaylanmadigini dogrular")
    public void kullaniciTurTalebininOnaylanipOnaylanmadiginiDogrular() {
        Assert.assertEquals(managerPage.verification.getText(),"APPROVED");
    }
}


