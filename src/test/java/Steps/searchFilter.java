package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchFilter {
    BaseStep step = new BaseStep();

    @When("employer should be on home page")
    public void employer_should_be_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        step.EmployerLogin();
    }
    @Then("employer search by job title")
    public void employer_search_by_job_title() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div[1]/div/div"))).click();
        Thread.sleep(3000);
        step.DriverQuit();
    }
    @Then("filter by no of position")
    public void filter_by_no_of_position() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div[2]/div[1]/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"allListingDates\"]"))).click();
        Thread.sleep(3000);
    }

    @Then("filter by listing date")
    public void filter_by_listing_date() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name=\"filterByRadio\"])[4]"))).click();
        Thread.sleep(3000);

    }
    @Then("filter by location")
    public void filter_by_location() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div/div/div/div[1]/div/div"))).click();
        Thread.sleep(3000);
        step.DriverQuit();
    }

}
