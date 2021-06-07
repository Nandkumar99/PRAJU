package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobseekerAccepsRejectNeedMoreInfo {

    BaseStep step= new BaseStep();
   public WebDriver driver;

    @Given("I post new job and send intial job invite to jobseeker")
    public void I_post_new_job_and_send_intial_job_invite() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(3000);
        step.EmployerLogin();
        Thread.sleep(3000);
        step.PostJob();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='button-with-image button-with-image-border button-margin btn btn-secondary'])[4]"))).click();
        Thread.sleep(3000);
        step.SendJobInvitation();
        Thread.sleep(3000);
        step.DriverQuit();
    }

    @Then("jobseeker should be on list job page")
    public void jobseeker_should_be_on_list_job_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(3000);
        step.JobseekerLogin();
        Thread.sleep(5000);
    }

    @Then("jobseeker do need more info")
    public void jobseeker_do_need_more_info() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"button-with-image button-with-image-border btn btn-secondary\"])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("reason"))).sendKeys("I want some more info");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Request send for more infomation.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(5000);
        step.DriverQuit();
    }

    @Then("jobseeker reject the job proposal")
    public void jobseeker_reject_the_job_proposal() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"button-with-image button-with-image-border btn btn-secondary\"])[3]"))).click();
        Select extend = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/select"))));
        extend.selectByIndex(1);
        Select country = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("country"))));
        country.selectByIndex(1);
        Select city = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("city"))));
        city.selectByIndex(13);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("area"))).sendKeys("Hinjewadi");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalDetails"))).sendKeys(" ia m not interested with offered salary");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(5000);
        step.DriverQuit();
    }

    @Then("Resend job proposal to jobseeker")
    public void resend_job_proposal_to_jobseeker() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"noButtonBorder collapseList\"])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"noButtonBorder\"])[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[5]"))).sendKeys("100");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(3000);
        step.DriverQuit();
    }
    @Then("jobseeker accepts the job proposal")
    public void jobseeker_accepts_the_job_proposal() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"button-with-image button-with-image-border btn btn-secondary\"])[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInfo"))).sendKeys("Yes, i am interested");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        step.DriverQuit();

    }
    }

