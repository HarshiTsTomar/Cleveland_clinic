package stepdefinition;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AppointmentsActions;
import pages.HomePageActions;
import pages.RequestAppointmentActions;
import utils.Base;
import utils.WebDriverHelper;
 
public class RequestAppointmentStep
{
    WebDriverHelper helper = new WebDriverHelper(Base.driver);
    RequestAppointmentActions actions = new RequestAppointmentActions();
    @Given("the User has launched the browser and navigated to {string} maximized the browser window")
    public void the_user_has_launched_the_browser_and_navigated_to_maximized_the_browser_window(String string) {
        helper.verifyUrl(string);
    }
   
    @When("the User Clicks on the Schedule now button under the Appointments section")
    public void the_user_clicks_on_the_schedule_now_button_under_the_appointments_section()
    {
        HomePageActions action = new HomePageActions();
        action.clickOnSchedule();
    }
    @When("the User Clicks on the Request an Appointment button")
    public void the_user_clicks_on_the_request_an_appointment_button() {
        AppointmentsActions action = new AppointmentsActions();
        action.clickOnRequest();
    }
    @When("the User Clicks on the Get Started button")
    public void the_user_clicks_on_the_get_started_button() {
        actions.clickOnGetStarted();
    }
    @When("the User Clicks on the Me option")
    public void the_user_clicks_on_the_me_option() {
        actions.clickOnMe();
    }
    @When("the User Clicks on the Not sure option")
    public void the_user_clicks_on_the_not_sure_option() {
        actions.clickOnNot_Sure();
    }
    @When("the User enters the personal information {string} {string}{string}{string}{string}")
    public void the_user_enters_the_personal_information(String string, String string2, String string3, String string4, String string5) {
        actions.fillTheDetails(string, string2, string3, string4, string5);
    }
    @When("the User Clicks on the Next button")
    public void the_user_clicks_on_the_next_button() {
        actions.clickOnNextButton();
    }
    @When("the User enters the contact information {string}{string}{string}{string} {string} {string}")
    public void the_user_enters_the_contact_information(String string, String string2, String string3, String string4, String string5, String string6) {
        actions.fillcontacts(string, string2, string3, string4, string5, string6);
    }
    @When("the User enters the appointment reason {string}")
    public void the_user_enters_the_appointment_reason(String string) {
        actions.appointmentneed(string);
    }
}
