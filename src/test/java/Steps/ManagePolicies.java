package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagePolicies {
    BaseStep step= new BaseStep();
    WebDriver driver;

    @Given("Employer should be on policy page")
    public void remove_user() throws InterruptedException {

        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("workEmail"))).sendKeys("jayesh.kshatriya@steerlean.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Jayesh@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/div[1]/span[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/div[2]/div/ul/li[2]/div/span"))).click();
    }
    @Then("Employer Flip policy")
    public void add_the_user() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/button[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div/div[1]/div/label/input"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button"))).click();
        Thread.sleep(4000);
    }
    @Then("Employer View policy")
    public void edit_the_user() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/button[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]/button/span"))).click();
    }
    @Then("Employer Remove policy")
    public void removepolicy() throws InterruptedException {
        //Remove policy
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"noButtonBorder\"])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div[2]/button[1]"))).click();
        Thread.sleep(5000);
    }

    @Then("Employer Add policy")
    public void flip_policies() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("title"))).sendKeys("Policy 3");
        WebElement browse = step.driver.findElement(By.xpath("//input[@name='policyDoc']"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
    }
    @Then("Employer Edit policy")
    public void Edit_policy() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/button[2]"))).click();
        WebElement browse1 = step.driver.findElement(By.xpath("//input[@name='policyDoc']"));
        browse1.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        step.DriverQuit();
    }
}
