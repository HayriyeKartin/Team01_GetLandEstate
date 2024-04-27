package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ManagerPage {

    public ManagerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




    //fatih20
    @FindBy(xpath = "//a[@class='add-property btn btn-primary']")
    public WebElement createPropertyButton;

    @FindBy(xpath = "//input[@placeholder='Title']")
    public WebElement title;

    @FindBy(xpath = "//div[text()='Enter a title']")
    public WebElement titleMessage;
//div[text()='Enter a title']

    @FindBy(xpath = "//textarea")
    public WebElement description;

    @FindBy(xpath = "//div[text()='Enter a description']")
    public WebElement descriptionMessage;

    @FindBy(xpath = "//input[@id='price']")
    public WebElement price;

    @FindBy(xpath = "//div[text()='Price must be positive']")
    public WebElement priceMessage;

    @FindBy(xpath = "//select[@name='advertTypeId']")
    public WebElement advertTypeDDM;

    @FindBy(xpath = "//select[@name='categoryId']")
    public WebElement categoryDDM;

    @FindBy(xpath = "//select[@name='countryId']")
    public WebElement countryDDM;

    @FindBy(xpath = "//select[@name='cityId']")
    public WebElement cityDDM;

    @FindBy(xpath = "//select[@name='districtId']")
    public WebElement districtDDM;

    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement address;

    @FindBy(xpath = "//div[text()='newAdvertPageTranslations.requiredAddress']")
    public WebElement addressMessage;

    @FindBy(xpath = "//input[@id='Size']")
    public WebElement size;

    @FindBy(xpath = "//input[@id='Bedrooms']")
    public WebElement bedrooms;

    @FindBy(xpath = "//input[@id='Bathrooms']")
    public WebElement bathrooms;

    @FindBy(xpath = "//select[@id='Garage']")
    public WebElement garage;

    @FindBy(xpath = "//input[@id='Year of Build']")
    public WebElement yearOfBuild;

    @FindBy(xpath = "//select[@id='Furniture']")
    public WebElement furnitureDDM;

    @FindBy(xpath = "//input[@id='Maintenance Fee']")
    public WebElement maintenanceFee;

    @FindBy(xpath = "//select[@id='Terrace']")
    public WebElement terrace;

    @FindBy(xpath = "//p[text()='Drag and drop the images or click here']")
    public WebElement uploadImages;

    @FindBy(xpath = "//div[@class='image-feedback']")
    public WebElement uploadImagesMessage;

    @FindBy(xpath = "//div[@class='plus-button']")
    public WebElement uploadImagesPlusButton;

    @FindBy(xpath = "//div[@class='img-wrapper']")
    public WebElement uploadImagesDogrulama;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createButton;

    @FindBy(xpath = "//span[@class='p-toast-summary']")
    public WebElement advertCreatedMessage;

    @FindBy(xpath = "//div[@class='p-toast-detail']")
    public WebElement districtMessage;


    public void uploadFilePath(String dosyaYolu){
        try{
            ReusableMethods.bekle(3);
            StringSelection stringSelection = new StringSelection(dosyaYolu);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(3000);
        }catch (Exception ignored){
        }
    }

























































































    //hafsa220
//----------------------------US08---------------------------------------------



    @FindBy(xpath = "//*[@class='user-input form-control']")
    public WebElement emaill;

    @FindBy(xpath = "//*[@class='user-password-input form-control']")
    public  WebElement passwordd;



    @FindBy(xpath = "(//*[@class='user-pic'])[1]")
    public  WebElement profileButton;

    @FindBy(xpath = "(//*[@class='ok-icon'])[2]")
    public  WebElement ilanlarim;

    @FindBy(xpath = "(//div[@class='text'])[2]")
    public  WebElement kayitliIlan;


    @FindBy(xpath = "(//*[@class='btn-link btn btn-primary'])[2]")
    public  WebElement guncelleikon;

    @FindBy(xpath = "//*[@class='dynamic-button auto-wide btn btn-primary']")
    public  WebElement guncelleButton;

    @FindBy(xpath = "//*[.='Advert updated successfully']")
    public  WebElement textMessage;


    @FindBy(xpath = "(//*[@class='btn-link btn btn-primary'])[1]")
    public  WebElement deleteButton;
    @FindBy(xpath = "(//*[@class='p-button-label p-c'])[2]")
    public  WebElement deleteYes;

    @FindBy(xpath = "//*[.='']")
    public  WebElement deleteMessage;
    @FindBy(xpath = "(//*[@class='p-column-title'])[2]")
    public WebElement yayinlamaTarihi;
    @FindBy(xpath = "(//*[@class='btn-link btn btn-primary'])[3]")
    public WebElement durumButonu;
    @FindBy(xpath = "(//*[@class='btn-link btn btn-primary'])[4]")
    public WebElement goruntulemeBegeniTur;

    //--------------------------------US18-----------------------------
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButonu;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//a[@title='Back to Site']")
    public WebElement backToSiteButonu;

    @FindBy(xpath = "//a[@data-rr-ui-event-key='2']")
    public WebElement propertiesKutucugu;

    @FindBy(xpath = "//img[@alt='Scenic_Spacious_Garden_House']")
    public WebElement cankayaAnkara;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement gunAyTarih;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButonu;

    @FindBy(xpath = "//*[.='TourRequest created successfully']")
    public WebElement bilgiMesaji;

    @FindBy(xpath = "//div[@class='user-logo-nav navbar-nav']")
    public WebElement profilBolumu;

    @FindBy(xpath = "//*[.='My Tour Requests']")
    public WebElement myToRequest;

    @FindBy(xpath = "//button[@class='nav-link']")
    public WebElement myResponses;

    @FindBy(xpath = "//*[.='MALTEPE YALI SAHİLDE SATILIK 3+2 TERAS DUBLEKS']")
    public WebElement ilanDogrulama1;

    @FindBy(xpath = "//*[.='BÜYÜKÇEKMECE FEZA PARK VİLLALARI SATIŞ OFİSİNDEN 5+1 VİLLA']")
    public WebElement ilanDogrulama2;

    @FindBy(xpath = "//button[@class='btn-link decline-button btn btn-primary']")
    public WebElement redButonu;

    @FindBy(xpath = "(//button[@class='btn-link approve-button btn btn-primary'])[1]")
    public WebElement onayButonu;










































































































    //mehmet420
    //US 13 Locate'leri
    //TC01
    @FindBy(xpath = "//a[@data-rr-ui-event-key='5']")
    public WebElement loginButtonn;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement eMail;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement paswordd;

    @FindBy(xpath = "//*[@class='submit-button btn btn-secondary']")
    public WebElement Login;

    @FindBy(xpath = "//span[text()='Back to Site']")
    public WebElement backToSiteButtonn;

    @FindBy(xpath = "(//*[@class='user-pic'])[1]")
    public  WebElement profileButtonn;

    @FindBy(xpath = "(//*[@class='ok-icon'])[4]")
    public  WebElement myTourRequests;

    @FindBy (xpath = "//*[@id='react-aria9381675401-:rd:-tab-response']")
    public WebElement myResponsess;

    @FindBy (xpath = "//div[@class='text']")
    public WebElement randevuIstekGoruntuleme;

//TC02

    @FindBy (xpath = "//*[@class='btn-link decline-button btn btn-primary']")
    public WebElement randevuRed;

    @FindBy (xpath = "(//*[@class='p-button-label p-c'])[2]")
    public WebElement randevuRedOnay;

    @FindBy(xpath = "//*[@class='p-tag-value']")
    public WebElement randevuRedDogrulama;

    @FindBy (xpath = "//*[@class='btn-link approve-button btn btn-primary']")
    public WebElement randevuKabul;

    @FindBy (xpath = "(//*[@class='p-button-label p-c'])[1]")
    public WebElement randevuKabulOnay;

    @FindBy(xpath = "//*[@class='p-tag-value']")
    public WebElement randevuKabulDogrulama;

//US 14 Locate'leri
//TC01

    @FindBy(xpath = "(//*[@class='d-none d-sm-inline'])[6]")
    public WebElement tourRequest;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@class='search-button btn btn-outline-secondary']")
    public WebElement searchBoxForClick;

    @FindBy(xpath = "(//*[@class='text'])[1]")
    public WebElement ilanSec;

    @FindBy(xpath = "//*[@id='tourDate']")
    public WebElement turTarihSec;

    @FindBy(xpath = "//*[@id='tourTime']")
    public WebElement turSaatSec;

    @FindBy(xpath = "//*[@class='tour-request-form-button-wrapper']")
    public WebElement submitTourRequest;

    @FindBy(xpath = "//*[@class='p-toast-detail']")
    public WebElement talepDogrulama;

//TC02

    @FindBy (xpath = "//*[@id='react-aria6964455574-:r5:-tab-request']")
    public WebElement MyRequests;

    @FindBy (xpath = "(//*[@class='p-tag-value'])[1]")
    public WebElement verification;




















































































































    //hayriye620
    //US23 locate'leri
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//span[text()='Back to Site']")
    public WebElement backToSiteButton;

    @FindBy(xpath = "(//a[text()='Home'])[1]")
    public WebElement homeMenuButton;

    @FindBy(xpath = "//img[@class='flag-icon']")
    public WebElement flagIconButton;

    @FindBy(xpath = "//img[@src='/icons/flags/tr.png']")
    public WebElement trFlagIconButton;

    @FindBy(xpath = "(//a[text()='Anasayfa'])[1]")
    public WebElement anasayfaMenuButton;

    @FindBy(xpath = "//img[@src='/icons/flags/fr.png']")
    public WebElement frFlagIconButton;

    @FindBy(xpath = "(//a[text()='Accueil'])[1]")
    public WebElement accueilMenuButton;

    @FindBy(xpath = "//img[@src='/icons/flags/de.png']")
    public WebElement deFlagIconButton;

    @FindBy(xpath = "(//a[text()='Zuhause'])[1]")
    public WebElement zuhauseMenuButton;

    @FindBy(xpath = "//img[@src='/icons/flags/es.png']")
    public WebElement esFlagIconButton;

    @FindBy(xpath = "(//a[text()='Inicio'])[1]")
    public WebElement inicioMenuButton;

    // US17 locate'leri
    @FindBy(xpath ="//a[@title='Reports']")
    public WebElement reports;

    @FindBy(xpath ="(//input[@name='startDate'])[1]")
    public WebElement advertsStartDate;

    @FindBy(xpath ="(//input[@name='endDate'])[1]")
    public WebElement advertsEndDate;

    @FindBy(xpath ="//select[@id='category']")
    public WebElement advertsCategory;

    @FindBy(xpath ="//select[@id='type']")
    public WebElement advertType;

    @FindBy(xpath ="(//select[@name='status'])[1]")
    public WebElement advertsStatus;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[1]")
    public WebElement advertsExcelIcon;

    @FindBy(xpath ="//span[text()='Success']")
    public WebElement messageSuccess;

    @FindBy(xpath ="//input[@id='amount']")
    public WebElement amount;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[2]")
    public WebElement amountExcelIcon;

    @FindBy(xpath ="//select[@id='role']")
    public WebElement users;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[3]")
    public WebElement usersExcelIcon;

    @FindBy(xpath ="(//input[@name='startDate'])[2]")
    public WebElement tourRequestStartDate;

    @FindBy(xpath ="(//input[@name='endDate'])[2]")
    public WebElement tourRequestEndDate;

    @FindBy(xpath ="(//select[@name='status'])[2]")
    public WebElement tourRequestStatus;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[4]")
    public WebElement tourRequestExcelIcon;

    // US20 locate'leri

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

    @FindBy(xpath = "//span[text()='ContactMessages']")
    public WebElement contactMessagesButton;

    @FindBy(xpath = "//span[text()='customer@hayriye.com']")
    public WebElement inComingMessage;

    @FindBy(xpath = "//p[text()='Merhaba, sayfanızda ilan vermek istiyorum.']")
    public WebElement inComingMessageText;
    @FindBy(xpath = "//div[@class='accordion-collapse collapse show']//button[@title='Delete message']//*[name()='svg']")
    public WebElement deleteMessageIcon;

    @FindBy(xpath = "(//button[@title='Mark as read'])[1]")
    public WebElement markAsReadIcon;

    @FindBy(xpath = "(//button[@title='Mark as unread'])[1]")
    public WebElement markAsUnreadIcon;

    @FindBy(xpath = "//input[@placeholder='Type Something']")
    public WebElement messageSearchBox;

    @FindBy(xpath = "//button[@class='search-button btn btn-primary']")
    public WebElement messageSearchButton;

    @FindBy(xpath = "//span[text()='customer@hayriye.com']")
    public WebElement messageSearchResult;

    @FindBy(xpath = "//button[@class='filter-button btn btn-primary']")
    public WebElement messageFilterButton;

    @FindBy(css = "#status")
    public WebElement messageFilterSelect;

    @FindBy(css = "#startDate")
    public WebElement messageFilterStartDate;

    @FindBy(css = "#endDate")
    public WebElement messageFilterEndDate;

    @FindBy(xpath = "//button[@title='Apply Filters']")
    public WebElement messageApplyFiltersButton;

    @FindBy(xpath = "(//span[@class='email'])[1]")
    public WebElement filterMessage;

    public void contactMessageSend(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ManagerPage getLandEstatePage = new ManagerPage();
        getLandEstatePage.contactMenuButton.click();
        getLandEstatePage.firstNameInput.sendKeys("hayriye");
        getLandEstatePage.lastNameInput.sendKeys("customer");
        getLandEstatePage.emailInput.sendKeys("customer@hayriye.com");
        getLandEstatePage.messageTextArea.sendKeys("Merhaba, sayfanızda ilan vermek istiyorum.");
        ReusableMethods.visibleWait(getLandEstatePage.notRobotIframe,3);
        Driver.getDriver().switchTo().frame(1);
        getLandEstatePage.notRobotCheckBox.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().defaultContent();
        ReusableMethods.bekle(3);
        getLandEstatePage.contactMessageSendButton.click();
        ReusableMethods.bekle(3);
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        getLandEstatePage.loginButton.click();
        getLandEstatePage.email.sendKeys(ConfigReader.getProperty("email"));
        getLandEstatePage.password.sendKeys(ConfigReader.getProperty("passwordd"), Keys.ENTER);
    }











}
