package Regression.Master;


import Login.Menu;
import Pages.Customer;
import com.relevantcodes.extentreports.ExtentReports;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Utility.Chromedriver.loginfun;


/**
 * Created by user on 18/05/2017.
 */
public class CustomerTest {

    WebDriver driver;
    //static WebDriver driver;

    @BeforeClass
    //public static void customerfunc(WebDriver driver)
    public void login() {
        driver = loginfun();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Menu menu = new Menu(driver);

        menu.setClickmaster();
        menu.setClickcustomer();
        menu.setClickaddnewcust();

    }

    /* Login login=new Login(driver);
     login.setTxtUserid("swapnil@tcrafttechnologies.com");
     login.setTxtpassword("tcraft123");
     login.clicksignin();
*/
    @Test(dataProvider = "getdata")
    public void customer(String customername, String address, String contno, String contname, String contno2, String contname2,
                         String email, String state, String city, String nationality, String pincode) {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Customer c = new Customer(driver);

        c.setTxtcustomername(customername);
        c.setTxtcustomeraddress(address);
        c.setTxtcontno(contno);
        c.setTxtcontname(contname);
        c.setTxtcontno2(contno2);
        c.setTxtcontname2(contname2);
        c.setTxtemail(email);
        c.setSelectstate(state);
        c.setSelectcity(city);
        c.setTxtnatinality(nationality);
        c.setTxtpincode(pincode);
        c.setBtnsave();
        c.setClickconfirm();
    }

    @DataProvider

    public String[][] getdata() throws IOException {

        FileInputStream f = new FileInputStream("Exelsheet/Login.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(f);

        HSSFSheet worksheet = workbook.getSheet("Sheet3");

        int rowcount = worksheet.getPhysicalNumberOfRows();

        String data[][] = new String[rowcount - 1][11];

        for (int i = 1; i < rowcount; i++) {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell customername = row.getCell(0);

            if (customername == null) {
                data[i - 1][0] = "";
            } else {
                customername.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][0] = customername.getStringCellValue();
            }




        }
        return data;
    }
}









