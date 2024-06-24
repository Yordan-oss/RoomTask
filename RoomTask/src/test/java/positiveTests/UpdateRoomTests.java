package positiveTests;

import driver.MyBrowsers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UpdateRoomPage;

public class UpdateRoomTests extends MyBrowsers {


    @Test(description = "Create single room")
    public void UpdateRoom(){
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.openLoginPage();
        loginPage.provideUserName("admin")
                .providePassword("password")
                .clickOnLoginSubmitButton();
        UpdateRoomPage updateRoomPage= new UpdateRoomPage(super.driver);
        updateRoomPage.openUpdateRoomPage(2);
        updateRoomPage.clickUpdateButton();
        updateRoomPage.clickEditButton();
        updateRoomPage.provideRoomName("YordanUpdate");
        updateRoomPage.pickRoomType("Double");
        updateRoomPage.chooseAccessible("true");
        updateRoomPage.providePrice("120");
        updateRoomPage.checkRadio();
        updateRoomPage.checkSafe();
        updateRoomPage.checkViews();
        updateRoomPage.provideDescription("Yordan room");
        updateRoomPage.provideImage("124124");
        updateRoomPage.clickUpdateButton();
    }
}
