package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnRegisteredPage {











    //pınar20

    public UnRegisteredPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactMenuButton;

    @FindBy(css = "#firstName")
    public WebElement firstNameInput;

    @FindBy(css = "#lastName")
    public WebElement lastNameInput;

    @FindBy(css = "#email")
    public WebElement emailInput;

    @FindBy(css = "#message")
    public WebElement messageTextArea;

    @FindBy(xpath = "//div[@class='recaptcha-wrapper']")
    public WebElement notRobotIframe;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement notRobotCheckBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement contactMessageSendButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div[1]/span")
    public WebElement contactMessageSuccess;

    @FindBy(xpath = "//div[text()='At least 2 characters']")
    public WebElement messageWarningText;

    @FindBy(xpath = "//div[text()='Invalid email']")
    public WebElement messageInvalidEmail;














    //gulsum60 - US12
    @FindBy(xpath = "//button[normalize-space()='Rent']")
    public WebElement rentButton;

    @FindBy(xpath = "//button[normalize-space()='Sale']")
    public WebElement saleButton;

    @FindBy(xpath = "//button[normalize-space()='HOUSE']")
    public WebElement houseButton;

    @FindBy(xpath = "//button[text()='APARTMENT']")
    public WebElement apartmentButton;

    @FindBy(xpath = "//button[text()='OFFICE']")
    public WebElement officeButton;

    @FindBy(xpath = "//button[text()='VILLA']")
    public WebElement villaButton;

    @FindBy(xpath = "//button[text()='LAND']")
    public WebElement landButton;

    @FindBy(xpath = "//button[text()='SHOP']")
    public WebElement shopButton;

    @FindBy(xpath = "//input[@name='query']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@id='ps']")
    public WebElement priceRangeMin;

    @FindBy(xpath = "//select[@id='at']")
    public WebElement advertTypeMenu;

    @FindBy(xpath = "//select[@id='c']")
    public WebElement categoryMenu;

    @FindBy(xpath = "//select[@id='ctry']")
    public WebElement countryMenu;

    @FindBy(xpath = "//select[@id='city']")
    public WebElement cityMenu;

    @FindBy(xpath = "//select[@id='dist']")
    public WebElement disctrictMenu;

    @FindBy(css = ".dynamic-button.btn.btn-primary")
    public WebElement submitSearch;

    @FindBy(xpath = "//div/img[@class='thumbnail-image']")
    public WebElement estatePicture;

    @FindBy(xpath = "(//div//div[@class='property-card card'])[1]")
    public WebElement firstAdvert;

    @FindBy(xpath = "//p[2]")
    public WebElement createAccountPopUpText;

    @FindBy(id = "tourDate")
    public WebElement tourDateMenu;
    @FindBy(id = "tourTime")
    public WebElement tourTimeMenu;

    @FindBy(xpath = "//h4[normalize-space()='Log in for tour request']")
    public WebElement tourRequestPopUpText;

    @FindBy(xpath = "//span[@class='register-link']")
    public WebElement createOneNowText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='form-submit-button']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='advert-description']")
    public WebElement estateDescription;
    @FindBy(xpath = "//span[@class='property-value']")
    public WebElement detailsSizeInfo;

    @FindBy(xpath = "//span[@class='address-value']")
    public WebElement locationAddressInfo;

    @FindBy(xpath = "//div[@class='advert-details-owner-mail']//button[1]")
    public WebElement contactNumberEyeIcon;

    @FindBy(xpath = "//div[@class='advert-details-owner-mail']//button[2]")
    public WebElement sendMailEyeIcon;





































































    //hayriye220
}
