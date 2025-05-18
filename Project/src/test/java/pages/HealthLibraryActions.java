package pages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HealthLibraryLocators;
import utils.Base;
import utils.ReportHelper;
import utils.WebDriverHelper;
 
public class HealthLibraryActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Clicks on the 'Body Systems and Organs' section to navigate further.
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void clickOnEyes(ExtentTest test,String eye) {
        try {
            driverHelper.scrollToElementandCLick(HealthLibraryLocators.bodySysAndOrgans);
           // driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1","Body Organs","value"));
            driverHelper.waitForVisibility(HealthLibraryLocators.searchBar, 10);
            driverHelper.typeText(HealthLibraryLocators.searchBar, eye);
            //driverHelper.typeText(HealthLibraryLocators.searchBar, ExcelReader.readCellValue("Sheet1","eye","value"));
            driverHelper.pressEnter(HealthLibraryLocators.searchBar);
            driverHelper.clickTheElement(HealthLibraryLocators.eyes);
            test.log(Status.INFO,"Clicked on Eyes");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Contact", test, "Eyes Not Clicked");
        }
    }
}
 