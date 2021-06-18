package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewdownloadResumesandButtons {
           BaseStep step = new BaseStep();
           public WebDriver driver;
    @Given("emp post new job for view update resumes")
        public void emp_post_new_job_for_view_update_resumes() throws InterruptedException {
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

    @Then("job seeker accepts the job proposal proposed by employer")
        public void job_seeker_accepts_the_job_proposal_proposed_by_employer() throws InterruptedException {
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
        Thread.sleep(5000);
        step.DriverQuit();

    }
    @Then("employer view jobseeker resume")
        public void jobseeker_view_jobseeker_resume() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
         WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"noButtonBorder\"])[1]"))).click();
        Thread.sleep(2000);
        step.driver.findElement(By.xpath("(//button[@class=\"noButtonBorder collapseList\"])[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title=\"View Jobseeker Details\"])"))).click();
       Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"button-with-image button-with-image-border button-margin btn btn-secondary\"])[1]"))).click();
        Thread.sleep(3000);
        step.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/button")).click();
        Thread.sleep(3000);

    }

    @Then("employer download jobseeker resume")
        public void jobseeker_download_jobseeker_resume(){
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"button-with-image button-with-image-border button-margin btn btn-secondary\"])[2]"))).click();

    }

    @Then("employer update jobseeker resume")
        public void jobseeker_update_jobseeker_resume() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"button-with-image button-with-image-border button-margin btn btn-secondary\"])[3]"))).click();
        Thread.sleep(2000);
        WebElement browse = step.driver.findElement(By.name("resume"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        Thread.sleep(4000);
        step.driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
        Thread.sleep(4000);
        step.DriverQuit();
    }

    @Then("REFRESH LIST button")
        public void refresh_LIST_button() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button"))).click();
        Thread.sleep(4000);
        step.driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/button[2]")).click();
        Thread.sleep(3000);
    }

    @Then("MARK ALL READ button")
        public void mark_ALL_READ_button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/button[4]"))).click();
        Thread.sleep(4000);
        step.driver.findElement(By.xpath("//button[@class='btn btn-secondary'][1]")).click();
        Thread.sleep(4000);
    }
    @Then("COLLAPSE Button")
        public void collapse_Button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/button[3]"))).click();
        Thread.sleep(3000);
        step.driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/button[3]")).click();
        Thread.sleep(3000);
        step.DriverQuit();

    }

    @Then("employer request for resubmit the documents")
       public void resubmit_the_documents() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"noButtonBorder\"])[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"noButtonBorder collapseList\"])[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title=\"View Jobseeker Details\"])"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"button-with-image button-with-image-border button-margin btn btn-secondary\"])[5]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div/label/input"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/div[2]/div/label/input"))).click();
        step.driver.findElement(By.xpath("//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m']")).click();
        Thread.sleep(3000);
        step.DriverQuit();
    }

    @Then("Jobseeker resubmit the documents")
        public void identify_the_the_documents() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(3000);
        step.JobseekerLogin();
        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Popover2\"]/img"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='border-light list-group-item-action list-group-item'][1]"))).click();
        Thread.sleep(2000);
        step.driver.findElement(By.xpath("//button[@class=\"reuploadDocs-button btn btn-link\"]")).click();
        Thread.sleep(2000);
        WebElement browse = step.driver.findElement(By.name("panImg"));
        browse.sendKeys("/home/nandkumar/Pictures/PAN CARD.png");
        Thread.sleep(4000);
        step.driver.findElement(By.xpath("//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m']")).click();
        Thread.sleep(4000);
        step.DriverQuit();

    }
}
