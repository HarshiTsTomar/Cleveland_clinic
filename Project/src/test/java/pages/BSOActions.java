package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.BSOLocatorss;
import utils.Base;
import utils.ReportHelper;
import utils.WebDriverHelper;
 
public class BSOActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * element, selects the 'Red Eye' option, switches to a new window, and
     * handles further actions as necessary.
     *  @param test The ExtentTest object for logging the status of the actions
     */
    public void eyeDiseases(ExtentTest test) {
        try {
            driverHelper.waitForClickability(BSOLocatorss.redEye, 10);
            driverHelper.hover(BSOLocatorss.eyeAppearance);
            driverHelper.clickTheElement(BSOLocatorss.redEye);
            driverHelper.switchWindow();
            test.log(Status.INFO, "Clicked on Red Eye");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Contact", test, "Red Eye Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     *Gathers the methods of TestCase 10
     *@param test The ExtentTest object for logging the status of the actions
     */
    public void ClickingOnParking(ExtentTest test) {
        try {
            HomePageActions homePageActions = new HomePageActions();
            ContactActions contactActions = new ContactActions();
            contactActions.clickContact(test);
            contactActions.viewPhoneDirect(test);
            contactActions.clickClevelanHome(test);
            homePageActions.clickNeedHelp(test);
            contactActions.verifyParking(test);
            contactActions.tillVirtualSecond(test);
            contactActions.getScreenshot(test);
            test.log(Status.INFO, "clicking on parking");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Parking", test, "Parking Not Clicked");
        }
    }
}
 