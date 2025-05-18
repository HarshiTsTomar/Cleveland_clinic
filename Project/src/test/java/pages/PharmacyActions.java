package pages;
 
import org.openqa.selenium.JavascriptExecutor;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.PharmacyLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.ReportHelper;
import utils.WebDriverHelper;
 
/**
 * Author: Vignesh
 * The PharmacyActions class contains methods for interacting with the
 * pharmacy-related sections of the application.
 */
public class PharmacyActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Clicks 'takeSurvey,' switches windows, verifies forms, and navigates back.
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void takeSurvey(ExtentTest test) {
        try {
            driverHelper.waitForVisibility(PharmacyLocators.takeSurvey, 3);
            JavascriptExecutor js = (JavascriptExecutor) Base.driver;
            js.executeScript("window.scrollBy(0,1000)", "");
            driverHelper.hover(PharmacyLocators.takeSurveySpecila);
            String cwindow = Base.driver.getWindowHandle();
            driverHelper.clickTheElement(PharmacyLocators.takeSurvey);
            driverHelper.switchWindow();
            LoggerHandler.info("verify forms");
            test.log(Status.INFO, "verify forms");
            Base.driver.close();
            Base.driver.switchTo().window(cwindow);
            Base.driver.navigate().back();
            test.log(Status.INFO,"Clicked on Take Survey");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Take Survey", test, "Take Survey Not Clicked");
        }
    }
}
 