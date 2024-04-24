package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.UnRegisteredPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UnRegisteredStepDefinition {
    UnRegisteredPage unRegisteredPage = new UnRegisteredPage();

    @Given("kullanici web sayfasina gider")
    public void kullaniciWebSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("contact butonuna tiklar")
    public void contactButonunaTiklar() {
        unRegisteredPage.contactMenuButton.click();
    }

    @And("Kullanici istenilen bilgileri girer \\{String} \\{String} \\{String} \\{String}")
    public void kullaniciIstenilenBilgileriGirerStringStringStringString() {
    }

    @And("{string} kutusuna tiklar")
    public void kutusunaTiklar(String arg0) {
    }

    @And("send butonuna tıklar")
    public void sendButonunaTıklar() {
    }

    @Then("Mesajın gönderildigi dogrulanır")
    public void mesajınGönderildigiDogrulanır() {
    }


    @Then("firstName alanina {int} karakterden kucuk deger girer ve At least {int} characters uyarisinin alindigini dogrular")
    public void firstnameAlaninaKarakterdenKucukDegerGirerVeAtLeastCharactersUyarisininAlindiginiDogrular(int arg0, int arg1) {
    }

    @And("lastName alanina {int} karakterden kucuk deger girer ve At least {int} characters uyarisinin alinigini dogrular")
    public void lastnameAlaninaKarakterdenKucukDegerGirerVeAtLeastCharactersUyarisininAliniginiDogrular(int arg0, int arg1) {
    }

    @And("{string} ve {string} isareti kullanilmadan email girilmeli ve Invalid email uyarisinin alindigini dogrular")
    public void veIsaretiKullanilmadanEmailGirilmeliVeInvalidEmailUyarisininAlindiginiDogrular(String arg0, String arg1) {
    }

    @Then("{string} isareti kullanilmadan email girilmeli ve Invalid email uyarisinin alindigini dogrular")
    public void isaretiKullanilmadanEmailGirilmeliVeInvalidEmailUyarisininAlindiginiDogrular(String arg0) {
    }

    @Then("{string} işareti kullanilmadan email girilmeli ve Invalid email uyarisinin alindigini dogrular")
    public void işaretiKullanilmadanEmailGirilmeliVeInvalidEmailUyarisininAlindiginiDogrular(String arg0) {
    }
}
