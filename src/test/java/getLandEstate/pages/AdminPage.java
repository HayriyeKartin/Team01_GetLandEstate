package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.ConfigReader;
import getLandEstate.utilities.ui_utilities.Driver;
import getLandEstate.utilities.ui_utilities.ReusableMethods;
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





















































































































//gülsüm220







































































































































































































//süleyman420




































































































































































































}
