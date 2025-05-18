package uistore;

import org.openqa.selenium.By;

public class RequestAppointmentLocators {
    
    public static By RequestAppointment_Get_Started = By.cssSelector(".btn--primary");
    public static By RequestAppointment_Requestlabel = By.cssSelector(".web-appt__header");
    public static By RequestAppointment_Me = By.xpath("//button[@class='btn--icon btn--myself ']");
    public static By RequestAppointment_Not_Sure = By.cssSelector(".btn--icon.btn--not-sure");
    public static By RequestAppointment_Firstname = By.id("firstName");
    public static By RequestAppointment_Lastname = By.id("lastName");
    public static By RequestAppointment_Gender = By.id("gender");
    public static By RequestAppointment_MaritalStatus = By.id("maritalStatus");
    public static By RequestAppointment_DOB = By.id("dob");
    public static By RequestAppointment_NextButton = By.cssSelector(".btn--primary");
    public static By RequestAppointment_Address = By.id("address1");
    public static By RequestAppointment_City = By.id("city");
    public static By RequestAppointment_StateCategory = By.id("state");
    public static By RequestAppointment_Email = By.id("email");
    public static By RequestAppointment_Phone_number = By.id("Phone number");
    public static By RequestAppointment_Zipcode = By.id("zip");
    public static By RequestAppointment_Reason = By.id("reason");
    public static By RequestAppointment_Verification_Label = By.cssSelector(".web-appt__header");
}
