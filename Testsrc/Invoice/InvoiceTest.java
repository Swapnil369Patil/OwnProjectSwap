package Invoice;

import Login.Menu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 01/06/2017.
 */
public class InvoiceTest {

    WebDriver driver;

    @Test

    public void login()
    {
        driver=loginfun();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Menu menu=new Menu(driver);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        menu.setClickinvoice();
        menu.setClickAddnewinvoice();


        InvoiceT i=new InvoiceT(driver);

        i.setTxtcustomername("r");
        i.setTxttripno("t");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        i.setClickairline();
        i.setTxtinvoicedate("02/06/2017");//this date is not pickup
        i.setClickradiobutton();
        i.setTxtticket1("456");
        i.setTxtticket2("7548");
        i.setTxtpnr("458");
        i.setTxtbasicfare("975");
        i.setTxtjourneydate("03/06/2017");
        i.setTxtbookcharge("76");
        i.setTxtdicount("100");
        i.setBtnsubmit();
        i.setBtnsave();
        i.setClickconfirm();
    }
}
