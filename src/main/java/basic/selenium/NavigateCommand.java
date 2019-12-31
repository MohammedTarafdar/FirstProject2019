package basic.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        driver.navigate().to("https://bestbuy.com");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }

        driver.navigate().back();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }

        driver.navigate().forward();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }

        driver.navigate().refresh();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }

        driver.quit();
    }
}
