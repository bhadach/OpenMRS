package OpenMRS.stepDef;

import OpenMRS.pages.FindPatientPage;
import OpenMRS.pages.HomePage;
import OpenMRS.pages.PatientPage;
import Utils.DriverHelper;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class SearchStepDef {
    WebDriver driver = DriverHelper.getDriver();
    HomePage homePage = new HomePage(driver);
    FindPatientPage findPatientPage = new FindPatientPage(driver);
    PatientPage patientPage = new PatientPage(driver);

    @Given("user clicks Find Patient Record application")
    public void user_clicks_find_patient_record_application() {
        homePage.findPatient();
    }

    @Then("user searches for a patient {string}")
    public void user_searches_for_a_patient(String patientName) {
        findPatientPage.searchPatient(patientName);

    }

    @Then("clicks on the patient profile")
    public void clicks_on_the_patient_profile() {
        findPatientPage.clickOnProfile();
    }

    @Then("user validates the patient name is visible")
    public void user_validates_the_patient_name_is_visible() {
        patientPage.nameIsVisible();
    }
}
