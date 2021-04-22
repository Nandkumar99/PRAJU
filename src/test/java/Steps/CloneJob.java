package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class CloneJob {

    BaseStep step= new BaseStep();

    @Given("clone job")
    public void clone_job() throws InterruptedException {
        step.BaseStep();

        step.geturl();

        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);

        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");


        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");

        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);

        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[1]/span[3]/span",xPath);
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[2]/div/ul/li[2]/div",xPath);
        Thread.sleep(20000);
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/form/div[2]/div/div/div/button/span[2]",xPath);

step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div/button",xPath);
Thread.sleep(5000);

//        Select Jobtitle= new Select(step.findElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/svg", xPath ,"BB"));;
//        Jobtitle.selectByVisibleText("DB1");

Thread.sleep(2000);
step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/div[4]/div/div[1]/button",xPath);


    }

    @And("after clone close the browser")
    public void after_clone_job_close_browser() throws Throwable {



    }

}
