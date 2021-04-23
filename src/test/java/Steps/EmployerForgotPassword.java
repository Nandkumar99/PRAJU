package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class EmployerForgotPassword {
    BaseStep step= new BaseStep();

    @Given("User should be on forgot password page")
    public void user_should_be_on_forgot_password_page(){
        step.BaseStep();
        step.geturl();
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
       step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[4]/a",xPath);

    }

    @Then("User forgot the password")
    public void user_forgot_the_password(){

        step.findElement("workEmail",name,"enter link").sendKeys("nandu@99gmail.com");
        step.DriverQuit();




    }

}
