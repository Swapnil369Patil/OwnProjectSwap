package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 18/05/2017.
 */
public class Customer {

    WebDriver driver;

    @FindBy(xpath =".//*[@id='Cust_Nm']")
    WebElement txtcustomername;


    @FindBy(xpath =".//*[@id='Cust_Addr']")
    WebElement txtcustomeraddress;

    @FindBy(xpath =".//*[@id='ContNo1']")
    WebElement txtcontno;

    @FindBy(xpath =".//*[@id='Cont_Persn']")
    WebElement txtcontname;

    @FindBy(xpath =".//*[@id='ContNo2']")
    WebElement txtcontno2;

    @FindBy(xpath =".//*[@id='Sec_Cont_Persn']")
    WebElement txtcontname2;

    @FindBy(xpath =".//*[@id='Cust_Email']")
    WebElement txtemail;

    @FindBy(xpath =".//*[@id='ddlState']")
    WebElement selectstate;

    @FindBy(xpath =".//*[@id='ddlCity']")
    WebElement selectcity;

    @FindBy(xpath =".//*[@id='Nationality']")
    WebElement txtnatinality;

    @FindBy(xpath =".//*[@id='Pin_Code']")
    WebElement txtpincode;

    @FindBy(xpath =".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath =".//*[@id='confirm']")
    WebElement Clickconfirm;

    public Customer (WebDriver driver) {


        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
    public void setTxtcustomername(String customername)
    {

        txtcustomername.sendKeys(customername);
    }
    public void setTxtcustomeraddress(String customeraddress)
    {
        txtcustomeraddress.sendKeys(customeraddress);
    }
    public void setTxtcontno(String contno)
    {
        txtcontno.sendKeys(contno);
    }
    public void setTxtcontname(String contname)
    {
        txtcontname.sendKeys(contname);
    }
    public void setTxtcontno2(String cont2)
    {
        txtcontno2.sendKeys(cont2);
    }
    public void setTxtcontname2(String contname2)
    {
        txtcontname2.sendKeys(contname2);
    }
    public void setTxtemail(String email)
    {
        txtemail.sendKeys(email);
    }
    public void setSelectstate(String state)
   {
       Select combo=new Select(selectstate);
       combo.selectByVisibleText(state);

    }
    public void setSelectcity(String city)
    {
        Select combo=new Select(selectcity);
        combo.selectByVisibleText(city);
    }
    public void setTxtnatinality(String nation)
    {
        txtnatinality.sendKeys(nation);
    }
    public void setTxtpincode(String pin)
    {
        txtpincode.sendKeys(pin);
    }
    public void setBtnsave()
    {
        btnsave.click();
    }
    public void setClickconfirm()
    {
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",Clickconfirm);
    }
}
