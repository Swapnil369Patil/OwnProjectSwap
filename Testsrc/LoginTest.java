import Login.Login;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by user on 30/04/2017.
 */
public class LoginTest {

    WebDriver driver;
    @Test(dataProvider = "getdata")
    public void login(String Userid,String Password)
    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://travel.tfleet.in/");

        Login login = new Login(driver);

        login.setTxtUserid(Userid);
        login.setTxtpassword(Password);
        login.clicksignin();


    }

    @DataProvider

    public Object[][] getdata() throws IOException {

        FileInputStream fis=new FileInputStream("Exelsheet/Login.xls");// create object for file and pass the path

        HSSFWorkbook workbook=new HSSFWorkbook(fis); //  create object for workbbok and pass the filename

        HSSFSheet worksheet=workbook.getSheet("sheet1");// get sheet of that workbook & put name of the sheet

        int Rowcount= worksheet.getPhysicalNumberOfRows(); // i declare 1 variable here

        String data[][]=new String[Rowcount-1][2]; // initialize the array here it

        for (int i=1;i<Rowcount;i++)
        {
            HSSFRow row=worksheet.getRow(i);//get row here

            HSSFCell UserCell=row.getCell(0);// get cell here
            if(UserCell==null)  //here we check if usercell is null
            {
                data[i-1][0]=""; // then on this point we pass value null
            }else
            {
                UserCell.setCellType(Cell.CELL_TYPE_STRING); //it will set celltype
                data[i-1][0]=UserCell.getStringCellValue(); //and will get string cell value
            }

            HSSFCell PassCell=row.getCell(1);
            if (PassCell==null)
            {
                data[i-1][1]="";
            }else
            {
                PassCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][1]=PassCell.getStringCellValue();

            }



        }







       return data;
    }





}


