package Steps;//package Steps;
//
//import Base.BaseStep;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.ClickAction;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.security.Key;
//
//import static Base.BaseStep.Pather.name;
//import static Base.BaseStep.Pather.xPath;
//
//public class EditJobOwners {
//    public WebDriver driver;
//
//    //WebDriver driver;
//    BaseStep step = new BaseStep();
//    @Given("user should be on add owner page")
//    public void post_new_job_for_edit_owners() throws InterruptedException {
//        step.BaseStep();
//        step.geturl();
//        Thread.sleep(5000);
//        step.EmployerLogin();
//    }
//
//    @Then("Add and Remove job owner")
//    public void add_job_owner() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(step.driver, BaseStep.TimeOut.CUSTOM_MAX.getValue());
//
//        step.findElementClick("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[3]", xPath);
//        Thread.sleep(2000);
////       step.findElementClick("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[1]",xPath);
//     Thread.sleep(3000);
////       step.findElement("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[1]/div[1]/div[1]",xPath,"NB").click();
////Thread.sleep(3000);
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[1]"))),Keys.UP,Keys.ENTER;
//
////        step.driver.findElement(By.xpath("(//div[@class=\"select__placeholder css-1wa3eu0-placeholder\"])[3]")).sendKeys(Keys.TAB,Keys.TAB,"nandu");
//
//
//
//
//    }
//
//}
