package OpenMRS.stepDef;

import OpenMRS.pages.HomePage;
import Utils.DriverHelper;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageStepDef {
    WebDriver driver = DriverHelper.getDriver();
    HomePage homePage = new HomePage(driver);

    @When("{string} matches the actual name of the application user clicks to open new page")
    public void matches_the_actual_name_of_the_application_user_clicks_to_open_new_page(String expectedName) {
        homePage.clickApplication(expectedName);
    }

}
