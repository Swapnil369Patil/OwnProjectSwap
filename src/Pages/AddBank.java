package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 19/05/2017.
 */
public class AddBank {

    WebDriver driver;

    @FindBy(xpath = ".//*[@id='ddl_BankNm']")
    WebElement selectbankname;

    @FindBy(xpath = ".//*[@id='Bank_Acc_No']")
    WebElement txtAccno;

    @FindBy(xpath = ".//*[@id='Bank_Addr']")
    WebElement txtAddress;

    @FindBy(xpath = ".//*[@id='ContNo1']")
    WebElement txtbankcontno;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;

    public AddBank(WebDriver driver)
    {

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void setSelectbankname(String bankname) {


        Select combo = new Select(selectbankname);
        combo.selectByVisibleText(bankname);
    }
    public void setTxtAccno(String accno)
    {
        txtAccno.sendKeys(accno);
    }
    public void setTxtAddress(String address)
    {
        txtAddress.sendKeys(address);
    }
    public void setTxtbankcontno(String contno)
    {
        txtbankcontno.sendKeys(contno);
    }
    public void setBtnsave()
    {
        btnsave.click();
    }
    public void setClickconfirm()

    {
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",clickconfirm);
    }
}
