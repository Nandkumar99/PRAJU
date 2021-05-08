package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeoutException;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class AddUsers {
    BaseStep step = new BaseStep();
    WebDriver driver;

    @Given("^User should be on add user page$")
    public void user_should_be_on_add_user_page() throws Throwable {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("jayesh.kshatriya@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Jayesh@123");
        step.findElementClick("//button[@type='submit']", xPath);//login button
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/div[1]/span[3]", xPath);
        Thread.sleep(3000);
    }


    @Then("^Add users$")
    public void add_user() throws Throwable {
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/" +
                "nav/ul/li[2]/div[2]/div/ul/li[1]/div/span", xPath);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/button/span[2]", xPath, BaseStep.TimeOut.HIGH).click();

        Thread.sleep(4000);
        step.findElement("firstName", name, BaseStep.TimeOut.HIGH).sendKeys("Nandkumar");
        step.findElement("lastName", name, BaseStep.TimeOut.HIGH).sendKeys("Babar");
        step.findElement("workEmail", name, BaseStep.TimeOut.HIGH).sendKeys("nandkumar");
        step.findElement("phoneNumber", name, "phone").sendKeys("8010675211");
        Thread.sleep(2000);
        step.findElement("//button[@type='submit']", xPath, "nb").click();//submit button
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[1]/button", xPath);
    }

    @Then("^Remove users$")
    public void Remove_users() throws InterruptedException {
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div/div/div[1]/div[2]/div[8]/div/div[4]/div/div/div/button", xPath);
        Thread.sleep(5000);
        step.findElementClick("//button[@type='submit']", xPath);
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[1]/button", xPath);

    }


}