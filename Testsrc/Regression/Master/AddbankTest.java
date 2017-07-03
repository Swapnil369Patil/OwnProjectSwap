package Regression.Master;

import Login.Menu;
import Pages.AddBank;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import org.apache.james.mime4j.field.address.Address;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Utility.Chromedriver.loginfun;
import static Utility.TakeScreenshot.takeScreenshot;

/**
 * Created by user on 19/05/2017.
 */
public class AddbankTest {

    WebDriver driver;

    @BeforeClass
    public  void login()
    {
        driver=loginfun();

        Menu menu = new Menu(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        menu.setClickmaster();
        menu.setClickBank();
        menu.setClickaddnewbank();
    }

    @Test(dataProvider = "getdata")
    public void addbank(String Bankname, String Acno, String address, String bankcontactno) throws IOException {

        ExtentReports extent = new ExtentReports("Extent-Report/report.html", true, NetworkMode.OFFLINE);
        ExtentTest test = extent.startTest("Add Bank Test", "Add bank Test for enter Input");
       /* driver = loginfun();

        Menu menu = new Menu(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        menu.setClickmaster();
        menu.setClickBank();
        menu.setClickaddnewbank();
*/

        AddBank b = new AddBank(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        b.setSelectbankname(Bankname);
        test.log(LogStatus.INFO, "Bank Name Enter as " + Bankname);
        b.setTxtAccno(Acno);
        test.log(LogStatus.INFO, "Acno Enter as " + Acno);
        b.setTxtAddress(address);
        test.log(LogStatus.INFO, "Address Enter as " + address);
        b.setTxtbankcontno(bankcontactno);
        test.log(LogStatus.INFO, "Bank Contact name Enter as " + bankcontactno);
        b.setBtnsave();
        b.setClickconfirm();

        test.log(LogStatus.INFO, "Snapshot below" + test.addScreenCapture("./screenshots/" + takeScreenshot(driver)));

        extent.endTest(test);
        extent.flush();

        String Expected = "";

        String Actual = "";

        try {

            Actual = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div")).getText();
            Assert.assertEquals(Actual.equals(Expected), "Bank Add Successfully"); // using this we check true and false result
            Assert.assertEquals(Actual, Expected); // using this we check actual and expected result


        } catch (Exception e) {

        }

        Assert.assertEquals(Actual, Expected);


    }
    @DataProvider
    public String[][] getdata() throws IOException {

        FileInputStream fis = new FileInputStream("Exelsheet/Login.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet worksheet = workbook.getSheet("Sheet2");

        int rowcount = worksheet.getPhysicalNumberOfRows();

        String data[][] = new String[rowcount - 1][4];
        for (int i = 1; i < rowcount; i++) {
            HSSFRow row = worksheet.getRow(i);


            HSSFCell Bankname = row.getCell(0);

            if (Bankname == null) {
                data[i - 1][0] = "";
            } else {
                Bankname.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][0] = Bankname.getStringCellValue();
            }
            HSSFCell Acno = row.getCell(1);
            if (Acno == null) {
                data[i - 1][1] = "";
            } else {
                Acno.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][1] = Acno.getStringCellValue();
            }
            HSSFCell address = row.getCell(2);
            if (address == null) {
                data[i - 1][2] = "";
            } else {
                address.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][2] = address.getStringCellValue();
            }
            HSSFCell bankcontactno = row.getCell(3);
            if (bankcontactno == null) {
                data[i - 1][3] = "";
            } else {
                bankcontactno.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][3] = bankcontactno.getStringCellValue();
            }

        }
        return data;
    }
}
