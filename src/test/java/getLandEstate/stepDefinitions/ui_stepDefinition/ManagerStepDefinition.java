package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.ManagerPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class ManagerStepDefinition {
    ManagerPage managerPage = new ManagerPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciWebSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        managerPage.loginButton.click();
    }

    @And("kullanici email ve password bilgileri ile login olur")
    public void kullaniciEmailVePasswordBilgileriIleLoginOlur() {
        managerPage.email.sendKeys(ConfigReader.getProperty("email"));
        managerPage.password.sendKeys(ConfigReader.getProperty("password"), Keys.ENTER);
    }

    @And("Back to Site butonuna tiklar")
    public void backToSiteButonunaTiklar() {
        managerPage.backToSiteButton.click();
    }

    @Then("sayfa dilinin default olarak ingilizce oldugunu dogrular")
    public void sayfaDilininDefaultOlarakIngilizceOldugunuDogrular() {
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

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
