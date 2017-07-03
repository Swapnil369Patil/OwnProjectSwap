package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.xml.bind.annotation.W3CDomHandler;

/**
 * Created by user on 17/05/2017.
 */
public class Click {

    WebDriver driver;
    @Test
    public void loginfun()
    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://travel.tfleet.in/");

        driver.findElement(By.xpath("//*[@id='Email_Id']")).sendKeys("snejdhv01@gmail.com");

        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("tcraft123");

        driver.findElement(By.xpath("//*[@id='btnSubmit1']")).click();

        driver.manage().window().maximize();

        driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[3]/a/span")).click();

        driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[3]/ul[1]/li/a")).click();


    }

}
