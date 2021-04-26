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
        Thread.sleep(5000);}


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
    public void i_open_Jobbseeker_Linkedin_login(){
        step.BaseStep();
        step.geturllinkedin();
    }

    @Then("Enter Linkden userid and password")
    public void enter_Linkden_userid_and_password() throws InterruptedException {
        Thread.sleep(5000);
        step.findElement("username",id,"xpath").sendKeys("ricky77ponting@gmail.com");
        step.findElement("password",id,"password").sendKeys("Ad$12345");
        step.findElementClick("//*[@id=\"app__container\"]/main/div[2]/form/div[3]/button",xPath);
//        step.DriverQuit();
    }

    @When("I open Jobseeker google login")
    public void i_open_Jobseeker_google_login(){
        step.BaseStep();
        step.geturl();

    }

    @Then("Enter google userid and password")
    public void enter_google_userid_and_password() throws InterruptedException {
        Thread.sleep(2000);
     step.findElementClick("//*[@id=\"root\"]/main/div[1]/div/div[4]/div/button[1]/img",xPath);
     Thread.sleep(10000);
       driver.getWindowHandles();
        step.findElement("identifier",name,"emailid").sendKeys("ricky77ponting@gmail.com");
        step.findElementClick("//*[@id=\"identifierNext\"]/div/button/div[2]",xPath);
        Thread.sleep(5000);


        //step.DriverQuit();
    }



}

