package uistore;

import org.openqa.selenium.By;

public class FindADoctorLocators 
{
    public static By FindADoctorLocators_searchBar= By.id("search-input");
    public static By FindADoctorLocators_location= By.cssSelector("[value='Filter by Locations by City...']");
    public static By FindADoctorLocators_locationOption= By.xpath("//li[text()='East Cleveland, OH']");
    public static By FindADoctorLocators_Department= By.cssSelector("[value='Filter by Institutes & Departments...']");
    public static By FindADoctorLocators_DepartmentOption= By.xpath("//li[text()='Cardiovascular Medicine']");
    public static By FindADoctorLocators_Language= By.cssSelector("[value='Filter by Languages...']");
    public static By FindADoctorLocators_DoctorCount= By.cssSelector("h2.search-facets-title__total");
    public static By FindADoctorLocators_Request= By.xpath("//a[@href='/webappointment?PhysicianFirstName=Michael&PhysicianLastName=Maier&PhysicianSuffix=DPM']");
    public static By FindADoctorLocators_Label= By.cssSelector("h1");
}
