package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchedulesIVANDEnterFeedback {

        BaseStep step = new BaseStep();
        WebDriver driver;
        @When("employer post new job for scheduling interview round")
        public void post_new_job_for_scheduling_interviews() throws InterruptedException {
            step.BaseStep();
            step.geturl();
            Thread.sleep(2000);
            step.EmployerLogin();
            Thread.sleep(2000);
            step.PostJob();
            WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/button"))).click();
            Thread.sleep(3000);
            step.SendJobInvitation();
            Thread.sleep(3000);
            step.DriverQuit();
        }

        @Then("Jobseeker accepts the intial job invitation")
        public void jobseeker_accepts_the_intial_job_invitation() throws InterruptedException {
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
            Thread.sleep(50000);
            step.DriverQuit();
        }

        @Then("User should be on interview scheduling screen")
        public void user_should_be_on_interview_scheduling_screen() throws InterruptedException {
            step.BaseStep();
            step.geturl();
            step.EmployerLogin();
            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder collapseList'])[2]"))).click();
        }
        @Given("Schedules the coding round")
        public void schedules_an_coding_round() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[2]"))).click();
            Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
            ivmode.selectByIndex(4);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
            Thread.sleep(3000);
            WebElement browse = step.driver.findElement(By.id("exercise"));
            browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInformation"))).sendKeys("Good internet Connection Required");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
            Thread.sleep(4000);
        }
        @Then("Enter feedback of coding round")
        public void enter_feedback_of_coding_round() throws InterruptedException {
            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[6]/div/span[3]/button"))).click();
            Thread.sleep(3000);
            step.driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("Cleared",Keys.ENTER);
            Thread.sleep(2500);
            step.driver.findElement(By.xpath("//*[@id=\"react-confirm-alert\"]/div/div/div/div/button[1]")).click();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"candidateLevel\"]/input"))).sendKeys("Good",Keys.ENTER);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nextstep\"]/input"))).sendKeys("Nothing for now",Keys.ENTER);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("feedbackComments"))).sendKeys("good communication skill");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
            Thread.sleep(3000);
            step.DriverQuit();
        }

        @Given("Schedules the Telephonic round")
        public void schedules_the_Telephonic_round() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[2]/div/button"))).click();
            Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
            ivmode.selectByIndex(1);
            Select Calltype = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("callTypeSelect"))));
            Calltype.selectByIndex(1);
            Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
            duration.selectByIndex(1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("callBridgeDetails"))).sendKeys("Sachin tendulkar");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInformation"))).sendKeys("Good internet Connection Required");
            step.dateformatnew();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
            Thread.sleep(62000);
        }

        @Then("Enter feedback of telephonic round")
        public void enter_feedback_of_telephonic_round_as_selected() throws InterruptedException {
            enter_feedback_of_coding_round();
            step.DriverQuit();
        }

        @Given("Schedules the video conference round")
        public void schedules_the_video_conference_round() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[2]/div/button"))).click();
            Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
            ivmode.selectByIndex(2);
            Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
            duration.selectByIndex(1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("callBridgeDetails"))).sendKeys("Sachin tendulkar");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInformation"))).sendKeys("Good internet Connection Required");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("callBridgeDetails"))).sendKeys("M.S. DHONI");
            step.dateformatnew();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();Thread.sleep(62000);

        }

        @Then("Enter feedback of video conference round")
        public void enter_feedback_of_video_conference_round_as_selected() throws InterruptedException {
          enter_feedback_of_coding_round();
          step.DriverQuit();
        }

        @Given("Schedules the face to face round round")
        public void schedules_the_face_to_face_round_round() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[2]/div/button"))).click();
            Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
            ivmode.selectByIndex(3);
            Select duration = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("duration"))));
            duration.selectByIndex(1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInformation"))).sendKeys("Good internet Connection Required");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("address"))).sendKeys("Baner pune");
            step.dateformatnew();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
            Thread.sleep(62000);
        }

        @Then("^Enter feedback of face to face round")
        public void enter_feedback_of_face_to_face_round_as_selected() throws InterruptedException {
          enter_feedback_of_coding_round();
          step.DriverQuit();
        }
    }


