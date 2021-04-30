package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

import static Base.BaseStep.Pather.*;

public class JobseekerAccepsRejectNeedMoreInfo {

    BaseStep step= new BaseStep();
    WebDriver driver;

    @Given("I post new job and send intial job invite to jobseeker")
    public void I_post_new_job_and_send_intial_job_invite() throws InterruptedException {

        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
                                //Standard account login
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);

                                //post new job
        Thread.sleep(6000);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[1]/span[3]/span",xPath);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[2]/div/ul/li[2]/div",xPath);
        Thread.sleep(2000);
        step.findElement("jobTitle", name,"title").sendKeys("final");
        Select MinExp = new Select(step.findElement("minYearsOfExperience", name ,"Experience"));;
        MinExp.selectByVisibleText("5");

        Select MaxExp = new Select(step.findElement("maxYearsOfExperience", name ,"Experience"));;
        MaxExp.selectByVisibleText("10");

        Select country = new Select(step.findElement("country", name ,"Location"));;
        country.selectByVisibleText("India");


        Select city = new Select(step.findElement("city", name ,"Experience"));;
        city.selectByVisibleText("Pune");

        step.findElement("noOfPositions",name,"position").sendKeys("100");
        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/div/div[2]/div[1]",xPath,"req").sendKeys("Steerlean.com");
        Thread.sleep(3000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/form/div[8]/button[2]/span[2]",xPath);// click on post job button
        Thread.sleep(5000);

                     //send intial jobinvitation
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button",xPath); //click on view job button
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/button/span[2]",xPath,"invite candidate").click();
        Thread.sleep(5000);
        step.findElement("fullName",name,"full name").sendKeys("AB Deviliers");
        step.findElement("email",name,"email").sendKeys("ricky77ponting@gmail.com");
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

    @Then("jobseeker should be on list job page")
    public void jobseeker_should_be_on_list_job_page() throws InterruptedException {

        Thread.sleep(5000);
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.findElementClick("//img[@class='socialLoginIcons']",xPath);
        Thread.sleep(10000);

        // Switch parent window to child window
        System.out.println("driver"+ driver);
        Set<String> handler = step.driver.getWindowHandles();
        Iterator<String> it= handler.iterator();
        System.out.println("title" +handler);
        String parentWindowId =it.next();
        System.out.println("parent window id:"+ parentWindowId);
        String childWindowId= it.next();
        System.out.println("Child window id:"+ childWindowId);
        step.driver.switchTo().window(childWindowId);
        Thread.sleep(5000);


                           //login to jobseeker account
        step.findElement("//input[@id='username']",xPath,"name").sendKeys("ricky77ponting@gmail.com");
        step.findElement("//input[@id='password']",xPath,"password").sendKeys("Ad$12345");
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(3000);

        step.driver.switchTo().window(parentWindowId); //again switch to parent window
         Thread.sleep(10000);

    }

    @Then("jobseeker do need more info")
    public void jobseeker_do_need_more_info() throws InterruptedException {
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/span/div/div[1]/div[2]/div[1]/div/div[8]/div/div[1]/button",xPath, BaseStep.TimeOut.HIGH).click();//view job button
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div[1]/div[3]/div/div[2]/button/span[1]",xPath);//nedd more info button
        step.findElement("reason",name,"description").sendKeys("I want salary structure");//add comment in need more info
        step.findElementClick("//button[@type='submit']",xPath);// submit button
        Thread.sleep(5000);
        step.DriverQuit();
    }

    @Then("jobseeker accepts the job proposal")
    public void jobseeker_accepts_the_job_proposal() throws InterruptedException {
        Thread.sleep(15000);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/span/div/div[1]/div[2]/div[1]/div/div[8]/div/div[1]/button",xPath, BaseStep.TimeOut.HIGH).click();//view job button
        Thread.sleep(3000);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div[1]/div[3]/div/div[1]/button",xPath, BaseStep.TimeOut.HIGH).click();//view job button
        step.findElement("additionalInfo",name,"accepts").sendKeys("i am interested");
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(5000);
        step.DriverQuit();
    }



    @Then("jobseeker reject the job proposal")
    public void jobseeker_reject_the_job_proposal() throws InterruptedException {
        Thread.sleep(15000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/span/div/div[1]/div[2]/div[1]/div/div[8]/div/div[3]/button",xPath);

        Thread.sleep(7000);
        Select Currency1= new Select(step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/select", xPath, "Currency"));
        Currency1.selectByIndex(1);

        Thread.sleep(5000);
        Select country1= new Select(step.findElement("country", name, "Currency"));
        country1.selectByIndex(1);

        Select city1= new Select(step.findElement("city", name, "Currency"));
        city1.selectByIndex(5);

        step.findElement("area",name,"area").sendKeys("punaa");
        step.findElement("additionalDetails",name,"additonal").sendKeys("okokok");
step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/form/div[5]/button[2]/span[2]",xPath);
        step.DriverQuit();

    }

}
