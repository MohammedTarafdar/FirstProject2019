package basic.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

    public WebDriver driver;

    public static void main(String[] args) {

        CrossBrowser obj = new CrossBrowser();

        obj.initDriver("chrome");
        obj.launchURL("https://www.bestbuy.com");
        String title = obj.getPageTitle();
        System.out.println(title);
        obj.quitBrowser();

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

    public void launchURL(String url){
        driver.get(url);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void closeBrowser(){
        driver.close();
    }

    public void quitBrowser(){
        driver.quit();
    }


}
