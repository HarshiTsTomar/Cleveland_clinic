package stepdefinition;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForProvidersAction;
 
public class ForProvidersDefinition {
 
 ForProvidersAction act1 = new ForProvidersAction();
 
@Given("User clicks on Join Our Nursing Team and verifies")
public void user_clicks_on_join_our_nursing_team_and_verifies() {
    act1.joinNursingTeam(Hooks.test);
   
}
@Given("User clicks on Careers and verifies")
public void user_clicks_on_careers_and_verifies() {
    act1.careers(Hooks.test);
   
}
@Given("User clicks on Refer a Patient and verifies")
public void user_clicks_on_refer_a_patient_and_verifies() {
    act1.referPatient(Hooks.test);
   
}
@When("User clicks on ConsultQD and verifies")
public void user_clicks_on_consult_qd_and_verifies() {
    act1.consultQd(Hooks.test);
   
}
@Then("User clicks on Education and verifies")
public void user_clicks_on_education_and_verifies() {
    act1.education(Hooks.test);
   
}
 
}