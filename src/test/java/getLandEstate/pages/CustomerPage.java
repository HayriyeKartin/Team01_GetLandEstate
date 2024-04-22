package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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







































































































































































































    //arzu430





















































































































































































































}
