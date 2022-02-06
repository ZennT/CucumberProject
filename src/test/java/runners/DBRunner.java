package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // this is used for more readable reports or outputs
                "html:target/default-cucumber-reports.html",  // use this report
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"

        },
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@read_feature",
        dryRun = false
)

public class DBRunner {
}
