package Regression.Master;

import Login.Login;
import Pages.Supplier;
import Utility.MultipleBrowser;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.event.MenuKeyListener;

import static Utility.Chromedriver.loginfun;
import static Utility.MultipleBrowser.beforetestfun;

import Login.Menu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 15/05/2017.
 */
public class SupplierTest {

WebDriver driver;
    //Static WebDriver driver;
    @Test
    public  void login() {
        //driver = loginfun();

       driver = beforetestfun("firefox");


       /* *//**//*System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://travel.tfleet.in/");

     // driver.manage().window().maximize();
        Login login = new Login(driver);
        login.setTxtUserid("swapnil@tcrafttechnologies.com");
        login.setTxtpassword("tcraft123");
        login.clicksignin();*//**//*
    }*/

        //@Test
        // public static void supplierfunc (WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Menu menu = new Menu(driver);
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        menu.setClickmaster();
        menu.setClicksupplier();
        menu.setClickaddnew();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
        @Test(dataProvider = "getdata")
                public void supplier(String supplierr,String address,String state)

    {
        Supplier supplier = new Supplier(driver);

        supplier.clickClickbus();
        supplier.setClickTrain();
        supplier.setClickairline();
        supplier.setClickcar();
        supplier.setTxtsupplier(supplierr);
        supplier.setTxtaddress(address);
        supplier.setTxtstate(state);
        supplier.setTxtcity("Pune");
        supplier.setTxtfaxno("3454");
        supplier.setTxtservicetax("34");
        supplier.setTxtcontact1("67589098755");
        supplier.setTxtcontname("anil");
        supplier.setTxtcontct2("34758996085");
        supplier.setTxtcontname2("aju");
        supplier.setTxtemail("bn@fg.mm");
        supplier.setTxtwebsite("yyydf");
        supplier.setTxtbankname("Axis Bank");
        supplier.setTxtaccno("432534335534");
        supplier.setTxtbranchname("hinjewadi");
        supplier.setTxtbranchaddress("qwert");
        supplier.setTxtmicrno("345");
        supplier.setTxtifsccode("435");
        supplier.setClicksave();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        supplier.setclickyes();
    }

       /* String expected="Supplier Added Successfully";
        String actual="";
        try {

            actual = driver.findElement(By.xpath(".*//*//**//*[@id='msg']")).getText();
            //System.out.println(expected);
        }
        catch (Exception e)
        {
            System.out.println(actual);
            e.printStackTrace();
        }
      Assert.assertEquals(actual, expected);*/



    @DataProvider

    public String[][]getdata() throws IOException {

        FileInputStream fil=new FileInputStream("Exelsheet/Login.xls");

        HSSFWorkbook workbook=new HSSFWorkbook(fil);

        HSSFSheet worksheet=workbook.getSheet("Supplier");

        int rowcount=worksheet.getPhysicalNumberOfRows();

        String data[][]=new String[rowcount-1][3];

        for(int i=1;i<rowcount;i++){

            HSSFRow row=worksheet.getRow(i);

            HSSFCell supplier=row.getCell(0);

            if(supplier==null){
                data[i-1][0]="";

            }else
            {
                supplier.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][0]=supplier.getStringCellValue();
            }

            HSSFCell address=row.getCell(1);

            if(address==null){
                data[i-1][1]="";
            }else
            {
                address.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][1]=address.getStringCellValue();
            }

            HSSFCell state=row.getCell(2);

            if (state==null)
            {
                data[i-1][2]="";
            }else
            {
                state.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][2]=state.getStringCellValue();
            }
        }
return data;



    }
    }










