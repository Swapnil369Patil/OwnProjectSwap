package AddTrip;

import Login.Menu;
import Trip.AddTrip;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import static Trip.PassangerDobfirst1.passangerdob1fun;


import static Trip.Tripdate.tripdatefun;
import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 31/05/2017.
 */
public class AddTripTest {

    WebDriver driver;
    @Test

    public void trip() throws ParseException {
        driver=loginfun();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Menu menu=new Menu(driver);

        menu.setClicktrip();
        menu.setClickAddnewtrip();

        AddTrip t=new AddTrip(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        t.setTxtcustomername("r");
        tripdatefun(driver, "03/07/2017");
        t.setTxtpassangermobno("2345678123");
        t.setTxtbookedby("karan");
        t.setTxtbookedbycontno("5675678976");
        t.setClickbus();
        t.setClickairline();
        t.setClickcar();
        t.setClickhotel();
        t.setClicktrain();
        t.setTxtfirstname("rakesh");
        t.setTxtlastname("bad");
        t.setTxtage("26");
        passangerdob1fun(driver, "20/11/2018");
        t.setTxtgender("Male");
        t.setTxtspecialrequest("egrg");
        t.setClickadd();
        t.setTxtfirstname1("atul");
        t.setTxtlastname2("bhavale");
        t.setTxtage2("25");
        t.setTxtdate("20/05/2015");
        t.setTxtgender2("Male");
        t.setTxtspecialrequest2("wergerg");
        t.setBtnsave();
        t.setClickconfirm();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        t.setClickAirline();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        t.setTxtairlinename("Air India"); //airline name is not pickup
        t.setTxtflightno("12");
        t.settxtfareclass("Business Class");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        t.setTxtorigin("Pune"); //Proper origin is not pickup
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        t.setTxtdestination("Delhi");//Proper destination is not pickup
        t.setTxtflexiblitydays("1");
        t.setTxtsuppliername("Swapnilpatil");
        t.setBtnsave2();
        t.setClickconfirm2();


    }
}
