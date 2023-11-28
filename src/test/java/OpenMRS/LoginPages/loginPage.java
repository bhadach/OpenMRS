package OpenMRS.LoginPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class loginPage {
    public loginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//a//img")
WebElement logo;

@FindBy (xpath = "//input[@id='username']")
    WebElement usernameBox;

@FindBy(xpath = "//input[@id='password']")
    WebElement password;

@FindBy(xpath = "//ul[@id='sessionLocation']//li")
    List<WebElement> locations;

@FindBy (xpath = "//input[@id='loginButton']")
    WebElement loginButton;
@FindBy(xpath = "//a[@id='cantLogin']")
    WebElement CantLoginButton;

@FindBy(xpath = "//div[@id='error-message']")
WebElement alert;
    @FindBy(xpath = "//p[contains(text(),'Please contact')]")
    WebElement text;
    @FindBy(xpath ="//button[contains(text(),'Okay')]")
    WebElement okayButton;
public void LoginNegativePath(String username ,String password,String location,String alert) throws InterruptedException {
    usernameBox.sendKeys(username);
    this.password.sendKeys(password);
    Thread.sleep(2000);
    for (int i =0;i<locations.size();i++){
        if (locations.get(i).getText().equals(location)){
            locations.get(i).click();
            break;
        }
    }
    loginButton.click();
    Assert.assertEquals(alert,this.alert.getText());
}
public void logoClick(){
    logo.click();
}
public void clickCantLoginButton(String alert){
    CantLoginButton.click();
    Assert.assertEquals(alert,text.getText());
    okayButton.click();

}

public void LoginHappyPath(WebDriver driver,String username,String password, String location,String title) throws InterruptedException {
    usernameBox.sendKeys(username);
    this.password.sendKeys(password);
    Thread.sleep(2000);
    for (int i =0;i<locations.size();i++){
        if (locations.get(i).getText().equals(location)){
            locations.get(i).click();
            break;
        }
    }
    loginButton.click();
   Assert.assertEquals(title,driver.getTitle().trim());
}





}
