package OpenMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//div[@id='apps']//a")
    public List<WebElement> applications;


    public void clickApplication(String expectedName){
        for(WebElement app: applications){
            if(app.getText().trim().equals(expectedName)){
                app.click();
                break;
            }
        }
    }
}

