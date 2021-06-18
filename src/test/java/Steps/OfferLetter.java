package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferLetter {
    BaseStep step = new BaseStep();
    WebDriver driver;

    @Given("Post new job")
    public void post_new_job() throws InterruptedException {
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
    }

    @Then("Send job invitation to candidate")
    public void send_job_invitation_to_candidate() throws InterruptedException {
        Thread.sleep(3000);
        step.SendJobInvitation();
        Thread.sleep(3000);
        step.DriverQuit();
    }

    @Then("jobseeker should be on home page")
    public void jobseeker_aceepts_the_job_proposal() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(3000);
        step.JobseekerLogin();
        Thread.sleep(3000);
    }
    @Then("jobseeker accept intial job proposal")
    public void jobseeker_accept_intial_job_proposal() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additionalInfo"))).sendKeys("Yes, i am interested");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(5000);
        step.DriverQuit();
    }
    @Given("schedule an interview")
    public void schedule_an_interview() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
         step.EmployerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder collapseList'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[2]"))).click();
        Select ivmode = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewMode"))));
        ivmode.selectByIndex(4);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
        Thread.sleep(3000);
        WebElement browse = step.driver.findElement(By.id("exercise"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalInformation"))).sendKeys("Good internet connection", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(5000);
    }

    @Then("Select the candidate by cancelling schedules round")
    public void select_the_candidate() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-secondary'])[1]"))).click();
        Thread.sleep(5000);
    }

    @Then("roll out offer letter")
    public void roll_out_offer_letter() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder collapseList'])[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("joiningDate"))).sendKeys(Keys.SPACE,Keys.DOWN,Keys.ENTER);
        Select Country = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("country"))));
        Country.selectByIndex(1);
        Select City = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("city"))));
        City.selectByIndex(1);
        Select offervalidity = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("offerValidTime"))));
        offervalidity.selectByIndex(1);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalDetails"))).sendKeys("Please join within 15 days");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button' and @class='noButtonBorder'])[6]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"salaryComponentDetails.0.componentName\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("salaryComponentDetails.0.annualAmount"))).sendKeys("1000");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@title='Next'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Send Offer']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-secondary'])[1]"))).click();
        Thread.sleep(4000);
    }

    @Then("extends offer validity period")
    public void extend_offer_validity_perio() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        Select offervalidity = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("offerValidityPeriodInDays"))));
        offervalidity.selectByIndex(1);
        Select extend = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("validityReason"))));
        extend.selectByIndex(2);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalDetails"))).sendKeys("Offer validity extended");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(3000);
        step.DriverQuit();
    }
    @Then("jobseeker accepts the offer letter")
    public void jobseeker_accepts_the_offer_letter() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='button-with-image button-with-image-border btn btn-secondary'])[1]"))).click();
        Thread.sleep(3000);
        step.driver.findElement(By.name("additionalInfo")).sendKeys("i am interested");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(5000);
    }
    @Then("Jobseeker need more on offer letter")
    public void jobseeker_need_more_on_offer_letter() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='button-with-image button-with-image-border btn btn-secondary'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("reason"))).sendKeys("I want some more info");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        step.DriverQuit();
    }
    @Then("jobseeker rejects the offer letter with work location is not suitable")
    public void jobseeker_rejects_the_offer_letter() {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='button-with-image button-with-image-border btn btn-secondary'])[3]"))).click();
        Select extend = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/select"))));
        extend.selectByIndex(1);
        Select country = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("country"))));
        country.selectByIndex(1);
        Select city = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("city"))));
        city.selectByIndex(13);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("area"))).sendKeys("Hinjewadi");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalDetails"))).sendKeys(" ia m not interested with offered salary");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

    }
    @Then("jobseeker reject offer letter with salary not as per expection")
    public void jobseeker_reject_offer_letter_with_salary_not_as_per_expection() {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='button-with-image button-with-image-border btn btn-secondary'])[2]"))).click();
        Select rejct= new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/select"))));
        rejct.selectByIndex(2);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[1]"))).sendKeys("1000");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]"))).sendKeys("1000");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalDetails"))).sendKeys("i am not interested with offered salary");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
    }

    @Then("jobseeker reject offer letter with availability constraint")
    public void jobseeker_reject_offer_letter_with_availability_constraint() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='button-with-image button-with-image-border btn btn-secondary'])[2]"))).click();
        Select rejct= new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/select"))));
        rejct.selectByIndex(3);
        Select availability= new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("availability"))));
        availability.selectByIndex(3);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalDetails"))).sendKeys("I am not interested");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(2000);
    }

    @Then("jobseeker reject offer letter with other reason")
    public void jobseeker_reject_offer_letter_with_other_reason() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='button-with-image button-with-image-border btn btn-secondary'])[2]"))).click();
        Select rejct= new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/select"))));
        rejct.selectByIndex(4);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("additionalDetails"))).sendKeys("I am not interested");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='toggle']"))).click();
        Select Jcountry= new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("joiningCountry"))));
        Jcountry.selectByIndex(1);
        Select Jcity= new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("joiningCity"))));
        Jcity.selectByIndex(6);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[1]"))).sendKeys("100");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]"))).sendKeys("100");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[4]"))).sendKeys("200");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(3000);
         step.DriverQuit();
    }

}