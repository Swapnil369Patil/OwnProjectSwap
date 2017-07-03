package Admin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 22/05/2017.
 */
public class Email {

    WebDriver driver;

    @FindBy(xpath = "//div/div/div/table/tbody/tr[1]/td[3]/input[2]")
    WebElement clickcheckb1;

    @FindBy(xpath = "//div/div/div/table/tbody/tr[2]/td[4]/input")
    WebElement clickcheckb2;

    @FindBy(xpath = "//section/div/div/div/table/tbody/tr[3]/td[5]/input")
    WebElement clickcheckb3;

    @FindBy(xpath = "//div/div/div/table/tbody/tr[3]/td[6]/input")
    WebElement clickcheckb4;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;


    public  Email(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void setClickcheckb1()
    {
        clickcheckb1.click();
    }

    public void setClickcheckb2()
    {
        clickcheckb2.click();
    }

    public void setClickcheckb3()
    {
        clickcheckb3.click();
    }
    public void setClickcheckb4()
    {
        clickcheckb4.click();
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

