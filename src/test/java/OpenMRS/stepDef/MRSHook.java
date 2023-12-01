package OpenMRS.stepDef;

import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class MRSHook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void Setup(){

        driver.get(ConfigReader.ReadProperty("mrsURL"));
    }
    @After
    public void TearDown(Scenario scenario){
        BrowserUtils.getScreenShotCucumber(driver, scenario);
        driver.quit();
    }
}
