package negativeTests;

import driver.MyBrowsers;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RoomPage;

public class NegDeleteRoomTests extends MyBrowsers {

    @Test(description= "Can't delete a room")
    public void deleteRoom(){
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("password")
                .clickOnLoginSubmitButton();
        RoomPage roomPage = new RoomPage(super.driver);
        roomPage.clickDeleteButton();
    }
}
