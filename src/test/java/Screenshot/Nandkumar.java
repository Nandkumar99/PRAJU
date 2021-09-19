package Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Nandkumar {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com/");

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        String str= RandomString.make(4);

        File SRC=scrShot.getScreenshotAs(OutputType.FILE);
        File Dest=new File("/home/nandkumar/Pictures/NBNB/fbpage"+str+".png");

        FileHandler.copy(SRC, Dest);
    }
    }
