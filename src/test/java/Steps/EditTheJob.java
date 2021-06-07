package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EditTheJob {
    BaseStep step = new BaseStep();
    public WebDriver driver;

    @Given("first post new job")
    public void first_post_new_job() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
        step.PostJob();
    }

    @Then("Edit the posted job")
    public void edit_the_posted_job() throws InterruptedException {
        //Edit the posted job
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("internalJobCode"))).sendKeys("9899");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[8]/button[2]"))).click();
       Thread.sleep(4000);
        step.DriverQuit();
    }

}






