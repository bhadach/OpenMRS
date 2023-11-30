package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class DriverHelper {
    public static WebDriver driver;
    private DriverHelper(){};
    //u can not create an object from this class, which means you can not do any manipulations data in here
    public static WebDriver getDriver(){
        if (driver==null||((RemoteWebDriver)driver).getSessionId()==null){
           // String browser="chrome";
            switch (ConfigReader.ReadProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case"edge":
                    WebDriverManager.chromedriver().setup();
                    driver=new EdgeDriver();
                    break;

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().deleteAllCookies();
        }
        return driver;
    }
}
