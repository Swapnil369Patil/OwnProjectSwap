import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


//import static Regression.Master.SupplierTest.supplierfunc;
import static Utility.Chromedriver.loginfun;

/**
 * Created by user on 19/05/2017.
 */
public class Multiple {

    WebDriver driver;
    @Test (priority = 1)
    public void login()
    {
        driver=loginfun();
        System.out.println("Login Completed");
        //driver.close();
    }

   @Test (priority = 2)
    public void supplier()
   {
       //supplierfunc(driver);
       System.out.println("Supplier Completed");
       //driver.close();
   }

  @Test (priority = 3)
    public  void customer()
 {
     //customerfunc(driver);
     System.out.println("Customer Completed");
    // driver.close();

 }
}
