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

import static Base.BaseStep.Pather.xPath;

public class HistoricFeedbacks {
    BaseStep step = new BaseStep();
    WebDriver driver;

    @Given("Employer Post new job for historic feedback")
    public void post_new_job_for_historic_feedback() throws InterruptedException {
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

    @Then("Jobseeker accepts the job invitation")
    public void jobseeker_accepts_the_job_invitation() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(3000);
        step.JobseekerLogin();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInfo"))).sendKeys("Yes, i am interested");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(50000);
        step.DriverQuit();
    }

    @Given("user should be on feedback screen")
    public void user_should_be_on_feedback_screen() throws InterruptedException {

        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.EmployerLogin(); //Standard account login
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder collapseList'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Add Historic Feedback']"))).click();

    }

    @Then("Enter select feedback for telephonic round")
    public void enter_select_feedback_for_telephonic_round() throws InterruptedException {
        //Telephonic round
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(1);
        Select Avai = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        Avai.selectByIndex(2);
        step.Historicselect();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
    }

    @Then("Enter select feedback for video conference round")
    public void enter_select_feedback_for_video_conference_round() throws InterruptedException {
        //video conference round
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(2);
        Select Avai = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        Avai.selectByIndex(2);
        step.Historicselect();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);

    }

    @Then("Enter select feedback for Face to face round")
    public void enter_select_feedback_for_Face_to_face_round() throws InterruptedException {
        //face to face round
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(3);
        Select Avai = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        Avai.selectByIndex(2);
        step.Historicselect();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
    }

    @Then("Enter select feedback for coding round")
    public void enter_select_feedback_for_coding_round() throws InterruptedException {
        // coding round
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(4);
        step.Historicselect();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
        step.DriverQuit();
    }

    @Then("Enter reject feedback for telephonic round")
    public void enter_reject_feedback_for_telephonic_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(1);
        Thread.sleep(3000);
        Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        duration.selectByIndex(2);
        step.Historicreject();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);

    }

    @Then("Enter reject feedback for video conference round")
    public void enter_reject_feedback_for_video_conference_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(2);
        Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        duration.selectByIndex(2);
        Thread.sleep(3000);
        step.Historicreject();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);

    }

    @Then("Enter reject feedback for Face to face round")
    public void enter_reject_feedback_for_Face_to_face_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(3);
        Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
        duration.selectByIndex(2);
        Thread.sleep(3000);
        step.Historicreject();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);

    }

    @Then("Enter reject feedback for coding round")
    public void enter_reject_feedback_for_coding_round() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(4);
        step.Historicreject();
        String ActualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[1]/div/div/div[1]"))).getText();
        String ExpectedTitle = "Historic interview details and feedback saved successfully.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button-with-image button-back-with-image-border btn btn-secondary']"))).click();
        Thread.sleep(3000);
        step.driver.findElement(By.xpath("(//button[@class='button-with-image btn btn-secondary'])[2]")).click();

    }

    @Then("Hide the candidate profile")
    public void hide_candidate_profile() throws InterruptedException {
        Thread.sleep(4000);
        step.findElementClick("(//button[@class='noButtonBorder collapseList'])[5]", xPath);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-secondary'])[1]"))).click();
        step.DriverQuit();


    }

}