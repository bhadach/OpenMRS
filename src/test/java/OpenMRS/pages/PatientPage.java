package OpenMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientPage {
    public PatientPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "h1")
    WebElement headerName;

    public void nameIsVisible(){
        headerName.isDisplayed();
    }
}
