package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.ContactLocators;
import uistore.InstituteLocators;
import uistore.NeedHelpLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
/**
 * Author: Vignesh
 * The ContactActions class contains methods for navigating through
 * contact-related
 * sections and performing the required actions on various elements.
 */
public class ContactActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Vignesh
     * Navigates to and clicks on the contact button after ensuring its visibility
     * and readiness.
     * Handles hovering and clicking actions for smooth navigation to the contact
     * section.
     *
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void clickContact(ExtentTest test) {
        try {
            driverHelper.hover(InstituteLocators.specilaSelectcontact);
            driverHelper.waitForClickability(InstituteLocators.contact, 3);
            driverHelper.clickTheElement(InstituteLocators.contact);
            test.log(Status.INFO, "Clicked on contact");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Parking", test, "Parking Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Verifies the visibility of the contact options and performs actions to view
     * phone details and contact Cleveland Clinic's support section.
     *
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void viewPhoneDirect(ExtentTest test) {
        try {
            driverHelper.waitForClickability(ContactLocators.viewp, 3);
            driverHelper.scrollToElement(ContactLocators.viewp);
            driverHelper.clickTheElement(ContactLocators.viewPhone);
            driverHelper.clickTheElement(ContactLocators.contactCleveland);
            test.log(Status.INFO, "Clicked on contact CleveLand Clinic");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("contact CleveLand Clinic", test, "contact CleveLand Clinic Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Navigates to and clicks on the Cleveland home page contact link. Handles
     * element hovering and clicking interactions.
     *
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void clickClevelanHome(ExtentTest test) {
        try {
            driverHelper.waitForClickability(ContactLocators.contactClevelandhome, 10);
            driverHelper.hover(ContactLocators.contactClevelandhome);
            driverHelper.clickTheElement(ContactLocators.contactClevelandhome);
            test.log(Status.INFO, "Clicked on homePage");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("homePage", test, "homePage Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Verifies and clicks on the parking section element for additional
     * information.
     * Logs the action performed in the test report.
     *
     * @param test The ExtentTest object for logging the status of the actions.
     */
    public void verifyParking(ExtentTest test) {
        try {
            driverHelper.hover(NeedHelpLocators.parking);
            driverHelper.scrollToElementandCLick(NeedHelpLocators.parking);
            LoggerHandler.info("click on parking");
            test.log(Status.INFO, "click on parking");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Parking", test, "Parking Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Performs a sequence of actions to navigate through and interact with the
     * virtual assistance section and related elements.
     *
     * @param test The ExtentTest object for logging the status of the actions.
     */
    public void tillVirtualSecond(ExtentTest test) {
        try {
            driverHelper.clickTheElement(NeedHelpLocators.needassitance);
            driverHelper.clickTheElement(NeedHelpLocators.globalPatient);
            driverHelper.scrollToElementandCLick(NeedHelpLocators.speakwithteam);
            driverHelper.scrollToElement(NeedHelpLocators.virtualSecond);
            driverHelper.scrollToElementandCLick(NeedHelpLocators.virtualSecond);
            test.log(Status.INFO, "Clicked on virutual Second");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("virutual Second", test, "virutual Second Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Captures a screenshot of the current page when clicking the "Get Started"
     * button
     * and attaches it to the test report.
     *
     * @param test The ExtentTest object for logging the status of the actions and
     *             attaching the screenshot.
     */
    public void getScreenshot(ExtentTest test) {
        try {
            driverHelper.clickTheElement(NeedHelpLocators.getStarted);
            //driverHelper.verifyUrl(Base.driver.getCurrentUrl());
            test.log(Status.INFO, "Clicked on get started");
            //driverHelper.verifyUrl(ExcelReader.readCellValue("Sheet1", null, null));
            Screenshot.captureScreenshot(Base.driver, "create_account");
            ReportHelper.attachScreenshotToReport("create_account", test, "");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Get started", test, "get started Not Clicked");
        }
    }
}