package getLandEstate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage {













    //fatih20







































































































































































































    //hafsa220







































































































































































































    //mehmet420







































































































































































































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
