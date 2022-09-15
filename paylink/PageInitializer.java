package paylink;

import cap.utilities.SharedDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import paylink.pages.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class PageInitializer {
    private WebDriver driver;
    public static Scenario myScenario;
    public static LinkedHashMap<String, String> printTestDataMap = new LinkedHashMap<String, String>();

  //  public SignInPage signInPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public Lead_page leadpage;
    public supportPage supportpage;
    public Sign_Up signUp;
    public PageInitializer() {
        System.out.println("\n >>> PageInitializer  Constructor...");
        driver = SharedDriver.getDriver();
        initPages();
    }

    private void initPages() {
        //signInPage = new SignInPage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        leadpage=new Lead_page(driver);
        supportpage=new supportPage(driver);
        signUp=new Sign_Up(driver);
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (printTestDataMap.size() > 0) {
            for (Map.Entry<String, String> entry : printTestDataMap.entrySet()) {
                scenario.log(entry.getKey().concat(": ").concat(entry.getValue()));
            }
        }

        byte[] imageBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(imageBytes, "image/png", "");

        System.out.println("\n Scenario Outline: " + scenario.getName());
        System.out.println("\n Scenario Status: " + scenario.getStatus());
        /*if (scenario.getSourceTagNames().contains(Constants.LOGOUT_TAG)) {
            System.out.println(scenario.getSourceTagNames());
            signInPage.clickLogOut();
        }*/

    }

    //  @Before("not @API and not @Mobile and not @Desktop")
    @Before
    public void before(Scenario scenario1) {
        printTestDataMap.clear();
        myScenario = scenario1;
    }
}
