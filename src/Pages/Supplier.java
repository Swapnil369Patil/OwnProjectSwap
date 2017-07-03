package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 02/05/2017.
 */
public class Supplier {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='Serv_1']")
    WebElement clickbus;

    @FindBy(xpath = "//input[@id='Serv_5']")
    WebElement clickTrain;

    @FindBy(xpath = "//input[@id='Serv_3']")
    WebElement clickcar;

    @FindBy(xpath = "//input[@id='Serv_2']")
    WebElement clickairline;

    @FindBy (xpath = "//input[@id='Supp_Nm']")
    WebElement txtsupplier;

    @FindBy (xpath = "//input[@id='Supp_Addr']")
    WebElement txtaddress;

    @FindBy (xpath = "//*[@id='ddlState']")
    WebElement txtstate;

    @FindBy(xpath =".//*[@id='ddlCity']")
    WebElement txtcity;

    @FindBy (xpath = "//input[@id='Fax_No']")
    WebElement txtfaxno;

    @FindBy (xpath="//input[@id='ST_Reg_No']")
    WebElement txtservicetax;

    @FindBy (xpath = "//input[@id='ContNo1']")
    WebElement txtcontact1;

    @FindBy (xpath = "//input[@id='Cont_Persn']")
    WebElement txtcontname;

    @FindBy(xpath = "//input[@id='ContNo2']")
    WebElement txtcontct2;

    @FindBy (xpath = ".//*[@id='Sec_Cont_Persn']")
    WebElement txtcontname2;

    @FindBy (xpath = "//input[@id='Supp_Email']")
    WebElement txtemail;

    @FindBy (xpath = "//input[@id='Website']")
    WebElement txtwebsite;

    @FindBy (xpath = ".//*[@id='ddl_BankNm']")
    WebElement txtbankname;

    @FindBy (xpath = "//input[@id='Bank_Acc_No']")
    WebElement txtaccno;

    @FindBy (xpath = "//input[@id='Branch_Nm']")
    WebElement txtbranchname;

    @FindBy (xpath = "//input[@id='Branch_Addr']")
    WebElement txtbranchaddress;

    @FindBy (xpath = "//input[@id='MICR_No']")
    WebElement txtmicrno;

    @FindBy (xpath = "//input[@id='IFSC_Code']")
    WebElement txtifsccode;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    WebElement clicksave;

    @FindBy (xpath = "//button[@id='confirm']")
    WebElement clickyes;


    public Supplier (WebDriver driver)
    {
        this.driver=driver;

        PageFactory.initElements(driver, this);
    }

    public void clickClickbus ()
    {
        clickbus.click();
    }

    public void setClickTrain()
    {
        clickTrain.click();

    }
    public void setClickcar() {clickcar.click();}

    public void setClickairline() { clickairline.click(); }

    public void setTxtsupplier(String supplier)
    {
      txtsupplier.sendKeys(supplier);
    }

    public void setTxtaddress(String address)
    {
        txtaddress.sendKeys(address);
    }

   public  void setTxtstate(String state)
   {
       txtstate.sendKeys(state);

   }
    public void setTxtcity(String city)
    {
        //txtcity.sendKeys(city);
        Select combo=new Select (txtcity);
        combo.selectByVisibleText(city);
    }
    public void setTxtfaxno(String faxno)
    {
        txtfaxno.sendKeys(faxno);
    }
    public void setTxtservicetax(String servicetax)
    {
        txtservicetax.sendKeys(servicetax);
    }
    public void setTxtcontact1(String contact1)
    {
        txtcontact1.sendKeys(contact1);
    }
    public void setTxtcontname(String contname)
    {
        txtcontname.sendKeys(contname);
    }
    public void setTxtcontct2(String contact2)
    {
        txtcontct2.sendKeys(contact2);
    }
    public void setTxtcontname2(String contname2)
    {
        txtcontname2.sendKeys(contname2);
    }
    public void setTxtemail(String email)
    {
        txtemail.sendKeys(email);
    }
    public void setTxtwebsite(String website)
    {
        txtwebsite.sendKeys(website);
    }
    public void setTxtbankname(String bankname)
    {
        txtbankname.sendKeys(bankname);
        /*Select combo = new Select(selectbankname);
        combo.selectByVisibleText(bankname);*/
    }
    public void setTxtaccno(String accno)
    {
        txtaccno.sendKeys(accno);
    }
    public void setTxtbranchname(String branchnm)
    {
        txtbranchname.sendKeys(branchnm);
    }
    public void setTxtbranchaddress(String braddress )
    {
        txtbranchaddress.sendKeys(braddress);
    }
    public void setTxtmicrno(String micrno)
    {
        txtmicrno.sendKeys(micrno);
    }
    public void setTxtifsccode(String ifsc)

    {
        txtifsccode.sendKeys(ifsc);
    }
    public void setClicksave()

    {
        clicksave.click();
    }
   public  void setclickyes()

   {
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", clickyes);
   }

}


