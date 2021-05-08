package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Base.BaseStep.Pather.*;

public class IntialJobProposal {

    BaseStep step = new BaseStep();
    @Given("Employer should be on home page")
    public void Employer_should_be_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(5000);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button",xPath);
        Thread.sleep(7000);

    }

    @Then("send intial job invite to jobseeker")
    public void send_intial_job_invite_to_jobseeker() throws InterruptedException {
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/button",xPath);
        step.findElement("fullName",name,"full name").sendKeys("AB Deviliers");
        step.findElement("email",name,"email").sendKeys("ABDevilers360@gmail.com");
        Thread.sleep(5000);
        Select Avalaibility= new Select(step.findElement("availability", name, "Avalaibility"));
        Avalaibility.selectByVisibleText("1");

        Select Currency= new Select(step.findElement("currency", name, "Currency"));
        Currency.selectByIndex(0);

        step.findElement("salary",id,"expected salary").sendKeys("10000");
        step.findElement("fixedSalary",id,"Offered salary").sendKeys("5000");
        step.findElement("joiningBonus",id,"joining bonus").sendKeys("100");

        WebElement browse = step.driver.findElement(By.id("resume"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");

        step.findElement("//div[@class='ql-editor ql-blank']",xPath, "desc").sendKeys("steerlean");
        step.findElementClick("//button[@type='submit']",xPath);//submit button
        Thread.sleep(5000);
        step.DriverQuit();


    }
    @Then("edit job proposal")
    public void edit_proposal() throws InterruptedException {
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[1]/button",xPath);// click on invite candidate
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[6]/div/span[4]/div/button",xPath);//edit job proposal
        Thread.sleep(2000);
        Select Avalaibility1= new Select(step.findElement("availability", name, BaseStep.TimeOut.HIGH));
        Avalaibility1.selectByIndex(4);
        Thread.sleep(5000);
        step.findElementClick("//button[@type='submit']",xPath);//submit button
        Thread.sleep(5000);
        step.DriverQuit();
        }


    @Then("resend job proposal")
    public void resend_job_proposal() throws InterruptedException {
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[1]/button",xPath);step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[6]/div/span[3]/div/button",xPath);//resend job proposal
        step.findElement("email",name,"new email").sendKeys("ABD360@gmail.com");
        step.findElementClick("//button[@type='submit']",xPath);//submit button
        Thread.sleep(5000);
        step.DriverQuit();
        }


    @Then("drop the the candidate")
    public void drop_the_the_candidate() throws InterruptedException {
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[1]/button",xPath);//click on invite cand.
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[6]/div/span[5]/button",xPath);//click on drop button

        Select reason= new Select(step.findElement("reason", name, "Avalaibility"));
        reason.selectByIndex(1);

        step.findElement("comment",name,"Comments").sendKeys("candidate is not good");
        step.findElementClick("//button[@type='submit']",xPath);//submit button
        Thread.sleep(4000);
        step.DriverQuit();
        }

        }




