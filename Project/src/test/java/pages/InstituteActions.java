package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.InstituteLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.ReportHelper;
import utils.WebDriverHelper;
 
/**
 * Author: Vignesh
 * The InstituteActions class provides methods for navigating and interacting
 * with institute-related sections.
 */
public class InstituteActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Hovers over the selection element and clicks on 'Blood Management.'
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void bloodacction(ExtentTest test) {
        try {
            driverHelper.hover(InstituteLocators.specilaSelect);
            driverHelper.clickTheElement(InstituteLocators.bloodManagement);
            test.log(Status.INFO, "Clicked on BloodMangement");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("BloodMangement", test, "BloodMangement Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Ensures clickability, scrolls, hovers, and clicks on 'Pharmacy,' with form
     * verification logged.
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void pharmacyAction(ExtentTest test) {
        try {
            driverHelper.waitForClickability(InstituteLocators.specilaSelect, 3);
            driverHelper.scrollToElement(InstituteLocators.specilaSelect);
            driverHelper.waitForClickability(InstituteLocators.specilaSelect, 3);
            driverHelper.hover(InstituteLocators.specilaSelect);
            driverHelper.clickTheElement(InstituteLocators.pharmacy);
            LoggerHandler.info("verify forms");
            test.log(Status.INFO, "Clicked on Pharmacy");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Pharmacy", test, "Pharmacy Not Clicked");
        }
    }
 
}
 
 