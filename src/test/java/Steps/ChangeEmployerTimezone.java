package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeEmployerTimezone {
    BaseStep step = new BaseStep();
    @Given("user should on change time zone page")
    public void user_should_on_change_time_zone_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Popover2\"]/img"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div/ul/button[1]"))).click();
    }

    @Then("change the time zone")
    public void change_the_time_zone() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/button"))).click();
        Select Timezone = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("timeZone"))));
        Timezone.selectByIndex(11);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div[1]/div/button"))).click();
//        String ActualTitle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div/div/div[1]"))).getText();
//        String ExpectedTitle = "Timezone successfully set";
//        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
        step.DriverQuit();

    }
}
