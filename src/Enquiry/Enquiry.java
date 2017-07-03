package Enquiry;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 27/05/2017.
 */
public class Enquiry {
    WebDriver driver;

    @FindBy (xpath = ".//*[@id='ddl_CustNm']")
    WebElement txtcustomername;

    @FindBy(xpath = ".//*[@id='Subject']")
    WebElement txtsubject;

    @FindBy(xpath = ".//*[@id='Enq_Dtls']")
    WebElement  txtenquirydetails;

    @FindBy(xpath = ".//*[@id='Source']")
    WebElement txtsource;

    @FindBy(xpath = ".//*[@id='Destination']")
    WebElement txtdestination;

    /*@FindBy(xpath = "")
    WebElement txtfromdate;

    @FindBy(xpath = "")
    WebElement txttodate;

    @FindBy(xpath = "")
    WebElement txtrevertdatetime;*/

    @FindBy(xpath = ".//*[@id='chkAir']")
    WebElement clickairline;

    @FindBy(xpath = ".//*[@id='chkBus']")
    WebElement clickbus;

    @FindBy(xpath = ".//*[@id='chkCar']")
    WebElement clickcar;

    @FindBy(xpath = ".//*[@id='chkHotel']")
    WebElement clickhotel;

    @FindBy(xpath = ".//*[@id='chkRlway']")
    WebElement clicktrain;

    @FindBy (xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;

  public Enquiry(WebDriver driver)
  {
      this.driver=driver;
      PageFactory.initElements(driver,this);
  }
   public void setTxtcustomername(String customername)
   {
      //txtcustomername.sendKeys(customername);
       Select combo=new Select(txtcustomername);
       combo.selectByVisibleText(customername);
   }

    public void setTxtsubject(String subject)
    {
        txtsubject.sendKeys(subject);
    }

    public void setTxtenquirydetails(String eqdetail)
    {
        txtenquirydetails.sendKeys(eqdetail);
    }
    public void setTxtsource(String source)
    {
        txtsource.sendKeys(source);
    }
    public void setTxtdestination(String destination)

    {
        txtdestination.sendKeys(destination);
    }
   public void  setClickairline()
   {
       clickairline.click();
   }

    public void setClickbus()
    {
        clickbus.click();
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
        clicktrain.click();
    }
    public void setBtnsave()
    {
        btnsave.click();
    }
    public  void setClickconfirm()
    {
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",clickconfirm);
    }
}
