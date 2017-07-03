package Enquiry;

import Login.Menu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;


import static Date.EnquiryFromdate.fromdatefun;
import static Date.EnquiryTodate.todatefun;
import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 30/05/2017.
 */
public class EnquiryTest {

    WebDriver driver;
    @Test
    public void login() throws ParseException {
        driver=loginfun();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Menu menu=new Menu(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        menu.setClickenquiry();
        menu.setClickaddnewenquiry();

        Enquiry en=new Enquiry(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        en.setTxtcustomername("Rajendra");
        en.setTxtsubject("jfdfsdf");
        en.setTxtenquirydetails("dsfsdffg");
        en.setTxtsource("pune");
        en.setTxtdestination("Banglore");
        fromdatefun(driver, "20/10/2000");
        todatefun(driver, "20/10/2020");

        en.setClickairline();
        en.setClickbus();
        en.setClickcar();
        en.setClickhotel();
        en.setClicktrain();
        en.setBtnsave();
        en.setClickconfirm();
    }
}
