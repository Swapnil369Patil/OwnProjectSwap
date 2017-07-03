package Regression.Master;

import Login.Menu;
import Pages.TaxMaster;
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
 * Created by user on 20/05/2017.
 */
public class TaxMasterTest {

    WebDriver driver;

    @BeforeClass
    public void taxmasterlogin() {
        driver = loginfun();

        Menu menu = new Menu(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        menu.setClickmaster();
        menu.setCliccktaxmaster();
        menu.setClickaddnewtaxmaster();
    }

        @Test (dataProvider = "getdata")
                public void taxmaster(String taxname,String taxratetype/*,String taxrate,String effdatefrm,String effdateto*/ ) {

            TaxMaster t = new TaxMaster(driver);

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            t.setTxttaxname(taxname);
            t.setTxttaxratetype(taxratetype);
           /* t.setTxtaxrate(taxrate);
            t.setTxteffedatefrom(effdatefrm);
            t.setTxteffedateto(effdateto);
            t.setBtnsave();
            t.setClickconfirm();
*/
        }
        @DataProvider

    public String[][] getdata() throws IOException {

            FileInputStream file=new FileInputStream("Exelsheet/Login.xls");

            HSSFWorkbook workbook=new HSSFWorkbook(file);

            HSSFSheet worksheet=workbook.getSheet("Sheet4");

            int rowcount=worksheet.getPhysicalNumberOfRows();

            String data[][]= new String[rowcount-1][2];

            for(int i=1;i<rowcount;i++){

                HSSFRow row=worksheet.getRow(i);

                HSSFCell taxname=row.getCell(0);

                if(taxname==null){
                    data[i-1][0]="";

                }else{
                    taxname.setCellType(Cell.CELL_TYPE_STRING);
                    data[i-1][0]=taxname.getStringCellValue();
                }

                HSSFCell taxratetype=row.createCell(1); //taxratetype value is not picking from exel sheet

                if(taxratetype==null){
                    data[i-1][1]="";

                }
                else {
                    taxratetype.setCellType(Cell.CELL_TYPE_STRING);
                    data[i-1][1]=taxratetype.getStringCellValue();
                }

            }
            return data;
    }
}
