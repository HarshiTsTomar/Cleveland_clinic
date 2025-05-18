

package uistore;

import org.openqa.selenium.By;

public class InstituteLocators {
    public static By bloodManagement=By.cssSelector("a[href='/departments/blood-management']");
    public static By pharmacy=By.cssSelector("a[href='/departments/pharmacy']");
    public static By specilaSelect=By.xpath("//h2[contains(text(),'Special Expertise Institutes')]");
    public static By specilaSelectcontact=By.xpath("(//h5[text()='About Cleveland Clinic'])");
    public static By contact=By.xpath("(//a[@href='/help'])[4]");

}
