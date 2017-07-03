package Account;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 02/06/2017.
 */
public class Transaction {

    WebDriver driver;

    @FindBy(xpath = ".//*[@id='txtTransDate']")
    WebElement txttransactiondate;

    @FindBy(xpath = ".//*[@id='Pay_Cat']")
    WebElement txtpaymentcategoury;

    @FindBy(xpath = ".//*[@id='ddlBankNm']")
    WebElement txtbankname;

    @FindBy(xpath = ".//*[@id='ddlAccNo']")
    WebElement txtAccno;

    @FindBy(xpath = ".//*[@id='ddlpaymode']")
    WebElement txtpaytype;

    @FindBy(xpath = ".//*[@id='Remark']")
    WebElement txtremark;

    @FindBy(xpath = ".//*[@id='Amount']")
    WebElement txtamt;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;

    public Transaction(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setTxttransactiondate(String trandate)
    {
        txttransactiondate.sendKeys(trandate);
    }
    public void setTxtpaymentcategoury(String paycategory)
    {
        //txtpaymentcategoury.sendKeys(paycategory);
        Select combo=new Select(txtpaymentcategoury);
        combo.selectByVisibleText(paycategory);
    }
    public void setTxtbankname (String bankname)
    {
        //txtbankname.sendKeys(bankname);
        Select combo=new Select(txtbankname);
        combo.selectByVisibleText(bankname);
    }
    public void setTxtAccno (String acno)
    {
        //txtAccno.sendKeys(acno);
        Select combo=new Select(txtAccno);
        combo.selectByVisibleText(acno);
    }
    public void setTxtpaytype (String paytype)
    {
        //txtpaytype.sendKeys(paytype);
        Select combo=new Select(txtpaytype);
        combo.selectByVisibleText(paytype);
    }
    public void setTxtremark (String remark)
    {
        txtremark.sendKeys(remark);
    }
    public void setTxtamt (String amt)
    {
        txtamt.sendKeys(amt);
    }
    public void setBtnsave ()
    {
        //btnsave.click();
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",btnsave);
    }
    public void setClickconfirm ()
    {
        //clickconfirm.click();
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",clickconfirm);
    }

}
