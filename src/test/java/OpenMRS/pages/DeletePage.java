package OpenMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage {

    public DeletePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'Delete')]")
    WebElement deletePatient;

    @FindBy(css = "#delete-reason")
    WebElement deleteReason;

    @FindBy(xpath = "//div[@id='simplemodal-container']//button[contains(text(),'Confirm')]")
    WebElement confirmButton;


    public void setDeletePatient(String deleteReason){
        deletePatient.click();
        this.deleteReason.sendKeys(deleteReason);
        confirmButton.click();
    }


}
