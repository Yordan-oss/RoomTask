package negativeTests;

import driver.MyBrowsers;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RoomPage;

public class NegCreateRoomTests extends MyBrowsers {

    @Test(description= "Can't create room without name")
    public void createRoomWithoutName(){
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("password")
                .clickOnLoginSubmitButton();
        RoomPage roomPage = new RoomPage(super.driver);
        roomPage.pickRoomType("Double");
        roomPage.chooseAccessible("true");
        roomPage.providePrice("100");
        roomPage.checkSafe();
        roomPage.checkRefreshments();
        roomPage.checkViews();
        roomPage.clickCreateButton();
    }

    @Test(description= "Can't create room without price")
    public void createRoomWithoutPrice(){
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("password")
                .clickOnLoginSubmitButton();
        RoomPage roomPage = new RoomPage(super.driver);
        roomPage.provideRoomName("Yordan neg room");
        roomPage.pickRoomType("Double");
        roomPage.chooseAccessible("true");
        roomPage.checkSafe();
        roomPage.checkRefreshments();
        roomPage.checkViews();
        roomPage.clickCreateButton();
    }
}
