package OpenMRS.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\esono\\IdeaProjects\\OpenMRS2\\src\\test\\resources\\features",
        glue = "OpenMRS/stepDef",
        dryRun = false,
//        tags = "@regression",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class Runner {
}
