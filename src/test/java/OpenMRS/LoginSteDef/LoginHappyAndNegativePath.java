package OpenMRS.LoginSteDef;

import OpenMRS.LoginPages.loginPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import javax.swing.text.Utilities;

public class LoginHappyAndNegativePath {
    WebDriver driver= DriverHelper.getDriver();
    loginPage loginPage=new loginPage(driver);
    @When("user provide wrung username {string} and password {string} and select Location {string} and click login button and Validate the Alert {string}")
    public void user_provide_wrung_username_and_password_and_select_location_and_click_login_button_and_validate_the_alert
            (String username ,String password,String location,String alert) throws InterruptedException {
        loginPage.LoginNegativePath(username,password,location,alert);
    }
    @Then("user user click cant long in button validate the message {string} then click okay button")
    public void user_user_click_cant_long_in_button_validate_the_message_then_click_okay_button(String alert) {
        loginPage.clickCantLoginButton(alert);
    }
    @Then("user click  Open mrs title logo to clean the userN and Password input boxes")
    public void user_click_open_mrs_title_logo_to_clean_the_user_n_and_password_input_boxes() {
        loginPage.logoClick();
    }






    @Given("user provide username and password and select Location {string} and click login button Then validate the home page is visible {string}")
    public void user_provide_username_and_password_and_select_location_and_click_login_button_then_validate_the_home_page_is_visible
            (String location, String title) throws InterruptedException {
      loginPage.LoginHappyPath(driver, ConfigReader.ReadProperty("username"),ConfigReader.ReadProperty("password"),location,title);
    }



}
