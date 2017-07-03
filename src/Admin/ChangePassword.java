package Admin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 22/05/2017.
 */
public class ChangePassword {

    WebDriver driver;

    @FindBy(xpath = ".//*[@id='oldPassword']")
    WebElement txtoldpass;

    @FindBy(xpath = ".//*[@id='Password']")
    WebElement txtnewpass;

    @FindBy(xpath = ".//*[@id='ConfirmPassword']")
    WebElement txtconfirmpass;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;

    public ChangePassword(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void setTxtoldpass(String oldpass)
    {
        txtoldpass.sendKeys(oldpass);
    }
    public void setTxtnewpass(String newpass)
    {
        txtnewpass.sendKeys(newpass);
    }
    public void setTxtconfirmpass(String confirmpass)
    {
        txtconfirmpass.sendKeys(confirmpass);
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
