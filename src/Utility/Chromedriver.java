package Utility;

import Login.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 16/05/2017.
 */
public class Chromedriver {

    static WebDriver driver;
    public static WebDriver loginfun()
    {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");// this 3 line code for avoiding warning
        System.setProperty("org.apache.commons.logging.Log",
                "org.apache.commons.logging.impl.Jdk14Logger");

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://travel.tfleet.in/");

        driver.manage().window().maximize();

        Login login = new Login(driver);
        login.setTxtUserid("swapnil@tcrafttechnologies.com");
        login.setTxtpassword("tcraft123");
        login.clicksignin();
    return driver;

    }

}
