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

public class SchedulesRoundsAndEnterFeedback {
    BaseStep step = new BaseStep();
    WebDriver driver;
    @Given("Post new job for scheduling interviews")
    public void post_new_job_for_scheduling_interviews() throws InterruptedException {
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
        step.findElement("jobTitle", name, "title").sendKeys("Schedule interview");
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
       Thread.sleep(5000);
        step.findElementClick("//button[@type='submit']", xPath);//submit button
        step.DriverQuit();
    }

    @Then("Jobseeker accepts the intial job invitation")
    public void jobseeker_accepts_the_intial_job_invitation() throws InterruptedException {
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

    @Then("User should be on interview scheduling screen")
    public void user_should_be_on_interview_scheduling_screen() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        //Standard account login
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", BaseStep.Pather.xPath);
        step.findElement("workEmail", BaseStep.Pather.name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", BaseStep.Pather.name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", BaseStep.Pather.xPath);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button", BaseStep.Pather.xPath); //click on view job button
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/button", BaseStep.Pather.xPath);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[2]/div/button", BaseStep.Pather.xPath);
    }
    @Given("Schedules the coding round")
    public void schedules_an_coding_round() throws InterruptedException {
        Select modeIV = new Select(step.findElement("interviewMode", name ,"Experience"));
        modeIV.selectByIndex(4);
        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
//        WebElement dateBox1 = step.driver.findElement(By.id("interviewTime"));
//        dateBox1.sendKeys("");
//        dateBox1.sendKeys(Keys.RIGHT,Keys.RIGHT,Keys.RIGHT,Keys.RIGHT);
//        dateBox1.sendKeys("",Keys.UP);
//        Thread.sleep(2000);

        WebElement browse = step.driver.findElement(By.id("exercise"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        step.findElement("additionalInformation",name,"desc.").sendKeys("good internet connection");
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[3]/button",xPath); //click on feedback button
    }

    @Then("Enter feedbck of coding round as rejected")
    public void enter_feedbck_of_coding_round_as_rejected() throws InterruptedException {
        step.findElement(" //*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[4]/form/div[2]/div/div[3]/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElementClick("//*[@id=\"react-confirm-alert\"]/div/div/div/div/button[1]",xPath);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
        step.findElement("feedbackComments",name,"des").sendKeys("NBNB");
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(2000);
    }

    @Then("Enter feedback of coding round as cleared")
    public void enter_feedback_of_coding_round_as_cleared() throws InterruptedException {
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[7]/button",xPath);//Edit button
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[4]/form/div[2]/div[1]/div[3]/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("//*[@id=\"nextstep\"]/input",xPath,"NBNB").sendKeys("Nothing for now",Keys.ENTER);
        step.findElementClick("//button[@type='submit']",xPath);
         step.DriverQuit();
    }

    @Given("Schedules the Telephonic round")
    public void schedules_the_Telephonic_round() throws InterruptedException {

        Select modeIV = new Select(step.findElement("interviewMode", name ,"Experience"));
        modeIV.selectByIndex(1);
        Select calltype= new Select(step.findElement("callTypeSelect", name ,"Experience"));
        calltype.selectByIndex(1);
        Select Duration1= new Select(step.findElement("duration", name ,"Experience"));
        Duration1.selectByIndex(1);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
        step.findElement("additionalInformation",name,"Additional").sendKeys("Good internet connection required");
        step.findElement("callBridgeDetails",name,"Bridge details").sendKeys("MS Dhoni");

        WebElement dateBox1 = step.driver.findElement(By.id("interviewTime"));
        dateBox1.sendKeys("");
        dateBox1.sendKeys(Keys.RIGHT,Keys.RIGHT,Keys.RIGHT,Keys.RIGHT);
        dateBox1.sendKeys("",Keys.UP);
        step.findElementClick("//button[@type='submit']",xPath);

        Thread.sleep(70000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[3]/button",xPath); //click on feedback button
    }

    @Then("Enter feedback of Telephonic round as rejected")
    public void enter_feedback_of_Telephonic_round_as_rejected() throws InterruptedException {
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[4]/form/div[2]/div/div[3]/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElementClick("//*[@id=\"react-confirm-alert\"]/div/div/div/div/button[1]",xPath);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
        step.findElement("feedbackComments",name,"des").sendKeys("NBNB");
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(2000);
    }

    @Then("Enter feedback of telephonic round as selected")
    public void enter_feedback_of_telephonic_round_as_selected() throws InterruptedException {
        Thread.sleep(4000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[7]/button",xPath);// click on edit button
        Thread.sleep(4000);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[4]/form/div[2]/div[1]/div[3]/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("//*[@id=\"nextstep\"]/input",xPath,"NBNB").sendKeys("Nothing for now",Keys.ENTER);
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(5000);
        step.DriverQuit();
    }

    @Given("Schedules the video conference round")
    public void schedules_the_video_conference_round() throws InterruptedException {
        Select modeIV = new Select(step.findElement("interviewMode", name ,"Experience"));
        modeIV.selectByIndex(2);

        Select Duration1= new Select(step.findElement("duration", name ,"Experience"));
        Duration1.selectByIndex(1);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
        step.findElement("additionalInformation",name,"Additional").sendKeys("Good internet connection required");
        step.findElement("callBridgeDetails",name,"Bridge details").sendKeys("MS Dhoni");

        WebElement dateBox1 = step.driver.findElement(By.id("interviewTime"));
        dateBox1.sendKeys("");
        dateBox1.sendKeys(Keys.RIGHT,Keys.RIGHT,Keys.RIGHT,Keys.RIGHT);
        dateBox1.sendKeys("",Keys.UP);
        step.findElementClick("//button[@type='submit']",xPath);

        Thread.sleep(70000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[3]/button",xPath); //click on feedback button

    }

    @Then("Enter feedback of video conference round as rejected")
    public void enter_feedback_of_video_conference_round_as_rejected() throws InterruptedException {
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[4]/div[2]/div/div[4]/form/div[2]/div/div[3]/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElementClick("//*[@id=\"react-confirm-alert\"]/div/div/div/div/button[1]",xPath);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
        step.findElement("feedbackComments",name,"des").sendKeys("NBNB");
        step.findElementClick("//button[@type='submit']",xPath);

        Thread.sleep(2000);
    }

    @Then("Enter feedback of video conference round as selected")
    public void enter_feedback_of_video_conference_round_as_selected() throws InterruptedException {

        Thread.sleep(4000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[4]/div[2]/div/div[7]/button",xPath);// click on edit button
        Thread.sleep(4000);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[4]/div[2]/div/div[4]/form/div[2]/div[1]/div[3]/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("//*[@id=\"nextstep\"]/input",xPath,"NBNB").sendKeys("Nothing for now",Keys.ENTER);
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(5000);
        step.DriverQuit();
    }

    @Given("Schedules the face to face round round")
    public void schedules_the_face_to_face_round_round() throws InterruptedException {
        Select modeIV = new Select(step.findElement("interviewMode", name ,"Experience"));
        modeIV.selectByIndex(3);

        Select Duration1= new Select(step.findElement("duration", name ,"Experience"));
        Duration1.selectByIndex(3);

        step.findElement("interviewerEmail",name,"NBNB").sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
        step.findElement("additionalInformation",name,"Additional").sendKeys("Good internet connection required");
        step.findElement("address",name,"Bridge details").sendKeys("Baner, pune");

        WebElement dateBox1 = step.driver.findElement(By.id("interviewTime"));
        dateBox1.sendKeys("");
        dateBox1.sendKeys(Keys.RIGHT,Keys.RIGHT,Keys.RIGHT,Keys.RIGHT);
        dateBox1.sendKeys("",Keys.UP);
        step.findElementClick("//button[@type='submit']",xPath);

        Thread.sleep(70000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[6]/div/span[3]/button",xPath); //click on feedback button


    }

    @Then("Enter feedback of face to face round as rejected")
    public void enter_feedback_of_face_to_face_round_as_rejected() throws InterruptedException {
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[5]/div[2]/div/div[4]/form/div[2]/div[1]/div[3]/div/input",xPath,"NBNB").sendKeys("Reject",Keys.ENTER);
        step.findElementClick("//*[@id=\"react-confirm-alert\"]/div/div/div/div/button[1]",xPath);
        step.findElement("//*[@id=\"rejectionReason\"]/input",xPath,"NBNB").sendKeys("Lack of knowledge",Keys.ENTER);
        step.findElement("feedbackComments",name,"des").sendKeys("NBNB");
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(2000);

    }

    @Then("^Enter feedback of face to face round as selected")
    public void enter_feedback_of_face_to_face_round_as_selected() throws InterruptedException {
        Thread.sleep(4000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[5]/div[2]/div/div[7]/button",xPath);// click on edit button
        Thread.sleep(4000);
        step.findElement("//*[@id=\"root\"]/main/div[2]/div[1]/div[1]/div[5]/div[2]/div/div[4]/form/div[2]/div[1]/div[3]/div/input",xPath,"NBNB").sendKeys("Cleared",Keys.ENTER);
        step.findElement("//*[@id=\"candidateLevel\"]/input",xPath,"NBNB").sendKeys("Good",Keys.ENTER);
        step.findElement("//*[@id=\"nextstep\"]/input",xPath,"NBNB").sendKeys("Nothing for now",Keys.ENTER);
        step.findElementClick("//button[@type='submit']",xPath);
        Thread.sleep(5000);
        step.DriverQuit();
    }
}
