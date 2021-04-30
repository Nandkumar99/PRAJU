package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

import static Base.BaseStep.Pather.*;

public class HistoricFeedbacks {
    BaseStep step = new BaseStep();
    WebDriver driver;

    @Given("Post new job for historic feedback")
    public void post_new_job_for_historic_feedback() throws InterruptedException {
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
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[1]/span[3]/span", xPath);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[2]/div/ul/li[2]/div", xPath);
        Thread.sleep(2000);
        step.findElement("jobTitle", name, "title").sendKeys("Historic feedbacks");
        Select MinExp = new Select(step.findElement("minYearsOfExperience", name, "Experience"));
        MinExp.selectByVisibleText("5");
        Select MaxExp = new Select(step.findElement("maxYearsOfExperience", name, "Experience"));
        MaxExp.selectByVisibleText("10");
        Select country = new Select(step.findElement("country", name, "Location"));
        country.selectByVisibleText("India");
        Select city = new Select(step.findElement("city", name, "Experience"));
        city.selectByVisibleText("Pune");
        step.findElement("noOfPositions", name, "position").sendKeys("1001");
        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/div/div[2]/div[1]", xPath, "req").sendKeys("Steerlean.com");
        Thread.sleep(3000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/form/div[8]/button[2]/span[2]", xPath);// click on post job button
        Thread.sleep(5000);

        //send intial jobinvitation
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button", xPath); //click on view job button
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/button/span[2]", xPath, "invite candidate").click();
        Thread.sleep(5000);
        step.findElement("fullName", name, "full name").sendKeys("Historic");
        step.findElement("email", name, "email").sendKeys("ricky77ponting@gmail.com");
        Thread.sleep(5000);
        Select Avalaibility = new Select(step.findElement("availability", name, "Avalaibility"));
        Avalaibility.selectByVisibleText("1");

        Select Currency = new Select(step.findElement("currency", name, "Currency"));
        Currency.selectByIndex(0);

        step.findElement("salary", id, "expected salary").sendKeys("10000");
        step.findElement("fixedSalary", id, "Offered salary").sendKeys("5000");
        step.findElement("joiningBonus", id, "joining bonus").sendKeys("100");

        WebElement browse = step.driver.findElement(By.id("resume"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");

        step.findElement("//div[@class='ql-editor ql-blank']", xPath, "desc").sendKeys("steerlean");
        step.findElementClick("//button[@type='submit']", xPath);//submit button
         step.DriverQuit();
    }

    @Given("Jobseeker accepts the job invitation")
    public void jobseeker_accepts_the_job_invitation() throws InterruptedException {

        Thread.sleep(10000);
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.findElementClick("//img[@class='socialLoginIcons']", xPath);
        Thread.sleep(10000);

        // Switch parent window to child window
        System.out.println("driver" + driver);
        Set<String> handler = step.driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        System.out.println("title" + handler);
        String parentWindowId = it.next();
        System.out.println("parent window id:" + parentWindowId);
        String childWindowId = it.next();
        System.out.println("Child window id:" + childWindowId);
        step.driver.switchTo().window(childWindowId);
        Thread.sleep(5000);


        //login to jobseeker account
        step.findElement("//input[@id='username']", xPath, "name").sendKeys("ricky77ponting@gmail.com");
        step.findElement("//input[@id='password']", xPath, "password").sendKeys("Ad$12345");
        step.findElementClick("//button[@type='submit']", xPath);
        Thread.sleep(5000);
        step.driver.switchTo().window(parentWindowId); //again switch to parent window

        //jobseeker accepts the job invitation
        Thread.sleep(15000);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[2]/span/div/div[1]/div[2]/div[1]/div/div[8]/div/div[1]/button", xPath, BaseStep.TimeOut.HIGH).click();//view job button
        Thread.sleep(7000);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div[1]/div[3]/div/div[1]/button", xPath, BaseStep.TimeOut.HIGH).click();//view job button
        step.findElement("additionalInfo", name, "accepts").sendKeys("i am interested");
        step.findElementClick("//button[@type='submit']", xPath);
        step.DriverQuit();

    }

    @Given("user should be on feedback screen")
    public void user_should_be_on_feedback_screen() throws InterruptedException {

        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
                                 //Standard account login
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button", xPath); //click on view job button
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/button", xPath);
        Thread.sleep(2000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[3]/button", xPath);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div/div/div[2]/div/button/span[2]", xPath);


    }
    @Then("Enter reject feedback for telephonic round")
    public void enter_reject_feedback_for_telephonic_round() throws InterruptedException {
        //Telephonic round
        Thread.sleep(60000);
        Select MaxExp2 = new Select(step.findElement("interviewMode", name ,"Experience"));
        MaxExp2.selectByIndex(1);

        WebElement dateBox1 = step.driver.findElement(By.id("interviewTime"));
        dateBox1.sendKeys("");
        dateBox1.sendKeys(Keys.SPACE);
        dateBox1.sendKeys("",Keys.ENTER);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Select Duration2 = new Select(step.findElement("duration", name , BaseStep.TimeOut.CUSTOM_MAX));;
        Duration2.selectByIndex(2);

        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
        step.findElement("feedbackComments",name, BaseStep.TimeOut.CUSTOM_MAX).sendKeys("good candi");
        step.findElementClick("//button[@type='submit']",xPath);

    }

    @Then("Enter select feedback for telephonic round")
    public void enter_select_feedback_for_telephonic_round() throws InterruptedException {
        Thread.sleep(100000);
        Select MaxExp2 = new Select(step.findElement("interviewMode", name ,"Experience"));
        MaxExp2.selectByIndex(1);

        WebElement dateBox1 = step.driver.findElement(By.id("interviewTime"));
        dateBox1.sendKeys("");
        dateBox1.sendKeys(Keys.SPACE);
        dateBox1.sendKeys("",Keys.ENTER);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Select Duration2 = new Select(step.findElement("duration", name , BaseStep.TimeOut.CUSTOM_MAX));;
        Duration2.selectByIndex(2);

        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("feedbackComments",name, BaseStep.TimeOut.CUSTOM_MAX).sendKeys("good candi");
        step.findElementClick("//button[@type='submit']",xPath);

        step.DriverQuit();

    }

    @Then("Enter reject feedback for video conference round")
    public void Enter_reject_feedback_for_video_conference_round() throws InterruptedException {
        Select MaxExp1 = new Select(step.findElement("interviewMode", name ,"Experience"));
        MaxExp1.selectByIndex(2);

        WebElement dateBox = step.driver.findElement(By.id("interviewTime"));
        dateBox.sendKeys("");
        dateBox.sendKeys(Keys.SPACE);
        dateBox.sendKeys("",Keys.ENTER);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Select Duration = new Select(step.findElement("duration", name , BaseStep.TimeOut.CUSTOM_MAX));;
        Duration.selectByIndex(2);

        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
         step.findElement("feedbackComments",name, BaseStep.TimeOut.CUSTOM_MAX).sendKeys("good candi");
         step.findElementClick("//button[@type='submit']",xPath);



    }
    @Then("Enter select feedback for video conference round")
    public void Enter_select_feedback_for_video_conference_round() throws InterruptedException {
        Thread.sleep(100000);
        Select MaxExp1 = new Select(step.findElement("interviewMode", name ,"Experience"));
        MaxExp1.selectByIndex(2);

        WebElement dateBox = step.driver.findElement(By.id("interviewTime"));
        dateBox.sendKeys("");
        dateBox.sendKeys(Keys.SPACE);
        dateBox.sendKeys("",Keys.ENTER);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Select Duration = new Select(step.findElement("duration", name , BaseStep.TimeOut.HIGH));;
        Duration.selectByIndex(2);

        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("feedbackComments",name, BaseStep.TimeOut.HIGH).sendKeys("good candi");
        step.findElementClick("//button[@type='submit']",xPath);
        step.DriverQuit();

    }

    @Then("Enter reject feedback for Face to face round")
    public void enter_reject_feedback_for_Face_to_face_round() throws InterruptedException {
        Thread.sleep(1000);
        Select MaxExp3 = new Select(step.findElement("interviewMode", name ,"Experience"));
        MaxExp3.selectByIndex(3);

        WebElement dateBox2 = step.driver.findElement(By.id("interviewTime"));
        dateBox2.sendKeys("");
        dateBox2.sendKeys(Keys.SPACE);
        dateBox2.sendKeys("",Keys.ENTER);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Select Duration3 = new Select(step.findElement("duration", name , BaseStep.TimeOut.CUSTOM_MAX));;
        Duration3.selectByIndex(3);
        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
        step.findElement("feedbackComments",name,"Feedback").sendKeys("not good candidate");
        step.findElement("//button[@type='submit']",xPath, BaseStep.TimeOut.MIDDLE).click();

    }

    @Then("Enter select feedback for Face to face round")
    public void enter_select_feedback_for_Face_to_face_round() throws InterruptedException {
        Thread.sleep(100000);
        Select MaxExp3 = new Select(step.findElement("interviewMode", name ,"Experience"));
        MaxExp3.selectByIndex(3);

        WebElement dateBox2 = step.driver.findElement(By.id("interviewTime"));
        dateBox2.sendKeys("");
        dateBox2.sendKeys(Keys.SPACE);
        dateBox2.sendKeys("",Keys.ENTER);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        Select Duration3 = new Select(step.findElement("duration", name , BaseStep.TimeOut.LOW));;
        Duration3.selectByIndex(3);
        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("feedbackComments",name, "feedback").sendKeys("good candidate");
        step.findElement("//button[@type='submit']",xPath, BaseStep.TimeOut.HIGH).click();
        step.DriverQuit();
    }

    @Then("Enter reject feedback for coding round")
    public void enter_reject_feedback_for_coding_round(){
                Select MaxExp4 = new Select(step.findElement("interviewMode", name ,"Experience"));
                MaxExp4.selectByIndex(4);
        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
        step.findElement("feedbackComments",name, "feedback").sendKeys("Not good candidate");
        step.findElementClick("//button[@type='submit']",xPath);

    }



    @Then("Enter select feedback for coding round")
    public void enter_select_feedback_for_coding_round() throws InterruptedException {
        Thread.sleep(100000);
        Select MaxExp4 = new Select(step.findElement("interviewMode", name ,"Experience"));
        MaxExp4.selectByIndex(4);
        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com",Keys.ENTER);
        step.findElement("//*[@id=\"root\"]/main/div[2]/form/div[6]/div/div/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("feedbackComments",name, "feedback").sendKeys("good candidate");
        step.findElementClick("//button[@type='submit']",xPath);
        step.DriverQuit();
    }



    }
