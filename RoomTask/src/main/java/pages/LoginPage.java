package pages;

import configuration.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class LoginPage extends BasePage {

    public static final String LOGIN_PAGE_URL = "/admin";


    @FindBy(id = "username")
    private WebElement usernameInputFIeld;

    @FindBy(id = "password")
    private WebElement passwordInputField;

    @FindBy(id = "doLogin")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, ConfigurationManager.configuration().timeout()), this);
    }

    public void openLoginPage () {
        navigateTo(LOGIN_PAGE_URL);
    }



    public LoginPage  provideUserName(String userName) {
        waitAndTypeTextInField(usernameInputFIeld,userName);
        return new LoginPage(driver);
    }

    public LoginPage providePassword(String userPassword){
        waitAndTypeTextInField(passwordInputField,userPassword);
        return new LoginPage(driver);
    }

    public LoginPage clickOnLoginSubmitButton(){
        waitAndClickOnWebElement(loginButton);
        return new LoginPage(driver);
    }

}

