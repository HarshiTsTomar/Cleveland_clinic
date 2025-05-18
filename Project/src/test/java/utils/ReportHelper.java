package utils;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
 
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;
 
public class ReportHelper extends Base {
    public static TakesScreenshot ts;
    private static ExtentReports report;
    private static ExtentTest test;
 
    /**
     * Author : Vinny
     *
     * This method initializes and configures an ExtentSparkReporter instance
     * to generate an HTML report in the specified file path.
     *
     * @param name The name of the report file to be created.
     * @return
     */
    public static ExtentReports createExtentReporter(String name) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("/home/coder/project/workspace/Project/reports/" + name + ".html");
        report = new ExtentReports();
        report.attachReporter(sparkReporter);
        return report;
    }
 
    /**
     * Author : Vinny
     *
     * This method creates a new test node in the ExtentReports instance.
     * Each test node is used to log details for a specific test case.
     *
     * @param extentTestName The name of the test case to be displayed in the report.
     * @return ExtentTest The test node created in the ExtentReports instance.
     */
    public static ExtentTest ExtentTest(String extentTestName) {
        test = report.createTest(extentTestName);
        return test;
    }
 
    /**
     * Author : Vinny
     *
     * This method writes the report data to the specified HTML file
     * and finalizes the ExtentReports instance.
     * It must be called at the end of test execution to save the report.
     */
    public static void extentReportFlush() {
        report.flush();
    }
 
    /**
     * Author : Vinny
     *
     * This method captures a screenshot of the current browser window,
     * saves it to a specified directory, and returns the file path.
     *
     * @param filename The name for the screenshot file, appended with a timestamp for uniqueness.
     * @return String The path of the saved screenshot file.
     */
    public static String captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
 
        String destPath = "./" + name;
 
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
 
        // Create the screenshots directory if it doesn't exist
        File screenshotsDir = new File(System.getProperty("user.dir") + "/reports");
 
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
 
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }
 
    /**
     * Author : Vinny
     *
     * This method attaches a screenshot to the ExtentReports instance
     * with a description and status information. The screenshot path is generated using the captureScreenShot method.
     *
     * @param filename The name of the screenshot file.
     * @param test The ExtentTest instance to which the screenshot is attached.
     * @param description The description of the screenshot or the related action.
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}