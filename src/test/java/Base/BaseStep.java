package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;


public class BaseStep {
    public WebDriver driver;

    public void BaseStep() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        WebDriverManager.operadriver().setup();
//        driver=new OperaDriver();
//        WebDriverManager.edgedriver().setup();
//        driver=new EdgeDriver();

        driver.manage().window().maximize();
    }

//    public void login() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 300000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[1]/div[5]/div/div[1]/div[2]/div[1]/div/div[7]/div/div[1]/button"))).click();
//        Thread.sleep(3000);
//    }

    public enum Pather {
        id,
        className,
        name,
        xPath,
        cssSelector,
        linkText
    }

    public enum TimeOut {
        LOW(20000),
        MIDDLE(3000),
        HIGH(5000),
        CUSTOM_MAX(7000);
        private final int value;

        public int getValue() {
            return value;
        }

        // enum constructor - cannot be public or protected
        private TimeOut(int value) {
            this.value = value;
        }

    }

    public void geturl() {
        driver.get("https://testveryfyl.steerlean.com/");
    }

    public void geturllinkedin() {
        driver.get("https://www.linkedin.com/uas/login?session_redirect=%2Foauth%2Fv2%2Flogin-success%3Fapp_id%3D8554205%26auth_type%3DAC%26flow%3D%257B%2522scope%2522%253A%2522r_liteprofile%2Br_emailaddress%2522%252C%2522creationTime%2522%253A1619177074372%252C%2522state%2522%253A%2522EAhQLxfgzlu1tke6IXco%2522%252C%2522appId%2522%253A8554205%252C%2522authorizationType%2522%253A%2522OAUTH2_AUTHORIZATION_CODE%2522%252C%2522redirectUri%2522%253A%2522https%253A%252F%252Ftestveryfyl.steerlean.com%252Flinkedin%2522%252C%2522currentStage%2522%253A%2522LOGIN_SUCCESS%2522%252C%2522currentSubStage%2522%253A0%252C%2522authFlowName%2522%253A%2522generic-permission-list%2522%257D&fromSignIn=1&trk=oauth&cancel_redirect=%2Foauth%2Fv2%2Flogin-cancel%3Fapp_id%3D8554205%26auth_type%3DAC%26flow%3D%257B%2522scope%2522%253A%2522r_liteprofile%2Br_emailaddress%2522%252C%2522creationTime%2522%253A1619177074372%252C%2522state%2522%253A%2522EAhQLxfgzlu1tke6IXco%2522%252C%2522appId%2522%253A8554205%252C%2522authorizationType%2522%253A%2522OAUTH2_AUTHORIZATION_CODE%2522%252C%2522redirectUri%2522%253A%2522https%253A%252F%252Ftestveryfyl.steerlean.com%252Flinkedin%2522%252C%2522currentStage%2522%253A%2522LOGIN_SUCCESS%2522%252C%2522currentSubStage%2522%253A0%252C%2522authFlowName%2522%253A%2522generic-permission-list%2522%257D");
    }

    public void geturlgoogle() {
        driver.get("https://accounts.google.com/o/oauth2/auth/identifier?redirect_uri=storagerelay%3A%2F%2Fhttps%2Ftestveryfyl.steerlean.com%3Fid%3Dauth572249&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&client_id=972926623322-22deonbgepat13ek4hd1s5vh43v6bf8o.apps.googleusercontent.com&ss_domain=https%3A%2F%2Ftestveryfyl.steerlean.com&prompt&fetch_basic_profile=true&gsiwebsdk=2&flowName=GeneralOAuthFlow");
    }

    public void waitElement(WebElement element, TimeOut timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception ex) {

        }

    }

    public void findElementClick(String path, Pather type) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
            switch (type) {
                case className:
                    wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).click();
                    break;
                case id:
                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();
                    break;
                case name:
                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).click();
                    break;
                case xPath:
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
                    break;
                case cssSelector:
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).click();
                    break;
                case linkText:
                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).click();
                    break;
                default:
                    new NotFoundException();
            }

        } catch (Exception ex) {
        }
    }

    public WebElement findElement(String path, Pather type, TimeOut timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        } catch (Exception ex) {
            return null;
        }
    }

    public WebElement findElement(String path, Pather type, String description) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        } catch (Exception ex) {
            System.out.println("find element method error" + ex.getMessage());
            return null;
        }
    }


    public void PageScrolldown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)", "");

    }

    public void PageScrollup() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-300)", "");
    }

    public void DriverQuit() {
        driver.quit();
    }

    public void EmployerLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("workEmail"))).sendKeys("nandkumar.babar@steerlean.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Babar@9899");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(5000);

    }

    public void JobseekerLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='noButtonBorder'])[1]"))).click();
        System.out.println("driver" + driver);
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        System.out.println("title" + handler);
        String parentWindowId = it.next(); //System.out.println("parent window id:"+ parentWindowId);
        String childWindowId = it.next(); //System.out.println("Child window id:"+ childWindowId);
        driver.switchTo().window(childWindowId);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']"))).sendKeys("ricky77ponting@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']"))).sendKeys("Ad$12345");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        driver.switchTo().window(parentWindowId);
        Thread.sleep(3000);
    }

    public void PostJob() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='pro-item-content'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='pro-item-content'])[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("jobTitle"))).sendKeys("Automation Test Engg");
        Select MinExp = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("minYearsOfExperience"))));
        MinExp.selectByVisibleText("5");
        Select MaxExp = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("maxYearsOfExperience"))));
        MaxExp.selectByVisibleText("9");
        Select Country = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("country"))));
        Country.selectByVisibleText("India");
        Select City = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("city"))));
        City.selectByVisibleText("Pune");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("noOfPositions"))).sendKeys("1723");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"))).sendKeys("Steerlean consulting");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='submit'])[1]"))).click();
        Thread.sleep(3000);
    }

    public void SendJobInvitation() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        Thread.sleep(3000);
        driver.findElement(By.name("fullName")).sendKeys("ABD");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("email"))).sendKeys("ricky77ponting@gmail.com");
        Select Avai = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("availability"))));
        Avai.selectByVisibleText("1");
        Select currency = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("currency"))));
        currency.selectByIndex(0);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("salary"))).sendKeys("10000");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("fixedSalary"))).sendKeys("5000");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("joiningBonus"))).sendKeys("100");
        Thread.sleep(3000);
        WebElement browse = driver.findElement(By.id("resume"));
        browse.sendKeys("/home/nandkumar/Downloads/Jacky-Smith-Resume-Project-Manager-3.pdf");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ql-editor ql-blank']"))).sendKeys("Steerlean");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        Thread.sleep(2000);
    }

    public void Historicselect() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']"))).sendKeys(Keys.SPACE, Keys.ARROW_LEFT, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
        Date date = new Date();
        System.out.println("Current Date " + dateFormat.format(date));
        // Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // Perform addition/subtraction
        c.add(Calendar.YEAR, 0);
        c.add(Calendar.MONTH, 0);
        c.add(Calendar.DATE, 0);
        c.add(Calendar.HOUR, 0);
        c.add(Calendar.MINUTE, 0);
        c.add(Calendar.SECOND, 0);
        c.add(Calendar.AM_PM, 0);
        // Convert calendar back to Date
        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']")).sendKeys(Keys.SPACE,dateFormat.format(currentDatePlusOne));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='search']"))).sendKeys("Cleared", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='search'])[2]"))).sendKeys("Good", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("feedbackComments"))).sendKeys("Good Candidate");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

    }

    public void Historicreject() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("interviewerEmail"))).sendKeys("nandkumar.babar@steerlean.com", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']"))).sendKeys(Keys.SPACE, Keys.ARROW_LEFT, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
        Date date = new Date();
        System.out.println("Current Date " + dateFormat.format(date));
        // Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // Perform addition/subtraction
        c.add(Calendar.YEAR, 0);
        c.add(Calendar.MONTH, 0);
        c.add(Calendar.DATE, 0);
        c.add(Calendar.HOUR, 0);
        c.add(Calendar.MINUTE, 0);
        c.add(Calendar.SECOND, 0);
        c.add(Calendar.AM_PM, 0);
        // Convert calendar back to Date
        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']")).sendKeys(Keys.SPACE,dateFormat.format(currentDatePlusOne));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='search']"))).sendKeys("Reject", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rejectionReason\"]/input"))).sendKeys("lack of knowledge", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("feedbackComments"))).sendKeys("Candidate not interested");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

    }

    public void Reschedules() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m'])[1]"))).click();
        Select maxexp = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.name("reasonsForRescheduling"))));
        maxexp.selectByIndex(3);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

    }

    public void CancelRound() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='noButtonBorder'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='bg-gradient-theme-left border-0 postedJobsButtonWidth float-right btn btn-secondary btn-m'])[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("reason"))).sendKeys("Not good candiidate");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
    }

    public void dateformatnew() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div/div/div/div/input"))).sendKeys(Keys.SPACE, Keys.ARROW_LEFT, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
        Date date = new Date();
        System.out.println("Current Date " + dateFormat.format(date));
        // Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // Perform addition/subtraction
        c.add(Calendar.YEAR, 0);
        c.add(Calendar.MONTH, 0);
        c.add(Calendar.DATE, 0);
        c.add(Calendar.HOUR, 0);
        c.add(Calendar.MINUTE, 1);
        c.add(Calendar.SECOND, 0);
        c.add(Calendar.AM_PM, 0);
        // Convert calendar back to Date
        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div/div/div/div/input")).sendKeys(Keys.SPACE,dateFormat.format(currentDatePlusOne));

    }

    public void srcinterview() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, TimeOut.CUSTOM_MAX.value);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div/div/div/div/input"))).sendKeys(Keys.SPACE, Keys.ARROW_LEFT, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
        Date date = new Date();
        System.out.println("Current Date " + dateFormat.format(date));
        // Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // Perform addition/subtraction
        c.add(Calendar.YEAR, 0);
        c.add(Calendar.MONTH, 0);
        c.add(Calendar.DATE, 0);
        c.add(Calendar.HOUR, 0);
        c.add(Calendar.MINUTE, 6);
        c.add(Calendar.SECOND, 0);
        c.add(Calendar.AM_PM, 0);
        // Convert calendar back to Date
        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div/div/div/div/input")).sendKeys(Keys.SPACE,dateFormat.format(currentDatePlusOne));
        }
    }

