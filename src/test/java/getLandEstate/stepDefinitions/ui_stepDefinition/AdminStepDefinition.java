package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.AdminPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AdminStepDefinition {

    AdminPage adminPage= new AdminPage();

    //us04

    @Given("kullanici {string} gider")
    public void kullaniciUrlGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        ReusableMethods.click(adminPage.loginbutton);
    }


    @And("kullanici email ve password bilgileri ile login olur")
    public void kullaniciEmailVePasswordBilgileriIleLoginOlur() {
        adminPage.emailTextBox.sendKeys(ConfigReader.getProperty("adminEmail"),
                Keys.TAB, Keys.TAB, ConfigReader.getProperty("adminPassword"), Keys.ENTER);
    }

    @And("Back To Site butonuna tiklar")
    public void backToSiteButonunaTiklar() {
        adminPage.backToSite.click();
    }

    @But("kullanici sayfada {int} saniye bekler")
    public void kullaniciSayfadaSaniyeBekler(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("sayfa dilinin default olarak ingilizce oldugunu dogrular")
    public void sayfaDilininDefaultOlarakIngilizceOldugunuDogrular() {
        Assert.assertEquals("Home", adminPage.englishTextVerify.getText());
    }

    @And("Turkce dil secenegini secer ve sayfa dilinin Turkce oldugunu dogrular")
    public void dilSeceneginiSecerVeSayfaDilininTürkçeOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.trflagIconButton);
        Assert.assertEquals("Anasayfa",adminPage.turkishText.getText());
    }

    @And("Francais dil secenegini secer ve sayfa dilinin Francais oldugunu dogrular")
    public void dilSeceneginiSecerVeSayfaDilininFrançaisOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.franchIconButton);
        Assert.assertEquals("Accueil",adminPage.frTextVerify.getText());
    }

    @And("Deutsch dil secenegini secer ve sayfa dilinin Deutsch oldugunu dogrular")
    public void dilSeceneginiSecerVeSayfaDilininDeutschOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.grIconButton);
        Assert.assertEquals("Zuhause",adminPage.grTextVerify.getText());

    }

    @And("Espanol dil secenegini secer ve sayfa dilinin Espanol oldugunu dogrular")
    public void dilSeceneginiSecerVeSayfaDilininEspañolOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.spIconButton);
        Assert.assertEquals("Inicio", adminPage.spTextVerify.getText());
    }
}
