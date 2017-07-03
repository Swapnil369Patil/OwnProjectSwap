package Trip;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 31/05/2017.
 */
public class Tripdate {
    static WebDriver driver;
    public static void tripdatefun(WebDriver driver,String setDate) throws ParseException {

        SimpleDateFormat myDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat calDateFormat=new SimpleDateFormat("MMMM yyyy");
        java.util.Date date=myDateFormat.parse(setDate);

        driver.findElement(By.xpath(".//*[@id='datetimepicker1']/span")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        /*Date*/ java.util.Date curDate=calDateFormat.parse(driver.findElement(By.xpath(".//*[@id='datetimepicker1']/div/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]")).getText());
        System.out.println(curDate);

        int monthDiff = Months.monthsBetween(new org.joda.time.DateTime(curDate).withDayOfMonth(1), new org.joda.time.DateTime(date).withDayOfMonth(1)).getMonths();
        boolean isFuture =true;

        // decided whether set date is in past or future
        if(monthDiff<0){
            isFuture=false;
            monthDiff*=-1;
        }

        // iterate through month difference
        for (int i=1;i<=monthDiff;i++){

            //click on next & previous
            driver.findElement(By.xpath(".//*[@id='datetimepicker1']/div/ul/li[1]/div/div[1]/table/thead/tr[1]/th[@class="+(isFuture?"'next'":"'prev'")+"]")).click();
        }

        // Click on Day of Month from table

        driver.findElement(By.xpath("//div[@class='datepicker']/div[1]//td[text()='" + (new DateTime(date).getDayOfMonth()) + "']")).click();
    }//div[@class='datepicker']/div[1]//td[text()='

    //.//*[@id='datetimepicker1']/div/ul/li[1]/div/div[1]/table/tbody/tr[5]/td[text()='
}


