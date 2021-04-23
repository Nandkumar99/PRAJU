package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;

public class Postnewjob {

    BaseStep step= new BaseStep ();
    VeryFylLogin log=new VeryFylLogin();


    @Given("post new job")
    public void post_the_job()  throws InterruptedException{

          step.BaseStep();
       step.geturl();
        Thread.sleep(5000);

        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);


        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[1]/span[3]/span",xPath);
        step.findElementClick("//*[@id=\"root\"]/main/div[1]/div[2]/div[1]/div/div[2]/nav/ul/li/div[2]/div/ul/li[2]/div",xPath);
        Thread.sleep(2000);
        step.findElement("jobTitle", name,"title").sendKeys("Automation");
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
        step.findElementClick("//*[@id=\"root\"]/main/div[2]/form/div[8]/button[2]/span[2]",xPath);


    }

    @Then("close the browser")
    public void close_the_browser() throws InterruptedException {
       // step.DriverQuit();

    }

}
