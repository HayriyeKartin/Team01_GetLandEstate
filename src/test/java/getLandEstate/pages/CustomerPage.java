package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CustomerPage {










    public CustomerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }








    //bilal30
    @FindBy(xpath= "//*[text()='Login']")
    public WebElement loginButton;
    @FindBy(xpath= "//input[@placeholder='Email']")
    public WebElement emailButton;
    @FindBy(xpath= "//input[@placeholder='Enter password']")
    public WebElement passwordButton;
    @FindBy(xpath= "//*[text()='LOGIN']")
    public WebElement loginButton2;
    @FindBy(xpath= "//*[text()='Create Property']")
    public WebElement createPropertyText;

    @FindBy(css= ".dropdown-toggle.nav-link")
    public WebElement dilSecmeMenusu;
    @FindBy(xpath= "//*[text()='Türkçe']")
    public WebElement turkceDili;
    @FindBy(xpath= "//*[text()='Français']")
    public WebElement fransaDili;
    @FindBy(xpath= "//*[text()='Deutsch']")
    public WebElement almanDili;
    @FindBy(xpath= "//*[text()='Español']")
    public WebElement ispanyaDili;
    @FindBy(xpath= "//*[text()='HOUSE']")
    public WebElement houseText;
    @FindBy(xpath= "//*[text()='EV']")
    public WebElement evText;
    @FindBy(xpath= "//button[text()='MAISON']")
    public WebElement maisonText;
    @FindBy(xpath= "//button[text()='HAUS']")
    public WebElement hausText;
    @FindBy(xpath= "//button[text()='CASA']")
    public WebElement casaText;

    ///
    @FindBy(xpath= "//a[text()='Register']")
    public WebElement register;
    @FindBy(xpath= "//input[@placeholder='First Name']")
    public WebElement firstname;
    @FindBy(xpath= "//input[@placeholder='Last Name']")
    public WebElement lastname;
    @FindBy(xpath= "//input[@placeholder='(XXX) XXX-XXXX']")
    public WebElement phoneNumber;
    @FindBy(xpath= "//input[@placeholder='Email']")
    public WebElement email;
    @FindBy(xpath= "//input[@placeholder='Enter password']")
    public WebElement password;
    @FindBy(xpath= "//input[@placeholder='Confirm Password']")
    public WebElement confirmPassword;
    @FindBy(xpath= "//input[@name='terms']")
    public WebElement termsOfUse;
    @FindBy(xpath= "//*[text()='REGISTER']")
    public WebElement register2;
    @FindBy(xpath= "//*[text()='Success']")
    public WebElement success;
    @FindBy(xpath= "//div[@class='p-toast-detail']")
    public WebElement successMessage;











































































































































    //akın230

    @FindBy(xpath = "//a[@data-rr-ui-event-key='5']")
    public WebElement girisButonu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//button[@class='submit-button btn btn-secondary']")
    public WebElement loginButonu;
    @FindBy(xpath ="(//div[@class='form-feedback invalid-feedback'])[1]")
    public WebElement invalidEmail ;

    @FindBy(xpath ="(//div[@class='form-feedback invalid-feedback'])[2]" )
    public WebElement invalidPassword ;

    @FindBy(xpath = "//div[@class='user-logo-nav navbar-nav']")
    public WebElement profileButton;
    @FindBy(xpath ="(//a[@class='dropdown-item'])[1]" )
    public WebElement myProfileButton;

    @FindBy(xpath ="//input[@value='akin.sakarya5116@gmail.com']" )
    public WebElement myEmail;

    @FindBy(xpath ="//input[@name='firstName']")
    public WebElement myName ;

    @FindBy(xpath ="(//button[@class='submit-button btn btn-secondary'])[1]" )
    public WebElement updateButton ;

    @FindBy(xpath ="//*[.='Profile updated successfully']" )
    public WebElement updateAssert ;

    @FindBy(xpath ="//button[@data-rr-ui-event-key='change-password']" )
    public WebElement changePasswordButton;

    @FindBy(xpath ="//input[@name='currentPassword']" )
    public WebElement currentPasswordArea;

    @FindBy(xpath ="//*[.='You can login using your GetLandEstate account']" )
    public WebElement changePasswordAssert;

    @FindBy(xpath ="//button[@data-rr-ui-event-key='profile-photo']" )
    public WebElement profilePhotoButton ;

    @FindBy(xpath ="//*[.='SELECT']" )
    public WebElement selectButton ;

    @FindBy(xpath ="//button[@class='done-button btn btn-primary']" )
    public WebElement doneButton ;

    @FindBy(xpath ="//button[@class='save-button btn btn-secondary']" )
    public WebElement saveButton ;

    @FindBy(xpath ="//*[.='Updated']" )
    public WebElement saveAssert ;

    @FindBy(xpath ="//button[@data-rr-ui-event-key='delete-account']" )
    public WebElement deleteAccountButton ;
    @FindBy(xpath ="(//input[@class='user-password-input form-control'])[4]" )
    public WebElement deletePasswordArea ;
    @FindBy(xpath ="//input[@placeholder='Enter your password']" )
    public WebElement deleteButton ;

    public static void uploadFileWithRobot(String filePath) {
        try {
            Robot robot = new Robot();

            // Dosya yolunu kopyala
            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            ReusableMethods.bekle(5);
            // CTRL+V (Yapıştır) kısayolu ile dosya yolu yapıştır
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // ENTER tuşu ile dosya seçimi onayla
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
















































































































    //arzu430





















































































































































































































}
