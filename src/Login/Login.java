package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 28/04/2017.
 */
public class Login {

    WebDriver driver; // Webdriver is datatype and driver is variable

    @FindBy(xpath = "//*[@id='Email_Id']")
    WebElement txtUserid;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement txtpassword;

    @FindBy(xpath = "//*[@id='btnSubmit1']")
    WebElement clicksignin;


    public Login(WebDriver driver)//create constructor so class name same as constructor name
    {
        this.driver=driver; // we declared "driver" variable as same name for insatance & local so instanstance variable should declared using this
        PageFactory.initElements(driver,this); // page factory we dclared for the initialize the element of the Page object or initiate the page object
    }

    public void setTxtUserid(String userid)
    {
        txtUserid.sendKeys(userid);
    }

    public void setTxtpassword (String password)
    {
        txtpassword.sendKeys(password);
    }
    public  void clicksignin()
    {
        clicksignin.click();

    }


}
