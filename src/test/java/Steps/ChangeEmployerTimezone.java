package Steps;

import Base.BaseStep;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class ChangeEmployerTimezone {

    BaseStep step = new BaseStep();
    @Given("^user should on change time zone page$")
    public void user_should_on_change_time_zone_page() throws Throwable {
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

    @Then("^change the time zone$")
    public void change_the_time_zone() throws InterruptedException {
   step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/button",xPath);
//        Select TimeZone = new Select(step.findElement("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[1]/div/div/select", xPath, "BB"));
//
//        TimeZone.selectByValue("2");
        step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div[1]/div/button",xPath);
Thread.sleep(5000);
step.DriverQuit();
    }






    }
