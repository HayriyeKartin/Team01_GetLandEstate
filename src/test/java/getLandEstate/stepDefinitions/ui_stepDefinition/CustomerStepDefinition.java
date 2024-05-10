package getLandEstate.stepDefinitions.ui_stepDefinition;

import com.github.javafaker.Faker;
import getLandEstate.pages.CustomerPage;
import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import getLandEstate.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomerStepDefinition {
    CustomerPage custemerPage=new CustomerPage();
    Faker faker =new Faker();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));


    @Given("Kullanici getLandEstate sayfasina gider")
    public void kullaniciGetLandEstateSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        custemerPage.loginButton.click();

    }

    @And("Email ve Password bilgileriyle login olur")
    public void emailVePasswordBilgileriyleLoginOlur() {
        custemerPage.emailButton.sendKeys(ConfigReader.getProperty("custemerEmail"));
        custemerPage.passwordButton.sendKeys(ConfigReader.getProperty("custemerPassword"));
        custemerPage.loginButton2.click();

    }


    @Then("Sayfa dili default olarak English oldugunu dogrular")
    public void sayfaDiliDefaultOlarakEnglishOldugunuDogrular() {
        Assert.assertEquals("HOUSE",custemerPage.houseText.getText());
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Sayfa dilini Türkçe olarak secer")
    public void sayfaDiliniTürkçeOlarakSecer() {
        custemerPage.dilSecmeMenusu.click();

        ReusableMethods.bekle(3);
        custemerPage.turkceDili.click();
        ReusableMethods.bekle(7);

    }

    @Then("Sayfa dilinin Türkçe oldugunu dogrular")
    public void sayfaDilininTürkçeOldugunuDogrular() {
        ReusableMethods.visibleWait(custemerPage.evText,10);
        Assert.assertEquals("EV",custemerPage.evText.getText());
    }

    @And("Sayfa dilini Français olarak secer")
    public void sayfaDiliniFrançaisOlarakSecer() {
        custemerPage.dilSecmeMenusu.click();
        ReusableMethods.bekle(3);
        custemerPage.fransaDili.click();
        ReusableMethods.bekle(4);
    }

    @Then("Sayfa dilinin Français oldugunu dogrular")
    public void sayfaDilininFrançaisOldugunuDogrular() {
        Assert.assertEquals("MAISON",custemerPage.maisonText.getText());
    }

    @And("Sayfa dilini Deutsch olarak secer")
    public void sayfaDiliniDeutschOlarakSecer() {
        custemerPage.dilSecmeMenusu.click();
        ReusableMethods.bekle(3);
        custemerPage.almanDili.click();
        ReusableMethods.bekle(4);
    }

    @Then("Sayfa dilinin Deutsch oldugunu dogrular")
    public void sayfaDilininDeutschOldugunuDogrular() {
        Assert.assertEquals("HAUS",custemerPage.hausText.getText());
    }

    @And("Sayfa dilini Espanol olarak secer")
    public void sayfaDiliniEspanolOlarakSecer() {
        custemerPage.dilSecmeMenusu.click();
        ReusableMethods.bekle(3);
        custemerPage.ispanyaDili.click();
        ReusableMethods.bekle(4);
    }

    @Then("Sayfa dilinin Espanol oldugunu dogrular")
    public void sayfaDilininEspanolOldugunuDogrular() {
        Assert.assertEquals("CASA",custemerPage.casaText.getText());
    }


    @And("Kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        custemerPage.register.click();
    }

    @When("Kullanici first name girer")
    public void kullaniciFirstNameGirer() {
        custemerPage.firstname.sendKeys(ConfigReader.getProperty("firstName"));
    }

    @And("Kullanici last name girer")
    public void kullaniciLastNameGirer() {
        custemerPage.lastname.sendKeys(ConfigReader.getProperty("lastName"));
    }

    @And("Kullanici phone girer")
    public void kullaniciPhoneGirer() {
        custemerPage.phoneNumber.click();
        custemerPage.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
    }

    @And("Kullanici email girer")
    public void kullaniciEmailGirer() {
        custemerPage.email.sendKeys(faker.internet().emailAddress());
    }

    @And("Kullanici password girer")
    public void kullaniciPasswordGirer() {
        custemerPage.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Kullanici confirm password girer")
    public void kullaniciConfirmPasswordGirer() {
        custemerPage.confirmPassword.sendKeys(ConfigReader.getProperty("confirmPassword"));
    }


    @And("Terms of Use ve Privacy Policy checkbox'ı  secer")
    public void termsOfUseVePrivacyPolicyCheckboxISecer() {
        custemerPage.termsOfUse.click();
    }


    @And("Kullanici kayit icin register butonuna tiklar")
    public void kullaniciKayitIcinRegisterButonunaTiklar() {
        custemerPage.register2.click();
        wait.until(ExpectedConditions.visibilityOf(custemerPage.successMessage));
    }

    @Then("Your registration has been completed successfully. yazisini dogrulayin")
    public void yourRegistrationHasBeenCompletedSuccessfullyYazisiniDogrulayin() {
        Assert.assertEquals("Success",custemerPage.success.getText());
        Assert.assertTrue(custemerPage.successMessage.getText().contains("Your registration has been completed successfully"));

    }

    @When("first name {string} girer")
    public void firstNameGirer(String firstName) {
        custemerPage.firstname.sendKeys(firstName);
    }

    @And("last name {string} girer")
    public void lastNameGirer(String lastName) {
        custemerPage.lastname.sendKeys(lastName);
    }

    @And("phone {string} girer")
    public void phoneGirer(String phone) {
        custemerPage.phoneNumber.click();
        custemerPage.phoneNumber.sendKeys(phone);
    }

    @And("email {string} girer")
    public void emailGirer(String email) {
        custemerPage.email.sendKeys(email);
    }

    @And("password {string} girer")
    public void passwordGirer(String password) {
        custemerPage.password.sendKeys(password);
    }

    @And("confirm password {string} girer")
    public void confirmPasswordGirer(String confirmPassword) {
        custemerPage.confirmPassword.sendKeys(confirmPassword);
    }

    @Then("Zorunlu alanlar bos birakildigi icin register butonu aktif olmamali")
    public void zorunluAlanlarBosBirakildigiIcinRegisterButonuAktifOlmamali() {
        Assert.assertFalse(custemerPage.register2.isEnabled());
        Driver.getDriver().navigate().refresh();
    }

    @And("Terms of Use ve Privacy Policy checkbox'ı  secili olmasin")
    public void termsOfUseVePrivacyPolicyCheckboxISeciliOlmasin() {
        if (custemerPage.termsOfUse.isSelected()){
            custemerPage.termsOfUse.click();
        }
    }

    @Then("Register butonu aktif olmamali")
    public void registerButonuAktifOlmamali() {
        Assert.assertFalse(custemerPage.register2.isEnabled());

    }


    @And("Kullanici password {string} girer")
    public void kullaniciPasswordGirer(String password) {
        custemerPage.password.sendKeys(password);
    }

    @And("Kullanici confirm {string} girer")
    public void kullaniciConfirmGirer(String confirmPassword) {
        custemerPage.confirmPassword.sendKeys(confirmPassword);
    }

    @And("Kullanici email'e @ karakteri olmadan  girer")
    public void kullaniciEmailEKarakteriOlmadanGirer() {
        custemerPage.email.sendKeys(ConfigReader.getProperty("eksikEmail1"));
    }


    @And("Kullanici email'e . isareti olmadan  girer")
    public void kullaniciEmailEIsaretiOlmadanGirer() {
        custemerPage.email.sendKeys(ConfigReader.getProperty("eksikEmail2"));
    }

    CustomerPage customerPage=new CustomerPage();

   @Given("Kullanici {string} sayfasina gider")
   public void kullaniciSayfasinaGider(String url) {
       Driver.getDriver().get(url);
   }

    @When("Sag ust kisimdaki Login butonuna tiklayarak giris ekranina ulasir.")
    public void sagUstKisimdakiLoginButonunaTiklayarakGirisEkraninaUlasir() {
        customerPage.girisButonu.click();
    }

    @And("Email ve Password alanlarina gerekli veri girisini yapar.")
    public void emailVePasswordAlanlarinaGerekliVeriGirisiniYapar() {
        customerPage.emailKutusu.sendKeys("akin.sakarya5116@gmail.com");
        customerPage.passwordKutusu.sendKeys("147258369Fb.");
    }

    @And("Login butonuna tiklayarak basarili bir sekilde giris saglar.")
    public void loginButonunaTiklayarakBasariliBirSekildeGirisSaglar() {
        customerPage.loginButonu.click();
    }

    @And("Email girerken @ ve . kullanmadiginda Invalid email uyarisi aldigini dogrular.")
    public void emailGirerkenVeKullanmadigindaInvalidEmailUyarisiAldiginiDogrular() {
        customerPage.emailKutusu.sendKeys("akin.sakarya5116gmail.com", Keys.TAB);
        Assert.assertTrue(customerPage.invalidEmail.isDisplayed());
    }

    @And("Password alanini bos biraktiginda Password is required uyarisi aldigini dogrular.")
    public void passwordAlaniniBosBiraktigindaPasswordIsRequiredUyarisiAldiginiDogrular() {
        customerPage.emailKutusu.sendKeys("akin.sakarya5116gmail.com",Keys.TAB,Keys.TAB,Keys.TAB);
        Assert.assertTrue(customerPage.invalidPassword.isDisplayed());
    }

    @And("Login ekraninda iken henuz Email ve Password bilgisini girmediginde Login butonunun aktif olmadigini dogrular.")
    public void loginEkranindaIkenHenuzEmailVePasswordBilgisiniGirmedigindeLoginButonununAktifOlmadiginiDogrular() {
        Driver.getDriver().navigate().refresh();
        customerPage.emailKutusu.sendKeys("",Keys.TAB);
        Assert.assertFalse(customerPage.loginButonu.isEnabled());
    }

    @And("Sag ustteki profil butonuna tiklayarak acilan menuden My Profile butonuna tiklar.")
    public void sagUsttekiProfilButonunaTiklayarakAcilanMenudenMyProfileButonunaTiklar() {
        customerPage.profileButton.click();
        ReusableMethods.bekle(3);
        customerPage.myProfileButton.click();
    }

    @And("Gelen ekranda profil bilgilerini gorebildigini dogrular.")
    public void gelenEkrandaProfilBilgileriniGorebildiginiDogrular() {
        Assert.assertTrue(customerPage.myEmail.isDisplayed());
    }

    @And("Herhangi bir profil bilgisinde degisiklik yaparak update butonuna basar.")
    public void herhangiBirProfilBilgisindeDegisiklikYaparakUpdateButonunaBasar() {
        customerPage.myName.sendKeys(" Mete");
        customerPage.updateButton.click();
        ReusableMethods.bekle(10);
    }

    @And("Profil bilgisindeki guncellemenin gerceklestigini dogrular.")
    public void profilBilgisindekiGuncellemeninGerceklestiginiDogrular() {
        Assert.assertTrue(customerPage.updateAssert.isDisplayed());
    }

    @And("Mevcut ekranda Change Password butonuna tiklayarak sifre degistirme ekranina ulasir.")
    public void mevcutEkrandaChangePasswordButonunaTiklayarakSifreDegistirmeEkraninaUlasir() {
        customerPage.changePasswordButton.click();
    }

    @And("Gereken bilgileri doldurarak Change butonuna basar ve sifrenin degistirildigini dogrular.")
    public void gerekenBilgileriDoldurarakChangeButonunaBasarVeSifreninDegistirildiginiDogrular() {
        customerPage.currentPasswordArea.sendKeys("147258369Fb.",Keys.TAB,"1907Fbc.",Keys.TAB,"1907Fbc.",Keys.ENTER);
        ReusableMethods.bekle(3);
        Assert.assertTrue(customerPage.changePasswordAssert.isDisplayed());
    }

    @And("Acilan sayfadan Profile Photo butonuna tiklayarak profil fotografi ekleme ekranina ulasir.")
    public void acilanSayfadanProfilePhotoButonunaTiklayarakProfilFotografiEklemeEkraninaUlasir() {
        customerPage.profilePhotoButton.click();
    }

    @And("Select butonuna tiklayarak acilan ekrandan bir fotograf secer ve Done a basarak ekler.")
    public void selectButonunaTiklayarakAcilanEkrandanBirFotografSecerVeDoneABasarakEkler() {
        customerPage.selectButton.click();
        String path ="\"C:\\Users\\sakarya\\Downloads\\Fenerbahçe_SK.png\"";
        CustomerPage.uploadFileWithRobot(path);
        customerPage.doneButton.click();
    }

    @And("Save butonuna tiklayarak eklenen fotografi kaydeder ve eklendigini dogrular.")
    public void saveButonunaTiklayarakEklenenFotografiKaydederVeEklendiginiDogrular() {
        customerPage.saveButton.click();
        ReusableMethods.bekle(5);
        Assert.assertTrue(customerPage.saveAssert.isDisplayed());
    }

    @And("Mevcut sayfadan Delete Account butonuna tiklayarak hesap silme ekranina ulasir.")
    public void mevcutSayfadanDeleteAccountButonunaTiklayarakHesapSilmeEkraninaUlasir() {
        customerPage.deleteAccountButton.click();
    }

    @And("Mevcut sifresini girer ve alt kisimdaki Delete Account butonuna tiklayarak hesabini siler.")
    public void mevcutSifresiniGirerVeAltKisimdakiDeleteAccountButonunaTiklayarakHesabiniSiler() {
        customerPage.deletePasswordArea.sendKeys("1907Fbc.");
        customerPage.deleteButton.click();
    }

    @Given("customer web sayfasina gider")
    public void customerWebSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("customer login butonuna tiklar")
        public void customerLoginButonunaTiklar() {

        customerPage.customerLoginButton.click();
    }

    @And("customer olarak email girer")
    public void customerOlarakEmailGirer() {
        customerPage.customerEmailBox.sendKeys(ConfigReader.getProperty("customerEmail"));
    }

    @And("customer olarak password girer")
    public void customerOlarakPasswordGirer() {
        customerPage.customerPasswordBox.sendKeys(ConfigReader.getProperty("customerPassword"));
    }

    @And("giris icin login butonuna tiklar")
    public void girisIcinLoginButonunaTiklar() {
        customerPage.customerSubmitLoginButton.click();
    }

    @When("rent butonuna tiklar")
    public void rentButonunaTiklar() {
        customerPage.rentButton.click();
    }

    @And("house butonuna tiklar")
    public void houseButonunaTiklar() {
        customerPage.houseButton.click();
    }

    @And("villa butonuna tiklar")
    public void villaButonunaTiklar() {
        customerPage.villaButton.click();
    }
    @And("buyutec ikonuna tiklar")
    public void buyutecIkonunaTiklar() {
        customerPage.searchBoxicon.click();
        ReusableMethods.bekle(20);
    }

    @Then("house ile ilgili Rent seceneklerinin geldigini dogrular")
    public void houseIleIlgiliRentSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.rentHousePicture.isDisplayed());
    }

    @Then("villa ile ilgili Rent seceneklerinin geldigini dogrular")
    public void villaIleIlgiliRentSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.rentVillaPicture.isDisplayed());
    }

    @When("price range bilgilerini girer")
    public void priceRangeBilgileriniGirer() {
        customerPage.priceRangeMin.click();
        customerPage.priceRangeMax.click();
    }

    @And("advert type dropdowndan Rent secer")
    public void advertTypeDropdowndanRentSecer() {
        ReusableMethods.ddmVisibleText(customerPage.advertTypeDropdown,"Rent");

    }

    @And("category dropdowndan Office secer")
    public void categoryDropdowndanOfficeSecer() {
        ReusableMethods.ddmVisibleText(customerPage.categoryDropdown,"Office");

    }

    @And("country dropdowndan Turkiye secer")
    public void countryDropdowndanTurkiyeSecer() {
        ReusableMethods.ddmVisibleText(customerPage.countryDropdown,"Türkiye");
    }

    @And("city dropdowndan Ankara secer")
    public void cityDropdowndanAnkaraSecer() {
        ReusableMethods.ddmVisibleText(customerPage.cityDropdown,"Ankara");
    }
    @And("alttaki search butonuna tiklar")
    public void alttakiSearchButonunaTiklar() {
        customerPage.secondPageSearchBoxSubmit.click();
    }
    @Then("ofis ile ilgili Rent seceneklerinin geldigini dogrular")
    public void ofisIleIlgiliRentSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.rentOfficePicture.isDisplayed());
    }
    @When("searchBox alanina apartment yazar")
    public void searchboxAlaninaApartmentYazar() {
        customerPage.searchBoxArea.sendKeys("apartment");
    }


    @Then("apartman ile ilgili Rent seceneklerinin geldigini dogrular")
    public void apartmanIleIlgiliRentSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.rentApartmentPicture.isDisplayed());
    }

    @When("searchBox alanina land yazar")
    public void searchboxAlaninaLandYazar() {
        customerPage.searchBoxArea.sendKeys("land");
    }

    @And("category dropdowndan Land secer")
    public void categoryDropdowndanLandSecer() {
        ReusableMethods.ddmVisibleText(customerPage.categoryDropdown,"Land");
    }

    @And("city dropdowndan Kocaeli secer")
    public void cityDropdowndanKocaeliSecer() {
        ReusableMethods.ddmVisibleText(customerPage.cityDropdown,"Kocaeli");
    }


    @And("district dropdowndan Darica secer")
    public void districtDropdowndanDaricaSecer() {
        ReusableMethods.ddmVisibleText(customerPage.districtDropdown,"Darıca");
    }

    @Then("land ile ilgili Rent seceneklerinin geldigini dogrular")
    public void landIleIlgiliRentSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue( customerPage.rentLandPicture.isDisplayed());
    }

    @When("searchBox alanina shop yazar")
    public void searchboxAlaninaShopYazar() {
        customerPage.searchBoxArea.sendKeys("shop");
    }

    @And("category dropdowndan Shop secer")
    public void categoryDropdowndanShopSecer() {
        ReusableMethods.ddmVisibleText(customerPage.categoryDropdown,"Shop");
    }

    @And("city dropdowndan Batman secer")
    public void cityDropdowndanBatmanSecer() {
        ReusableMethods.ddmVisibleText(customerPage.cityDropdown,"Batman");
    }

    @And("district dropdowndan Kozluk secer")
    public void districtDropdowndanKozlukSecer() {
        ReusableMethods.ddmVisibleText(customerPage.districtDropdown,"Kozluk");
    }

    @Then("shop ile ilgili Rent seceneklerinin geldigini dogrular")
    public void shopIleIlgiliRentSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.rentShopPicture.isDisplayed());
    }

    @And("kiralik isyeri ilan resmine tiklar")
    public void kiralikIsyeriIlanResmineTiklar() {
        customerPage.rentShopPicture.click();
    }

    @Then("kiralik isyeri ilanini secebildigini dogrular")
    public void kiralikIsyeriIlaniniSecebildiginiDogrular() {
        Assert.assertTrue(customerPage.rentShopPicture.isDisplayed());
    }

    @Then("sectigi kiralik emlagin resmini gordugunu dogrular")
    public void sectigiKiralikEmlaginResminiGordugunuDogrular() {
        Assert.assertTrue(customerPage.rentRealEstatePicture.isDisplayed());
    }

    @Then("sectigi kiralik emlak ile ilgili description gordugunu dogrular")
    public void sectigiKiralikEmlakIleIlgiliDescriptionGordugunuDogrular() {
        Assert.assertTrue(customerPage.rentRealEstateDescription.isDisplayed());

    }

    @Then("sectigi kiralik emlak ile ilgili details bilgilerini gordugunu dogrular")
    public void sectigiKiralikEmlakIleIlgiliDetailsBilgileriniGordugunuDogrular() {
        Assert.assertTrue(customerPage.rentRealEstateDetails.isDisplayed());
    }

    @Then("sectigi kiralik emlak ile ilgili location bilgilerini gordugunu dogrular")
    public void sectigiKiralikEmlakIleIlgiliLocationBilgileriniGordugunuDogrular() {
        Assert.assertTrue(customerPage.rentRealEstateLocation.isDisplayed());
    }

    @When("profil resmine tiklar")
    public void profilResmineTiklar() {
        customerPage.customerProfil.click();
    }

    @And("My Tour Requests sekmesini tiklar")
    public void myTourRequestsSekmesiniTiklar() {
        customerPage.customerMyTourRequestsButton.click();
        ReusableMethods.bekle(7);
    }

    @And("MY TOUR REQUEST yazisini gorur")
    public void myTOURREQUESTYazisiniGorur() {
        customerPage.customerMyTourRequestTitle.isDisplayed();
        ReusableMethods.bekle(7);
    }

    @And("MY REQUESTS butonuna tiklar")
    public void myREQUESTSButonunaTiklar() {
        customerPage.customerMyRequestsButton.click();
        ReusableMethods.bekle(10);
    }

    @Then("randevu isteklerini gordugunu dogrular")
    public void randevuIstekleriniGordugunuDogrular() {
        Assert.assertTrue(customerPage.customerRequestsList.isDisplayed());
    }

    @And("MY RESPONSES butonuna tiklar")
    public void myRESPONSESButonunaTiklar() {
        customerPage.customerMyResponsesButton.click();
    }

    @Then("randevu isteklerininin onay veya red durumunu gordugunu dogrular")
    public void randevuIsteklerinininOnayVeyaRedDurumunuGordugunuDogrular() {
        Assert.assertTrue(customerPage.customerRequestsStatus.isDisplayed());
    }

    @Then("sectigi kiralik emlak ile ilgili iletisim bilgilerini gordugunu dogrular")
    public void sectigiKiralikEmlakIleIlgiliIletisimBilgileriniGordugunuDogrular() {
        customerPage.manageContactPhoneikon.click();
        Assert.assertTrue(customerPage.manageContactPhoneLink.isDisplayed());
        customerPage.manageContactPhoneikon.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
        Assert.assertTrue(customerPage.manageContactMailLink.isDisplayed());

    }

    @And("rent tour date bilgisi girer")
    public void rentTourDateBilgisiGirer() {
        customerPage.tourDate.sendKeys("01122024");
    }

    @And("rent tour time bilgisi girer")
    public void rentTourTimeBilgisiGirer() {
        ReusableMethods.ddmIndex(customerPage.tourTimeDropdown,15);
    }

    @And("submit tour request butonuna tiklar")
    public void submitTourRequestButonunaTiklar() {
        customerPage.submitTourRequestButton.click();
    }

    @Then("TourRequest created successfully metnini gordugunu dogrular")
    public void tourrequestCreatedSuccessfullyMetniniGordugunuDogrular() {
        Assert.assertTrue(customerPage.tourRequestCreatedText.isDisplayed());
    }

    @And("price range min bilgisine eksi bir girer")
    public void priceRangeMinBilgisineEksiBirGirer() {
        customerPage.priceRangeMin.click();
        customerPage.priceRangeMin.sendKeys("-1");
    }

    @Then("shop ile ilgili Rent seceneklerinin listelenmedigini dogrular")
    public void shopIleIlgiliRentSeceneklerininListelenmediginiDogrular() {
        Assert.assertFalse(customerPage.rentShopPicture.isDisplayed());
    }

    @When("searchBox alanina villa yazar")
    public void searchboxAlaninaVillaYazar() {
        customerPage.searchBoxArea.sendKeys("villa");
    }

    @And("price range max bilgisine eksi bir girer")
    public void priceRangeMaxBilgisineEksiBirGirer() {
        customerPage.priceRangeMax.click();
        customerPage.priceRangeMax.sendKeys("-1");
        ReusableMethods.bekle(2);
    }

    @Then("villa ile ilgili Rent seceneklerinin listelenmedigini dogrular")
    public void villaIleIlgiliRentSeceneklerininListelenmediginiDogrular() {
        Assert.assertFalse(customerPage.rentVillaPicture.isDisplayed());
    }

    @When("sale butonuna tiklar")
    public void saleButonunaTiklar() {
        customerPage.saleButton.click();
    }

    @Then("house ile ilgili Sale seceneklerinin geldigini dogrular")
    public void houseIleIlgiliSaleSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.saleHousePicture.isDisplayed());
    }

    @Then("villa ile ilgili Sale seceneklerinin geldigini dogrular")
    public void villaIleIlgiliSaleSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.saleVillaPicture.isDisplayed());
    }

    @Then("apartman ile ilgili Sale seceneklerinin geldigini dogrular")
    public void apartmanIleIlgiliSaleSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.saleApartmentPicture.isDisplayed());
    }

    @And("advert type dropdowndan Sale secer")
    public void advertTypeDropdowndanSaleSecer() {
        ReusableMethods.ddmVisibleText(customerPage.advertTypeDropdown,"Sale");
    }

    @And("city dropdowndan Aydin secer")
    public void cityDropdowndanAydinSecer() {
        ReusableMethods.ddmVisibleText(customerPage.cityDropdown,"Aydın");
    }

    @Then("ofis ile ilgili Sale seceneklerinin geldigini dogrular")
    public void ofisIleIlgiliSaleSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.saleOfficePicture.isDisplayed());
    }


    @And("city dropdowndan Osmaniye secer")
    public void cityDropdowndanOsmaniyeSecer() {
        ReusableMethods.ddmVisibleText(customerPage.cityDropdown,"Osmaniye");
    }

    @And("district dropdowndan Bahce secer")
    public void districtDropdowndanBahceSecer() {
        ReusableMethods.ddmVisibleText(customerPage.districtDropdown,"Bahçe");
    }

    @Then("land ile ilgili Sale seceneklerinin geldigini dogrular")
    public void landIleIlgiliSaleSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue( customerPage.saleLandPicture.isDisplayed());
    }

    @And("district dropdowndan Mamak secer")
    public void districtDropdowndanMamakSecer() {
        ReusableMethods.ddmVisibleText(customerPage.districtDropdown,"Mamak");
    }

    @Then("shop ile ilgili Sale seceneklerinin geldigini dogrular")
    public void shopIleIlgiliSaleSeceneklerininGeldiginiDogrular() {
        Assert.assertTrue(customerPage.saleShopPicture.isDisplayed());
    }

    @And("satilik isyeri ilan resmine tiklar")
    public void satilikIsyeriIlanResmineTiklar() {
        customerPage.saleShopPicture.click();
    }
    @Then("satilik isyeri ilanini secebildigini dogrular")
    public void satilikIsyeriIlaniniSecebildiginiDogrular() {
        Assert.assertTrue(customerPage.saleShopPicture.isDisplayed());
    }


    @Then("sectigi satilik emlagin resmini gordugunu dogrular")
    public void sectigiSatilikEmlaginResminiGordugunuDogrular() {
        Assert.assertTrue(customerPage.saleRealEstatePicture.isDisplayed());
    }

    @Then("sectigi satilik emlak ile ilgili description gordugunu dogrular")
    public void sectigiSatilikEmlakIleIlgiliDescriptionGordugunuDogrular() {
        Assert.assertTrue(customerPage.saleRealEstateDescription.isDisplayed());
    }
    @Then("sectigi satilik emlak ile ilgili details bilgilerini gordugunu dogrular")
    public void sectigiSatilikEmlakIleIlgiliDetailsBilgileriniGordugunuDogrular() {
        Assert.assertTrue(customerPage.saleRealEstateDetails.isDisplayed());
    }

    @Then("sectigi satilik emlak ile ilgili location bilgilerini gordugunu dogrular")
    public void sectigiSatilikEmlakIleIlgiliLocationBilgileriniGordugunuDogrular() {
        Assert.assertTrue(customerPage.saleRealEstateLocation.isDisplayed());
    }

    @Then("sectigi satilik emlak ile ilgili iletisim bilgilerini gordugunu dogrular")
    public void sectigiSatilikEmlakIleIlgiliIletisimBilgileriniGordugunuDogrular() {
        customerPage.manageContactPhoneikon.click();
        Assert.assertTrue(customerPage.manageContactPhoneLink.isDisplayed());
        customerPage.manageContactPhoneikon.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
        Assert.assertTrue(customerPage.manageContactMailLink.isDisplayed());
    }

    @And("sale tour date bilgisi girer")
    public void saleTourDateBilgisiGirer() {
        customerPage.tourDate.sendKeys("01012025");
    }

    @And("sale tour time bilgisi girer")
    public void saleTourTimeBilgisiGirer() {
        ReusableMethods.ddmIndex(customerPage.tourTimeDropdown,20);
    }


}