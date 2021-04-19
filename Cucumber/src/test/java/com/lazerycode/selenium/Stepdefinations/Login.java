package com.lazerycode.selenium.Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();

    }
    @When("I open VeryFyl Login page")
    public void i_open_very_fyl_login_page() {
        driver.get("https://testveryfyl.steerlean.com/");
    }
    @Then("I Open VeryFyl Home page")
    public void i_open_very_fyl_home_page() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]")).click();
        driver.findElement(By.name("workEmail")).sendKeys("nandkumar.babar@steerlean.com");
        driver.findElement(By.name("password")).sendKeys("Babar@99");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
        @And("close browser")
        public void close_browser() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.quit();
        }
        }
