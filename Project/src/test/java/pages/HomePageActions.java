package pages;
import java.time.Duration;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.HomePageLocators;
import uistore.NeedHelpLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class HomePageActions {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
   /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Schedule Now" button on the home page.
     * It logs the action using the provided ExtentTest object.
     *
     * @param test The ExtentTest object used for logging test PASSrmation.
     */
 
     public  void clickOnSchedule()
     {
         try{    
             driverHelper.clickTheElement(HomePageLocators.Appointments_ScheduleNow);
             Hooks.test.log(Status.PASS, "Clicked on schedule now as Excepted");
         }catch(Exception e)
         {
         Hooks.test.log(Status.FAIL, e.getMessage());
         ReportHelper.attachScreenshotToReport("Schedule Now Button", Hooks.test, "Schedule Now Button click failed");
     }
     }
 
   
    /**
      * Author: Kiruthik Vijey Raj P
      * This method clicks on the "Find a Doctor" button on the home page.
      * It logs the action using the provided ExtentTest object.
      *
      * @param test The ExtentTest object used for logging test PASSrmation.
      */
 
      public  void clickOnFindADoctor()
      {
         try{
             driverHelper.clickTheElement(HomePageLocators.Appointments_Find_a_Doctor);
             Hooks.test.log(Status.PASS, "Clicked on Find a Doctor as Excepted");
          }catch(Exception e)
          {
             Hooks.test.log(Status.FAIL, e.getMessage());
             ReportHelper.attachScreenshotToReport("Appointments_Request", Hooks.test, "Appointments_Request failed");
         }
     }
       /**
     * Author: Vignesh
     * Clicks on the 'Health Library' section to navigate to the health library
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void healthLibrary(ExtentTest test) {
        try {
            driverHelper.clickTheElement(HomePageLocators.healthLibrary);
            driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1","HealthLibrary","value"));
            test.log(Status.INFO,"Clicked on Health Library");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Health Library", test, "Health Library Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Clicks on the 'Institute and Departments' section to navigate to the relevant
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void institute(ExtentTest test) {
        try {
            driverHelper.clickTheElement(HomePageLocators.institueAndDepat);
            test.log(Status.INFO, "Clicked on Institute And Department");
            //driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1","Institute and Departments","value"));
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Institute And Department", test, "Institute And Department Not Clicked");
        }
    }
 
    /**
     * Author: Vignesh
     * Clicks on the 'need help' section to navigate to the relevant page.
     * @param test The ExtentTest object for logging the status of the actions
     */
    public void clickNeedHelp(ExtentTest test) {
        try {
            driverHelper.waitForClickability(NeedHelpLocators.needHelp, 3);
            driverHelper.hover(NeedHelpLocators.needHelp);
            driverHelper.clickTheElement(NeedHelpLocators.needHelp);
            test.log(Status.INFO, "Clicked on Needhelp");
        } catch (Exception e) {
            test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Needhelp", test, "Needhelp Not Clicked");
        }
    }
   
   
    /**
     * Author: Vinny Claret.A
     * This method performs a search operation on the home page.
     * It clicks on the search icon, enters the search term "Respiratory", and
     * presses Enter.
     * It then verifies the page title, waits for an element to be clickable, clicks
     * it, and retrieves text from another element.
     *
     * @throws Exception If an error occurs during the search operation.
     */
    public void searchOperation(ExtentTest test, String string) {
       try{
        driverHelper.clickTheElement(HomePageLocators.search);
         Hooks.test.log(Status.PASS, "Clicked on Searchbar as expected");
        driverHelper.clickTheElement(HomePageLocators.searchbar);
        driverHelper.typeText(HomePageLocators.searchbar, string);
        Hooks.test.log(Status.PASS, "Entered on Respiratory as expected");
 
        driverHelper.pressEnter(HomePageLocators.searchbar);
        String title = Base.driver.getTitle();
        driverHelper.verifyTitle(title);
 
        driverHelper.waitForClickability(HomePageLocators.firstResp, 2);
        Hooks.test.log(Status.PASS, "Clicked on first Respiratory as expected");
        driverHelper.clickTheElement(HomePageLocators.firstResp);
        driverHelper.retrieveText(HomePageLocators.verifyResp);
    }
    catch (Exception e) {
        test.log(Status.FAIL, e.getMessage());
        ReportHelper.attachScreenshotToReport("Search Operation", test, "Respiratory Not Clicked");
    }
}
 
    /**
     * Author: Harshit Tomar
     * This method clicks on the Facebook social link on the home page.
     * It takes a screenshot, switches to the new window, and then closes it.
     */
 
    public void clickFaceBook(){
        String mainWindowHandle = Base.driver.getWindowHandle();
	        driverHelper.clickTheElement(HomePageLocators.facebookSocialLink);
	        driverHelper.switchWindow();   
	        //driverHelper.assertUrl(ExcelReader.readCellValue("data1", "facebook", "value"));
	        Base.driver.close();
	        Base.driver.switchTo().window(mainWindowHandle);         
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Twitter social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickTwitter(){
        String mainWindowHandle = Base.driver.getWindowHandle();
	        driverHelper.clickTheElement(HomePageLocators.twitterSocialLink);
	        driverHelper.switchWindow();      
	       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "twitter", "value"));
	        Base.driver.close();
	        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the YouTube social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickYoutube(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.youtubeSocialLink);
        //driverHelper.assertHref(HomePageLocators.youtubeSocialLink,ExcelReader.readCellValue("data1", "youtube", "value"));
        driverHelper.switchWindow();      
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Instagram social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickInstagram(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.instagramSocialLink);
        driverHelper.switchWindow();      
        //driverHelper.assertUrl(ExcelReader.readCellValue("data1", "instagram", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
       
    /**
     * Author: Harshit Tomar
     * This method clicks on the LinkedIn social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickLinkedIn(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.linkedinSocialLink);
        driverHelper.switchWindow();        
        // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "linkedIn", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Pinterest social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickPinterest(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.pinterestSocialLink);
        driverHelper.switchWindow();      
        //driverHelper.assertUrl(ExcelReader.readCellValue("data1", "pinterest", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the Snapchat social link on the home page.
     * It switches to the new window and then closes it.
     */
 
    public void clickSnapchat(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.clickTheElement(HomePageLocators.snapchatSocialLink);
        driverHelper.switchWindow();    
       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "snapchat", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Appointments Access" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickAppointmentsAccess(){
        driverHelper.scrollToElement(HomePageLocators.appointmentsActions);
        driverHelper.clickTheElement(HomePageLocators.appointmentsActions);
       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "appointments", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Accepted Insurance" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickAcceptedInsurance(){
        driverHelper.scrollToElement(HomePageLocators.acceptedInsuranceActions);
        driverHelper.clickTheElement(HomePageLocators.acceptedInsuranceActions);
       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "insurance", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Events Calender" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickEventsCalender(){
        String mainWindowHandle = Base.driver.getWindowHandle();
        driverHelper.scrollToElement(HomePageLocators.eventsCalenderActions);
        driverHelper.clickTheElement(HomePageLocators.eventsCalenderActions);
        driverHelper.switchWindow();    
        //driverHelper.assertUrl(ExcelReader.readCellValue("data1", "calender", "value"));
        Base.driver.close();
        Base.driver.switchTo().window(mainWindowHandle);
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Financial Assistance" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickFinancialAssistance(){
        driverHelper.scrollToElement(HomePageLocators.financialAssistanceActions);
        driverHelper.clickTheElement(HomePageLocators.financialAssistanceActions);
       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "financial", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Give to Cleveland Clinic" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickGiveCleveland(){
        driverHelper.scrollToElement(HomePageLocators.giveClevelandActions);
        driverHelper.clickTheElement(HomePageLocators.giveClevelandActions);
        //driverHelper.assertUrl(ExcelReader.readCellValue("data1", "giveCleveland", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Pay Bill" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickPayBill(){
        driverHelper.scrollToElement(HomePageLocators.payBillActions);
        driverHelper.clickTheElement(HomePageLocators.payBillActions);
       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "payBill", "value"));
        Base.driver.navigate().back();
    }
   
    /**
     * Author: Harshit Tomar
     * This method clicks on the "Price Transparency" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
 
    public void clickPriceTransparency(){
        driverHelper.scrollToElement(HomePageLocators.priceTransparencyActions);
        driverHelper.clickTheElement(HomePageLocators.priceTransparencyActions);
       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "transparency", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Refer Patient" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickReferPatient(){
        driverHelper.scrollToElement(HomePageLocators.referPatientActions);
        driverHelper.clickTheElement(HomePageLocators.referPatientActions);
      //  driverHelper.assertUrl(ExcelReader.readCellValue("data1", "patient", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Phone Directory" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickPhoneDirectory(){
        driverHelper.scrollToElement(HomePageLocators.phoneDirectoryActions);
        driverHelper.clickTheElement(HomePageLocators.phoneDirectoryActions);
       // driverHelper.assertUrl(ExcelReader.readCellValue("data1", "directory", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Virtual Opinions" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickVirtualOpinions(){
        driverHelper.scrollToElement(HomePageLocators.virtualOpinionsActions);
        driverHelper.clickTheElement(HomePageLocators.virtualOpinionsActions);
        //driverHelper.assertUrl(ExcelReader.readCellValue("data1", "vitualOpinions", "value"));
        Base.driver.navigate().back();
    }

    /**
     * Author: Harshit Tomar
     * This method clicks on the "Virtual Visits" link on the home page.
     * It scrolls to the element, clicks it, and then navigates back.
     */
    public void clickVirtualVisits(){
        driverHelper.scrollToElement(HomePageLocators.virtualVisitsActions);
        driverHelper.clickTheElement(HomePageLocators.virtualVisitsActions);
        //driverHelper.assertUrl(ExcelReader.readCellValue("data1", "virtualVisits", "value"));
        Base.driver.navigate().back();
        driverHelper.clickTheElement(HomePageLocators.clevelandClinicHeader);
    }

 
    public void verifySocialLinks(ExtentTest test){
        clickFaceBook();

        clickInstagram();
    
        clickLinkedIn();

        clickPinterest();
     
        clickTwitter();
      
        clickYoutube();

        clickSnapchat();

    }
    public void verifyActionsFooter(ExtentTest test){
        clickAppointmentsAccess();

        clickAcceptedInsurance();
       
        clickEventsCalender();
       
        clickFinancialAssistance();
        
        clickGiveCleveland();
       
        clickPayBill();
       
        clickPriceTransparency();
        
        clickReferPatient();
      
        clickPhoneDirectory();
      
        clickVirtualOpinions();
        
        clickVirtualVisits();
      
    }
    
   
}
