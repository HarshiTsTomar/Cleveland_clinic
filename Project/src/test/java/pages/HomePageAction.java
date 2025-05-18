package pages;
import java.time.Duration;
import com.aventstack.extentreports.Status;
import stepdefinition.Hooks;
import uistore.LocationPageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;
 
 
public class HomePageAction {
    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
/**
         * Author: Md Saif Masoom
         * Executes actions on the homepage.
         * This method navigates to the homepage of the application and performs specific actions.
         * It hovers over an element identified by a locator and clicks on it to proceed further.
         * It is wrapped in a try-catch block to handle any exceptions that may occur during execution.
         *
         * @throws Exception If an error occurs during the hover or click actions.
         */
    public void homePage() {
        try {
            driverHelper.hover(LocationPageLocators.getDirection);
            Hooks.test.log(Status.PASS, "Hovered over Get Direction button as expected");
            driverHelper.clickTheElement(LocationPageLocators.getDirection);
            Hooks.test.log(Status.PASS, "Clicked over Get Direction button as expected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs specific actions.
     * It clicks for proceed further.
     * It is wrapped in a try-catch block to handle any exceptions that may occur during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
    public void secondpageAction(String locationData) {
        try {
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.clickTheElement(LocationPageLocators.searchbar);
            Hooks.test.log(Status.PASS, "Clicked over search bar as expected");
            driverHelper.typeText(LocationPageLocators.searchbar, locationData);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs specific actions.
     * It clicks and wait for element to visible.
     * It is wrapped in a try-catch block to handle any exceptions that may occur during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
    public void locationTypesInput() {
        try {
            driverHelper.clickTheElement(LocationPageLocators.locationTypes);
            Hooks.test.log(Status.PASS, "Clicked over location types dropdown menu as expected");
            driverHelper.waitForVisibility(LocationPageLocators.locationTypes, 10);
            driverHelper.clickTheElement(LocationPageLocators.healthCentre);
            Hooks.test.log(Status.PASS, "Clicked over health care option as expected");
            Thread.sleep(3000);
            driverHelper.selectByValue(LocationPageLocators.locationtypes1, "Imaging & Radiology");
            Hooks.test.log(Status.PASS, "Selected value from dropdown menu as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs specific actions.
     * It clicks and wait for element to visible.
     * It is wrapped in a try-catch block to handle any exceptions that may occur during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
    public void specialityInput() {
        try {
            driverHelper.clickTheElement(LocationPageLocators.speciality);
            Hooks.test.log(Status.PASS, "Clicked over speciality dropdown menu as expected");
            driverHelper.waitForVisibility(LocationPageLocators.speciality, 10);
            driverHelper.clickTheElement(LocationPageLocators.astama);
            Hooks.test.log(Status.PASS, "Clicked over asthma option from dropdown menu as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.speciality1, 10);
            driverHelper.clickTheElement(LocationPageLocators.speciality1);
            Hooks.test.log(Status.PASS, "Clicked over speciality dropdown menu as expected");
            driverHelper.clickTheElement(LocationPageLocators.brainhealth);
            Hooks.test.log(Status.PASS, "Clicked over speciality dropdown menu and selected brain health option as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs specific actions.
     * It clicks and wait for element to visible.
     * It is wrapped in a try-catch block to handle any exceptions that may occur during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
 
    public void serviceTypesInput() {
        try {
            driverHelper.clickTheElement(LocationPageLocators.serviceTypes);
            Hooks.test.log(Status.PASS, "Clicked over service types dropdown menu as expected");
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes, 10);
            driverHelper.clickTheElement(LocationPageLocators.emergency);
            Hooks.test.log(Status.PASS, "Clicked over emergency option as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.serviceTypes1, 10);
            driverHelper.clickTheElement(LocationPageLocators.serviceTypes1);
            Hooks.test.log(Status.PASS, "Clicked over service types dropdown menu as expected");
            driverHelper.clickTheElement(LocationPageLocators.expresscare);
            Hooks.test.log(Status.PASS, "Clicked over express care options as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs specific actions.
     * It clicks on button.
     * It is wrapped in a try-catch block to handle any exceptions that may occur during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
    public void buttonDirection() {
        try {
            driverHelper.clickTheElement(LocationPageLocators.DirectionButton);
            Hooks.test.log(Status.PASS, "Clicked over direction button as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
     * Author: Md Saif Masoom
     * Executes actions on the homepage.
     * This method navigates to the homepage of the application and performs specific actions.
     * It switches window and wait for element to visible after that it take screenshot.
     * It is wrapped in a try-catch block to handle any exceptions that may occur during execution.
     *
     * @throws Exception If an error occurs during the hover or click actions.
     */
 
    public void secondWindow() {
        try {
            driverHelper.switchWindow();
            Hooks.test.log(Status.PASS, "Window switched as expected");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driverHelper.waitForVisibility(LocationPageLocators.signinsecond, 5);
            driverHelper.verifyUrl(Base.prop.getProperty("mapurl"));
            Screenshot.screenShotAndHighlight(Base.driver, LocationPageLocators.signinsecond, "Google Maps page");
            Hooks.test.log(Status.PASS, "Screenshot captured successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
