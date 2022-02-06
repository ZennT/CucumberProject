




package runners;
//important to run from this class to generate reports

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // junitten geliyor
@CucumberOptions(
//        features = " PATH OF FEATURE",
//        glue = "PATH OF THE STEP DEFINITIONS"

        //cucumber reprts icin bu plugin ekliyoruz
        // report icin runner classd an calistirmak zorundayiz
//        plugin is used for adding extra power to framework
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failedRerun.txt"  // generates a text file under target folder that will have only failed scenarios
        },
        features = "./src/test/resources/features",  // // absolute path de kullanilabilir
        glue = {"stepdefinitions", "hooks"}, // absolute path de kullanilabilir mi????  NOOO
        tags = "@excel_login",  // --> senaryo flower_search veya teapot_search seklinde taglenmisse calisir
        dryRun = false



//--> when we add a new step make this true,
        // it checks the code without opening the browser
//        dryRun = false   --> dryrun yazmamakla ayni, this is default behavior
//always run dryrun false for actual test result
        //dryrun true make quick checks for syncronization
        // tags = "teapot_search and flower_search"  --> hic test calismaz cunku ikisinin de ayni anda oldugu bir senaryo yok
        // @wip  --> has no logic, not a special tag, just a name given by us
        //


)


public class Runner {


}
/*Runner is used to run the feature files(Test Cases)
 *@RunWith   : This makes the class runnable.
 *@CucumberOptions :
 * -add path of features folder and step definitions folder,
 * -tags
 * -dryRun
 * -Report plugins
 * -failedRunner plugin
 * ----------------
 * What is the role of ?
 * -features : path of features folder.
 * -glue     : path of step definitions folder
 * -tags     : to run individual or multiple features or scenarios
 * For example, if i pass same tag to multiple feature, then all features with that tag will run
 * -dryRun   : to check if there is any missing step definition(JAVA code)
 *           : dryRun can be true or false
 *           : dryRun = false default behaviour. Runs the test on hte browser while checking the missing steps
 *           : dryRun = true do not run tests on the browser and check if there is any missing step definition

 * */
