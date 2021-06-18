package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Base.BaseStep.Pather.xPath;

public class AddRemoveJobOwner {
    public WebDriver driver;
    BaseStep step = new BaseStep();

    @Given("user should be on job owner page")
    public void post_new_job_for_edit_owners() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.EmployerLogin();
    }

    @Then("remove job owner")
    public void add_job_owner() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[3]", xPath);
        Thread.sleep(3000);
        step.driver.findElement(By.xpath("(//button[@class=\"noButtonBorder\"])[22]")).click();
        Thread.sleep(2000);
        step.driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary\"])[1]")).click();
        Thread.sleep(2000);
        step.DriverQuit();

    }
    @Then("Add job owner")
    public void remove_job_owner() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[3]", xPath);
        Thread.sleep(2000);
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[1]",xPath);
        Thread.sleep(3000);
        step.DriverQuit();

    }

}
