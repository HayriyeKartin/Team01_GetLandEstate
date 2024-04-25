package getLandEstate.stepDefinitions.ui_stepDefinition;

import com.github.javafaker.Faker;
import getLandEstate.pages.CustomerPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
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
}
