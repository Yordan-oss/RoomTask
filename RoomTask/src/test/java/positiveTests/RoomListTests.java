package positiveTests;

import driver.MyBrowsers;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RoomPage;

public class RoomListTests extends MyBrowsers {


    @Test(description = "Yordan room persist in the list.")
    public void actualList(){
        RoomPage roomPage = new RoomPage(super.driver);
        roomPage.checkList();
    }
}
