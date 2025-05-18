package uistore;

import org.openqa.selenium.By;

public class RespiratoryLocators {
    public static By Introduction = By.xpath("//a[@class='tab-link js-tab-link selected']");
    public static By cough = By.xpath("//a[@class='tab-link js-tab-link'][1]");
    public static By pep = By.xpath("//a[@class='tab-link js-tab-link'][2]");
    public static By Acapella = By.xpath("//a[@class='tab-link js-tab-link'][3]");
    public static By nebulizer  = By.xpath("//a[@class='tab-link js-tab-link'][4]");

    public static By byDoctors = By.xpath("//a[@class='nav--section__link js-search-filter-click'][1]");
    public static By verifyDoctor = By.xpath("//h2[@class='search-facets-title__total']");
    
    public static By specialist = By.cssSelector("#Specialist");
    public static By male = By.cssSelector("#Male");
    public static By female = By.cssSelector("#Female");
    public static By mahamod = By.xpath("//*[@id='hits']/div[1]/h2/a");
    public static By doctorInfo = By.xpath("//div[@class='l-66-33--1']");
    public static By ratings = By.xpath("//strong[@class='header--bio__rating-numbers']");
}
