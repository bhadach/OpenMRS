package OpenMRS.stepDef;

import OpenMRS.pages.HomePage;
import OpenMRS.pages.LoginPage;
import OpenMRS.pages.RegisterPage;
import Utils.DriverHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterStepDef {
    WebDriver driver = DriverHelper.getDriver();

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    RegisterPage registerPage = new RegisterPage(driver);


    @When("user provides {string} as patients Given name and {string} as family name")
    public void user_provides_as_patients_given_name_and_as_family_name(String givenName, String familyName) throws InterruptedException {
        registerPage.patientName(givenName,familyName);


    }
    @Then("user selects {string} as patient's gender")
    public void user_selects_as_patient_s_gender(String gender) {
        registerPage.selectGender(gender);
        registerPage.nextButton.click();
    }
    @Then("user provides the patients birth date {string},{string} and {string}")
    public void user_provides_the_patients_birth_date_and(String birthDay, String birthMonth, String birthYear) {
        registerPage.insertBirthDate(birthDay,birthMonth,birthYear);
        registerPage.nextButton.click();
    }
    @Then("user input the patients address {string},{string},{string},{string},{string}")
    public void user_input_the_patients_address(String address, String city, String state, String country, String postalCode) {
        registerPage.insertPatientAddress(address,city,state,country,postalCode);
        registerPage.nextButton.click();
    }
    @Then("user enters the patients phone number {string}")
    public void user_enters_the_patients_phone_number(String phoneNumber) {
        registerPage.enterPatientPhoneNumber(phoneNumber);
        registerPage.nextButton.click();
    }
    @Then("user selects the patients relationship type {string} and persons name {string}")
    public void user_selects_the_patients_relationship_type_and_persons_name(String relationshipType, String personName) {
        registerPage.selectRelationshipTypeAndName(relationshipType,personName);
        registerPage.nextButton.click();
    }
    @Then("user confirms the patient's information")
    public void user_confirms_the_patient_s_information() {
        registerPage.confirmPatientInfo();
    }


    @And("user clicks register a patient application")
    public void userClicksRegisterAPatientApplication() throws InterruptedException {
        homePage.applications.get(3).click();
        Thread.sleep(2000);
    }
}
