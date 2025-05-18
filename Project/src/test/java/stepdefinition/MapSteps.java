package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePageAction;
import io.cucumber.java.en.Then;
import utils.Base;
import utils.WebDriverHelper;
 
public class MapSteps {
    HomePageAction homePageAction = new HomePageAction();
 
    @Given("the user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
    }
 
    @When("the user initiates the home page interaction sequence")
    public void the_user_initiates_the_home_page_interaction_sequence() {
        homePageAction.homePage();
    }
 
    @When("the user proceeds with the second page interaction sequence using {string}")
    public void the_user_proceeds_with_the_second_page_interaction_sequence_using(String locationData) {
        homePageAction.secondpageAction(locationData);
    }
 
    @When("the user selects various location types")
    public void the_user_selects_various_location_types() {
        homePageAction.locationTypesInput();
    }
 
    @When("the user specifies the required speciality")
    public void the_user_specifies_the_required_speciality() {
        homePageAction.specialityInput();
    }
 
    @When("the user designates the service types")
    public void the_user_designates_the_service_types() {
        homePageAction.serviceTypesInput();
    }
 
    @When("the user activates the direction button")
    public void the_user_activates_the_direction_button() {
        homePageAction.buttonDirection();
    }
 
    @Then("the user transitions to the secondary window and captures a screenshot")
    public void the_user_transitions_to_the_secondary_window_and_captures_a_screenshot() {
        homePageAction.secondWindow();
    }
}