package pages;

import configuration.ConfigurationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class RoomPage extends BasePage {

    public static final String Room_PAGE_URL = "/admin";

    @FindBy(xpath = "//a[normalize-space()='Rooms']")
    private WebElement roomsPage;

    @FindBy(id = "roomName")
    private WebElement roomNameInputField;

    @FindBy(id = "type")
    private WebElement type;

    @FindBy(id = "accessible")
    private WebElement accessible;

    @FindBy(id = "roomPrice")
    private WebElement roomPrice;

    @FindBy(id = "wifiCheckbox")
    private WebElement wifiCheckbox;

    @FindBy(id = "tvCheckbox")
    private WebElement tvCheckbox;

    @FindBy(id = "radioCheckbox")
    private WebElement radioCheckbox;

    @FindBy(id = "safeCheckbox")
    private WebElement safeCheckbox;

    @FindBy(id = "viewsCheckbox")
    private WebElement viewsCheckbox;

    @FindBy(id = "createRoom")
    private WebElement createRoom;

    @FindBy(xpath = "//div[@id='room2']//div[2]")
    private WebElement deleteRoom;

    @FindBy(id = "room1")
    private WebElement defaultRoom;

    @FindBy(id = "room2")
    private WebElement YordanRoom;

    @FindBy(id = "room3")
    public WebElement YordanRoom2;



    public RoomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(BasePage.driver, ConfigurationManager.configuration().timeout()), this);

    }

    public void openRoomPage() {
        navigateTo(Room_PAGE_URL);
    }




    public void provideRoomName(String roomName) {
        waitAndTypeTextInField(roomNameInputField, roomName);
    }

    public void pickRoomType(String roomType) {
        selectDropdown(type,roomType);
    }

    public void chooseAccessible(String access) {
        selectDropdown(accessible, access);
    }

    public void providePrice(String price){
        waitAndTypeTextInField(roomPrice,price);
    }

    public void checkWiFi(){
       selectCheckbox(wifiCheckbox);
    }

    public void checkTV(){
        selectCheckbox(tvCheckbox);
    }

    public void checkRadio(){
        selectCheckbox(radioCheckbox);
    }

    public void checkRefreshments(){
        selectCheckbox(radioCheckbox);
    }

    public void checkSafe(){
        selectCheckbox(safeCheckbox);
    }

    public void checkViews(){
        selectCheckbox(viewsCheckbox);
    }

    public void clickCreateButton(){
        waitAndClickOnWebElement(createRoom);
    }

    public void clickDeleteButton(){
        waitAndClickOnWebElement(deleteRoom);
    }

    public void checkList(){
        Assert.assertTrue(YordanRoom.isDisplayed(), "Layout is not displayed on the page");
        String expectedRoom = "YordanRoom";
        String actualRoom = YordanRoom.getText();
        Assert.assertEquals(actualRoom, expectedRoom, "Layout is not as expected");
    }










}
