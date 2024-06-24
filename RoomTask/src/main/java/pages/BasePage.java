package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static configuration.ConfigurationManager.configuration;


public class BasePage {


    protected static WebDriverWait wait;

    final String BASE_URL = configuration().url();

    protected static WebDriver driver;

    protected static Logger log;

    Actions actions = new Actions(driver);

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }


    public void navigateTo(String pageURLsufix) {
        String currentURL = BASE_URL + pageURLsufix;

        driver.get(currentURL);
        log.info("CONFIRM # The user has navigating to : {}", currentURL);

        waitPageTobeFullLoaded();
    }

    public void waitPageTobeFullLoaded() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return document.readyState").equals("complete");
    }


    public static void waitAndClickOnWebElement(WebElement elm) {
        wait.until(ExpectedConditions.visibilityOf(elm));
        wait.until(ExpectedConditions.elementToBeClickable(elm));
        elm.click();
    }

    public static void waitAndTypeTextInField(WebElement textField, String inputText) {
        wait.until(ExpectedConditions.visibilityOf(textField));
        textField.clear();
        textField.sendKeys(inputText);
    }


    public void selectDropdown(WebElement elementLocation, String select) {
        wait.until(ExpectedConditions.textToBe((By) elementLocation, select));
    }

    public void selectCheckbox(WebElement elm) {
        wait.until(ExpectedConditions.visibilityOf(elm));
        if (elm.isSelected()) {
            actions.click(elm);
        }
    }

    // Read Text Method
    public void readText(WebElement elm) {
        wait.until(ExpectedConditions.visibilityOf(elm));
        elm.findElement((By) elm).getText();
    }



}


