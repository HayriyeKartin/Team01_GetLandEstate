package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.AdminPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;







public class AdminStepDefinition { //baslangıc 20.satır

    AdminPage adminPage= new AdminPage();

    //gulsum24 //us04


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

    public void dilSeceneginiSecerVeSayfaDilininTurkceOldugunuDogrular() {
      
        adminPage.iconClick(adminPage.flagIcon, adminPage.trflagIconButton);
        Assert.assertEquals("Anasayfa",adminPage.turkishText.getText());
    }

    @And("Francais dil secenegini secer ve sayfa dilinin Francais oldugunu dogrular")

    public void dilSeceneginiSecerVeSayfaDilininFrancaisOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.franchIconButton);
        Assert.assertEquals("Accueil",adminPage.frTextVerify.getText());
    }

    @And("Deutsch dil secenegini secer ve sayfa dilinin Deutsch oldugunu dogrular")
    public void dilSeceneginiSecerVeSayfaDilininDeutschOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.grIconButton);
        Assert.assertEquals("Zuhause",adminPage.grTextVerify.getText());

    }

    @And("Espanol dil secenegini secer ve sayfa dilinin Espanol oldugunu dogrular")

    public void dilSeceneginiSecerVeSayfaDilininEspanolOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.spIconButton);
        Assert.assertEquals("Inicio",adminPage.spTextVerify.getText());
    }

    //us05
    @Then("login oldugu dogrulanir")
    public void loginOlduguDogrulanir() {
        adminPage.profileIconButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminPage.myProfileButton.getText().contains("My Profile"));
        ReusableMethods.bekle(2);
    }

    @When("gecersiz {string} ve {string} bilgilerini girer")
    public void gecersizEmailVePasswordBilgileriniGirer(String email, String password) {
        adminPage.emailTextBox.sendKeys(email,Keys.TAB, Keys.TAB, password);
    }

    @And("LOGIN butonuna tiklar")
    public void logınButonunaTiklar() {
        adminPage.accountLogin.click();
        ReusableMethods.bekle(2);
    }

    @Then("uyari mesaji goruntulenir ve login olunamadigini dogrular")
    public void uyariMesajiGoruntulenirVeLoginOlunamadiginiDogrular() {

        String alertMessage = "Invalid email or password. Please check your credentials and try again.";
        assertEquals(alertMessage,adminPage.invalidEmailOrPasswordAlertMessage.getText());
        ReusableMethods.bekle(2);
    }


    @When("Users kutusuna tiklar")
    public void usersKutusunaTiklar() {
        adminPage.usersButton.click();
        ReusableMethods.bekle(3);
    }

    @And("arama kutusunda verilen bilgileri aratir {string}, {string}, {string}, {string}")
    public void aramaKutusundaVerilenBilgileriAratir(String name, String email, String phone, String role) {

        adminPage.sendKeysAndClick(adminPage.searchBoxG, name, adminPage.searchButtonG);
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminPage.nameTextVerify.isDisplayed());

        adminPage.deleteMethod(adminPage.searchBoxG);
        adminPage.sendKeysAndClick(adminPage.searchBoxG, email, adminPage.searchButtonG);
        ReusableMethods.bekle(2);

        adminPage.deleteMethod(adminPage.searchBoxG);
        adminPage.sendKeysAndClick(adminPage.searchBoxG, phone, adminPage.searchButtonG);
        ReusableMethods.bekle(2);

        adminPage.deleteMethod(adminPage.searchBoxG);
        adminPage.sendKeysAndClick(adminPage.searchBoxG, phone, adminPage.searchButtonG);
        ReusableMethods.bekle(2);

        adminPage.deleteMethod(adminPage.searchBoxG);
        adminPage.sendKeysAndClick(adminPage.searchBoxG, role, adminPage.searchButtonG);
        ReusableMethods.bekle(2);

    }

    @Then("kullanici bilgilerinin goruntulendigi dogrulanir")
    public void kullaniciBilgilerininGoruntulendigiDogrulanir() {
        assertFalse(adminPage.emailTextVerify.getText().isEmpty());
    }


    @And("arama kutusunda {string} aratilir")
    public void aramaKutusundaAratilir(String mail) {
        adminPage.sendKeysAndClick(adminPage.searchBoxG, mail, adminPage.searchButtonG);
        ReusableMethods.bekle(4);
    }

    @And("kullanici bilgileri duzenleme iconuna tiklar")
    public void kullaniciBilgileriDuzenlemeIconunaTiklar() {
        ReusableMethods.click(adminPage.editUsersIcon);
        ReusableMethods.bekle(5);
    }

    @And("kullanici yeni bilgilerini girer")
    public void ullaniciYeniBilgileriniGirer() {
        adminPage.deleteMethod(adminPage.firstNameBox);
        adminPage.firstNameBox.sendKeys(
                "Damon", Keys.TAB,
                "Salvatore", Keys.TAB,
                "(966) 778-1000",
                Keys.TAB, "rebelvamp@mail.com");

        ReusableMethods.bekle(5);

    }

    @And("UPDATE butonuna tiklar")
    public void updateButonunaTiklar() {
        adminPage.updateButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("user bilgilerinin guncellendigini dogrular")
    public void userBilgilerininGuncellendiginiDogrular() {
        assertEquals("User type save successfully", adminPage.updateSuccessText.getText());
    }

    @And("Roles seceneginden MANAGER butonunu secer")
    public void rolesSecenegindenMANAGERButonunuSecer() {
        ReusableMethods.ddmVisibleText(adminPage.rolesMenu, "MANAGER");
        ReusableMethods.bekle(2);
    }

    @And("Roles seceneginden CUSTOMER butonunu secer")
    public void rolesSecenegindenCUSTOMERButonunuSecer() {
        ReusableMethods.ddmVisibleText(adminPage.rolesMenu, "CUSTOMER");
    }

    @And("Roles seceneginden ADMIN butonunu secer")
    public void rolesSecenegindenADMINButonunuSecer() {
        ReusableMethods.ddmVisibleText(adminPage.rolesMenu, "ADMIN");
    }

    @And("UPDATE butonuna tiklar ve rolun atandigini dogrular")
    public void updateButonunaTiklarVeRolunAtandiginiDogrular() {
        ReusableMethods.click(adminPage.updateButton);
        ReusableMethods.bekle(2);
        assertEquals("User type save successfully",adminPage.roleVerify.getText());

    }

    @And("DELETE butonuna tiklar")
    public void deleteButonunaTiklar() {
        adminPage.deleteButton.click();
        ReusableMethods.bekle(3);
    }

    @And("{string} sorusunu goruntuler")
    public void sorusunuGoruntuler(String question) {
        assertTrue(question, adminPage.popUpMessage.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("YES butonuna tiklar")
    public void yesButonunaTiklar() {
        adminPage.yesTextBox.click();
        ReusableMethods.bekle(2);

    }

    @Then("{string} yazisini gorur ve kullanicinin silindigini dogrular")
    public void kullanicininSilindiginiDogrular(String str) {
        assertEquals(str, adminPage.deletedSuccessMessage.getText());
    }










































    //selahattin282
    





















































































































    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  //suleyman482








































}
