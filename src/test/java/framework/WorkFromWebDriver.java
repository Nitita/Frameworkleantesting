package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import utils.ConfigProperties;

import java.util.concurrent.TimeUnit;

public class WorkFromWebDriver {
    public static WebDriver driver;

    @BeforeTest
    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", ConfigProperties.getTestProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window();
        driver.get(ConfigProperties.getTestProperty("urlProd"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
