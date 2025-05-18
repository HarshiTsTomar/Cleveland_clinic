package pages;
 
 
import com.aventstack.extentreports.Status;
 
import stepdefinition.Hooks;
import uistore.RequestAppointmentLocators;
import utils.Base;
import utils.ReportHelper;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class RequestAppointmentActions
{
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method hovers over and clicks on the "Get Started" button on the request appointment page.
     */
 
    public void clickOnGetStarted()
    {
        try{
        driverHelper.hover(RequestAppointmentLocators.RequestAppointment_Get_Started);
        driverHelper.clickTheElement(RequestAppointmentLocators.RequestAppointment_Get_Started);    
        Hooks.test.log(Status.PASS, "Clicked on Get Started as Excepted");    
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Get Started", Hooks.test, "Get Started failed");
        }
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method waits for the "Next" button to be clickable, then hovers over and clicks it.
     */
 
    public void clickOnNextButton()
    {
        try{
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_NextButton, 10);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        Hooks.test.log(Status.PASS, "Clicked on Next Button as Excepted");
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Next Button", Hooks.test, "Next Button click failed");
        }
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method waits for the "Me" option to be clickable, then hovers over and clicks it.
     */
 
    public void clickOnMe()
    {
        try{
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_Me, 10);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_Me);
        Hooks.test.log(Status.PASS, "Clicked on Me button as Excepted");
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Me button", Hooks.test, "ME Button click failed");
        }
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method clicks on the "Not Sure" option on the request appointment page.
     */
 
    public void clickOnNot_Sure()
    {
        try{
        driverHelper.clickTheElement(RequestAppointmentLocators.RequestAppointment_Not_Sure);
        Hooks.test.log(Status.PASS, "Clicked on Not Sure as Excepted");
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Not Sure button", Hooks.test, "Not Sure  Button click failed");
        }
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method fills in the personal details required for the appointment request.
     *
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     * @param gender The gender of the person.
     * @param status The marital status of the person.
     * @param DOB The date of birth of the person.
     */
 
    public void fillTheDetails(String firstName,String lastName,String gender,String status,String DOB)
    {
        try{
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Firstname, firstName);
        Hooks.test.log(Status.PASS, "Inputed first Name in the Input box as Expected");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Lastname, lastName);
        Hooks.test.log(Status.PASS, "Inputed Last Name in the Input box as Expected");
        driverHelper.selectByValue(RequestAppointmentLocators.RequestAppointment_Gender, gender);
        Hooks.test.log(Status.PASS, "Selected the Gender in DropDown as Expected");
        driverHelper.selectByValue(RequestAppointmentLocators.RequestAppointment_MaritalStatus, status);
        Hooks.test.log(Status.PASS, "Selected the Marital Status in DropDown as Expected");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_DOB, DOB);
        Hooks.test.log(Status.PASS, "Selected the Date of Birth in DropDown as Expected");
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Fill Details", Hooks.test, "Fill Details failed");
        }
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method fills in the contact details required for the appointment request.
     *
     * @param address The address of the person.
     * @param city The city of the person.
     * @param state The state of the person.
     * @param zipcode The zip code of the person.
     * @param email The email address of the person.
     * @param phone The phone number of the person.
     */
 
    public void fillcontacts(String address,String city,String state,String zipcode,String email,String phone)
    {
        try{
        driverHelper.clickUsingJS(RequestAppointmentLocators.RequestAppointment_Address);
        Hooks.test.log(Status.PASS, "Clicked on Address Input Box as Excepted");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Address, address);
        Hooks.test.log(Status.PASS, "Inputed Address in the Input box as Expected");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_City, city);
        Hooks.test.log(Status.PASS, "Inputed City in the Input box as Expected");
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_StateCategory, 10);
        driverHelper.selectByVisibleText(RequestAppointmentLocators.RequestAppointment_StateCategory, state);
        Hooks.test.log(Status.PASS, "Selected the State in DropDown as Expected");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Email, email);
        Hooks.test.log(Status.PASS, "Inputed Email in the Input box as Expected");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Zipcode, zipcode);
        Hooks.test.log(Status.PASS, "Inputed zipcode in the Input box as Expected");
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Phone_number, phone);
        Hooks.test.log(Status.PASS, "Inputed Phone number in the Input box as Expected");
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        Hooks.test.log(Status.PASS, "Clicked on Next Button as Excepted");
        }catch(Exception e)
        {
            Hooks.test.log(Status.FAIL, e.getMessage());
            ReportHelper.attachScreenshotToReport("Fill Contacts", Hooks.test, "Fill Contacts failed");
        }
    }
   
    /**
     * Author: Kiruthik Vijey Raj P
     * This method fills in the reason for the appointment and proceeds to the next step.
     *
     * @param reason The reason for the appointment.
     */
 
    public void appointmentneed(String reason)
    {
        try{
        driverHelper.typeText(RequestAppointmentLocators.RequestAppointment_Reason, reason);
        Hooks.test.log(Status.PASS, "Inputed Reason for Appointment in the Input box as Expected");
        driverHelper.waitForClickability(RequestAppointmentLocators.RequestAppointment_NextButton,10);
        driverHelper.hoverAndClick(RequestAppointmentLocators.RequestAppointment_NextButton);
        Hooks.test.log(Status.PASS, "Clicked on Next Button as Excepted");
        driverHelper.waitForVisibility(RequestAppointmentLocators.RequestAppointment_Verification_Label, 10);
        Screenshot.screenShotAndHighlight(Base.driver,RequestAppointmentLocators.RequestAppointment_Verification_Label,"Appointment");
        ReportHelper.attachScreenshotToReport("Appointment", Hooks.test, "Appointment Found");
        } catch(Exception e)
        {
            ReportHelper.attachScreenshotToReport("Fill Reason for appointment", Hooks.test, e.getMessage());
        }
    }
}