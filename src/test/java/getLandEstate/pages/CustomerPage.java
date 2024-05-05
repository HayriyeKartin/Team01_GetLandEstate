package getLandEstate.pages;

import getLandEstate.utilities.Driver;
import getLandEstate.utilities.ReusableMethods;
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
    @FindBy(xpath = "//*[contains(@href,'/login')]")
    public WebElement customerLoginButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement customerEmailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement customerPasswordBox;

    @FindBy(xpath = "//*[contains(@class,'form-submit-button')]")
    public WebElement customerSubmitLoginButton;
    @FindBy(xpath = "//input[@name='query']")
    public WebElement searchBoxArea;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement searchBoxicon;

    @FindBy(xpath = "//img[@alt='Comfortable house in Kusadasi']")
    public WebElement rentHousePicture;
    @FindBy(xpath = "//img[@alt='v1.png']")
    public WebElement rentVillaPicture;
    @FindBy(xpath = "//img[@alt='Modern Office Space']")
    public WebElement rentOfficePicture;

    @FindBy(xpath = "//img[@alt='Modern Apartment in Scenic İnebolu']")
    public WebElement rentApartmentPicture;

    @FindBy(xpath = "//img[@alt='Investment opportunity Land in Darıca']")
    public WebElement rentLandPicture;
    @FindBy(xpath = "//img[@alt='Shop on Main Street in Kozluk']")
    public WebElement rentShopPicture;

    @FindBy(xpath = "//button[text()='Rent']")
    public WebElement rentButton;
    @FindBy(xpath = "//button[text()='HOUSE']")
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

    @FindBy(xpath ="//input[@name='q']")
    public WebElement secondPageSearchBox;
    @FindBy(xpath ="//input[@name='ps']")
    public WebElement priceRangeMin;

    @FindBy(xpath ="//input[@name='pe']")
    public WebElement priceRangeMax;
    @FindBy(xpath ="//select[@id='at']")
    public WebElement advertTypeDropdown;
    @FindBy(xpath ="//select[@id='c']")
    public WebElement categoryDropdown;

    @FindBy(xpath ="//select[@id='ctry']")
    public WebElement countryDropdown;

    @FindBy(xpath ="//select[@id='city']")
    public WebElement cityDropdown;
    @FindBy(xpath ="//select[@id='dist']")
    public WebElement districtDropdown;
    @FindBy(xpath ="//button[@class='dynamic-button  btn btn-primary']")
    public WebElement secondPageSearchBoxSubmit;
    @FindBy(xpath ="//div[@class='p-galleria-item']")
    public WebElement rentRealEstatePicture;
    @FindBy(xpath ="//h4[@class='description-title']")
    public WebElement rentRealEstateDescription;
    @FindBy(xpath ="//h4[@class='advert-properties-title']")
    public WebElement rentRealEstateDetails;
    @FindBy(xpath ="//h4[@class='advert-location-title']")
    public WebElement rentRealEstateLocation;
    @FindBy(xpath ="//div[@class='user-logo-nav navbar-nav']")
    public WebElement customerProfil;
    @FindBy(xpath ="//span[text()='My Tour Requests']")
    public WebElement customerMyTourRequestsButton;

    @FindBy(xpath ="//h1[text()='MY TOUR REQUEST']")
    public WebElement customerMyTourRequestTitle;

    @FindBy(xpath ="//p[text()='MY REQUESTS']")
    public WebElement customerMyRequestsButton;


    @FindBy(xpath ="//p[text()='Villa Best 210']")
    public WebElement customerRequestsList;

    @FindBy(xpath ="//span[text()='APPROVED']")
    public WebElement customerRequestsStatus;

    @FindBy(xpath ="//p[text()='MY RESPONSES']")
    public WebElement customerMyResponsesButton;
    @FindBy(xpath ="//button[@class='show-toggle btn btn-danger'][1]")
    public WebElement manageContactPhoneikon;

    @FindBy(xpath ="//a[@class='advert-detail-phone-link']")
    public WebElement manageContactPhoneLink;
    @FindBy(xpath ="//button[@class='show-toggle btn btn-danger'][2]")
    public WebElement manageContactMailikon;

    @FindBy(xpath ="//a[@class='advert-detail-mail-link']")
    public WebElement manageContactMailLink;

    @FindBy(xpath ="//input[@id='tourDate']")
    public WebElement tourDate;
    @FindBy(xpath ="//select[@id='tourTime']")
    public WebElement tourTimeDropdown;
    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submitTourRequestButton;

    @FindBy(xpath ="//div[text()='TourRequest created successfully']")
    public WebElement tourRequestCreatedText;

    @FindBy(xpath = "//button[text()='Sale']")
    public WebElement saleButton;
    @FindBy(xpath = "//img[@alt='Calm Family House in Batman Center']")
    public WebElement saleHousePicture;
    @FindBy(xpath = "//img[@alt='Seaview Villa in Basiskele']")
    public WebElement saleVillaPicture;

    @FindBy(xpath = "//img[@alt='Modern Apartment in Central Location']")
    public WebElement saleApartmentPicture;

    @FindBy(xpath = "//img[@alt='Modern Office']")
    public WebElement saleOfficePicture;
    @FindBy(xpath = "//img[@alt='Expansive Land Parcel in Bahce']")
    public WebElement saleLandPicture;

    @FindBy(xpath = "//img[@alt='Shop on the Main Street']")
    public WebElement saleShopPicture;
    @FindBy(xpath ="//div[@class='p-galleria-item']")
    public WebElement saleRealEstatePicture;

    @FindBy(xpath ="//h4[@class='description-title']")
    public WebElement saleRealEstateDescription;

    @FindBy(xpath ="//h4[@class='advert-properties-title']")
    public WebElement saleRealEstateDetails;
    @FindBy(xpath ="//h4[@class='advert-location-title']")
    public WebElement saleRealEstateLocation;





















































































































































































































}
