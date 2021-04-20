//package com.lazerycode.selenium.Stepdefinations;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LoginStepDefination {
//WebDriver driver;
//    @Given("user is already on login page")
//    public void user_is_already_on_login_page() {
//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//        driver.get("http://www.freecrm.com");
//
//
//    }
//
//    @When("^title of login page is free CRM$")
//    public void title_of_login_page_is_free_crm() {
//
//
//    }
//
//    @Then("user enters username and user enters password")
//    public void user_enters_username_and_user_enters_password() {
//
//    }
//
//    @Then("user clicks on login button")
//    public void user_clicks_on_login_button() {
//
//    }
//}