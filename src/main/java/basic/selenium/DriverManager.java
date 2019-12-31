package basic.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        //driver.manage().window().maximize();  //maximize does not work properly with Mac
        driver.manage().deleteAllCookies();

        driver.get("https://www.bestbuy.com");

        String title = driver.getTitle();
        System.out.println("Page title is: "+title);

        String pageTitle = "Best Buy | Official Online Store | Shop Now & Save";
        if(title.equals(pageTitle)){
            System.out.println("Page title is correct");
        }
        else {
            System.out.println("Page title is incorrect");
        }

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }


        driver.close();
        driver.quit();


    }
}
