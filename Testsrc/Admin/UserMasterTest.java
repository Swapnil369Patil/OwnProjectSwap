package Admin;

import Login.Menu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 22/05/2017.
 */
public class UserMasterTest {

    WebDriver driver;

    @Test
    public  void usermaster()
    {
        driver=loginfun();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);



        Menu menu=new Menu(driver);

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        menu.setClickadmin();
        menu.setClickusermaster();
        menu.setClickaddnewusermaster();

        UserMaster u=new UserMaster(driver);

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        u.setTxtempname("Russ");
        u.setTxtemail("asd@jk.com");
        u.setTxtpass("qwertyui");
        u.setTxtconfirmpas("qwertyui");
        u.setTxtdesignation("Manager");
        u.setTxtmobno("12345236587");
        u.setTxtaddress("uk England");
        u.setTxtaddinfo("uiugtfhv");
        u.setBtnsave();
        u.setClickconfirm();
    }
}
