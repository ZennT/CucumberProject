package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
//        Running Path : @target/failedRerun.txt
        features = "@target/failedRerun.txt",
        glue = {"stepdefinitions","Hooks"},
        dryRun = false
//        in failed rerun do not use any tag, we should not limit
)
public class FailedScenarioRunner {
}