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
}
