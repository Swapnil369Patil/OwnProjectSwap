package Admin;

import Login.Menu;
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
 * Created by user on 22/05/2017.
 */
public class ChangePasswordTest {

    WebDriver driver;
@BeforeClass
    public void login() {

    driver = loginfun();

    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    Menu menu = new Menu(driver);

    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    menu.setClickadmin();
    menu.setClickchangepass();
}

     @Test(dataProvider = "getdata")
            public void  changepassword(String oldpass)/*String newpass,String confirmpass*/
     {

        ChangePassword c=new ChangePassword(driver);

    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        c.setTxtoldpass(oldpass);
        //c.setTxtnewpass(newpass);
       // c.setTxtconfirmpass(confirmpass);
        c.setBtnsave();
        c.setClickconfirm();


    }

    @DataProvider

    public String[][] getdata() throws IOException {

        FileInputStream file=new FileInputStream("Exelsheet/Login.xls");

        HSSFWorkbook workbook=new HSSFWorkbook(file);

        HSSFSheet worksheet=workbook.getSheet("Changepass");

        int rowcount=worksheet.getPhysicalNumberOfRows();

        String data[][]=new String[rowcount-1][1];

        for(int i=1;i<rowcount;i++)
        {
            HSSFRow row=worksheet.getRow(i);

            HSSFCell oldpass=row.getCell(0);

            if (oldpass==null)
            {
                data[i-1][0]="";
            }else
            {
                oldpass.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][0]=oldpass.getStringCellValue();
            }


        }
        return data;

    }
}
