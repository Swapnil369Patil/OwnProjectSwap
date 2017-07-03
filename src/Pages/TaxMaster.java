package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 20/05/2017.
 */
public class TaxMaster {

    WebDriver driver;

    @FindBy(xpath = ".//*[@id='ddlSTax']")
    WebElement txttaxname;

    @FindBy(xpath = ".//*[@id='ddlSTaxRate']")
    WebElement txttaxratetype;

    @FindBy(xpath = ".//*[@id='txtTaxRate']")
    WebElement txttaxrate;

    @FindBy(xpath = ".//*[@id='txtEffectDate']")
    WebElement txteffedatefrom;

    @FindBy(xpath = ".//*[@id='txtEffectiveUpto']")
    WebElement txteffedateto;

    @FindBy(xpath = ".//*[@id='btnSubmit']")
    WebElement btnsave;

    @FindBy(xpath = ".//*[@id='confirm']")
    WebElement clickconfirm;


    public TaxMaster (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void setTxttaxname(String taxname)
    {
        txttaxname.sendKeys(taxname);
    }
    public void setTxttaxratetype(String taxratetype) {
        txttaxratetype.sendKeys(taxratetype);
        //driver.findElement(By.xpath(".//*[@id='ddlSTaxRate']/option[2]")).click();
        /*Select combo = new Select(txttaxratetype);
        combo.selectByVisibleText(taxratetype);*/
    }
    public void setTxttaxrate(String taxrate)
    {
        txttaxrate.sendKeys(taxrate);
    }
 public void setTxteffedatefrom(String effecfrom)
 {
     //txteffedatefrom.click();
     txteffedatefrom.sendKeys(effecfrom);
 }
    public void setTxteffedateto(String effecto)
    {
        //txteffedateto.click();
        txteffedateto.sendKeys(effecto);
    }
    public void setBtnsave()
    {
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
