package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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

    @FindBy (xpath = "//div[@class='accordion-collapse collapse show']//button[@title='Delete message']//*[name()='svg']")
    public WebElement deleteMessage;

    @FindBy (xpath = "//p[normalize-space()='Admin test5']")
    public WebElement test5Message;

    @FindBy (xpath = "//p[normalize-space()='Admin test4']")
    public WebElement message4;

    @FindBy (xpath = " //div[@class='accordion-collapse collapse show']//button[@title='Mark as read']//*[name()='svg']//*[name()='path' and contains(@d,'M12 19a6.9')]")
    public WebElement markAsRead;

    @FindBy(xpath = " //div[@class='accordion-collapse collapse show']//button[@title='Mark as unread']//*[name()='svg']//*[name()='path' and contains(@d,'M22 8.98V1')]")
    public WebElement markAsUnread;





































































































































    //gülsüm220
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


    //us05 locateleri

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
    public void iconClick(WebElement element1, WebElement element2) {
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








































































//süleyman420



























































































































































































}
