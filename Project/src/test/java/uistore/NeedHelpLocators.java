package uistore;
 
import org.openqa.selenium.By;
 
public class NeedHelpLocators {
    public static By parking=By.xpath("(//a[@href='/patients/travel/parking'])");
    public static By needassitance=By.xpath("(//a[@href='/patients/travel/travel-assistance'])[1]");
    public static By globalPatient=By.xpath("(//a[@href='/patients/international'])[1]");
    public static By speakwithteam=By.xpath("(//a[@href='/patients/international#locations'])[2]");
    public static By virtualSecond=By.xpath("(//a[@href='/online-services/virtual-second-opinions'])[1]");
    public static By needHelp=By.xpath("(//a[contains(text(),'Need Help?')])[1]");
    public static By getStarted=By.xpath("(//a[contains(text(),'Get Started (U.S.)')])[1]");
 
}