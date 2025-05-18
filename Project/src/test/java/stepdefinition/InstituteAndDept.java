package stepdefinition;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BSOActions;
import pages.BloodManageActions;
import pages.HomePageActions;
import pages.InstituteActions;
import pages.PharmacyActions;
 
public class InstituteAndDept {
    ExtentTest test = Hooks.test;
    ExtentReports reports;
    BloodManageActions bloodManageActions = new BloodManageActions();
    BSOActions bso = new BSOActions();
    HomePageActions homePageActions = new HomePageActions();
    InstituteActions institute = new InstituteActions();
    BloodManageActions bloodMangement = new BloodManageActions();
    PharmacyActions pharmacy = new PharmacyActions();
 
 
    @Given("user clicked on Institute and departments")
    public void user_clicked_on_institute_and_departments() {
        homePageActions.institute(test);
        System.out.println("user clicked on Institute and Departments");
    }
 
    @Then("user clicked on Blood Management")
    public void user_clicked_on_blood_management() {
        institute.bloodacction(test);
        System.out.println("User clicked on Blood Management");
    }
 
    @Then("redirected to result resultPage")
    public void redirected_to_result_result_page() {
       
        bloodMangement.bloodMethod(test);
        institute.pharmacyAction(test);
 
    }
 
    @Then("navigate back to the previous Page")
    public void navigate_back_to_the_previous_page() {
        System.out.println("User Navigated to Previous Page");
    }
 
    @Then("clicked on Pharmacy link and click takesurvey")
    public void clicked_on_pharmacy_link_and_click_takesurvey() {
        pharmacy.takeSurvey(test);
        bso.ClickingOnParking(test);
 
    }
 
}