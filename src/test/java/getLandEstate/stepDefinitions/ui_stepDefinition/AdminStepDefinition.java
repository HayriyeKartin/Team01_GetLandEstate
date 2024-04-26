package getLandEstate.stepDefinitions.ui_stepDefinition;

import getLandEstate.pages.AdminPage;
import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;






public class AdminStepDefinition {
    AdminPage adminPage = new AdminPage();


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
            Thread.sleep(second * 1000);
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
        Assert.assertEquals("Anasayfa", adminPage.turkishText.getText());
    }

    @And("Francais dil secenegini secer ve sayfa dilinin Francais oldugunu dogrular")

    public void dilSeceneginiSecerVeSayfaDilininFrancaisOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.franchIconButton);
        Assert.assertEquals("Accueil", adminPage.frTextVerify.getText());
    }

    @And("Deutsch dil secenegini secer ve sayfa dilinin Deutsch oldugunu dogrular")
    public void dilSeceneginiSecerVeSayfaDilininDeutschOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.grIconButton);
        Assert.assertEquals("Zuhause", adminPage.grTextVerify.getText());

    }

    @And("Espanol dil secenegini secer ve sayfa dilinin Espanol oldugunu dogrular")

    public void dilSeceneginiSecerVeSayfaDilininEspanolOldugunuDogrular() {

        adminPage.iconClick(adminPage.flagIcon, adminPage.spIconButton);
        Assert.assertEquals("Inicio", adminPage.spTextVerify.getText());
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
        adminPage.emailTextBox.sendKeys(email, Keys.TAB, Keys.TAB, password);
    }

    @And("LOGIN butonuna tiklar")
    public void logınButonunaTiklar() {
        adminPage.accountLogin.click();
        ReusableMethods.bekle(2);
    }

    @Then("uyari mesaji goruntulenir ve login olunamadigini dogrular")
    public void uyariMesajiGoruntulenirVeLoginOlunamadiginiDogrular() {


        String alertMessage = "Invalid email or password. Please check your credentials and try again.";
        assertEquals(alertMessage, adminPage.invalidEmailOrPasswordAlertMessage.getText());
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
        assertEquals("User type save successfully", adminPage.roleVerify.getText());

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









































    //US_21 Selahattin - 286
    //TC_01
    @Given("kullanici URL e gider")
    public void kullaniciURLEgider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        ReusableMethods.click(adminPage.loginButton);
    }

    @And("Email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        adminPage.AdEmail.sendKeys(ConfigReader.getProperty("AdLoginEmail"));
        adminPage.AdPassword.sendKeys(ConfigReader.getProperty("AdLoginPassword"));
        ReusableMethods.click(adminPage.submitLogin);
    }

    @And("Contact messages sayfasına gider")
    public void contactMessagesSayfasinaGider() {
        ReusableMethods.click(adminPage.contactMessages);
    }

    @And("Mesaj listesi goruntulenir")
    public void mesajListesiGoruntulenir() {
        adminPage.inComingMessage.click();
        ReusableMethods.bekle(2);
        String expectedData = "Admin Mesaj Testi";
        String actualData = adminPage.inComingMessageText.getText();
        Assert.assertEquals(expectedData, actualData);
        ReusableMethods.bekle(2);
    }

    @And("Bir mesaji secer ve siler")
    public void birMesajiSecerVeSiler() {
        adminPage.deleteMessageIcon.click();
        ReusableMethods.bekle(3);
    }

    @Then("Mesajin silindigini dogrular")
    public void mesajinSilindiginiDogrular() {
        Assert.assertTrue(adminPage.inComingMessageText.isDisplayed());
    }

    //TC_02
    @And("Okunmamis mesajlari kontrol eder")
    public void okunmamisMesajlariKontrolEder() {
        ReusableMethods.click(adminPage.contactMessages);
        ReusableMethods.click(adminPage.filterButton);
        ReusableMethods.click(adminPage.unReadMessages);
        ReusableMethods.click(adminPage.applyFilters);
    }

    @And("Bir mesaji secer ve okundu olarak isaretler")
    public void birMesajiSecerVeOkunduOlarakIsaretler() {
        ReusableMethods.click(adminPage.inComingMessage);
        ReusableMethods.click(adminPage.markAsReadIcon);

    }

    @Then("Mesajin okundu olarak isaretlendigini dogrular")
    public void mesajinOkunduOlarakIsaretlendiginiDogrular() {
        ReusableMethods.click(adminPage.contactMessages);
        ReusableMethods.click(adminPage.filterButton);
        ReusableMethods.click(adminPage.readMessages);
        ReusableMethods.click(adminPage.applyFilters);
        String expText = "Mark as unread";
        String actText = adminPage.markAsUnreadIcon.getAttribute("title");
        Assert.assertEquals(expText, actText);

    }

    //TC_03
    @And("Arama cubuguna gecerli bir sorgu girer")
    public void aramaCubugunaGecerliBirSorguGirer() {
        ReusableMethods.click(adminPage.contactMessages);
        adminPage.searchBox.sendKeys("Admin test4");
    }

    @And("Arama butonuna tiklar")
    public void aramaButonunaTiklar() {
        ReusableMethods.click(adminPage.searchButton);
    }

    @Then("Arama sonuclari goruntulenir")
    public void aramaSonuclariGoruntulenir() {
        adminPage.message4.isDisplayed();

    }

    //TC_04
    @And("Filtre ikonuna tiklar")
    public void filtreIkonunaTiklar() {
        ReusableMethods.click(adminPage.filterButton);
    }

    @And("Bir tarih araligi secer")
    public void birTarihAraligiSecer() {
        adminPage.startDate.sendKeys("16.04.2024");
        adminPage.endDate.sendKeys("25.04.2024");
    }

    @And("Apply Filters butonuna tiklar")
    public void applyFiltersButonunaTiklar() {
        ReusableMethods.click(adminPage.applyFilters);
    }

    @Then("Sonuclar goruntulenir")
    public void sonuclarGoruntulenir() {
        Assert.assertTrue(adminPage.firstMessage.isDisplayed());
    }




















































































    //suleyman482
    @Given("kullanici {string} sitesine gider")
    public void kullaniciSitesineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("giriş yap butonuna tıklar")
    public void girişYapButonunaTıklar() {
        adminPage.giriş.click();
    }
    @And("admin olarak giriş yapar")
    public void adminOlarakGirişYapar() {
        adminPage.adminmail.sendKeys(ConfigReader.getProperty("adminmail"));
        adminPage.adminşifre.sendKeys(ConfigReader.getProperty("sifre"));
        ReusableMethods.click( adminPage.admingiriş);
        ReusableMethods.click(adminPage.user);
        ReusableMethods.click(adminPage.kontrolPaneli);
        ReusableMethods.bekle(10);
    }
    @And("kontrol panelinden ilanlar kısmına tıklar")
    public void kontrolPanelindenIlanlarKısmınaTıklar() {
        ReusableMethods.click(adminPage.adminİlanlar);
        ReusableMethods.bekle(5);
    }
    @And("ara butonuna tıklar")
    public void araButonunaTıklar() {
        ReusableMethods.click(adminPage.adminİlanara);
        ReusableMethods.bekle(10);
    }
    @Then("ilan araması yapılabildiği doğrulanır")
    public void ilanAramasıYapılabildiğiDoğrulanır() {
        Assert.assertTrue(adminPage.adminİlanDoğrulama.isDisplayed());
    }
    @And("ilan türünü kiralık seçer")
    public void ilanTürünüKiralıkSeçer() {
        ReusableMethods.ddmValue(adminPage.adminilanTür,"1");
    }
    @And("ilan türünü satılık seçer")
    public void ilanTürünüSatılıkSeçer() {
        ReusableMethods.ddmValue(adminPage.adminilanTür,"2");
    }
    @And("ara kısmına ilan ismi girer")
    public void araKısmınaIlanIsmiGirer() {
        adminPage.adminİlanAramakutusu.sendKeys(ConfigReader.getProperty("ilanismi1"));
    }
    @Then("ilan araması yapılabildiği doğrulanırDört")
    public void ilanAramasıYapılabildiğiDoğrulanırDört() {
        String expected= ConfigReader.getProperty("ilanismi1");
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        String actual=adminPage.adminİlanDüzenlemeBaşlık.getAttribute("value");
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }
    @And("başlangıç fiyatını negatif girer")
    public void başlangıçFiyatınıNegatifGirer() {
        adminPage.adminİlanBaslangıçFiyatı.sendKeys(ConfigReader.getProperty("baslangicfiyatnegatif"));
    }
    @Then("başlangıç fiyatı sıfır ve daha büyük olmalı uyarısı alır")
    public void başlangıçFiyatıSıfırVeDahaBüyükOlmalıUyarısıAlır() {
        Assert.assertTrue(adminPage.adminİlanBaslangıçFiyatıuyarı.isDisplayed());
    }
    @And("başlangıç fiyatını pozitif bir değer girer")
    public void başlangıçFiyatınıPozitifBirDeğerGirer() {
        adminPage.adminİlanBitişFiyatı.sendKeys(ConfigReader.getProperty("baslangicfiyatpozitif"));
    }
    @And("bitiş fiyatını {string} girer")
    public void bitişFiyatınıGirer(String bitisFiyatinegatif) {
        adminPage.adminİlanBitişFiyatı.sendKeys(bitisFiyatinegatif);

    }
    @Then("bitiş fiyatı pozitif olmalı uyarısı alır")
    public void bitişFiyatıPozitifOlmalıUyarısıAlır() {
        Assert.assertTrue(adminPage.adminİlanBitişFiyatıuyarı.isDisplayed());
    }
    @And("bitiş fiyatına pozitif değer girer")
    public void bitişFiyatınaPozitifDeğerGirer() {
        adminPage.adminİlanBitişFiyatı.sendKeys(ConfigReader.getProperty("bitisfiyat"));
    }
    @And("başlangıç fiyatını bitiş fiyatından daha büyük girer")
    public void başlangıçFiyatınıBitişFiyatındanDahaBüyükGirer() {
        adminPage.adminİlanBaslangıçFiyatı.sendKeys(ConfigReader.getProperty("baslangicfiyat"));
        adminPage.adminİlanBitişFiyatı.sendKeys(ConfigReader.getProperty("bitisfiyat"));
    }
    @Then("başlangıç fiyatını bitiş fiyatından daha büyük olamaz uyarısı alır")
    public void başlangıçFiyatınıBitişFiyatındanDahaBüyükOlamazUyarısıAlır() {
        Assert.assertTrue(adminPage.adminİlanBitişBaşlangıçuyarı.isDisplayed());
    }
    @And("durum kısmını aktif şeçer")
    public void durumKısmınıAktifŞeçer() {
        ReusableMethods.ddmValue(adminPage.adminilanDurum,"2");
    }
    @Then("ilan araması yapılabildiği doğrulanır aktif")
    public void ilanAramasıYapılabildiğiDoğrulanırAktif() {
        String ecpected="Activated";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeDurum);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @And("durum kısmını beklemede şeçer")
    public void durumKısmınıBeklemedeŞeçer() {
        ReusableMethods.ddmValue(adminPage.adminilanDurum,"1");
    }
    @Then("ilan araması yapılabildiği doğrulanır beklemede")
    public void ilanAramasıYapılabildiğiDoğrulanırBeklemede() {
        String ecpected="Pending";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeDurum);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @And("durum kısmını reddedildi  şeçer")
    public void durumKısmınıReddedildiŞeçer() {
        ReusableMethods.ddmValue(adminPage.adminilanDurum,"3");
    }
    @Then("ilan araması yapılabildiği doğrulanır reddedildi")
    public void ilanAramasıYapılabildiğiDoğrulanırReddedildi() {
        String ecpected="Rejected";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeDurum);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @And("kategori kısmından evi seçer")
    public void kategoriKısmındanEviSeçer() {
        ReusableMethods.ddmValue(adminPage.adminİlanKategori,"1");
    }
    @And("kategori kısmından apartmanı seçer")
    public void kategoriKısmındanApartmanıSeçer() {
        ReusableMethods.ddmValue(adminPage.adminİlanKategori,"2");
    }
    @And("kategori kısmından ofisi seçer")
    public void kategoriKısmındanOfisiSeçer() {
        ReusableMethods.ddmValue(adminPage.adminİlanKategori,"3");
    }
    @And("kategori kısmından villayı seçer")
    public void kategoriKısmındanVillayıSeçer() {
        ReusableMethods.ddmValue(adminPage.adminİlanKategori,"4");
    }
    @And("kategori kısmından arsayı seçer")
    public void kategoriKısmındanArsayıSeçer() {
        ReusableMethods.ddmValue(adminPage.adminİlanKategori,"5");
    }
    @And("kategori kısmından mağazayı seçer")
    public void kategoriKısmındanMağazayıSeçer() {
        ReusableMethods.ddmValue(adminPage.adminİlanKategori,"6");
    }
    @And("ara kısmına arayacağı ilanı yazar")
    public void araKısmınaArayacağıIlanıYazar() {
        adminPage.adminİlanAramakutusu.sendKeys(ConfigReader.getProperty("ilanismi2"));
    }
    @And("çıkan ilandan düzenle kısmına tıklar")
    public void çıkanIlandanDüzenleKısmınaTıklar() {
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
    }
    @And("başlık kısmını değiştirir")
    public void başlıkKısmınıDeğiştirir() {
        adminPage.adminİlanDüzenlemeBaşlık.clear();
        adminPage.adminİlanDüzenlemeBaşlık.sendKeys(ConfigReader.getProperty("ilanismiguncelleme"));
    }
    @And("güncelle butonuna tıklar")
    public void güncelleButonunaTıklar() {
        ReusableMethods.click(adminPage.adminİlangüncelleme);
    }
    @Then("güncelleme doğrulama yapılır")
    public void güncellemeDoğrulamaYapılır() {
        Assert.assertTrue(adminPage.adminİlangüncellemedoğrulama.isDisplayed());
    }
    @And("durum kısmını aktif yapar")
    public void durumKısmınıAktifYapar() {
        ReusableMethods.ddmValue(adminPage.adminİlanDüzenlemeDurum,"1");
    }
    @And("durum kısmını red yapar")
    public void durumKısmınıRedYapar() {
        ReusableMethods.ddmValue(adminPage.adminİlanDüzenlemeDurum,"2");
    }
    @And("kontrol panelinden kategoriler kısmına tıklar")
    public void kontrolPanelindenKategorilerKısmınaTıklar() {
        ReusableMethods.click(adminPage.adminKategoriler);
        ReusableMethods.bekle(5);
    }
    @And("artı butonuna tıklar")
    public void artıButonunaTıklar() {
        ReusableMethods.click(adminPage.adminKategoriArtı);
    }
    @And("başlık girer")
    public void başlıkGirer() {
        adminPage.adminKategoriEklemeBaşlık.sendKeys(ConfigReader.getProperty("adminilankategoriekleme"));
    }
    @And("sıra girer")
    public void sıraGirer() {
        adminPage.adminKategoriEklemeSıra.sendKeys("1");
    }
    @And("ikon girer")
    public void ikonGirer() {
        adminPage.adminKategoriEklemeİcontext.sendKeys("K");
    }
    @And("aktif butonuna tıklar")
    public void aktifButonunaTıklar() {
        ReusableMethods.click(adminPage.adminKategoriEklemeAktif);
    }
    @And("oluştur butonuna tıklarbir")
    public void oluşturButonunaTıklarbir() {
        ReusableMethods.click( adminPage.adminKategoriEklemeOluştur);
    }
    @And("kategorinin oluştuğunu doğrular")
    public void kategorininOluştuğunuDoğrular() {
        Assert.assertTrue(adminPage.adminKategoriEklemeDoğrulama.isDisplayed());
    }
    @And("arama kısmına eklediği kategoriyi yazar")
    public void aramaKısmınaEklediğiKategoriyiYazar() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("adminilankategoriekleme"));

    }
    @And("search kısmına tıklar")
    public void searchKısmınaTıklar() {
        ReusableMethods.click( adminPage.adminKategoriArama);
        ReusableMethods.bekle(3);
    }
    @And("düzenle ikonuna tıklar")
    public void düzenleIkonunaTıklar() {
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
    }
    @And("başlığı değiştirir")
    public void başlığıDeğiştirir() {
        adminPage.adminKategoriEklemeBaşlık.clear();
        ReusableMethods.bekle(3);
        adminPage.adminKategoriEklemeBaşlık.sendKeys(ConfigReader.getProperty("adminilankategoriguncelleme"));
    }
    @And("Kategori güncelle butonuna tıklar")
    public void kategoriGüncelleButonunaTıklar() {
        ReusableMethods.click(adminPage.adminKategoriGüncellme);
    }
    @Then("kategorinin güncellendiğii doğrular")
    public void kategorininGüncellendiğiiDoğrular() {
        Assert.assertTrue(adminPage.adminKategoriGüncellmeDoğrulama.isDisplayed());
    }
    @And("arama kısmına güncellediği kategoriyi yazar")
    public void aramaKısmınaGüncellediğiKategoriyiYazar() {
        adminPage.adminKategoriAramaKutusu.sendKeys("adminilankategoriguncelleme");
        ReusableMethods.bekle(3);
    }
    @And("delete ikonuna tıklar")
    public void deleteIkonunaTıklar() {
        ReusableMethods.click(adminPage.adminİlansilme);
        ReusableMethods.click(adminPage.adminKategoriSilmeEvet);
    }
    @Then("kategorinin silindiğini doğrular")
    public void kategorininSilindiğiniDoğrular() {
        Assert.assertTrue(adminPage.adminKategoriSilmeDoğrulama.isDisplayed());
    }
    @And("kontrol panelinden ilan türleri kısmına tıklar")
    public void kontrolPanelindenIlanTürleriKısmınaTıklar() {
        ReusableMethods.click( adminPage.adminİlanTürü);
        ReusableMethods.bekle(3);
    }

    @And("başlık girer dört")
    public void başlıkGirerDört() {
        adminPage.adminKategoriEklemeBaşlık.sendKeys(ConfigReader.getProperty("adminilanturekleme"));
    }
    @And("oluştur butonuna tıklarDört")
    public void oluşturButonunaTıklarDört() {
        ReusableMethods.click(adminPage.adminİlanTürüEklemeOluştur);
    }
    @Then("ilan türünün oluştuğunu doğrular")
    public void ilanTürününOluştuğunuDoğrular() {
        Assert.assertTrue(adminPage.adminİlanTürüEklemeDoğrulama.isDisplayed());
    }
    @And("kontrol panelinden tur talepleri kısmına tıklar")
    public void kontrolPanelindenTurTalepleriKısmınaTıklar() {
        ReusableMethods.click(adminPage.adminTurİstekleri);
        ReusableMethods.bekle(3);
    }
    @Then("tur taleplerinin görüldüğünü doğrular")
    public void turTaleplerininGörüldüğünüDoğrular() {
        Assert.assertTrue(adminPage.adminİlanTurTalebleriDoğrulama.isDisplayed());
    }
    @And("kontrol panelinden kullanıcılar kısmına tıklar")
    public void kontrolPanelindenKullanıcılarKısmınaTıklar() {
        ReusableMethods.click(adminPage.adminKullanıcılar);
    }
    @And("{string} girer")
    public void girer(String arg0) {
        adminPage.adminKategoriAramaKutusu.sendKeys(arg0);
    }
    @And("search butonuna tıklar")
    public void searchButonunaTıklar() {
        ReusableMethods.click(adminPage.adminKategoriArama);
        ReusableMethods.bekle(3);
    }
    @Then("kullanıcı doğrulama yapar")
    public void kullanıcıDoğrulamaYapar() {
        String expected=ConfigReader.getProperty("adminmail");
        String actual=adminPage.adminKullanıcıAramaDoğrulama.getText();
        Assert.assertTrue(actual.contains(expected));
    }
    @And("rol türü girer")
    public void rolTürüGirer() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("adminrol"));
    }
    @Then("kullanıcı doğrulama yapar admin")
    public void kullanıcıDoğrulamaYaparAdmin() {
        String expected="ADMIN";
        String actual=adminPage.adminKullanıcıAramaDoğrulamaAdmin.getText();
        Assert.assertTrue(actual.contains(expected));
    }
    @And("email girer")
    public void emailGirer() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("adminmail"));
    }
    @And("numarayı günceller")
    public void numarayıGünceller() {
        adminPage.adminKullanıcıTelefonGüncelleme.clear();
        adminPage.adminKullanıcıTelefonGüncelleme.sendKeys(ConfigReader.getProperty("admintelefonguncelleme"));
    }
    @Then("numaranın güncellendiğini doğrular")
    public void numaranınGüncellendiğiniDoğrular() {
        Assert.assertTrue(adminPage.adminKullanıcıGüncellemeDoğrulama.isDisplayed());
    }
    @And("email girerOnbir")
    public void emailGirerOnbir() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("mail1"));
    }
    @And("costomer rolünü manager yapar")
    public void costomerRolünüManagerYapar() {
        ReusableMethods.ddmValue(adminPage.adminKullanıcıRolGüncelleme,"MANAGER");
    }
    @Then("rol atama doğrulaması yapılır")
    public void rolAtamaDoğrulamasıYapılır() {
        Assert.assertTrue(adminPage.adminKullanıcıGüncellemeDoğrulama.isDisplayed());
    }
    @And("email girerOniki")
    public void emailGirerOniki() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("mail2"));
    }
    @And("costomer rolünü admin yapar")
    public void costomerRolünüAdminYapar() {
        ReusableMethods.ddmValue(adminPage.adminKullanıcıRolGüncelleme,"ADMIN");
    }
    @And("email girerOnüç")
    public void emailGirerOnüç() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("mail3"));
    }
    @And("manager rolünü admin yapar")
    public void managerRolünüAdminYapar() {
        ReusableMethods.ddmValue(adminPage.adminKullanıcıRolGüncelleme,"ADMIN");
    }
    @And("email girerOndört")
    public void emailGirerOndört() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("mail4"));
    }
    @And("admin rolünü manager yapar")
    public void adminRolünüManagerYapar() {
        ReusableMethods.ddmValue(adminPage.adminKullanıcıRolGüncelleme,"MANAGER");
    }
    @And("email girerOnbeş")
    public void emailGirerOnbeş() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("mail5"));
    }
    @And("admin rolünü customer yapar")
    public void adminRolünüCustomerYapar() {
        ReusableMethods.ddmValue(adminPage.adminKullanıcıRolGüncelleme,"CUSTOMER");
    }
    @And("email girerOnaltı")
    public void emailGirerOnaltı() {
        adminPage.adminKategoriAramaKutusu.sendKeys(ConfigReader.getProperty("mail6"));
    }
    @And("manager rolünü customer yapar")
    public void managerRolünüCustomerYapar() {
        ReusableMethods.ddmValue(adminPage.adminKullanıcıRolGüncelleme,"CUSTOMER");
    }
    @And("Sayfayı kapatır")
    public void sayfayıKapatır() {
        ReusableMethods.click(adminPage.logOut);
        ReusableMethods.click(adminPage.getLogOutEvet);
        //Driver.closeDriver();
    }
    @Then("ilan araması yapılabildiği doğrulanır iki")
    public void ilanAramasıYapılabildiğiDoğrulanırIki() {
        String ecpected="Rent";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeİlanTürü);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @Then("ilan araması yapılabildiği doğrulanır üç")
    public void ilanAramasıYapılabildiğiDoğrulanırÜç() {
        String ecpected="Sale";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeİlanTürü);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @Then("ilan araması yapılabildiği doğrulanır ondört")
    public void ilanAramasıYapılabildiğiDoğrulanırOndört() {
        String ecpected="House";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeKategori);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @Then("ilan araması yapılabildiği doğrulanır onbeş")
    public void ilanAramasıYapılabildiğiDoğrulanırOnbeş() {
        String ecpected="Apartment";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeKategori);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @Then("ilan araması yapılabildiği doğrulanır onaltı")
    public void ilanAramasıYapılabildiğiDoğrulanırOnaltı() {
        String ecpected="Office";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeKategori);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @Then("ilan araması yapılabildiği doğrulanır onyedi")
    public void ilanAramasıYapılabildiğiDoğrulanırOnyedi() {
        String ecpected="Villa";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeKategori);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @Then("ilan araması yapılabildiği doğrulanır onsekiz")
    public void ilanAramasıYapılabildiğiDoğrulanırOnsekiz() {
        String ecpected="Land";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeKategori);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }
    @Then("ilan araması yapılabildiği doğrulanır ondokuz")
    public void ilanAramasıYapılabildiğiDoğrulanırOndokuz() {
        String ecpected="Shop";
        ReusableMethods.click(adminPage.adminİlanDüzenleme);
        ReusableMethods.bekle(5);
        Select select = new Select(adminPage.adminİlanDüzenlemeKategori);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(ecpected,actual);
    }


}







































































   











































    

















































































































