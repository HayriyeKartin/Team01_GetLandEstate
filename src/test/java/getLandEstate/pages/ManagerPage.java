package getLandEstate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage {













    //fatih20







































































































































































































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
    @FindBy(xpath = "//span[text()='ContactMessages']")
    public WebElement contactMessagesButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/h2/button")
    public WebElement firstMessage;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/h2/button")
    public WebElement secondMessage;

    @FindBy(xpath = "//div[@class='accordion-collapse collapse show']//button[@title='Delete message']//*[name()='svg']")
    public WebElement deleteMessageIcon;

    @FindBy(xpath = "//div[@class='accordion-collapse collapse show']//button[@title='Mark as unread']//*[name()='svg']//*[name()='path' and contains(@d,'M22 8.98V1')]")
    public WebElement markAsUnreadIcon;

    @FindBy(xpath = "//div[@class='accordion-collapse collapse show']//button[@title='Mark as read']//*[name()='svg']//*[name()='path' and contains(@d,'M12 19a6.9')]")
    public WebElement markAsReadIcon;












}
