package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Swapnil on 16/05/2017.
 */
public class Menu {

  WebDriver driver;

  //Master
    @FindBy(linkText ="Master")
    WebElement clickmaster;

    @FindBy(linkText = "Supplier")
    WebElement clicksupplier;

    @FindBy(xpath ="html/body/div[1]/div/section[2]/div[1]/div/div/div[1]/a")
    WebElement clickaddnew;

    @FindBy(linkText ="Customer")
    WebElement clickcustomer;

    @FindBy(xpath ="html/body/div[1]/div/section[2]/div/div/div/div[1]/a")
    WebElement clickaddnewcust;

     @FindBy(linkText = "Bank")
     WebElement clickBank;

     @FindBy(xpath = "//div/div/div/div[1]/a")
     WebElement clickaddnewbank;


  @FindBy(linkText = "Tax Master")
  WebElement cliccktaxmaster;

  @FindBy(xpath = ".//*[@id='AddTax']")
  WebElement clickaddnewtaxmaster;

  //Admin
  @FindBy(linkText = "Admin")
  WebElement clickadmin;

  @FindBy (xpath = "html/body/div[1]/aside/section/ul/li[2]/ul[1]/li/a")
  WebElement clickusermaster;

  @FindBy(xpath = ".//*[@id='formCommon']/div/div/a")
  WebElement clickaddnewusermaster;

  @FindBy(linkText= "Change Password")
  WebElement clickchangepass;

  @FindBy(linkText= "Permission")
  WebElement clickpermission;

  @FindBy(linkText= "Email")
  WebElement clickemail;

  //Enquiry
   @FindBy (linkText = "Enquiry")
   WebElement clickenquiry;

  @FindBy (xpath = ".//*[@id='resetForm']/div[1]/a")
  WebElement clickaddnewenquiry;

  @FindBy(linkText ="Trip")
  WebElement clicktrip;

  @FindBy(xpath ="//a[@class='btn btn-success']")
  WebElement clickAddnewtrip;

  //Invoice

  @FindBy(linkText = "Invoice")
  WebElement clickinvoice;

  @FindBy(xpath= "//div/div/div[1]/div[1]/a")
  WebElement clickAddnewinvoice;

  //Account

  @FindBy(linkText = "Account")
  WebElement clickaccount;

  @FindBy(xpath = "html/body/div[1]/aside/section/ul/li[4]/ul[1]/li/a")
  WebElement clicktransaction;

  @FindBy(xpath = "//div/section[2]/div/div/div/div[1]/a")
  WebElement clickaddnewtransaction;







  public Menu(WebDriver driver)
    {
        this.driver=driver;

        PageFactory.initElements(driver,this);
    }
    public void setClickmaster()
    {
      clickmaster.click();
    }
    public void setClicksupplier()
    {
      clicksupplier.click();
    }

    public void setClickaddnew()

    {
        clickaddnew.click();
    }

    public void setClickcustomer()


    {
        clickcustomer.click();
    }

    public void setClickaddnewcust()

    {
        clickaddnewcust.click();
    }

  public void setClickBank()
  {
    clickBank.click();
  }
  public void setClickaddnewbank()
  {
    clickaddnewbank.click();
  }
  public void setCliccktaxmaster()
  {
    cliccktaxmaster.click();
  }
  public void setClickaddnewtaxmaster()

  {
    clickaddnewtaxmaster.click();
  }

//Admin
  public  void setClickadmin()
  {
    clickadmin.click();
  }
  public  void setClickusermaster()
  {
    clickusermaster.click();
  }
  public  void setClickaddnewusermaster()
  {
    clickaddnewusermaster.click();
  }
  public  void setClickchangepass() {
    clickchangepass.click();
  }

    public  void setClickpermission()

    {
      clickpermission.click();
    }

  public  void setClickemail()

  {
    clickemail.click();
  }

  //Enquiry

public  void setClickenquiry()
{
 clickenquiry.click();
}
  public void setClickaddnewenquiry()
  {
    clickaddnewenquiry.click();
  }

  //Trip

  public void setClicktrip()
  {
    clicktrip.click();
  }
  public void setClickAddnewtrip()
  {
    clickAddnewtrip.click();
  }


  //Invoice
  public void setClickinvoice()
  {
    clickinvoice.click();
  }
  public void setClickAddnewinvoice()
  {
    clickAddnewtrip.click();
  }

  //Account

  public void setClickaccount()
  {
    clickaccount.click();
  }

  public void setClicktransaction()
  {
    clicktransaction.click();
  }

  public void setClickaddnewtransaction()
  {
    clickaddnewtransaction.click();
  }



  }



