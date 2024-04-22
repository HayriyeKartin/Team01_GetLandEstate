package getLandEstate.pages;

import getLandEstate.utilities.ui_utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
















    //selahattin20







































































































































































































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








































































































































    //süleyman420
















































































































































































































}
