package positiveTests;

import driver.MyBrowsers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RoomPage;

public class CreateRoomTests extends MyBrowsers {

    @Test(description = "Create single room")
    public void createRoom() {
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("password")
                .clickOnLoginSubmitButton();
        RoomPage roomPage = new RoomPage(super.driver);
        roomPage.provideRoomName("Yordan");
        roomPage.pickRoomType("Single");
        roomPage.chooseAccessible("true");
        roomPage.providePrice("100");
        roomPage.checkTV();
        roomPage.checkRadio();
        roomPage.checkViews();
        roomPage.clickCreateButton();
        roomPage.checkList();
    }

    @Test(description = "Create double room", priority = 1)
    public void createRoomDouble() {
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("password")
                .clickOnLoginSubmitButton();
        RoomPage roomPage = new RoomPage(super.driver);
        roomPage.provideRoomName("Yordan2");
        roomPage.pickRoomType("Double");
        roomPage.chooseAccessible("true");
        roomPage.providePrice("100");
        roomPage.checkSafe();
        roomPage.checkRefreshments();
        roomPage.checkViews();
        roomPage.clickCreateButton();
    }

}
