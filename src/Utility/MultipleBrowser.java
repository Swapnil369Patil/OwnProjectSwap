package Utility;

import Login.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 10/06/2017.
 */
public class MultipleBrowser {

   static WebDriver driver;

    public static WebDriver beforetestfun(String browser)
    {
        if(browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            System.setProperty("org.apache.commons.logging.Log",
                    "org.apache.commons.logging.impl.Jdk14Logger");

            driver=loginfun();

        }else if (browser.equals("firefox")) {
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            System.setProperty("org.apache.commons.logging.Log",
                    "org.apache.commons.logging.impl.Jdk14Logger");


            System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
           //System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");



           driver=new FirefoxDriver();
            driver.get("http://travel.tfleet.in/");
            driver.manage().window().maximize();

            Login login = new Login(driver);
            login.setTxtUserid("swapnil@tcrafttechnologies.com");
            login.setTxtpassword("tcraft123");
            login.clicksignin();


        }else {

            System.out.println("Not Found");
        }
        return driver;
        }

    }
