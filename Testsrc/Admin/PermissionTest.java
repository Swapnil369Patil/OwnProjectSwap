package Admin;

import Login.Menu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 22/05/2017.
 */
public class PermissionTest {

    WebDriver driver;

    @Test
    public  void permission()
    {
        driver=loginfun();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Menu menu=new Menu(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        menu.setClickadmin();
        menu.setClickpermission();

        Permission p=new Permission(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        p.setTxtusername("Russ");
        p.setClickcheck1();
        p.setClickcheck2();
        p.setClickcheck3();
        p.setClickcheck4();
        p.setClickcheck5();
        p.setClickcheck6();
        p.setBtnsave();
        p.setClickconfirm();


    }
}
