package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class EmployerPasswordChange {
    BaseStep step = new BaseStep();
    @Given("^user should on change passord field$")
    public void user_should_on_change_passord_field() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"Popover2\"]/img",xPath); //click on profile button
        step.findElementClick("/html/body/div[2]/div/div/div/div/ul/button[1]",xPath); //click on profile btn
        Thread.sleep(5000);


    }

    @Then("^change the password$")
    public void change_the_password(){
    step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/a",xPath);  //click on change password
    step.findElement("newPassword",name,"change password").sendKeys("Babar@99");
    step.findElement("confirmPassword",name,"confirm password").sendKeys("Babar@99");
step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div/div/div/form/button",xPath);
    }

    @And("^close the change password page$")
    public void close_the_change_password_page(){
step.DriverQuit();
    }
}
