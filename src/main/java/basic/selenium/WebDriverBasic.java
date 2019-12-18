package basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/MyDevelopment/FirstProject/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bestbuy.com");

        driver.manage().window().fullscreen();
        //Thread.sleep(5000);
        driver.quit();




    }


}
