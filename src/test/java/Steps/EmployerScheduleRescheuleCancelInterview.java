package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Base.BaseStep.Pather.id;


public class EmployerScheduleRescheuleCancelInterview {
    BaseStep step = new BaseStep();
    WebDriver driver;

    @Given("Employer Post new job for schedules reschedules and cancel interview")
    public void employer_Post_new_job_for_schedules_reschedules_and_cancel_interview() throws InterruptedException {
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

    @Then("Job seeker accepts the job invitation for scheduling round")
    public void jobseeker_accepts_the_job_invitation_for_scheduling_round() throws InterruptedException {
        Thread.sleep(3000);
        step.BaseStep();
        step.geturl();
        Thread.sleep(3000);
        step.JobseekerLogin();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInfo"))).sendKeys("Yes, i am interested");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(5000);
        step.DriverQuit();

    }
    @Given("Employer should be on feedback screen")
    public void employer_should_be_on_feedback_screen() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin(); //Standard account login
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder collapseList'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[2]"))).click();
    }

    @Then("Employer Schedules telephonic round")
    public void employer_Schedules_telephonic_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Thread.sleep(3000);
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(1);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Select Calltype = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("callTypeSelect"))));
        Calltype.selectByIndex(1);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("callBridgeDetails"))).sendKeys("Sachin Tendulkar");
        Thread.sleep(4000);
        step.srcinterview();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root']"))).sendKeys(Keys.ENTER,Keys.RIGHT,Keys.ENTER);
        Select Duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        Duration.selectByIndex(3);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m']"))).click();

        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Schedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(4000);
    }

    @Then("Employer Reschedules Telephonic round")
    public void employer_Reschedules_Telephonic_round() throws InterruptedException {
        step.Reschedules();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Reschedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(4000);
    }

    @Then("Employer cancels Telephonic round")
    public void employer_cancels_Telephonic_round() throws InterruptedException {
    step.CancelRound();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Interview is canceled";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
        step.DriverQuit();
    }
    @Then("Employer Schedules video conference round")
    public void employer_Schedules_video_conference_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(2);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("callBridgeDetails"))).sendKeys("Sachin Tendulkar");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Thread.sleep(4000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root']"))).sendKeys(Keys.ENTER,Keys.RIGHT,Keys.ENTER);
        step.srcinterview();
        Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        duration.selectByIndex(3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']"))).click();

        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Schedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(4000);
    }

    @Then("Employer Reschedules video conference round")
    public void employer_Reschedules_video_conference_round()  throws InterruptedException {
        Thread.sleep(3000);
        step.Reschedules();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Reschedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(4000);
    }
    @Then("Employer cancels video conference round")
    public void employer_cancels_video_conference_round() throws InterruptedException {
        Thread.sleep(3000);
      step.CancelRound();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Interview is canceled";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
        step.DriverQuit();
    }
    @Then("Employer Schedules Face to face round")
    public void employer_Schedules_Face_to_face_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(3);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("address"))).sendKeys("A/P- pune Dist pune");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Thread.sleep(3000);
        step.srcinterview();
        Thread.sleep(3000);
        Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        duration.selectByIndex(3);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m']"))).click();

        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Schedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(4000);
    }
    @Then("Employer Reschedules Face to face round")
    public void employer_Reschedules_Face_to_face_round() throws InterruptedException {
        Thread.sleep(3000);
        step.Reschedules();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Reschedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(4000);
    }
    @Then("Employer cancels Face to face round")
    public void employer_cancels_Face_to_face_round() throws InterruptedException {
        Thread.sleep(3000);
        step.CancelRound();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Interview is canceled";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
        step.DriverQuit();
    }
    @Then("Employer Schedules coding round")
    public void employer_Schedules_coding_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(4);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Thread.sleep(3000);
        WebElement browse1 =step.findElement("exercise",id,"Resume");
        browse1.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();

        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Schedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(5000);
    }
    @Then("Employer Reschedules coding round")
    public void employer_Reschedules_coding_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m'])[1]"))).click();
        Select ReasonforREschedule = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("reasonsForRescheduling"))));
        ReasonforREschedule.selectByIndex(3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInformation"))).sendKeys("Please join within 15 days");
        Thread.sleep(3000);
        WebElement browse1 = step.driver.findElement(By.id("exercise"));
        browse1.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();

        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div/div[1]"))).getText();
        String ExpectedTitle = "Reschedule details will be shared shortly with the participants.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(2000);


    }

    @Then("Employer cancels coding round with candidate not interested")
    public void employer_cancels_coding_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m'])[3]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("isJobSeekerNotInterested"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(3000);
        step.DriverQuit();
    }

}
