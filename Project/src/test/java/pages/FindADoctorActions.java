package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import stepdefinition.Hooks;
import uistore.FindADoctorLocators;
import utils.Base;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class FindADoctorActions
{
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method types the specified text into the search bar located by the given locator.
     * It is useful for entering search queries into the search bar.
     */
 
    public  void searchBar()
    {
        try{
        driverHelper.typeText(FindADoctorLocators.FindADoctorLocators_searchBar,"Heart");
        Hooks.test.log(Status.PASS, "Entered Heart in the Input Field as Excepted");
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Search Bar", Hooks.test, "Search Bar failed");
        }
    }
 
    /**
     * Author: Kiruthik Vijey Raj P
     * This method interacts with various filter sections on the "Find a Doctor" page.
     * It waits for elements to be clickable or visible, clicks on them, and enters text where necessary.
     * It is useful for setting filters such as location, department, and language.
     */
 
    public void filterSection()
    {
        try{
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_location, 10);
        Hooks.test.log(Status.PASS, "Entered Address in the Input Field as Excepted");
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_location);
        Hooks.test.log(Status.PASS, "Clicked on Location as Excepted");
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_locationOption);
        Hooks.test.log(Status.PASS, "Clicked on East Cleveland, OH as Excepted");
        Screenshot.captureScreenshot(Base.driver,"location");
        driverHelper.waitForVisibility(FindADoctorLocators.FindADoctorLocators_Department,10);
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Department,10);    
        driverHelper.hover(FindADoctorLocators.FindADoctorLocators_Department);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Department);
        Hooks.test.log(Status.PASS, "Clicked on Department as Excepted");
        driverHelper.waitForVisibility(FindADoctorLocators.FindADoctorLocators_DepartmentOption, 10);
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_DepartmentOption, 10);
        driverHelper.hover(FindADoctorLocators.FindADoctorLocators_DepartmentOption);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_DepartmentOption);
        Hooks.test.log(Status.PASS, "Clicked on Cardiovascular Medicine as Excepted");
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Language,10);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Language);
        Hooks.test.log(Status.PASS, "Clicked on Language as Excepted");
        driverHelper.typeText(FindADoctorLocators.FindADoctorLocators_Language, "English");
        Hooks.test.log(Status.PASS, "Entered English in the Input Field as Excepted");
        driverHelper.pressEnter(FindADoctorLocators.FindADoctorLocators_Language);
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Category Details", Hooks.test, "Category Details failed");
        }
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Find a Doctor" button and handles the resulting actions.
     * It waits for the element to be clickable, clicks it, switches to a new window, takes a screenshot, and attaches it to the report.
     *
     * @param test The ExtentTest object used for logging test information.
     */
 
    public void clickFindADoctorLocators()
    {
        try{
        driverHelper.waitForClickability(FindADoctorLocators.FindADoctorLocators_Request,5);
        driverHelper.clickTheElement(FindADoctorLocators.FindADoctorLocators_Request);
        Hooks.test.log(Status.PASS, "Clicked on Request as Excepted");
        driverHelper.switchWindow();
        Screenshot.screenShotAndHighlight(Base.driver, FindADoctorLocators.FindADoctorLocators_Label, "Find Doctor");
        ReportHelper.attachScreenshotToReport("Find Doctor", Hooks.test,"Screenshot");
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Find Doctor", Hooks.test, "Find Doctor failed");
        }
    }
   
    public void findADoctorAction()
    {
        searchBar();
        filterSection();
        clickFindADoctorLocators();
    }
}