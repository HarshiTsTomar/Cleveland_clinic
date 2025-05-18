package utils;
 
import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
 
/**
 * Utility class to provide helper methods for WebDriver actions.
 * Author: Kiruthik Vijey Raj P`
 */
public class WebDriverHelper {
    private WebDriver driver;
 
    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Waits until the specified element is visible on the page.
     * This method uses WebDriverWait to wait for a certain amount of time until the element located by the given locator is visible on the page.
     * If the element becomes visible within the specified timeout, the method proceeds; otherwise, it throws a TimeoutException.
     *
     * @param locator          The locator of the element to wait for.
     * @param timeoutInSeconds The maximum time to wait in seconds.
     */

    public void waitForVisibility(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        LoggerHandler.info("Wait till the Element " + locator + " is Visible");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Waits until the specified element is clickable on the page.
     * This method uses WebDriverWait to wait for a certain amount of time until the element located by the given locator is clickable.
     * If the element becomes clickable within the specified timeout, the method proceeds; otherwise, it throws a TimeoutException.
     *
     * @param locator          The locator of the element to wait for.
     * @param timeoutInSeconds The maximum time to wait in seconds.
     */

    public void waitForClickability(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        LoggerHandler.info("Wait till the Element " + locator + " is Clickable");
 
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Waits until the specified title is present on the page.
     * This method uses WebDriverWait to wait for a certain amount of time until the page title contains the specified text.
     * If the title contains the text within the specified timeout, the method proceeds; otherwise, it throws a TimeoutException.
     *
     * @param title            The title text to wait for.
     * @param timeoutInSeconds The maximum time to wait in seconds.
     */

    public void waitForTitle(String title, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.titleContains(title));
        LoggerHandler.info("Wait till the Title Changed ");
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * Sends the specified keys to the element located by the given locator.
     * This method finds the element using the provided locator and sends the specified text to it.
     * It is useful for entering text into input fields.
     *
     * @param locator The locator of the element.
     * @param data    The data to send to the element.
     */

    public void typeText(By locator, String data) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(data);
        LoggerHandler.info("Inputed " + data + " in Input Field");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Retrieves the text content of the element located by the given locator.
     * This method finds the element using the provided locator and returns its text content.
     * It is useful for extracting text from elements such as labels or paragraphs.
     *
     * @param locator The locator of the element.
     * @return The text content of the element.
     */

    public String retrieveText(By locator) {
        WebElement element = driver.findElement(locator);
        LoggerHandler.info("Retrived Text From " + locator);
        return element.getText();
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Clicks on the element using JavaScript.
     * This method finds the element using the provided locator and clicks on it using JavaScript.
     * It is useful for clicking elements that are not interactable through standard WebDriver click method.
     *
     * @param locator The locator of the element to click.
     */

    public void clickUsingJS(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        LoggerHandler.info("Scrolled to the Element And Clicked ");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Scrolls to the element using JavaScript.
     * This method finds the element using the provided locator and scrolls to it using JavaScript.
     * It is useful for bringing elements into view that are not currently visible on the screen.
     *
     * @param locator The locator of the element to scroll to.
     */

    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        LoggerHandler.info("Scrolled Till the element is in View ");
    }
    
    /**
     * Author: Kiruthik Vijey Raj P
     * Switches to a new window.
     * This method switches the WebDriver context to a new window.
     * It is useful for handling multiple windows or tabs in a browser.
     */

    public void switchWindow() {
        String parent = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
 
        for (String ch : child) {
            if (!parent.equals(ch)) {
                driver.switchTo().window(ch);
            }
        }
        LoggerHandler.info("Driver Switched to new Window");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Sends the Enter key to the element located by the given locator.
     * This method finds the element using the provided locator and sends the Enter key to it.
     * It is useful for submitting forms or triggering actions that require the Enter key.
     *
     * @param locator The locator of the element.
     */

    public void pressEnter(By locator) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
        LoggerHandler.info("Enter Action Performed");
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Clicks the element located by the given locator.
     * This method finds the element using the provided locator and clicks on it.
     * It is useful for interacting with buttons, links, and other clickable elements.
     *
     * @param locator The locator of the element.
     */

    public void clickTheElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
        LoggerHandler.info("Clicked the Element with locator " + locator);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Hovers over the element located by the given locator.
     * This method finds the element using the provided locator and hovers over it using Actions class.
     * It is useful for triggering hover effects or revealing hidden elements.
     *
     * @param locator The locator of the element.
     */

    public void hover(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).pause(Duration.ofSeconds(2)).perform();
        LoggerHandler.info("Hovered Over the Element with locator " + locator);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Hovers over the element and clicks on it.
     * This method finds the element using the provided locator, hovers over it, and then clicks on it using Actions class.
     * It is useful for interacting with elements that require a hover action before clicking.
     *
     * @param locator The locator of the element.
     */

    public void hoverAndClick(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).pause(Duration.ofSeconds(2)).click().build().perform();
        LoggerHandler.info("Hovered Over the Element And Clicked the element with locator " + locator);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Selects an option from a dropdown by its value.
     * This method finds the dropdown element using the provided locator and selects an option by its value.
     * It is useful for interacting with dropdown menus where options are identified by their values.
     *
     * @param locator The locator of the dropdown element.
     * @param value   The value of the option to select.
     */

    public void selectByValue(By locator, String value) {
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByValue(value);
        LoggerHandler.info("Selected The Option from The DropDown with Value: " + value);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Selects an option from a dropdown by its visible text.
     * This method finds the dropdown element using the provided locator and selects an option by its visible text.
     * It is useful for interacting with dropdown menus where options are identified by their visible text.
     *
     * @param locator     The locator of the dropdown element.
     * @param visibleText The visible text of the option to select.
     */

    public void selectByVisibleText(By locator, String visibleText) {
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
        LoggerHandler.info("Selected The Option from The DropDown with Visible Text " + visibleText);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Selects an option from a dropdown by its index.
     * This method finds the dropdown element using the provided locator and selects an option by its index.
     * It is useful for interacting with dropdown menus where options are identified by their index positions.
     *
     * @param locator The locator of the dropdown element.
     * @param index   The index of the option to select.
     */

    public void selectByIndex(By locator, int index) {
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
        LoggerHandler.info("Selected The Option from The DropDown with Index " + index);
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Verifies that the current URL matches the expected URL.
     * This method retrieves the current URL of the page and compares it with the expected URL.
     * If the URLs match, it logs a success message; otherwise, it logs a mismatch message and prints the stack trace.
     *
     * @param expectedUrl The expected URL to verify against.
     */

    public void verifyUrl(String expectedUrl) {
        try {
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl);
            LoggerHandler.info("Verified The Url");
        } catch (AssertionError e) {
            LoggerHandler.info("Url Mismatch");
            e.printStackTrace();
        }
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * Verifies that the current page title matches the expected title.
     * This method retrieves the current title of the page and compares it with the expected title.
     * If the titles match, it logs a success message; otherwise, it logs a mismatch message and prints the stack trace.
     *
     * @param expectedTitle The expected title to verify against.
     */

    public void verifyTitle(String expectedTitle) {
        try {
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
            LoggerHandler.info("Verified The Title");
        } catch (AssertionError e) {
            e.printStackTrace();
            LoggerHandler.info("Title Mismatch" + e.getMessage());
        }
 
    }
 
    /**
    * Author: Kiruthik Vijey Raj P
    * Scrolls to the element using JavaScript and clicks it.
    * This method finds the element using the provided locator, scrolls to it using JavaScript, and then clicks on it.
    * It is useful for interacting with elements that are not currently visible on the screen.
    *
    * @param locator The locator of the element to scroll to.
    */

    public void scrollToElementandCLick(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        LoggerHandler.info("Scrolled Till The Element And Clicked The Element");
    }
/**
 * Author: Harshit Tomar
 * This method asserts that the text of a web element matches the expected text.
 *
 * @param locator      The locator of the web element.
 * @param expectedText The expected text to be present in the web element.
 */
public void assertText(By locator, String expectedText) {
    try {
        WebElement element = driver.findElement(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedText));
        String actualText = element.getText();
        Assert.assertTrue(actualText.contains(expectedText));
        LoggerHandler.info(expectedText + " Asserted");
        Hooks.test.log(Status.PASS, "Found " + expectedText + " as expected");
    } catch (Exception e) {
        e.printStackTrace();
        LoggerHandler.error(e.getMessage());
        Hooks.test.log(Status.PASS, "Found " + expectedText + " not as expected");
    }
}

/**
 * Author: Harshit Tomar
 * This method asserts that the current URL contains the expected text.
 *
 * @param expectedText The expected text to be present in the URL.
 */
public void assertUrl(String expectedText) {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.urlContains(expectedText));
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedText));
        LoggerHandler.info(expectedText + " Asserted");
        Hooks.test.log(Status.PASS, "Verified URL: " + expectedText + " as expected");
    } catch (Exception e) {
        e.printStackTrace();
        LoggerHandler.error(e.getMessage());
        Hooks.test.log(Status.FAIL, "Verified URL: " + expectedText + " not as expected");
    }
}
/**
 * Author: Harshit Tomar
 * This method asserts that the href attribute of a web element matches the expected text.
 *
 * @param locator      The locator of the web element.
 * @param expectedText The expected href attribute value.
 */
public void assertHref(By locator, String expectedText) {
    try {
        WebElement element = driver.findElement(locator);
        String actualHref = element.getAttribute("href");
        Assert.assertEquals(actualHref, expectedText);
        LoggerHandler.info(expectedText + " Asserted");
        Hooks.test.log(Status.PASS, "Found " + expectedText + " as expected");
    } catch (Exception e) {
        e.printStackTrace();
        LoggerHandler.error(e.getMessage());
        Hooks.test.log(Status.PASS, "Found " + expectedText + " not as expected");
    }
}


}