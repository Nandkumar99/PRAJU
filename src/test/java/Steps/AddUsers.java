package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUsers {
    BaseStep step = new BaseStep();
    WebDriver driver;

    @Given("User should be on add user page")
    public void user_should_be_on_add_user_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("workEmail"))).sendKeys("jayesh.kshatriya@steerlean.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Jayesh@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/div[1]/span[3]"))).click();
        Thread.sleep(3000);
    }


    @Then("employer Add users")
    public void add_user() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/" +
                "nav/ul/li[2]/div[2]/div/ul/li[1]/div/span"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/button/span[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName"))).sendKeys("nandkumar");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("lastName"))).sendKeys("Babar");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("workEmail"))).sendKeys("nandkumar");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("phoneNumber"))).sendKeys("8010675211");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/form/div[5]/div[2]/div/button"))).click();

 }

    @Then("Employer remove users")
    public void Remove_users() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/div[2]/div/ul/li[1]/div"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div[1]/div[2]/div[8]/div/div[4]/div/div/div/button"))).click();
        Thread.sleep(2000);
        step.DriverQuit();
    }


}