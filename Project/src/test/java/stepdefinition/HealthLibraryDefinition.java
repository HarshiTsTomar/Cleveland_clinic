package stepdefinition;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HealthLibraryAction;
 
public class HealthLibraryDefinition {
 
    HealthLibraryAction act2 = new HealthLibraryAction();
 
@Given("User clicks on Disease and Condition and verifies")
public void user_clicks_on_disease_and_condition_and_verifies() {
    act2.diseaseAndCondition(Hooks.test);
   
}
@Given("User clicks on Diagnostics & Testing and verifies")
public void user_clicks_on_diagnostics_testing_and_verifies() {
    act2.diagnosticsAndTesting(Hooks.test);
 
   
}
@Given("User clicks on Treatments & Procedures and verifies")
public void user_clicks_on_treatments_procedures_and_verifies() {
    act2.treatmentsAndProcedure(Hooks.test);
   
}
@When("User clicks on Body Systems & Organs and verifies")
public void user_clicks_on_body_systems_organs_and_verifies() {
    act2.bodySystemsAndOrgans(Hooks.test);
 
   
}
@Then("User clicks on Drugs, Devices & Supplements and verifies")
public void user_clicks_on_drugs_devices_supplements_and_verifies() {
    act2.drugsDevicesSupplements(Hooks.test);
   
}
}