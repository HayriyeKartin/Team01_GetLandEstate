package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnRegisteredPage {
















    //pınar20

    public UnRegisteredPage(){
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






































































































































































































    //hayriye220
}
