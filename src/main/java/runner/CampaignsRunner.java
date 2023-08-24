package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/features/Campaigns.feature",}
        ,glue = {"stepDefinition"}
        ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:test_result/HtmlReport/Test_Report.html"}
)
public class CampaignsRunner {

}

