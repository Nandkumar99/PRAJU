package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOut {
BaseStep step= new BaseStep();

    @When("standard employer should be on home page")
    public void standard_employer_should_be_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
        Thread.sleep(2000);

    }
    @Then("signout")
    public void employer_logout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Popover2\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"border-light list-group-item-action list-group-item\"])[2]"))).click();
        Thread.sleep(2000);
        step.DriverQuit();
    }
    @When("premium employer should be on home page")
    public void premium_employer_should_be_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/button[1]/span[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("workEmail"))).sendKeys("premium.test.user1@protonmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Babar@9899");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button"))).click();
         Thread.sleep(2000);
    }
    @When("jobseeker should on home page")
    public void jobseeker_should_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(2000);
        step.JobseekerLogin();
        Thread.sleep(5000);

    }



}
