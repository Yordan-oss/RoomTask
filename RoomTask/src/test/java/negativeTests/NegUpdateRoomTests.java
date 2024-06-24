package negativeTests;

import driver.MyBrowsers;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UpdateRoomPage;

public class NegUpdateRoomTests extends MyBrowsers {

    @Test(description = "Can't update room with the same values.")
    public void updateRoomWithSameValues() {
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("password")
                .clickOnLoginSubmitButton();
        UpdateRoomPage updateRoomPage = new UpdateRoomPage(super.driver);
        updateRoomPage.openUpdateRoomPage(2);
        updateRoomPage.clickUpdateButton();
        updateRoomPage.clickEditButton();
        updateRoomPage.provideRoomName("Yordan");
        updateRoomPage.pickRoomType("Single");
        updateRoomPage.chooseAccessible("true");
        updateRoomPage.providePrice("100");
        updateRoomPage.checkRadio();
        updateRoomPage.checkSafe();
        updateRoomPage.checkViews();
        updateRoomPage.clickUpdateButton();
    }


}
