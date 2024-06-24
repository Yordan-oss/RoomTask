package pages;

import configuration.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class UpdateRoomPage extends BasePage {

    public static final String UpdateRoom_PAGE_URL = "/admin/room/";

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    private WebElement edit;

    @FindBy(id = "update")
    private WebElement updateButton;

    @FindBy(id = "cancelEdit")
    private WebElement cancelEditButton;

    @FindBy(xpath = "//a[normalize-space()='Rooms']")
    private WebElement roomsButton;

    @FindBy(id = "roomName")
    private WebElement roomNameInput;

    @FindBy(id = "type")
    private WebElement typeDropdown;

    @FindBy(id = "accessibleDropdown")
    private WebElement accessibleDropdown;

    @FindBy(id = "roomPriceInput")
    private WebElement roomPriceInput;

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

    @FindBy(id = "description")
    private WebElement descriptionInput;

    @FindBy(id = "image")
    private WebElement imageInput;


    public UpdateRoomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(BasePage.driver, ConfigurationManager.configuration().timeout()), this);
    }

    public void openUpdateRoomPage(int room) {
        navigateTo(UpdateRoom_PAGE_URL + room);
    }


    public void provideRoomName(String roomName) {
        waitAndTypeTextInField(roomNameInput, roomName);
    }

    public void pickRoomType(String roomType) {
        selectDropdown(typeDropdown, roomType);
    }

    public void chooseAccessible(String access) {
        selectDropdown(accessibleDropdown, access);
    }

    public void providePrice(String price) {
        waitAndTypeTextInField(roomPriceInput, price);
    }

    public void checkWiFi() {
        selectCheckbox(wifiCheckbox);
    }

    public void checkTV() {
        selectCheckbox(tvCheckbox);
    }

    public void checkRadio() {
        selectCheckbox(radioCheckbox);
    }

    public void checkRefreshments() {
        selectCheckbox(radioCheckbox);
    }

    public void checkSafe() {
        selectCheckbox(safeCheckbox);
    }

    public void checkViews() {
        selectCheckbox(viewsCheckbox);
    }

    public void provideDescription(String description) {
        waitAndTypeTextInField(descriptionInput, description);
    }

    public void provideImage(String image) {
        waitAndTypeTextInField(imageInput, image);
    }


    public void clickUpdateButton() {
        waitAndClickOnWebElement(updateButton);
    }

    public void clickEditButton() {
        waitAndClickOnWebElement(edit);
    }

    public void clickCancelButton() {
        waitAndClickOnWebElement(cancelEditButton);
    }


}
