package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VeryFylLogin {
    public WebDriver driver;
    BaseStep step = new BaseStep();

       @When("I open Employer Standard Login page")
        public void I_open_Employer_Standard_Login_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
    }

        @Then("I Open Home page")
        public void I_Open_Home_page() throws InterruptedException {
        step.EmployerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[1]/div/nav/ul/li/div/span[2]"))).getText();
        String ExpectedTitle = "VERYFYL RECRUITER";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        step.DriverQuit();
    }

        @When("I open employer premium login page")
        public void I_open_employer_premium_login_page() {
        step.BaseStep();
        step.geturl();
    }

        @Then("I open Home page")
        public void I_open_Home_page() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/button[1]/span[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("workEmail"))).sendKeys("premium.test.user1@protonmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Babar@9899");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button"))).click();
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[1]/div/nav/ul/li/div/span[2]"))).getText();
        String ExpectedTitle = "VERYFYL RECRUITER";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        step.DriverQuit();
    }
        @When("I open Jobbseeker Linkedin login and enter ID password")
        public void i_open_Jobbseeker_Linkedin_login() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(3000);
        step.JobseekerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[1]/div/nav/ul/li/div/span[2]"))).getText();
        String ExpectedTitle = "VERYFYL JOBSEEKER";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        step.DriverQuit();

    }
}