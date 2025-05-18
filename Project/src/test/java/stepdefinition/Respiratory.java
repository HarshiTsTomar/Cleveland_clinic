package stepdefinition;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.RespiratoryAction;
 
public class Respiratory {
    public static ExtentReports report;
    public static ExtentTest test;
    HomePageActions home = new HomePageActions();
    RespiratoryAction resp = new RespiratoryAction();
   
 
    @Given("the keyword {string} is searched")
    public void the_keyword_is_searched(String string) {
        HomePageActions home = new HomePageActions();
        home.searchOperation(test,string);
    }
 
    @When("the first search result is opened and relevant content is verified")
    public void the_first_search_result_is_opened_and_relevant_content_is_verified() {
        RespiratoryAction resp = new RespiratoryAction();
        resp.respOperation(test);
    }
 
    @Then("filters for male and female specialists are applied, and a doctor's profile is selected")
    public void filters_for_male_and_female_specialists_are_applied_and_a_doctor_s_profile_is_selected() {
        RespiratoryAction resp = new RespiratoryAction();
        resp.doctorFilters(test);
    }
 
    @Then("verify the profile page displays detailed information")
    public void verify_the_profile_page_displays_detailed_information() {
        RespiratoryAction resp = new RespiratoryAction();
        resp.doctorSelect(test);
    }
}