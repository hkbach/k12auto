package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.libs.BrowserFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Hooks {

    private static WebDriver driver;
    public static Scenario scenario;
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void BeforeScenario(Scenario scenario) {
        try {
            //Open browser
            driver = BrowserFactory.getCurrentDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            //Make video recording
//            Hooks.scenario = scenario;
//            String scenarioName = scenario.getName();
//            startRecord(scenarioName);

        } catch (Exception ex) {
            //LOGGER.error(ex.getMessage(), ex);
        }

    }

    @After
    public void AfterScenario(Scenario scenario) throws IOException {

        //Take Screenshot
//        Hooks.scenario = scenario;
//        String scenarioName = scenario.getName();
//        screenshot(scenarioName);

//        //Close Record
//        stopRecord();

        //Close browser
        BrowserFactory.closeCurrentBrowser();
    }

}