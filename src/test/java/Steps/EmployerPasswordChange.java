package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class EmployerPasswordChange {
    BaseStep step = new BaseStep();

    @Given("user should on change password field")
    public void user_should_on_change_passord_field() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.EmployerLogin();
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"Popover2\"]/img", xPath); //click on profile button
        step.findElementClick("/html/body/div[2]/div/div/div/div/ul/button[1]", xPath); //click on profile btn
        Thread.sleep(5000);
    }

    @Then("change the password")
    public void change_the_password() throws InterruptedException {
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/a", xPath);  //click on change password
        step.findElement("newPassword", name, "change password").sendKeys("Babar@9899");
        step.findElement("confirmPassword", name, "confirm password").sendKeys("Babar@9899");
        Thread.sleep(2000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div/div/div/form/button", xPath);
        Thread.sleep(5000);
        String ExpectedResult = step.findElement("//*[@id=\"feedback\"]",xPath,"NB").getText();
        String ActualResult = "Password set successfully.";
        Assert.assertEquals(ExpectedResult, ActualResult);
        step.DriverQuit();
    }

}
