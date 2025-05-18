package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {



    //kiruthik 
    public static By Appointments_ScheduleNow = By.xpath("(//a[@class='story-panel__button button'])[3]");
    public static By Appointments_Find_a_Doctor = By.xpath("(//a[@class='story-panel__button button'])[1]");

    ////Test Case 05 [Rewa]
    public static By healthLibrary_diseaseAndCondition = By.cssSelector("[title='Diseases & Conditions']");
    public static By healthLibrary_diseaseAndConditionNew = By.cssSelector("h1[class='page-header__title lede']");

    public static By healthLibrary_diagnosticsAndTesting = By.cssSelector("[href='/health/diagnostics']");
    public static By healthLibrary_diagnosticsAndTestingNew = By.cssSelector("h1[class='page-header__title lede']");

    public static By healthLibrary_treatmentsAndProcedure = By.cssSelector("[href='/health/treatments']");
    public static By healthLibrary_treatmentsAndProcedureNew = By.cssSelector("h1[class='page-header__title lede']");
    
    public static By healthLibrary_bodySystemsAndOrgans= By.cssSelector("[href='/health/body']");
    public static By healthLibrary_bodySystemsAndOrgansNew= By.cssSelector("h1[class='page-header__title lede']");
    
    public static By healthLibrary_drugsDevicesSupplements= By.cssSelector("[href='/health/drugs']");
    public static By healthLibrary_drugsDevicesSupplementsNew= By.cssSelector("h1[class='page-header__title lede']");
    
    public static By healthLibrary_titleHealth = By.cssSelector("div[class='care-widget__title js-care-widget__title']");
    
    ///// Test Case 06 [Rewa]
    
   public static By forProviders_joinOurNursingTeam= By.xpath("//h3[@id='join-our-nursing-tea']");
    
    public static By forProviders_nursingAtCleveland= By.cssSelector("[href='https://jobs.clevelandclinic.org/nursing/']");
    public static By forProviders_nursingAtClevelandNew=By.cssSelector("span[class='sitettl']"); 

    
    public static By forProviders_careers= By.xpath("//h3[@id='careers']");
    
    public static By forProviders_findYourCareer= By.xpath("//a[contains(text(),'Find your career')]");
    
    public static By forProviders_referPatient= By.xpath("//h3[@id='refer-a-patient']");
    
    public static By forProviders_referringPhysician= By.xpath("//a[contains(text(),'Referring Physician team')]");
    
    public static By forProviders_consultQd= By.id(("consultqd"));
    
    public static By forProviders_siteForPhysician= By.cssSelector("[href='https://consultqd.clevelandclinic.org/']");
    
    public static By forProviders_education= By.id(("education"));
    
    public static By forProviders_trainingAndEducation = By.cssSelector("[href='/departments/education']");

    


    public static By search = By.xpath("//a[@class='button--small button--search']");
    public static By searchbar = By.cssSelector("#search-input");
    public static By result = By.cssSelector("#site-stats-main");
    public static By firstResp = By.cssSelector("#site-hits > div:nth-child(1) > h2 > a > strong");
    public static By verifyResp = By.cssSelector(".hero-content__title");


    public static By healthLibrary=By.xpath("(//a[@href='/health'])[2]");
    public static By institueAndDepat=By.xpath("(//a[@href='/departments'])[2]");
    public static By needHelp=By.xpath("(//a[@class='nav--utility__link '])[2]");


    public static By clevelandClinicHeader = By.cssSelector("img[alt='Cleveland Clinic logo']");

    public static By facebookSocialLink = By.cssSelector("[href='https://www.facebook.com/ClevelandClinic']");
    public static By twitterSocialLink = By.cssSelector("[href='https://twitter.com/clevelandclinic']");
    public static By youtubeSocialLink = By.cssSelector("[href='https://www.youtube.com/user/clevelandclinic']");
    public static By instagramSocialLink = By.cssSelector("[href='https://www.instagram.com/clevelandclinic/']");
    public static By linkedinSocialLink = By.cssSelector("[href='https://www.linkedin.com/company/cleveland-clinic']");
    public static By pinterestSocialLink = By.cssSelector("[href='https://www.pinterest.com/clevelandclinic/']");
    public static By snapchatSocialLink = By.cssSelector("[href='https://www.snapchat.com/add/clevelandclinic']");
    
    
    public static By appointmentsActions = By.cssSelector("a[title='Appointments']");
    public static By acceptedInsuranceActions = By.cssSelector("a[title='Accepted Insurance']");
    public static By eventsCalenderActions = By.xpath("//a[text()='Events Calendar']");
    public static By financialAssistanceActions = By.xpath("//a[text()='Financial Assistance']");
    public static By giveClevelandActions = By.xpath("//a[text()='Give to Cleveland Clinic']");
    public static By payBillActions = By.cssSelector("a[title='Pay Your Bill']");
    public static By priceTransparencyActions = By.cssSelector("a[title='Price Transparency']");
    public static By referPatientActions = By.xpath("//a[text()='Refer a Patient']");
    public static By phoneDirectoryActions = By.xpath("//a[text()='Phone Directory']");
    public static By virtualOpinionsActions = By.xpath("//a[text()='Virtual Second Opinions']");
    public static By virtualVisitsActions = By.xpath("//a[text()='Virtual Visits']");
    

    public static By getDirection=By.cssSelector("div a.story-panel__button[href='/locations']");

}
