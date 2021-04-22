package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class Login {

    //    WebDriver driver;
    BaseStep step = new BaseStep();

    @When("I open VeryFyl Login page")
    public void i_open_very_fyl_login_page() {
        step.BaseStep();
        step.geturl();


    }

    @Then("I Open VeryFyl Home page")
    public void i_open_very_fyl_home_page() throws InterruptedException {

        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);

        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");


        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");

        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
    }

    @Then("close browser")
    public void close_browser() {
        step.DriverQuit();

    }
}

