package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Base.BaseStep.Pather.xPath;

public  class CloneJob{
    BaseStep step= new BaseStep();
    public WebDriver driver;

    @Given("User should be on Home page")
    public void User_should_be_on_Home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();

    }
    @Then("clone the job")
    public void clone_the_job() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[1]/span[3]/span"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[2]/div/ul/li[2]/div"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[2]/div/div/div/button/span[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div/button"))).click();
       Thread.sleep(4000);
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/div[3]/div/div[1" +
                "]/div[2]/div[1]/div/div[1]",xPath);
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div[4]/div/div[1]/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/form/div[8]/button[2]"))).click();
         Thread.sleep(4000);
         step.DriverQuit();


    }

}
