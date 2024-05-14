package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }





    //selahattin20
    @FindBy(xpath = "//a[normalize-space()='Login']")
    public WebElement loginButton;

    @FindBy (xpath = "//input[@placeholder='Email']")
    public WebElement AdEmail;

    @FindBy (xpath = "//input[@placeholder='Enter password']")
    public WebElement AdPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitLogin;

    @FindBy (xpath = "//span[normalize-space()='ContactMessages']")
    public WebElement contactMessages;

    @FindBy (xpath ="//input[@placeholder='Type Something']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@class='search-button btn btn-primary']//*[name()='svg']")
    public WebElement searchButton;

    @FindBy (xpath = "//button[@class='filter-button btn btn-primary']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")
    public WebElement filterButton;

    @FindBy (xpath = "//*[@id=\"status\"]/option[1]")
    public WebElement allMessages;

    @FindBy (xpath = "//*[@id=\"status\"]/option[2]")
    public WebElement readMessages;

    @FindBy (xpath = "//*[@id=\"status\"]/option[3]")
    public WebElement unReadMessages;

    @FindBy (xpath = "//select[@id='status']")
    public WebElement searchIn;

    @FindBy (xpath = "//input[@id='startDate']")
    public  WebElement startDate;

    @FindBy (xpath = "//input[@id='endDate']")
    public WebElement endDate;

    @FindBy (xpath = "//button[@title='Apply Filters']//*[name()='svg']")
    public WebElement applyFilters;

    @FindBy (xpath = "//div[@class='admin-contact-message-container']//div[1]//h2[1]//button[1]")
    public WebElement firstMessage;

    @FindBy (xpath = "//div[@class='accordion']//div[2]//h2[1]//button[1]")
    public WebElement secondMessage;

    @FindBy (xpath = "//p[normalize-space()='Admin test5']")
    public WebElement test5Message;

    @FindBy (xpath = "//button[@class='accordion-button']//span[@class='email'][normalize-space()='syasarit@gmail.com']")
    public WebElement syEmail;

    @FindBy (xpath = "//p[normalize-space()='Admin test4']")
    public WebElement message4;

    @FindBy (xpath = "//*[.='Admin test4']")
    public WebElement test4Message;

    @FindBy (xpath = " //*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/div[9]/div/div/div[3]/button[1]")
    public WebElement markAsRead;

    @FindBy(xpath = "(//button[@title='Mark as read'])[1]")
    public WebElement markAsReadIcon;

    @FindBy(xpath = "(//button[@title='Mark as unread'])[1]")
    public WebElement markAsUnreadIcon;

    @FindBy(xpath = "//span[text()='ContactMessages']")
    public WebElement contactMessagesButton;

    @FindBy(xpath = "//span[text()='customer@selahattin.com']")
    public WebElement inComingMessage;

    @FindBy(xpath = "//p[text()='Admin Mesaj Testi']")
    public WebElement inComingMessageText;
    @FindBy(xpath = "//div[@class='accordion-collapse collapse show']//button[@title='Delete message']//*[name()='svg']")
    public WebElement deleteMessageIcon;






















    //gülsüm125

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginbutton;

    @FindBy(css = "input[name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//span[normalize-space()='Back to Site']")
    public WebElement backToSite;

    @FindBy(xpath = "//img[@class='flag-icon']")
    public WebElement flagIcon;

    @FindBy(xpath = "//a[.='Home']")
    public WebElement englishTextVerify;

    @FindBy(xpath = "//a[normalize-space()='Türkçe']")
    public WebElement trflagIconButton;

    @FindBy(xpath = "//a[normalize-space()='Anasayfa']")
    public WebElement turkishText;

    @FindBy(xpath = "//a[normalize-space()='Français']")
    public WebElement franchIconButton;

    @FindBy(xpath = "//a[.='Accueil']")
    public WebElement frTextVerify;
    @FindBy(xpath = "//a[normalize-space()='Deutsch']")
    public WebElement grIconButton;

    @FindBy(xpath = "//a[.='Zuhause']")
    public WebElement grTextVerify;

    @FindBy(xpath = "//a[normalize-space()='Español']")
    public WebElement spIconButton;

    @FindBy(xpath = "//a[.='Inicio']")
    public WebElement spTextVerify;


    //us05 locateleri - gulsum

    @FindBy(xpath = "//div[.='Invalid email or password. Please check your credentials and try again.']")//div[@class='p-toast-detail']
    public WebElement invalidEmailOrPasswordAlertMessage;

    @FindBy(css = ".submit-button.btn.btn-secondary")
    public WebElement accountLogin;

    @FindBy(xpath = "//img[@src='/images/profile/user.jpg']")
    public WebElement profileIconButton;

    @FindBy(xpath = "//span[normalize-space()='My Profile']")
    public WebElement myProfileButton;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersButton;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBoxG;

    @FindBy(xpath = "//button[@class='search-button btn btn-outline-secondary']")
    public WebElement searchButtonG;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement nameTextVerify;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement emailTextVerify;

    @FindBy(xpath = "//div[.='User type save successfully']")
    public WebElement roleVerify;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement editUsersIcon;

    @FindBy(id = "firstName")
    public WebElement firstNameBox;

    @FindBy(css = ".update-button.btn.btn-primary")
    public WebElement updateButton;

    @FindBy(xpath = "//div[.='User type save successfully']")
    public WebElement updateSuccessText;

    @FindBy(css = "#role") //select[@id='role']
    public WebElement rolesMenu;


    @FindBy(xpath = "//button[normalize-space()='DELETE']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='p-confirm-popup-message']")
    public WebElement popUpMessage;

    @FindBy(xpath = "//span[normalize-space()='Yes']")
    public WebElement yesTextBox;

    @FindBy(css = ".p-toast-detail")
    public WebElement deletedSuccessMessage;

    //Delete Methodu - US05 gulsum
    public void deleteMethod(WebElement webElement) {
        String codeValue = webElement.getAttribute("value");
        for (int i = 0; i < codeValue.length(); i++) {
            webElement.sendKeys(Keys.BACK_SPACE);
        }
    }

    //Click Methodu - US04 gulsum
    public void multipleClick(WebElement element1, WebElement element2) {
        try {
            element1.click();
            element2.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element1, "arguments[0].click();", element2);
        }
    }

    //Send and click Methodu - US05 TC02 gulsum
    public void sendKeysAndClick(WebElement elementToSendKeys, String textToSend, WebElement elementToClick) {
        try {
            if (elementToSendKeys == null || elementToClick == null) {
                throw new IllegalArgumentException("Giriş verileri doğrulanamadı.");
            }
            if (textToSend == null || textToSend.isEmpty()) {
                throw new IllegalArgumentException("Gönderilecek metin boş olamaz.");
            }
            elementToSendKeys.sendKeys(textToSend);
            elementToClick.click();
        } catch (IllegalArgumentException e) {
            throw e; // Orijinal IllegalArgumentException'ı fırlat
        } catch (Exception e) {
            throw new RuntimeException("sendKeysAndClick metodu çalışırken bir hata oluştu.", e);
        }
    }

    //US05 E2E UI scenario - gulsum
    @FindBy(linkText = "Register")
    private WebElement registerLink;
    @FindBy(css = "[name='firstName']")
    private WebElement firstNameInput;
    @FindBy(css = "[name='lastName']")
    private WebElement lastNameInput;
    @FindBy(css = "[name='phone']")
    private WebElement phoneInput;
    @FindBy(css = "[name='email']")
    private WebElement emailInput;
    @FindBy(css = "[name='password']")
    private WebElement passwordInput;
    @FindBy(css = "[name='confirmPassword']")
    private WebElement confirmPasswordInput;
    @FindBy(id = "terms")
    private WebElement termsCheckbox;
    @FindBy(css = ".form-submit-button")
    private WebElement registerButtonG;
    @FindBy(css = ".p-toast-summary")
    private WebElement successRegister;

    public void clickOnRegisterLink() {
        registerLink.click();
    }

    public void typeFirstName(String firstname) {
        firstNameInput.sendKeys(firstname);
    }

    public void typeLastName(String lastname) {
        lastNameInput.sendKeys(lastname);
    }

    public void typePhoneNumber(String phone) {
        phoneInput.click();
        phoneInput.sendKeys(phone);
    }

    public void typeEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void typePassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void typeConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void acceptTerms() {
        termsCheckbox.click();
    }

    public void clickOnRegisterButton() {
        registerButtonG.click();
    }

    public void assertRegisterIsSuccessful() {
        assertEquals("Success", successRegister.getText());
    }























//süleyman350
@FindBy(xpath = "//a[@href='/login']")
public WebElement giriş;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement adminmail;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminşifre;
    @FindBy(xpath = "//div[@class='form-submit-button']")
    public WebElement admingiriş;
    @FindBy(xpath = "//a[@title='Adverts']")
    public WebElement adminİlanlar;
    @FindBy(xpath = "//a[@title='Categories']")
    public WebElement  adminKategoriler;
    @FindBy(xpath = "//a[@title='Advert Types']")
    public WebElement  adminİlanTürü;
    @FindBy(xpath = "//a[@title='Users']")
    public WebElement  adminKullanıcılar;
    @FindBy(xpath = "//a[@title='Tour Requests']")
    public WebElement  adminTurİstekleri;
    @FindBy(xpath = "//input[@name='q']")
    public WebElement  adminİlanAramakutusu;
    @FindBy(xpath = "//input[@name='price_start']")
    public WebElement  adminİlanBaslangıçFiyatı;
    @FindBy(xpath = "//div[text()='Price must be 0 or greater']")
    public WebElement  adminİlanBaslangıçFiyatıuyarı;
    @FindBy(xpath = "//input[@name='price_end']")
    public WebElement  adminİlanBitişFiyatı;
    @FindBy(xpath = "//div[text()='Price must be positive']")
    public WebElement  adminİlanBitişFiyatıuyarı;
    @FindBy(xpath = "//div[@class='p-toast p-component p-toast-top-right p-ripple-disabled']")
    public WebElement  adminİlanBitişBaşlangıçuyarı;
    @FindBy(xpath = "//select[@name='status']")
    public WebElement  adminilanDurum;
    @FindBy(xpath = "//select[@name='advert_type_id']")
    public WebElement  adminilanTür;
    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement  adminİlanKategori;
    @FindBy(xpath = "//button[@class='dynamic-button  btn btn-primary']")
    public WebElement  adminİlanara;
    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[1]")
    public WebElement  adminİlansilme;
    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[2]")
    public WebElement  adminİlanDüzenleme;
    @FindBy(xpath = "//input[@name='title']")
    public WebElement  adminİlanDüzenlemeBaşlık;
    @FindBy(xpath = "//select[@name='statusForAdvert']")
    public WebElement  adminİlanDüzenlemeDurum;
    @FindBy(xpath = "//select[@name='advertTypeId']")
    public WebElement  adminİlanDüzenlemeİlanTürü;
    @FindBy(xpath = "//select[@name='categoryId']")
    public WebElement  adminİlanDüzenlemeKategori;
    @FindBy(xpath = "//button[@class='dynamic-button auto-wide btn btn-primary']")
    public WebElement  adminİlangüncelleme;
    @FindBy(xpath = "//div[@class='p-toast-message p-toast-message-success p-toast-message-enter-done']")
    public WebElement  adminİlangüncellemedoğrulama;
    @FindBy(xpath = "//table/tbody/tr[1]/td[3]")
    public WebElement  adminİlanDoğrulama;
    @FindBy(xpath = "//p[1]")
    public WebElement  adminİlanbaşlıktıkla;
    @FindBy(xpath = "//input[@name='search']")
    public WebElement  adminKategoriAramaKutusu;
    @FindBy(xpath = "//button[@class='search-button btn btn-outline-secondary']")
    public WebElement  adminKategoriArama;
    @FindBy(xpath = "//button[@title='Add New']")
    public WebElement  adminKategoriArtı;
    @FindBy(xpath = "//input[@name='title']")
    public WebElement  adminKategoriEklemeBaşlık;
    @FindBy(xpath = "//input[@name='seq']")
    public WebElement  adminKategoriEklemeSıra;
    @FindBy(xpath = "////span[text()='Info']")
    public WebElement  adminKategoriEklemeİconİnfo;
    @FindBy(xpath = "//a[@href='https://fontawesome.com/search?o=r&m=free&s=solid']")
    public WebElement  adminKategoriEklemeİnfoLink;
    @FindBy(xpath = "//input[@name='icon']")
    public WebElement  adminKategoriEklemeİcontext;
    @FindBy(xpath = "//input[@name='active']")
    public WebElement  adminKategoriEklemeAktif;
    @FindBy(xpath = "//button[@class='category-common-button create-button btn btn-primary']")
    public WebElement  adminKategoriEklemeOluştur;
    @FindBy(xpath = "//button[@class='category-common-button update-button btn btn-warning']")
    public WebElement  adminKategoriGüncellme;
    @FindBy(xpath = "(//span[@class='p-button-label p-c'])[2]")
    public WebElement  adminKategoriSilmeEvet;
    @FindBy(xpath = "//div[@class='p-toast-message p-toast-message-success p-toast-message-enter-done']")
    public WebElement  adminKategoriGüncellmeDoğrulama;
    @FindBy(xpath = "//div[@class='p-toast p-component p-toast-top-right p-ripple-disabled']")
    public WebElement  adminKategoriSilmeDoğrulama;
    @FindBy(xpath = "//div[@class='p-toast-message p-toast-message-info p-toast-message-enter-done']")
    public WebElement  adminKategoriEklemeDoğrulama;
    @FindBy(xpath = "//button[@class='dynamic-button  btn btn-primary']")
    public WebElement  adminİlanTürüEklemeOluştur;
    @FindBy(xpath = "//button[@class='dynamic-button  btn btn-primary']")
    public WebElement  adminİlanTürüEklemeDoğrulama;
    @FindBy(xpath = "//table/tbody/tr[1]/td[4]")
    public WebElement  adminİlanTurTalebleriDoğrulama;
    @FindBy(xpath = "(//div[@style='display: flex; align-items: center; justify-content: space-between; padding: 0px 10px;'])[2]")
    public WebElement  adminKullanıcıAramaDoğrulama;
    @FindBy(xpath = "//span[text()='ADMIN']")                               //DEĞİŞTİ
    public WebElement  adminKullanıcıAramaDoğrulamaAdmin;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement  adminKullanıcıTelefonGüncelleme;
    @FindBy(xpath = "//select[@name='role']")
    public WebElement  adminKullanıcıRolGüncelleme;
    @FindBy(xpath = "//button[@class='update-button btn btn-primary']")
    public WebElement  adminKullanıcıGüncelleme;
    @FindBy(xpath = "//div[@class='p-toast-message p-toast-message-success p-toast-message-enter-done']")
    public WebElement  adminKullanıcıGüncellemeDoğrulama;
    @FindBy(xpath = "//a[@title='Logout']")
    public WebElement  logOut;
    @FindBy(xpath = "//button[@class='p-confirm-dialog-accept p-button p-component']")
    public WebElement  getLogOutEvet;
    @FindBy(xpath = "//div[@class='user-logo-nav navbar-nav']")
    public WebElement  user;
    @FindBy(xpath = "//span[text()='Control Panel']")
    public WebElement  kontrolPaneli;
    @FindBy(xpath = "//div[@class='advert-type']") //eklendi
    public WebElement  adminilandoğrulama2;
    @FindBy(xpath = "//div[@class='advert-type']") //eklendi
    public WebElement  adminilandoğrulma14;
    @FindBy(xpath = "(//span[@class='p-tag-value'])[1]") //eklendi
    public WebElement  adminilandoğrulamarol;


}
