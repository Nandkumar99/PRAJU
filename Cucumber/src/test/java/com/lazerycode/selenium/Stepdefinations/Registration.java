package com.lazerycode.selenium.Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @When("I Open VeryFyl Home page")
    public void i_open_very_fyl_home_page() {
        driver.get("https://testveryfyl.steerlean.com/");
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[3]/h6[2]/a")).click();


    }

    @Then("I complete Registration")
    public void i_complete_registration() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.name("firstName")).sendKeys("Nandkumar");
        driver.findElement(By.name("lastName")).sendKeys("Babar");
        driver.findElement(By.name("workEmail")).sendKeys("nandkumar.babar@steerlean.com");
        driver.findElement(By.name("phoneNumber")).sendKeys("8010675211");

        Select Employer = new Select(driver.findElement(By.name("employerType")));
        Employer.selectByVisibleText("Direct Employer");
        driver.findElement(By.name("organization")).sendKeys("Steerlean");

        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div/div/div[2]/form/div[9]/label/input"));
        checkbox.click(); //select the checkbox

        driver.findElement(By.name("password")).sendKeys("Babar@999");
        driver.findElement(By.name("confirmPassword")).sendKeys("Babar@999");
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(1000,5500)");

        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div/div/div[2]/form/button")).click();

    }


}