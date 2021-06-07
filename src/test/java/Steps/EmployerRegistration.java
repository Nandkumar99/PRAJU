package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployerRegistration {
    WebDriver driver;
    BaseStep step = new BaseStep();

    @When("I open veryfyl registration page")
    public void I_open_veryfyl_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register as an Employer"))).click();
    }

    @Then("I complate veryfyl Registration")
    public void I_complate_veryfyl_Registration() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName"))).sendKeys("Nandkumar");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("lastName"))).sendKeys("babar");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("organization"))).sendKeys("Steerlean");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("workEmail"))).sendKeys("nandkumar.babar@steerlean.com");
        Select Employer = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("employerType"))));
        Employer.selectByVisibleText("Direct Employer");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("phoneNumber"))).sendKeys("8010675211");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Babar@99");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("confirmPassword"))).sendKeys("Babar@99");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='alert']"))).getText();
        String ExpectedTitle = "Work Email is already registered.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
        step.DriverQuit();
    }
}