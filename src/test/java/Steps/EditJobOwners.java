package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class EditJobOwners {
    public WebDriver driver;
    //WebDriver driver;
    BaseStep step = new BaseStep();
    @Given("^Post new job for edit owners$")
    public void post_new_job_for_edit_owners() throws Throwable{
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        Thread.sleep(5000);

        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(5000);}




    @Then("^Add and Remove job owner$")
    public void add_job_owner() throws Throwable{
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[3]", xPath);
        Thread.sleep(2000);
step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[3]/div/div/button",xPath);
Thread.sleep(5000);
step.findElementClick("/html/body/div[4]/div/div/div[3]/button[1]",xPath);
   Thread.sleep(5000);
             // add job owner
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[3]/button",xPath);
        Thread.sleep(5000);
        step.DriverQuit();
    }

}
