package pages;
 
import java.time.Duration;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.HomePageLocators;
import utils.Base;
import utils.ReportHelper;
//import utils.ExcelReader;
import utils.WebDriverHelper;
 
public class ForProvidersAction {
 
     WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
 
    /**
     * Author: Rewa Pawar
     * Navigates to the 'Join Our Nursing Team' section, performs necessary actions,
     * switches to a new window, and then closes the window.
     */
     
    public void joinNursingTeam(ExtentTest test) {
        try {
            String mainWindowHandle = Base.driver.getWindowHandle();
            driverHelper.hover(HomePageLocators.forProviders_joinOurNursingTeam);
            driverHelper.clickTheElement(HomePageLocators.forProviders_joinOurNursingTeam);
            test.log(Status.PASS,"Clicked on Join our Nursing Team as excepted");
            driverHelper.hover(HomePageLocators.forProviders_nursingAtCleveland);
            driverHelper.clickTheElement(HomePageLocators.forProviders_nursingAtCleveland);
            test.log(Status.PASS,"Clicked on Nursing at Cleveland as excepted");
            driverHelper.switchWindow();
            test.log(Status.PASS,"Switched to new Nursing at Cleveland page as excepted");
            //driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "5", "value"));
            Base.driver.close();
            Base.driver.switchTo().window(mainWindowHandle);
           
        } catch (Exception e) {
           
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Join Nursing Team", Hooks.test, "Join Nursing Team functionality failed"); 
           
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Navigates to the 'Careers' section, performs necessary actions,
     * switches to a new window, and then closes the window.
     *
     */
   
    public void careers(ExtentTest test) {
        try {
            String mainWindowHandle = Base.driver.getWindowHandle();
            driverHelper.hover(HomePageLocators.forProviders_careers);
            driverHelper.clickTheElement(HomePageLocators.forProviders_careers);
            test.log(Status.PASS,"Clicked on Careers as excepted");
            driverHelper.hover(HomePageLocators.forProviders_findYourCareer);
            driverHelper.clickTheElement(HomePageLocators.forProviders_findYourCareer);
            test.log(Status.PASS,"Clicked on Find your Career as excepted");
            driverHelper.switchWindow();
            test.log(Status.PASS,"Switched to new Find your Career page as excepted");
           // driverHelper.verifyTitle(ExcelReader.readCellValue("Sheet1", "6", "value"));
            Base.driver.close();
            Base.driver.switchTo().window(mainWindowHandle);
           
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Careers", Hooks.test, "Career functionality failed"); 
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Navigates to the 'Refer a Patient' section, performs necessary actions,
     * switches to a new window, and then closes the window.
     *
     */
     
    public void referPatient(ExtentTest test) {
        try {
            String mainWindowHandle = Base.driver.getWindowHandle();
            driverHelper.clickTheElement(HomePageLocators.forProviders_referPatient);
            test.log(Status.PASS, "Clicked on Refer a Patient as expected ");
            driverHelper.clickTheElement(HomePageLocators.forProviders_referringPhysician);
            test.log(Status.PASS,"Clicked on Referring Physician as excepted");
            driverHelper.switchWindow();
            test.log(Status.PASS,"Switched to new Referring Physician page as excepted");
            //driverHelper.verifyTitle(ExcelReader.readCellValue("data2", "7", "value"));
            Base.driver.close();
            Base.driver.switchTo().window(mainWindowHandle);
           
           
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Refer Patient", Hooks.test, "Refer Patient Functionality failed");
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Navigates to the 'Consult QD' section, performs necessary actions,
     * switches to a new window, and then closes the window.
     *
     */
     
    public void consultQd(ExtentTest test) {
        try {
            String mainWindowHandle = Base.driver.getWindowHandle();
            driverHelper.clickTheElement(HomePageLocators.forProviders_consultQd);
            test.log(Status.PASS,"Clicked on ConsultQD as excepted");
            driverHelper.clickTheElement(HomePageLocators.forProviders_siteForPhysician);
            test.log(Status.PASS,"Clicked on Join our Site for Physician as excepted");
            driverHelper.switchWindow();
            test.log(Status.PASS,"Switched to new Site for Physician page as excepted");
            //driverHelper.verifyTitle(ExcelReader.readCellValue("data2", "8", "value"));
            Base.driver.close();
            Base.driver.switchTo().window(mainWindowHandle);
           
           
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Consult Qd", Hooks.test, "Consult Qd functionality failed");
        }
    }
 
    /**
     * Author: Rewa Pawar
     * Navigates to the 'Education' section, performs necessary actions,
     * switches to a new window, and then closes the window.
     *
     */
     
    public void education(ExtentTest test) {
        try {
            String mainWindowHandle = Base.driver.getWindowHandle();
            driverHelper.clickTheElement(HomePageLocators.forProviders_education);
            test.log(Status.PASS,"Clicked on Join our Education as excepted");
            driverHelper.clickTheElement(HomePageLocators.forProviders_trainingAndEducation);
            test.log(Status.PASS,"Clicked on Join our Training and Education as excepted");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
            driverHelper.switchWindow();
            test.log(Status.PASS,"Switched to new Training and Education page as excepted");
            //driverHelper.verifyTitle(ExcelReader.readCellValue("data2", "9", "value"));
            Base.driver.close();
            Base.driver.switchTo().window(mainWindowHandle);
           
           
        } catch (Exception e) {
            // Hooks.test.log(Status.FAIL, e.getMessage());
            // ReportHelper.attachScreenshotToReport("Education", Hooks.test, "Education functionality failed");
        }
    }
 
 
}