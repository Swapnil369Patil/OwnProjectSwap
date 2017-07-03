package Admin;

import Login.Menu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 22/05/2017.
 */
public class EmailTest {

    WebDriver driver;

    @Test
    public  void email()
    {

        driver=loginfun();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Menu menu=new Menu(driver);

        menu.setClickadmin();
        menu.setClickemail();

        Email e=new Email(driver);

        e.setClickcheckb1();
        e.setClickcheckb2();
        e.setClickcheckb3();
        e.setClickcheckb4();
        e.setBtnsave();
        e.setClickconfirm();
    }
}
