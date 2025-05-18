package stepdefinition;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BSOActions;
import pages.HealthLibraryActions;
import pages.HomePageActions;
 
public class HealthLibraryStep {
    ExtentTest test=Hooks.test;
    ExtentReports reports;
 
    HomePageActions homePageActions = new HomePageActions();
 
    @Given("user clicked on Health Library")
    public void user_clicked_on_health_library() {
        HomePageActions homePageActions = new HomePageActions();
        homePageActions.healthLibrary(test);
 
    }
 
    @Then("user clicked on Body Systems and Organs")
    public void user_clicked_on_body_systems_and_organs() {
        System.out.println("Clicked on Body Systems and Organs");
    }
 
    @Then("user search for {string}")
    public void user_search_for(String string) {
        HealthLibraryActions healthLibraryActions = new HealthLibraryActions();
        healthLibraryActions.clickOnEyes(test, string);
    }
 
    @Then("user clicked on red eyes and redirected to the resultPage")
    public void user_clicked_on_red_eyes_and_redirected_to_the_result_page() {
        BSOActions bso = new BSOActions();
        bso.eyeDiseases(test);
    }
}
 