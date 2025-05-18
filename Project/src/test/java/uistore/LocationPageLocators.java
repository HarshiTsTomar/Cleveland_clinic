package uistore;
 
import org.openqa.selenium.By;
 
public class LocationPageLocators {
    public static By searchbar = By.id("search-input");
    public static By locationTypes = By.cssSelector("input[class='chosen-search-input default']");
    public static By speciality = By.cssSelector("input[class='chosen-search-input default']");
    public static By serviceTypes = By.cssSelector("input[class='chosen-search-input default']");
    public static By DirectionButton = By.xpath("(//a[@target='_blank'])[6]");
    public static By healthCentre = By.xpath("//li[contains(text(),'Health Centers')]");
    public static By imagingradiology = By.xpath("//li[contains(text(),'Imaging & Radiology')]");
    public static By locationtypes1 = By.xpath("//select[@id='types']");
    public static By astama = By.xpath("//li[contains(text(),'Asthma')]");
    public static By speciality1 = By.xpath("(//input[@class='chosen-search-input'])[2]");
    public static By brainhealth = By.xpath("//li[contains(text(),'Brain Health')]");
    public static By emergency = By.xpath("//li[contains(text(),'Emergency Services')]");
    public static By serviceTypes1 = By.xpath("(//input[@class='chosen-search-input'])[3]");
    public static By expresscare = By.xpath("//li[contains(text(),'Express Care')]");
    public static By signinsecond = By.cssSelector("[class='gb_Ua gb_zd gb_qd gb_hd']");
    public static By getDirection=By.cssSelector("div a.story-panel__button[href='/locations']");
 }
