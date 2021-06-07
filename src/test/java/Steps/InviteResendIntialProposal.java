package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Base.BaseStep.Pather.name;

public class InviteResendIntialProposal {
    BaseStep step = new BaseStep();
    @Given("Employer should be on home page")
    public void Employer_should_be_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.EmployerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='noButtonBorder'])[1]"))).click();
        Thread.sleep(3000);
    }

    @Then("send intial job invite to jobseeker")
    public void send_intial_job_invite_to_jobseeker() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"button-with-image button-with-image-border button-margin btn btn-secondary\"])[4]"))).click();
        step.driver.findElement(By.name("fullName")).sendKeys("AB Devilers");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("email"))).sendKeys("AbdDeviliers360@gmail.com");
        Select Avai = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("availability"))));
        Avai.selectByVisibleText("1");
        Select currency = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("currency"))));
        currency.selectByIndex(0);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("salary"))).sendKeys("10000");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("fixedSalary"))).sendKeys("5000");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("joiningBonus"))).sendKeys("100");
        Thread.sleep(3000);
        WebElement browse =step.driver.findElement(By.id("resume"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ql-editor ql-blank']"))).sendKeys("Steerlean");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(2000);
        step.DriverQuit();

    }
    @Then("edit job proposal")
    public void edit_proposal() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"noButtonBorder collapseList\"])[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"noButtonBorder\"])[4]"))).click();
        Select Avalaibility1= new Select(step.findElement("availability", name, BaseStep.TimeOut.HIGH));
        Avalaibility1.selectByIndex(4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        step.DriverQuit();
    }


    @Then("resend job proposal")
    public void resend_job_proposal() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"noButtonBorder collapseList\"])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"noButtonBorder\"])[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("email"))).sendKeys("Abs180@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(5000);
        step.DriverQuit();
    }


    @Then("drop the the candidate")
    public void drop_the_the_candidate() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"noButtonBorder collapseList\"])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"noButtonBorder\"])[5]"))).click();
        Select Employer = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("reason"))));
        Employer.selectByIndex(1);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("comment"))).sendKeys("Candidate is not good");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(4000);
        step.DriverQuit();
    }

}
