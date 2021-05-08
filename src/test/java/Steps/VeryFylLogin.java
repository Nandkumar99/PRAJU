package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

import java.util.Iterator;
import java.util.Set;

import static Base.BaseStep.Pather.*;
import static Base.BaseStep.Pather.id;

public class VeryFylLogin {
    public WebDriver driver;
    //WebDriver driver;
    BaseStep step = new BaseStep();

    @When("I open Employer Standard Login page")
    public void I_open_Employer_Standard_Login_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
    }

    @Then("I Open Home page")
    public void I_Open_Home_page() throws InterruptedException {
        Thread.sleep(5000);

        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(5000);
    }


    @And("close browser")
    public void close_browser() {
        step.DriverQuit();
    }

    @When("I open employer premium login page")
    public void I_open_employer_premium_login_page() {
        step.BaseStep();
        step.geturl();

    }

    @Then("I open Home page")
    public void I_open_Home_page() {
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[1]/span[2]", xPath);
        step.findElement("workEmail", name, "Userid").sendKeys("premium.test.user1@protonmail.com");
        step.findElement("password", name, "Password").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);

    }


    @When("I open Jobbseeker Linkedin login")
    public void i_open_Jobbseeker_Linkedin_login() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.findElementClick("//img[@class='socialLoginIcons']",xPath);
        Thread.sleep(10000);

        System.out.println("driver"+ driver);
        Set<String> handler = step.driver.getWindowHandles();

        Iterator<String> it= handler.iterator();
        System.out.println("title" +handler);
        String parentWindowId =it.next();
        //System.out.println("parent window id:"+ parentWindowId);

        String childWindowId= it.next();
        //System.out.println("Child window id:"+ childWindowId);

        step.driver.switchTo().window(childWindowId);
        Thread.sleep(5000);

    }

    @Then("Enter linkedin id and password")
    public void Enter_linkedin_id_and_password() throws InterruptedException {
        step.findElement("//input[@id='username']",xPath,"name").sendKeys("ricky77ponting@gmail.com");
        step.findElement("//input[@id='password']",xPath,"password").sendKeys("Ad$12345");
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(5000);

    }

}