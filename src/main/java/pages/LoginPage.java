package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger(getClass());




    @FindBy (name = "_username")
    private WebElement inputLogin;

    @FindBy (id = "password")
    private WebElement inputPass;

    @FindBy (tagName = "button")
    private WebElement button;


    public void openPage() {
        try {
            webDriver.get("http://v3.test.itpmgroup.com");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.info("Can not open Login Page " + e);
            Assert.fail("Can not open Login Page " + e);
        }
    }

    public void enterTextInToInputLogin(String login) {
        actionsWithElements.enterTextInToElement(inputLogin, login);
    }

    public void enterTextInToInputPass(String pass) {
        actionsWithElements.enterTextInToElement(inputPass, pass);
    }

    public void clickOnButtonSubmit(){
        actionsWithElements.clickOnElement(button);
    }

    public void login(String login, String passWord) {
        openPage();
        enterTextInToInputLogin(login);
        enterTextInToInputPass(passWord);
        clickOnButtonSubmit();
    }
}
