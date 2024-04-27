package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.UnRegisteredPage;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class UnRegisteredStepDefinition {

    UnRegisteredPage unRegisteredPage = new UnRegisteredPage();

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
}
