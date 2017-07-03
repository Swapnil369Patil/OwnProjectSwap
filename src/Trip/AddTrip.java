package Trip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 30/05/2017.
 */
public class AddTrip {

    WebDriver driver;

    @FindBy(xpath = ".//*[@id='ddl_CustNm1']")
    WebElement txtcustomername;

    @FindBy(xpath = ".//*[@id='ContNo_Wo91']")
    WebElement  txtpassangermobno;

    @FindBy (xpath = ".//*[@id='Item1_Bk_By']")
    WebElement txtbookedby;

    @FindBy (xpath = ".//*[@id='ContNo_Wo92']")
    WebElement txtbookedbycontno;

    @FindBy (xpath = ".//*[@id='chkBus']")
    WebElement clickbus;

    @FindBy (xpath = ".//*[@id='chkAir']")
    WebElement clickairline;

    @FindBy (xpath = ".//*[@id='chkCar']")
    WebElement clickcar;

    @FindBy (xpath = ".//*[@id='chkHotel']")
    WebElement clickhotel;

    @FindBy (xpath = ".//*[@id='chkRlway']")
    WebElement clicktrain;

    //passenger details

    @FindBy (xpath = ".//*[@id='PsgTab']/tbody/tr/td[1]/input")
    WebElement txtfirstname;

    @FindBy (xpath = ".//*[@id='PsgTab']/tbody/tr/td[2]/input")
    WebElement txtlastname;

    @FindBy (xpath = ".//*[@id='PsgTab']/tbody/tr/td[3]/input")
    WebElement txtage;

    @FindBy (xpath = ".//*[@id='PsgTab']/tbody/tr/td[5]/select")
    WebElement txtgender;

    @FindBy (xpath = ".//*[@id='PsgTab']/tbody/tr/td[6]/input")
    WebElement txtspecialrequest;

    @FindBy (xpath = ".//*[@id='btnPsgAdd']")
    WebElement clickadd;

    @FindBy (xpath = ".//*[@id='psngr_1__Psngr_FNm']")
    WebElement txtfirstname1;

    @FindBy (xpath = ".//*[@id='psngr_1__Psngr_LNm']")
    WebElement txtlastname2;

    @FindBy (xpath = ".//*[@id='psngr_1__Age']")
    WebElement txtage2;

    @FindBy (xpath = ".//*[@id='psngr_1__DOB']")
    WebElement txtdate;


    @FindBy (xpath = ".//*[@id='txtGender']")
    WebElement txtgender2;

    @FindBy (xpath = ".//*[@id='psngr_1__Special_Req']")
    WebElement txtspecialrequest2;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;

    // Airline
    @FindBy(xpath = "//div/div/div[2]/form/div/div[1]/h4/a")
    WebElement clickAirline;

    @FindBy(xpath = ".//*[@id='AC_Airline_0']")
    WebElement txtairlinename;

    @FindBy(xpath = ".//*[@id='AC_Airline_0']")
    WebElement txtflightno;

    @FindBy(xpath = ".//*[@id='busAir']/tbody/tr/td[3]/select")
    WebElement txtfareclass;

    @FindBy(xpath = ".//*[@id='AC_AFm_0']")
    WebElement txtorigin;

    @FindBy(xpath = ".//*[@id='AC_ATo_0']")
    WebElement txtdestination;

    @FindBy(xpath = ".//*[@id='busAir']/tbody/tr/td[6]/input")
    WebElement txtflexiblitydays;

    @FindBy(xpath = ".//*[@id='datetimepickerAir_0']/input")
    WebElement txtjourneydate;

    @FindBy(xpath = ".//*[@id='airlineSup0']")
    WebElement txtsuppliername;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave2;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm2;


    //Bus

    @FindBy(xpath = ".//*[@id='addBus']/div[1]/h4/a")
    WebElement clickBus;

    @FindBy(xpath = ".//*[@id='bustab']/tbody/tr/td[1]/input")
    WebElement txtoperatorname;

    @FindBy(xpath = ".//*[@id='BusType0']")
    WebElement clickbustype;

    @FindBy(xpath = ".//*[@id='bustab']/tbody/tr/td[3]/input")
    WebElement txtorigin2;

    @FindBy(xpath = ".//*[@id='bustab']/tbody/tr/td[4]/input")
    WebElement txtdestination2;

    @FindBy(xpath = ".//*[@id='txtdate']")
    WebElement clickjourneydate2;

    @FindBy(xpath = ".//*[@id='BusSup0']")
    WebElement clicksuppliername2;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave3;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm3;

    //Car

    @FindBy(xpath = ".//*[@id='addCar']/div[1]/h4/a")
    WebElement clickCar;

    @FindBy(xpath = ".//*[@id='Cartab']/tbody/tr[1]/td[1]/input")
    WebElement txtdutydescription;

    @FindBy(xpath = ".//*[@id='CarId0']")
    WebElement clickcarname;

    @FindBy(xpath = ".//*[@id='CarType0']")
    WebElement txtclickcartype;

    @FindBy(xpath = ".//*[@id='Cartab']/tbody/tr[1]/td[4]/input")
    WebElement txtpickuppoint;

    @FindBy(xpath = ".//*[@id='txtdate']")
    WebElement clickfromdate;

    @FindBy(xpath = ".//*[@id='txtdate1']")
    WebElement clicktodate;

    @FindBy(xpath = ".//*[@id='CarSup0']")
    WebElement clicksuppliername3;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave4;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm4;






    public AddTrip(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setTxtcustomername(String customername)
    {
        txtcustomername.sendKeys(customername);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='ui-id-5']")).click();

    }

    public void setTxtpassangermobno(String passangermobno)
    {
        txtpassangermobno.sendKeys(passangermobno);
    }
    public void setTxtbookedby(String bookby)
    {
        txtbookedby.sendKeys(bookby);
    }



    public void setTxtbookedbycontno(String bookbycontnno)
    {
        txtbookedbycontno.sendKeys(bookbycontnno);
    }
    public void setClickbus()
    {
        clickbus.click();
    }
    public void setClickairline ()  {
        clickairline.click();
    }
    public void setClickcar()
    {
        clickcar.click();
    }
    public void setClickhotel()
    {
        clickhotel.click();
    }
    public void setClicktrain()
    {
        clickhotel.click();
    }
    public void setTxtfirstname(String firstname) {
        txtfirstname.sendKeys(firstname);
    }
    public void setTxtlastname(String lastname)
    {
        txtlastname.sendKeys(lastname);
    }




    public void  setTxtage(String age)
    {
        txtage.sendKeys(age);
    }
    public void setTxtgender(String gender)
    {
        //txtgender.sendKeys(gender);
        Select combo=new Select(txtgender);
        combo.selectByVisibleText(gender);
    }
    public void setTxtspecialrequest(String specrequest)
    {
        txtspecialrequest.sendKeys(specrequest);
    }
    public void setClickadd()
    {
        clickadd.click();
    }

    public void setTxtfirstname1(String fname1) {
        txtfirstname1.sendKeys(fname1);
    }
    public void setTxtlastname2(String lname2)
    {
        txtlastname2.sendKeys(lname2);
    }
    public void setTxtage2(String age2)
    {
        txtage2.sendKeys(age2);
    }
    public void setTxtdate(String date){txtdate.sendKeys(date);}
    public void setTxtgender2(String gender2)
    {
        //txtgender2.sendKeys(gender2);
        Select combo=new Select(txtgender2);
        combo.selectByVisibleText(gender2);

    }
    public void setTxtspecialrequest2(String specrequest2)
    {
        txtspecialrequest2.sendKeys(specrequest2);
    }
    public void setBtnsave()
    {
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", btnsave);
    }
    public void setClickconfirm()
    {
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",clickconfirm);
    }

    //Airline
public void setClickAirline()
{
    //clickAirline.click();
    JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();",clickAirline);
}
    public void setTxtairlinename(String airlinename)
    {
        txtairlinename.sendKeys(airlinename);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='ui-id-4']")).click();
    }
    public void setTxtflightno(String flightno)

    {
        txtflightno.sendKeys(flightno);
    }
    public void settxtfareclass(String fareclass)
    {
        //clickfareclass.click();
        Select combo=new Select(txtfareclass);
        combo.selectByVisibleText(fareclass);
    }
    public void setTxtorigin(String origin)
    {
        txtorigin.sendKeys(origin);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='ui-id-443']")).click();
    }
    public void setTxtdestination(String destination)
    {
        txtdestination.sendKeys(destination);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='ui-id-527']")).click();
    }
    public void setTxtflexiblitydays(String days)
    {
        txtflexiblitydays.sendKeys(days);
    }
    public void setTxtjourneydate(String date)
    {
        txtjourneydate.sendKeys(date);
    }
    public void setTxtsuppliername(String supplier)
    {
        //txtsuppliername.sendKeys(supplier);
        Select combo=new Select(txtsuppliername);
        combo.selectByVisibleText(supplier);
    }
    public void setBtnsave2()
    {
        //btnsave.click();
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", btnsave2);

    }
    public void setClickconfirm2()
    {
        //clickconfirm2.click();
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", clickconfirm2);
    }











































}
