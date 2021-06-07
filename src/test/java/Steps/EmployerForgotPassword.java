package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployerForgotPassword {
    BaseStep step= new BaseStep();

    @Given("User should be on forgot password page")
    public void user_should_be_on_forgot_password_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[4]/a"))).click();
        Thread.sleep(3000);
    }

    @Then("User forgot the password")
    public void user_forgot_the_password(){
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("workEmail"))).sendKeys("nandkumar@99gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"feedback\"]"))).getText();
        String ExpectedTitle = "We could not find an account with that email address. Please register first.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        step.DriverQuit();

    }

}
