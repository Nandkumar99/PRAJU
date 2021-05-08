package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class ManagePolicies {
    BaseStep step= new BaseStep();
    WebDriver driver;

    @Given("^Remove user$")
    public void remove_user() throws InterruptedException {

        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);


        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("jayesh.kshatriya@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Jayesh@123");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/div[1]/span[3]", xPath);
        Thread.sleep(3000);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li[2]/div[2]/div/ul/li[2]/div/span",xPath);
        Thread.sleep(5000);

              //Remove policy
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/button[4]",xPath);
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[3]/button[1]",xPath);
    }


    @Then("^Flip policy$")
    public void add_the_user() throws InterruptedException {
        Thread.sleep(5000);
       // flip policy
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/button[3]",xPath);
        Thread.sleep(3000);
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div/div[1]/div/label/input",xPath);
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button",xPath);
    }

    @Then("^View policy$")
    public void edit_the_user() throws InterruptedException {
        //view policy
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/button[1]",xPath);
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[1]/button",xPath);
        Thread.sleep(2000);
    }

    @Then("^Add policy")
    public void flip_policies() throws InterruptedException {
Thread.sleep(5000);
     step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/button/span[2]",xPath);
Thread.sleep(5000);
        step.findElement("title",name,"name").sendKeys("Policy 99");
        WebElement browse = step.driver.findElement(By.xpath("//input[@name='policyDoc']"));

        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
step.findElementClick("//button[@type='submit']",xPath);
    }
    @Then("^Edit policy")
    public void Edit_policy() throws InterruptedException {
        Thread.sleep(5000);
       step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/button[2]",xPath);
        Thread.sleep(5000);
        WebElement browse1 = step.driver.findElement(By.xpath("//input[@name='policyDoc']"));
        browse1.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");

        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(5000);
     step.DriverQuit();
    }
}
