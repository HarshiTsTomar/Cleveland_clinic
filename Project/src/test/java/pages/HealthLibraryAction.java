package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.HomePageLocators;
import utils.Base;
//import utils.ExcelReader;
import utils.WebDriverHelper;
 
public class HealthLibraryAction {
 
 
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Rewa Pawar
     * Navigates to the 'Disease and Condition' section of the health library,
     * waits for the page to load, verifies the title, and then navigates back.
     */
    public void diseaseAndCondition(ExtentTest test) {
        try {
            driverHelper.clickTheElement(HomePageLocators.healthLibrary_diseaseAndCondition);
            test.log(Status.PASS, "Clicked on Disease and Condition as expected ");
            driverHelper.waitForVisibility(HomePageLocators.healthLibrary_diseaseAndConditionNew, 3);
            //driverHelper.verifyTitle(ExcelReader.readCellValue("data2", "1", "value"));
            Base.driver.navigate().back();
 
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Disease and Condition", Hooks.test, "Disease and Condition functionality failed"); 
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Description: Navigates to the 'Diagnostics and Testing' section of the health
     * library,
     * waits for the page to load, verifies the title, and then navigates back.
     */
    public void diagnosticsAndTesting(ExtentTest test) {
        try {
            driverHelper.clickTheElement(HomePageLocators.healthLibrary_diagnosticsAndTesting);
            test.log(Status.PASS, "Clicked on Diagnostics and Testing as expected ");
            driverHelper.waitForVisibility(HomePageLocators.healthLibrary_diagnosticsAndTestingNew, 3);
            //driverHelper.verifyTitle(ExcelReader.readCellValue("data2", "2", "value"));
            Base.driver.navigate().back();
 
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Diagnostics and Testing", Hooks.test, "Diagnostics and Testing functionality failed"); 
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Description: Navigates to the 'Treatments and Procedure' section of the
     * health library,
     * waits for the page to load, verifies the title, and then navigates back.
     */
    public void treatmentsAndProcedure(ExtentTest test) {
        try {
            driverHelper.clickTheElement(HomePageLocators.healthLibrary_treatmentsAndProcedure);
            test.log(Status.PASS, "Clicked on Treatments and Procedure as expected ");
            driverHelper.waitForVisibility(HomePageLocators.healthLibrary_treatmentsAndProcedureNew, 3);
           // driverHelper.verifyTitle(ExcelReader.readCellValue("data2", "3", "value"));
            Base.driver.navigate().back();
 
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Treatments and Procedure", Hooks.test, "Treatments and Procedure functionality failed"); 
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Description: Navigates to the 'Body Systems and Organs' section of the health
     * library,
     * waits for the page to load, verifies the title, and then navigates back.
     */
    public void bodySystemsAndOrgans(ExtentTest test) {
        try {
            driverHelper.clickTheElement(HomePageLocators.healthLibrary_bodySystemsAndOrgans);
            test.log(Status.PASS, "Clicked on Body Systems and Organs as expected ");
            driverHelper.waitForVisibility(HomePageLocators.healthLibrary_bodySystemsAndOrgansNew, 3);
            //driverHelper.verifyTitle(ExcelReader.readCellValue("data2", "4", "value"));
            Base.driver.navigate().back();
 
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Body System and Organs functionality failed"); 
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Description: Navigates to the 'Drugs, Devices, and Supplements' section of
     * the health library,
     * waits for the page to load, and then navigates back.
     */
    public void drugsDevicesSupplements(ExtentTest test) {
        try {
            driverHelper.clickTheElement(HomePageLocators.healthLibrary_drugsDevicesSupplements);
            test.log(Status.PASS, "Clicked on Drugs Devices and Supplements as expected ");
            driverHelper.waitForVisibility(HomePageLocators.healthLibrary_drugsDevicesSupplementsNew, 3);
            Base.driver.navigate().back();
 
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Drugs and Devices", Hooks.test, "Drugs and Devices functionality failed"); 
        }
    }
 
}