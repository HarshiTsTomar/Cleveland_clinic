package utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

    /**
     * Author : Rewa Pawar
     *
     * This method captures a screenshot of a specific web element on a webpage,
     * highlights it and saves the screenshot with a timestamped filename.
     *
     * @param driver   The WebDriver instance used to interact with the web browser.
     * @param locator  The locator used to find the web element to be highlighted
     *                 and captured.
     * @param filename The name for the screenshot file attached with log stamp for
     *                 uniqueness.
     *
     */

    static public void screenShotAndHighlight(WebDriver driver, By locator, String filename) {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String screenshotName = filename + "_" + timestamp + ".png";
            WebElement captureElement = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='5px solid red'", captureElement);
            Thread.sleep(2000);
            TakesScreenshot ts = (TakesScreenshot) driver;
            File fs = ts.getScreenshotAs(OutputType.FILE);
            File target = new File(System.getProperty("user.dir") + "/screenshots");
            if (!target.exists()) {
                target.mkdirs();
            }
            FileHandler.copy(fs, new File(target.toString() + "/" + screenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * Author: Rewa Pawar
     * 
     * This method captures a screenshot of the entire webpage and saves it
     * with a timestamped filename.
     *      
     * @param driver   The WebDriver instance used to interact with the web
     * browser.
     * @param filename The name for the screenshot file attached with log
     * stamp for uniqueness.
     *      
     */ 
     

    static public void captureScreenshot(WebDriver driver, String filename) {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String screenshotName = filename + "_" + timestamp + ".png";
            TakesScreenshot ts = (TakesScreenshot) driver;
            File fs = ts.getScreenshotAs(OutputType.FILE);
            File target = new File(System.getProperty("user.dir") + "/screenshots");
            if (!target.exists()) {
                target.mkdirs();
            }
            FileHandler.copy(fs, new File(target.toString() + "/" + screenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}