package negativeTests;

import driver.MyBrowsers;
import org.testng.annotations.Test;
import pages.LoginPage;

public class NegLoginTests extends MyBrowsers {

    @Test(description = "Unsucess Login with wrong username")
    public void unsuccessfullLoginAdminWrongUsername() {
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("yordan")
                .providePassword("password")
                .clickOnLoginSubmitButton();
    }

    @Test(description = "Unsucess Login with wrong password", priority = 1)
    public void successfullLoginAdminWrongPassword() {
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("yordan")
                .clickOnLoginSubmitButton();
    }
}
