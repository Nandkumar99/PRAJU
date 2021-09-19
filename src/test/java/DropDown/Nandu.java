package DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Nandu {
    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
         WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        Thread.sleep(4000);  // Day
        Select Day = new Select(driver.findElement(By.name("birthday_day")));
        Day.selectByIndex(22);

          Thread.sleep(2000);   //Month
          Select Month = new Select(driver.findElement(By.name("birthday_month")));
         Month.selectByValue("1");

        Thread.sleep(2000);    // Year
        Select Year = new Select(driver.findElement(By.name("birthday_year")));
        Year.selectByVisibleText("1997");

                Thread.sleep(4000);  // Get Text in list
        Select Dayy = new Select(driver.findElement(By.name("birthday_day")));
//        List <WebElement> Alloptions = Dayy.getOptions();
//
//        for (WebElement alldates:Alloptions){
//            System.out.println(alldates.getText());


       List<WebElement> AllOptions=Dayy.getOptions();

//       for (WebElement NB:AllOptions){

           System.out.println(Dayy.getOptions().size());
//       }

    }
}

