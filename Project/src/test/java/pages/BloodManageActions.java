package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.BloodManageLocators;
import utils.Base;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class BloodManageActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Hovers over and clicks the 'Contact' button, captures a highlighted
     * screenshot, and navigates back.
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void bloodMethod(ExtentTest test) {
        try {
            driverHelper.waitForClickability(BloodManageLocators.contact, 4);
            driverHelper.hover(BloodManageLocators.contact);
            driverHelper.clickTheElement(BloodManageLocators.contact);
            Screenshot.screenShotAndHighlight(Base.driver, BloodManageLocators.contact, "Conatct");
            Base.driver.navigate().back();
            test.log(Status.INFO, "Clicked on Contact");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Contact", test, "Contact Not Clicked");
        }
    }
}
 
