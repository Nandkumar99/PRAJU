package Steps;

import Base.BaseStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Postnewjob {

    BaseStep step= new BaseStep();
    @Given("post new job")
    public void post_the_job() throws InterruptedException{
        step.BaseStep();
        step.geturl();
        Thread.sleep(5000);
        step.EmployerLogin();
        step.PostJob(); //post a new job
    }

    @Then("close the browser")
    public void close_the_browser() throws InterruptedException {
       step.DriverQuit();
    }
}
