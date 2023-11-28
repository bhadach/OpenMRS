package Utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

public class BrowserUtils {
    public static  String getText(WebElement element){
        return element.getText().trim();

    }

    public static void selectBy(WebElement location,String value, String methodName){
        Select select=new Select(location);
        switch (methodName){
            case "text":
                select.selectByVisibleText(value);break;
            case "value":
                select.selectByValue(value);break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));break;
            default:
                System.out.println("your method is not matching with text ,value,or index ");
        }
    }
    public static String getTitleWithJS(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.title").toString().trim();

    }
    public static void clickWithJs(WebDriver driver,WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);

    }
    public static void scrollIntoView(WebDriver driver,WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }
    public static void switchWindow(WebDriver driver,String title){
        Set<String> mainIds =driver.getWindowHandles();
         for (String id:mainIds){
             driver.switchTo().window(id);
             if (driver.getTitle().contains(title)){
                 break;
             }
         }
    }

   public static  void getScreenShot(WebDriver driver,String packageName){
       File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       String location =System.getProperty("src/test/java/"+packageName+"/");
       try {
           FileUtils.copyFile(file,new File(location+System.currentTimeMillis()));
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public static  void getScreenShotCucumber(WebDriver driver, Scenario scenario){
       Date date=new Date();
       String ScreenShotFileName=date.toString().replace(" ","-").replace(":","-");
       if (scenario.isFailed()){
           File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           try {
               FileUtils.copyFile(screenShotFile,new File("src/test/java/screenshot/"+ScreenShotFileName+".png"));
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
   }

}
