package OpenMRS.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="/Users/tentchotenev/Desktop/codefish/codefishProjectInternship/src/test/resources/features",
        glue = "OpenMRS/steDef",
        //dryRun = true,
//        tags = "@regression",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class Runner {
}
