package OpenMRS.stepDef;

import OpenMRS.pages.DeletePage;
import Utils.DriverHelper;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class DeleteStepDef {

    WebDriver driver = DriverHelper.getDriver();

    DeletePage deletePage = new DeletePage(driver);

    @Then("user clicks the delete patient button and types the reason as {string} and clicks confirm button")
    public void user_clicks_the_delete_patient_button_and_types_the_reason_as_and_clicks_confirm_button(String deleteReason) {
        deletePage.setDeletePatient(deleteReason);
    }
}
