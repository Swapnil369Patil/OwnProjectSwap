package Account;

import Login.Menu;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 02/06/2017.
 */
public class TransactionTest {

    WebDriver driver;

    @Test
    public void trans()
    {
        driver=loginfun();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Menu menu=new Menu(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        menu.setClickaccount();
        menu.setClicktransaction();
        menu.setClickaddnewtransaction();

        Transaction tr=new Transaction(driver);

        tr.setTxttransactiondate("02/06/2017");
        tr.setTxtpaymentcategoury("Credit");
        tr.setTxtbankname("Bank of Baroda");
        tr.setTxtAccno("456546456");
        tr.setTxtpaytype("Cash");
        tr.setTxtremark("fefewfew");
        tr.setTxtamt("9000");
        tr.setBtnsave();
        tr.setClickconfirm();
        
    }
}
