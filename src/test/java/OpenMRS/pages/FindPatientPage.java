package OpenMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindPatientPage {
    public FindPatientPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#patient-search")
    WebElement searchBar;
    @FindBy(xpath = "//td[.='Donald Duck']")
    WebElement patientName;

    public void searchPatient(String patientName){
        searchBar.sendKeys(patientName);
    }
    public void clickOnProfile(){
        patientName.click();
    }

}
