package Admin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 20/05/2017.
 */
public class UserMaster {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='Emp_Nm']")
    WebElement txtempname;

    @FindBy(xpath = ".//*[@id='Email']")
    WebElement txtemail;

    @FindBy(xpath = ".//*[@id='Password']")
    WebElement txtpass;

    @FindBy(xpath = ".//*[@id='ConfirmPassword']")
    WebElement txtconfirmpas;

    @FindBy(xpath = ".//*[@id='Designation']")
    WebElement txtdesignation;

    @FindBy(xpath = ".//*[@id='ContNo1']")
    WebElement txtmobno;

    @FindBy(xpath = ".//*[@id='Address']")
    WebElement txtaddress;

    @FindBy(xpath = ".//*[@id='Add_info']")
    WebElement txtaddinfo;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;

    public UserMaster(WebDriver driver)
    {
        this.driver=driver;

        PageFactory.initElements(driver,this);
    }
    public void setTxtempname(String empname)
    {
        txtempname.sendKeys(empname);
    }
    public void setTxtemail(String email)
    {
        txtemail.sendKeys(email);
    }

    public void setTxtpass(String passward)
    {
        txtpass.sendKeys(passward);
    }
    public void setTxtconfirmpas(String confirmpass)
    {
        txtconfirmpas.sendKeys(confirmpass);
    }
    public void setTxtdesignation(String designation)
    {
        txtdesignation.sendKeys(designation);
    }
    public void setTxtmobno(String mobno)
    {
        txtmobno.sendKeys(mobno);
    }
    public void setTxtaddress(String address)
    {
        txtaddress.sendKeys(address);
    }
    public void setTxtaddinfo(String addinfo)
    {
        txtaddinfo.sendKeys(addinfo);
    }
    public void setBtnsave()
    {
       // btnsave.click();
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
