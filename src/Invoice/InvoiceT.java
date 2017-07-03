package Invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 01/06/2017.
 */
public class InvoiceT {

    WebDriver driver;

    @FindBy(xpath = ".//*[@id='txtauto']")
    WebElement txtcustomername;

    @FindBy(xpath = ".//*[@id='txtTripNo']")
    WebElement txttripno;

   @FindBy(xpath = ".//*[@id='ArlnInv']/div/div[1]/h4/a")
    WebElement clickairline;

    @FindBy(xpath = ".//*[@id='txtInvDate']")
    WebElement txtinvoicedate;

    @FindBy(xpath = ".//*[@id='btnAMP']")
    WebElement clickradiobutton;

    @FindBy(xpath = ".//*[@id='airlinerakesh']")
    WebElement txtticket1;

    @FindBy(xpath = ".//*[@id='airlineatul']")
    WebElement txtticket2;

    @FindBy(xpath = ".//*[@id='Atxt_PNR_No1970']")
    WebElement txtpnr;

    @FindBy(xpath = ".//*[@id='Atxt_BasicFare1970']")
    WebElement txtbasicfare;

    @FindBy(xpath = ".//*[@id='Atxt_JDate1970']")
    WebElement txtjourneydate;

    @FindBy(xpath = ".//*[@id='Atxt_BkingChrgs1970']")
    WebElement txtbookcharge;

    @FindBy(xpath = ".//*[@id='Atxt_Disc1970']")
    WebElement txtdicount;

    @FindBy(xpath = ".//*[@id='btnValidateAir0']")
    WebElement btnsubmit;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;




    public InvoiceT(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setTxtcustomername(String customername)
    {
        txtcustomername.sendKeys(customername);
        driver.findElement(By.xpath(".//*[@id='ui-id-3']")).click();
    }

    public void setTxttripno(String tripno)
    {
        txttripno.sendKeys(tripno);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/ul[2]/li[1]")).click();
    }
    public void setClickairline()
    {
        clickairline.click();
    }
    public void setTxtinvoicedate(String date)
    {
        txtinvoicedate.sendKeys(date);
    }
    public void setClickradiobutton()
    {
        clickradiobutton.click();
    }
    public void setTxtticket1(String ticket1)
    {
        txtticket1.sendKeys(ticket1);
    }
    public void setTxtticket2(String ticket2)
    {
        txtticket2.sendKeys(ticket2);
    }
    public void setTxtpnr(String pnr)
    {
        txtpnr.sendKeys(pnr);
    }
    public void setTxtbasicfare(String bfare)
    {
        txtbasicfare.sendKeys(bfare);
    }
    public void setTxtjourneydate(String date1)
    {
        txtjourneydate.sendKeys(date1);
    }
    public void setTxtbookcharge(String bookcharge)
    {
        txtbookcharge.sendKeys(bookcharge);
    }
    public void setTxtdicount(String discount)
    {
        txtdicount.sendKeys(discount);
    }
    public void setBtnsubmit()
    {
        btnsubmit.click();
    }
    public void setBtnsave()
    {
        //btnsave.click();
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",btnsave);

    }
    public void setClickconfirm()
    {
        //clickconfirm.click();
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",clickconfirm);
    }
}
