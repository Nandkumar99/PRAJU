package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class EmployerRegistration {

    WebDriver driver;
    BaseStep step = new BaseStep();

    @When("I open veryfyl registration page")
    public void I_open_veryfyl_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();

        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[3]/h6[2]/a", xPath);

    }

    @Then("I complate veryfyl Registration")
    public void I_complate_veryfyl_Registration() throws InterruptedException {
        step.findElement("firstName", name, "2").sendKeys("Nandkumar");
        ;
        step.findElement("lastName", name, "b").sendKeys("Babar");
        step.findElement("organization", name, "orag").sendKeys("Steerlean");
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");

        Select Employer = new Select(step.findElement("employerType", name, "BB"));

        Employer.selectByVisibleText("Direct Employer");

        step.findElement("phoneNumber", name, "@").sendKeys("8010675211");
        step.findElement("password", name, "B").sendKeys("Babar@99");
        step.findElement("confirmPassword", name, "BB").sendKeys("Babar@99");
        step.findElement("//*[@id=\"root\"]/main/div/div/div/div/div/div/div[2]/form/div[9]/label/input", xPath, "smsm").click();
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div/div/div/div/div[2]/form/button", xPath);
        step.PageScrolldown();
        Thread.sleep(5000);
         }

        @And("close a browser")
        public void close_browser() throws InterruptedException {
        step.DriverQuit();
        }
        }