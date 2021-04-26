package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static Base.BaseStep.Pather.name;
import static Base.BaseStep.Pather.xPath;


public class EmployerPictureChange {
    BaseStep step = new BaseStep();
    @Given("^user should on home page$")
    public void user_should_on_home_page() throws InterruptedException {
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.findElementClick("//*[@id=\"root\"]/main/div/div/div[2]/div/button[2]/span[2]", xPath);
        step.findElement("workEmail", name, "2").sendKeys("nandkumar.babar@steerlean.com");
        step.findElement("password", name, "PASSWORD").sendKeys("Babar@99");
        step.findElementClick("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button", xPath);
        Thread.sleep(5000);


    }

    @Then("^Change the profile picture$")
    public void change_the_profile_picture() throws InterruptedException {
step.findElementClick("//*[@id=\"Popover2\"]/img",xPath); //click on profile button
step.findElementClick("/html/body/div[2]/div/div/div/div/ul/button[1]",xPath); //click on profile btn
        Thread.sleep(5000);
step.findElementClick("step.findElementClick(\"\",xPath);\n",xPath); //click on change picture
step.findElementClick("//*[@id=\"inner-circle\"]",xPath); //click picture
step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[3]/div/div[2]/" +
        "div/div[1]/div[2]/div/div/button/span[2]",xPath); //click on confirm preview


    }

}
