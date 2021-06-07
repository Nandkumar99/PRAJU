package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;


public class EmployerPictureChange {
    BaseStep step = new BaseStep();
    WebDriver driver;
    @Given("^user should on home page$")
    public void user_should_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(2000);
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@9899");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(2000);


    }

    @Then("^Change the profile picture$")
    public void change_the_profile_picture() throws InterruptedException {
step.findElementClick("//*[@id=\"Popover2\"]/img",xPath); //click on profile button
step.findElementClick("/html/body/div[2]/div/div/div/div/ul/button[1]",xPath); //click on profile btn
        Thread.sleep(2000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div[1]/button",xPath); //click on change picture

        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='socialLoginIcons']"))).click();
        System.out.println("driver" + driver);
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        System.out.println("title" + handler);
        String parentWindowId = it.next(); //System.out.println("parent window id:"+ parentWindowId);
        String childWindowId = it.next(); //System.out.println("Child window id:"+ childWindowId);
        driver.switchTo().window(childWindowId);

        Alert alert = driver.switchTo().alert(); // switch to alert
        step.driver.switchTo().alert();

//            driver.quit();
        }
    }








//step.findElementClick("//*[@id=\"inner-circle\"]",xPath); //click picture
//step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div[2]/" +
//        "div/div[1]/div[2]/div/div/button/span[2]",xPath); //click on confirm preview


