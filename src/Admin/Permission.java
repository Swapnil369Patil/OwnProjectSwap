package Admin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 22/05/2017.
 */
public class Permission {

    WebDriver driver;

    @FindBy (xpath = ".//*[@id='ddl_EmpNm']")
    WebElement txtusername;

    @FindBy (xpath = "//div[3]/div/div/table/tbody/tr[1]/td[2]/input[2]")
    WebElement clickcheck1;

    @FindBy (xpath = "//div[3]/div/div/table/tbody/tr[2]/td[2]/input[2]")
    WebElement clickcheck2;

    @FindBy (xpath = "//div[3]/div/div/table/tbody/tr[3]/td[2]/input[2]")
    WebElement clickcheck3;

    @FindBy (xpath = "//div[3]/div/div/table/tbody/tr[4]/td[2]/input[2]")
    WebElement clickcheck4;

    @FindBy (xpath = "//div[3]/div/div/table/tbody/tr[5]/td[2]/input[2]")
    WebElement clickcheck5;

    @FindBy (xpath = "//div[3]/div/div/table/tbody/tr[6]/td[2]/input[2]")
    WebElement clickcheck6;

    @FindBy (xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy (xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;

    public Permission(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public  void setTxtusername(String username)
    {
        //txtusername.sendKeys(username);
        Select combo=new Select(txtusername);
        combo.selectByVisibleText(username);

    }

    public  void setClickcheck1()
    {
        clickcheck1.click();
    }
    public  void setClickcheck2()
    {
        clickcheck2.click();
    }

    public  void setClickcheck3()
    {
        clickcheck3.click();
    }

    public  void setClickcheck4()
    {
        clickcheck4.click();
    }

    public  void setClickcheck5()
    {
        clickcheck5.click();
    }

    public  void setClickcheck6()
    {
        clickcheck6.click();
    }


    public  void setBtnsave()
    {
        btnsave.click();
    }
    public  void setClickconfirm()
    {
       // clickconfirm.click();
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",clickconfirm);
    }




}
