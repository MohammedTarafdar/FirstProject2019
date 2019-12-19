package basic.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

    public WebDriver driver;

    public static void main(String[] args) {

        CrossBrowser obj = new CrossBrowser();
        //WebDriver driver = obj.initDriver("chrome");
        WebDriver driver = obj.initDriver("firefox");
        driver.get("https://www.bestbuy.com");

    }

    public WebDriver initDriver(String browser){

        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("This "+browser+" is not found");
        }

        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();

        return driver;

    }




}
