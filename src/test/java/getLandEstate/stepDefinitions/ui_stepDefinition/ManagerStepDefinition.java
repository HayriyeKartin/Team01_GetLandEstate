package getLandEstate.stepDefinitions.ui_stepDefinition;

import com.github.javafaker.Faker;
import getLandEstate.pages.ManagerPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class ManagerStepDefinition {
    ManagerPage managerPage = new ManagerPage();
    Faker faker = new Faker();


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
        managerPage.eMail.sendKeys(ConfigReader.getProperty("managerMailMehmet"));
        managerPage.paswordd.sendKeys(ConfigReader.getProperty("managerPasswordMehmet"));
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
        ReusableMethods.visibleWait(managerPage.myResponsess,5);
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

    //US17
    @When("kullanici giris bilgileriyle login olur")
    public void kullaniciGirisBilgileriyleLoginOlur() {

        managerPage.email.sendKeys(ConfigReader.getProperty("email"));
        managerPage.password.sendKeys(ConfigReader.getProperty("passwordd"), Keys.ENTER);

    }

    @And("menuden reports secenegine tiklar")
    public void menudenReportsSecenegineTiklar() {
        managerPage.reports.click();
    }

    @When("ADVERTS basligi altindaki {string}, {string}, category, advertType, status alaninda gecerli secim yapilir")
    public void advertsBasligiAltindakiCategoryAdvertTypeStatusAlanindaGecerliSecimYapilir(String startDate, String endDate) {
        managerPage.advertsStartDate.sendKeys(startDate,
                Keys.TAB,endDate);
        ReusableMethods.ddmVisibleText(managerPage.advertsCategory, "Villa");
        ReusableMethods.ddmVisibleText(managerPage.advertType, "Rent");
        ReusableMethods.ddmVisibleText(managerPage.advertsStatus, "Activated");
    }

    @And("adverts excel ikonuna tiklanir")
    public void advertsExcelIkonunaTiklanir() {
        managerPage.advertsExcelIcon.click();
    }

    @Then("Success mesajinin goruntulendigi dogrulanir")
    public void successMesajininGoruntulendigiDogrulanir() {
        ReusableMethods.visibleWait(managerPage.messageSuccess,5);
        Assert.assertTrue(managerPage.messageSuccess.isDisplayed());
    }

    @When("MOST POPULAR PROPERTIES basligi altinda Amount alanina gecerli bir deger girilir")
    public void mostPOPULARPROPERTIESBasligiAltindaAmountAlaninaGecerliBirDegerGirilir() {
        ReusableMethods.deleteMethod(managerPage.amount);
        managerPage.amount.sendKeys("5");
    }

    @And("amount excel ikonuna tiklanir")
    public void amountExcelIkonunaTiklanir() {
        managerPage.amountExcelIcon.click();
    }

    @When("USERS basligi altindaki rollerden biri secilir")
    public void usersBasligiAltindakiRollerdenBiriSecilir() {
        ReusableMethods.ddmVisibleText(managerPage.users, "MANAGER");
    }

    @And("users excel ikonuna tiklanir")
    public void usersExcelIkonunaTiklanir() {
        managerPage.usersExcelIcon.click();
    }

    @When("TOUR REQUESTS basligi altindaki {string}, {string}, {string} alaninda gecerli secim yapilir")
    public void tourREQUESTSBasligiAltindakiAlanindaGecerliSecimYapilir(String startDate, String endDate, String status) {
        managerPage.tourRequestStartDate.sendKeys(startDate,
                Keys.TAB,endDate,
                Keys.TAB, status
        );
    }

    @And("tourRequest excel ikonuna tiklanir")
    public void tourrequestExcelIkonunaTiklanir() {
        managerPage.tourRequestExcelIcon.click();
    }

    //US20
    @And("ContactMessages butonuna tiklar")
    public void contactmessagesButonunaTiklar() {
        managerPage.contactMessageSend();
        ReusableMethods.bekle(3);
        managerPage.contactMessagesButton.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(5);
    }

    @Then("gelen mesaja tiklar ve mesajin goruntulendigini dogrular")
    public void gelenMesajaTiklarVeMesajinGoruntulendiginiDogrular() {
        managerPage.inComingMessage.click();
        ReusableMethods.bekle(2);
        String expectedData = "Merhaba, sayfanızda ilan vermek istiyorum.";
        String actualData = managerPage.inComingMessageText.getText();
        Assert.assertEquals(expectedData, actualData);
        ReusableMethods.bekle(2);
    }

    @Then("gelen mesaji siler ve mesajin silindigini dogrular")
    public void gelenMesajiSilerVeMesajinSilindiginiDogrular() {
        managerPage.deleteMessageIcon.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(managerPage.inComingMessageText.isDisplayed());
    }

    @When("gelen mesaja tiklar")
    public void gelenMesajaTiklar() {
        managerPage.inComingMessage.click();
        ReusableMethods.bekle(2);
    }

    @And("mark as read ikonuna tiklar")
    public void markAsReadIkonunaTiklar() {
        managerPage.markAsReadIcon.click();
        ReusableMethods.bekle(2);
    }

    @Then("mesajin okundu olarak isaretlendigini dogrular")
    public void mesajinOkunduOlarakIsaretlendiginiDogrular() {
        String expectedData = "Mark as unread";
        String actualData = managerPage.markAsUnreadIcon.getAttribute("title");
        Assert.assertEquals(expectedData, actualData);
        ReusableMethods.bekle(2);
    }

    @When("arama kutusuna gecerli bir deger girer ve arama butonuna tiklar")
    public void aramaKutusunaGecerliBirDegerGirerVeAramaButonunaTiklar() {
        managerPage.messageSearchBox.sendKeys("customer@hayriye.com");
        managerPage.messageSearchButton.click();
    }

    @Then("arama sonucunun goruntulendigini dogrular")
    public void aramaSonucununGoruntulendiginiDogrular() {
        String expectedData = "customer@hayriye.com";
        String actualData = managerPage.messageSearchResult.getText();
        Assert.assertEquals(expectedData, actualData);
    }

    @When("filtreleme ikonuna tiklar")
    public void filtrelemeIkonunaTiklar() {
        managerPage.messageFilterButton.click();
    }

    @And("okunan mesajlari secer")
    public void okunanMesajlariSecer() {
        ReusableMethods.ddmVisibleText(managerPage.messageFilterSelect, "Read");
    }

    @And("baslangic ve bitis tarihi secer")
    public void baslangicVeBitisTarihiSecer() {
        managerPage.messageFilterStartDate.sendKeys("01.04.2024");
        managerPage.messageFilterEndDate.sendKeys("30.04.2024");
    }

    @Then("filtreleme sonuclarinin goruntulendigini dogrular")
    public void filtrelemeSonuclarininGoruntulendiginiDogrular() {
        Assert.assertTrue(managerPage.filterMessage.isDisplayed());
    }

    @And("okunmayan mesajlari secer")
    public void okunmayanMesajlariSecer() {
        ReusableMethods.ddmVisibleText(managerPage.messageFilterSelect, "Unread");
    }

    @Then("kullanici sayfa dilinin default olarak ingilizce oldugunu dogrular")
    public void kullaniciSayfaDilininDefaultOlarakIngilizceOldugunuDogrular() {
        String expectedData = "Home";
        String actualData = managerPage.homeMenuButton.getText();
        assertEquals(expectedData, actualData);
    }

    @Then("turkce dil secenegini secer ve sayfa dilinin turkce oldugunu dogrular")
    public void turkceDilSeceneginiSecerVeSayfaDilininTurkceOldugunuDogrular() {
        managerPage.flagIconButton.click();
        managerPage.trFlagIconButton.click();
        String expectedData = "Anasayfa";
        String actualData = managerPage.anasayfaMenuButton.getText();
        assertEquals(expectedData, actualData);
    }

    @Then("fransizca dil secenegini secer ve sayfa dilinin fransizca oldugunu dogrular")
    public void fransizcaDilSeceneginiSecerVeSayfaDilininFransizcaOldugunuDogrular() {
        managerPage.flagIconButton.click();
        managerPage.frFlagIconButton.click();
        String expectedData = "Accueil";
        String actualData = managerPage.accueilMenuButton.getText();
        assertEquals(expectedData, actualData);
    }

    @Then("almanca dil secenegini secer ve sayfa dilinin almanca oldugunu dogrular")
    public void almancaDilSeceneginiSecerVeSayfaDilininAlmancaOldugunuDogrular() {
        managerPage.flagIconButton.click();
        managerPage.deFlagIconButton.click();
        String expectedData = "Zuhause";
        String actualData = managerPage.zuhauseMenuButton.getText();
        assertEquals(expectedData, actualData);
    }

    @Then("ispanyolca dil secenegini secer ve sayfa dilinin ispanyolca oldugunu dogrular")
    public void ispanyolcaDilSeceneginiSecerVeSayfaDilininIspanyolcaOldugunuDogrular() {
        managerPage.flagIconButton.click();
        managerPage.esFlagIconButton.click();
        String expectedData = "Inicio";
        String actualData = managerPage.inicioMenuButton.getText();
        assertEquals(expectedData, actualData);
    }
    @And("Create Property butonuna tiklar")
    public void createPropertyButonunaTiklar() {
        managerPage.createPropertyButton.click();
    }
    @And("Common Information bilgilerini girer")
    public void commonInformationBilgileriniGirer() {
        managerPage.title.sendKeys(faker.lorem().sentence());
        managerPage.description.sendKeys(faker.lorem().paragraph());
        managerPage.price.sendKeys(faker.number().randomDigitNotZero() +"");
        ReusableMethods.ddmValue(managerPage.advertTypeDDM,"1");
        ReusableMethods.ddmValue(managerPage.categoryDDM, "1");
    }
    @And("Address Information bilgilerini girer")
    public void addressInformationBilgileriniGirer() {
        ReusableMethods.ddmValue(managerPage.countryDDM, "223");
        ReusableMethods.ddmValue(managerPage.cityDDM, "4121");
        ReusableMethods.ddmValue(managerPage.districtDDM, "48317");
        managerPage.address.sendKeys(faker.address().fullAddress());
    }
    @And("Properties Information bilgilerini girer")
    public void propertiesInformationBilgileriniGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bedrooms.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }
    @Then("Common Information, Address Information, Properties bilgilerinin girilebildigini dogrular")
    public void commonInformationAddressInformationPropertiesBilgilerininGirilebildiginiDogrular() {
        Assert.assertEquals("form-control is-valid", managerPage.title.getAttribute("class"));
        Assert.assertEquals("form-control is-valid", managerPage.description.getAttribute("class"));
        Assert.assertEquals("form-control is-valid", managerPage.price.getAttribute("class"));
        Assert.assertEquals("select form-select is-valid", managerPage.advertTypeDDM.getAttribute("class"));
        Assert.assertEquals("1", managerPage.categoryDDM.getAttribute("value"));
        Assert.assertEquals("select form-select is-valid", managerPage.countryDDM.getAttribute("class"));
        Assert.assertEquals("select form-select is-valid", managerPage.cityDDM.getAttribute("class"));
        Assert.assertEquals("select form-select is-valid", managerPage.districtDDM.getAttribute("class"));
        Assert.assertEquals("form-control is-valid", managerPage.address.getAttribute("class"));
        Assert.assertNotEquals(" ", managerPage.size.getAttribute("value"));
        Assert.assertNotEquals(" ", managerPage.bedrooms.getAttribute("value"));
        Assert.assertNotEquals(" ", managerPage.bathrooms.getAttribute("value"));
        Assert.assertEquals("select form-select",managerPage.garage.getAttribute("class"));
        Assert.assertNotEquals(" ", managerPage.yearOfBuild.getAttribute("value"));
        Assert.assertEquals("select form-select",managerPage.furnitureDDM.getAttribute("class"));
        Assert.assertNotEquals(" ", managerPage.maintenanceFee.getAttribute("value"));
        Assert.assertEquals("select form-select",managerPage.terrace.getAttribute("class"));
    }
    @And("Common Information bolumunde Title ve Description alanlarini bos birakir")
    public void commonInformationBolumundeTitleVeDescriptionAlanlariniBosBirakir() {
        managerPage.title.click();
        managerPage.title.sendKeys(Keys.TAB);
        managerPage.description.click();
        managerPage.description.sendKeys(Keys.TAB);
    }

    @Then("Enter a title ve Enter a description uyari metinlerinin goruldugunu dogrular")
    public void enterATitleVeEnterADescriptionUyariMetinlerininGoruldugunuDogrular() {
        Assert.assertEquals("Enter a title",managerPage.titleMessage.getText());
        Assert.assertEquals("Enter a description",managerPage.descriptionMessage.getText());
    }

    @And("Address Information bolumunde Address alani bos birakilir")
    public void addressInformationBolumundeAddressAlaniBosBirakilir() {
        managerPage.address.click();
        managerPage.address.sendKeys(Keys.TAB);
    }

    @Then("newAdvertPageTranslations.requiredAddress uyari metninin goruldugunu dogrular")
    public void newadvertpagetranslationsRequiredAddressUyariMetnininGoruldugunuDogrular() {
        Assert.assertEquals("newAdvertPageTranslations.requiredAddress",managerPage.addressMessage.getText());
    }

    @And("Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler")
    public void dragAndDropTheImagesOrClickHereYazanAlanaTiklanarakYaDaSurukleyipBirakarakResimYukler() {
        managerPage.uploadImages.click();
        ReusableMethods.bekle(3);
        String dosyaYolu = System.getProperty("user.home")+"\\Desktop\\kiralik\\Screenshot_1.png";
        managerPage.uploadFilePath(dosyaYolu);
    }

    @Then("Resim yuklendigini dogrular")
    public void resimYuklendiginiDogrular() {
        Assert.assertEquals("img-wrapper",managerPage.uploadImagesDogrulama.getAttribute("class"));
    }

    @And("Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak boyutu uc MB tan buyuk olacak sekilde resim yukler")
    public void dragAndDropTheImagesOrClickHereYazanAlanaTiklanarakYaDaSurukleyipBirakarakBoyutuUcMBTanBuyukOlacakSekildeResimYukler() {
        managerPage.uploadImages.click();
        ReusableMethods.bekle(3);
        String dosyaYolu = System.getProperty("user.home")+"\\Desktop\\hd\\pexels-quang-nguyen-vinh-222549-2476632.jpg";
        managerPage.uploadFilePath(dosyaYolu);
    }

    @Then("Each image should be a maximum of uc MB uyari metninin goruldugunu dogrular")
    public void eachImageShouldBeAMaximumOfUcMBUyariMetnininGoruldugunuDogrular() {
        Assert.assertEquals("Each image should be a maximum of 3 MB", managerPage.uploadImagesMessage.getText());
    }

    @And("Common Information bolumunde Title alanini bos birakir, diger tum alanlara gerekli datalari girer")
    public void commonInformationBolumundeTitleAlaniniBosBirakirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.description.sendKeys(faker.lorem().paragraph());
        managerPage.price.sendKeys(faker.number().randomDigitNotZero() +"");
        ReusableMethods.ddmValue(managerPage.advertTypeDDM,"1");
        ReusableMethods.ddmValue(managerPage.categoryDDM, "1");
    }

    @Then("Create butonuna tiklanmadigini dogrular")
    public void createButonunaTiklanmadiginiDogrular() {
        Assert.assertFalse(managerPage.createButton.isEnabled());
    }

    @And("Common Information bolumunde Description alanini bos birakir, diger tum alanlara gerekli datalari girer")
    public void commonInformationBolumundeDescriptionAlaniniBosBirakirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.title.sendKeys(faker.lorem().sentence());
        managerPage.price.sendKeys(faker.number().randomDigitNotZero() +"");
        ReusableMethods.ddmValue(managerPage.advertTypeDDM,"1");
        ReusableMethods.ddmValue(managerPage.categoryDDM, "1");
    }

    @And("Common Information bolumunde Price alanini bos birakir, diger tum alanlara gerekli datalari girer")
    public void commonInformationBolumundePriceAlaniniBosBirakirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.title.sendKeys(faker.lorem().sentence());
        managerPage.description.sendKeys(faker.lorem().paragraph());
        ReusableMethods.ddmValue(managerPage.advertTypeDDM,"1");
        ReusableMethods.ddmValue(managerPage.categoryDDM, "1");
    }

    @And("Address Information bolumunde Country alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void addressInformationBolumundeCountryAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.cityDDM.click();
        managerPage.districtDDM.click();
        managerPage.address.sendKeys(faker.address().fullAddress());
    }

    @And("Address Information bolumunde City alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void addressInformationBolumundeCityAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        ReusableMethods.ddmValue(managerPage.countryDDM, "223");
        managerPage.districtDDM.click();
        managerPage.address.sendKeys(faker.address().fullAddress());
    }

    @And("Address Information bolumunde District alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void addressInformationBolumundeDistrictAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        ReusableMethods.ddmValue(managerPage.countryDDM, "223");
        ReusableMethods.ddmValue(managerPage.cityDDM, "4121");
        managerPage.address.sendKeys(faker.address().fullAddress());
    }

    @And("Common Information bolumunde Advert Type alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void commonInformationBolumundeAdvertTypeAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.title.sendKeys(faker.lorem().sentence());
        managerPage.description.sendKeys(faker.lorem().paragraph());
        managerPage.price.sendKeys(faker.number().randomDigitNotZero() +"");
        ReusableMethods.ddmValue(managerPage.categoryDDM, "1");
    }

    @And("Common Information bolumunde Category alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void commonInformationBolumundeCategoryAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.title.sendKeys(faker.lorem().sentence());
        managerPage.description.sendKeys(faker.lorem().paragraph());
        managerPage.price.sendKeys(faker.number().randomDigitNotZero() +"");
        ReusableMethods.ddmValue(managerPage.advertTypeDDM,"1");
    }

    @And("Address Information bolumunde Address alani bos birakilir, diger tum alanlara gerekli datalari girer")
    public void addressInformationBolumundeAddressAlaniBosBirakilirDigerTumAlanlaraGerekliDatalariGirer() {
        ReusableMethods.ddmValue(managerPage.countryDDM, "223");
        ReusableMethods.ddmValue(managerPage.cityDDM, "4121");
        ReusableMethods.ddmValue(managerPage.districtDDM, "48317");
    }

    @And("Properties bolumunde Size alani bos birakilir, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeSizeAlaniBosBirakilirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.bedrooms.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Properties bolumunde Bedrooms alani bos birakilir, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeBedroomsAlaniBosBirakilirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Properties bolumunde Bathrooms alani bos birakilir, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeBathroomsAlaniBosBirakilirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bedrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Properties bolumunde Garage alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeGarageAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bedrooms.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Properties bolumunde Year of Build alani bos birakilir, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeYearOfBuildAlaniBosBirakilirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bedrooms.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Properties bolumunde Furniture alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeFurnitureAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bedrooms.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Properties bolumunde Maintenance Fee alani bos birakilir, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeMaintenanceFeeAlaniBosBirakilirDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bedrooms.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Properties bolumunde Terrace alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer")
    public void propertiesBolumundeTerraceAlanindaSecimYapilmazDigerTumAlanlaraGerekliDatalariGirer() {
        managerPage.size.sendKeys(faker.number().digit());
        managerPage.bedrooms.sendKeys(faker.number().digit());
        managerPage.bathrooms.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.garage,"Yes");
        managerPage.yearOfBuild.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.furnitureDDM,"Yes");
        managerPage.maintenanceFee.sendKeys(faker.number().digit());
        ReusableMethods.ddmValue(managerPage.terrace, "Yes");
    }

    @And("Drag and drop the images or click here alani bos birakilir")
    public void dragAndDropTheImagesOrClickHereAlaniBosBirakilir() {
    }

    @And("Create butonuna tiklar")
    public void createButonunaTiklar() {
        ReusableMethods.click(managerPage.createButton);
    }

    @And("Address Information alaninda Country Deutschland ve City Auvergne bilgilerini girer")
    public void addressInformationAlanindaCountryDeutschlandVeCityAuvergneBilgileriniGirer() {
        ReusableMethods.ddmValue(managerPage.countryDDM,"82");
        ReusableMethods.ddmValue(managerPage.cityDDM,"1354");
        managerPage.address.sendKeys(faker.address().fullAddress());
    }

    @Then("ilan olusturuldugunu dogrular")
    public void ilanOlusturuldugunuDogrular() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = (String) js.executeScript("return arguments[0].innerText;", managerPage.advertCreatedMessage);
        Assert.assertEquals("Advert created!", text);
    }


    @Then("District alaninda secim yapilamadigindan ilan olusturulamadigini dogrular")
    public void districtAlanindaSecimYapilamadigindanIlanOlusturulamadiginiDogrular() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = (String) js.executeScript("return arguments[0].innerText;", managerPage.districtMessage);
        Assert.assertEquals("District not found.",text);

    }

    @When("kullanici manager olarak giris yapmak icin login butonuna tiklar")
    public void kullaniciManagerOlarakGirisYapmakIcinLoginButonunaTiklar() {
        managerPage.loginButton.click();
    }

    @And("kullanici manager email ve password bilgileri ile login olur")
    public void kullaniciManagerEmailVePasswordBilgileriIleLoginOlur() {
        managerPage.email.sendKeys(ConfigReader.getProperty("ManEmail"));
        managerPage.password.sendKeys(ConfigReader.getProperty("ManPassword"),Keys.ENTER);
    }



}


