package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePageActions;

public class FooterActionSteps {

    HomePageActions homepageActions = new HomePageActions();


    @When("I click on the Appointments Access link")
    public void i_click_on_the_appointments_access_link() {
        homepageActions.clickAppointmentsAccess();
    }

    @And("I click on the Accepted Insurance link")
    public void i_click_on_the_accepted_insurance_link() {
        homepageActions.clickAcceptedInsurance();
    }

    @And("I click on the Events Calendar link")
    public void i_click_on_the_events_calendar_link() {
        homepageActions.clickEventsCalender();
    }

    @And("I click on the Financial Assistance link")
    public void i_click_on_the_financial_assistance_link() {
        homepageActions.clickFinancialAssistance();
    }

    @And("I click on the Give to Cleveland Clinic link")
    public void i_click_on_the_give_to_cleveland_clinic_link() {
        homepageActions.clickGiveCleveland();
    }

    @And("I click on the Pay Bill link")
    public void i_click_on_the_pay_bill_link() {
        homepageActions.clickPayBill();
    }

    @And("I click on the Price Transparency link")
    public void i_click_on_the_price_transparency_link() {
        homepageActions.clickPriceTransparency();
    }

    @And("I click on the Refer Patient link")
    public void i_click_on_the_refer_patient_link() {
        homepageActions.clickReferPatient();
    }

    @And("I click on the Phone Directory link")
    public void i_click_on_the_phone_directory_link() {
        homepageActions.clickPhoneDirectory();
    }

    @And("I click on the Virtual Opinions link")
    public void i_click_on_the_virtual_opinions_link() {
        homepageActions.clickVirtualOpinions();
    }

    @And("I click on the Virtual Visits link")
    public void i_click_on_the_virtual_visits_link() {
        homepageActions.clickVirtualVisits();
    }
}
