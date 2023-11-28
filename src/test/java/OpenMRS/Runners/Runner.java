package OpenMRS.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\bhada\\IdeaProjects\\MRS\\src\\test\\resources\\MRSLogin",
        glue = "OpenMRS/LoginSteDef",
        //dryRun = true,
        tags = "@regression",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class Runner {
}
