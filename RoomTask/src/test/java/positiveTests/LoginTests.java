package positiveTests;


import driver.MyBrowsers;

import org.testng.annotations.Test;
import pages.LoginPage;

import static configuration.ConfigurationManager.configuration;

public class LoginTests extends MyBrowsers {


    @Test(description = "Success Login")
    public void successfullLoginAdmin() {
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName(configuration().username())
                .providePassword(configuration().password())
                .clickOnLoginSubmitButton();
    }
}
