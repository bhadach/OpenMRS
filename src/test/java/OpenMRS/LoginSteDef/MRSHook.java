package OpenMRS.LoginSteDef;

import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class MRSHook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void Setup(){

        driver.get(ConfigReader.ReadProperty("mrsURL"));
    }
    @After
    public void TearDown(){
        driver.quit();
    }
}
