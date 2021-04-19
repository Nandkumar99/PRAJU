//package com.pages;
//
//import com.base.Testbase;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import javax.xml.xpath.XPath;
//
//public class LoginPage extends Testbase {
//    @FindBy(xpath="//*[@id=\"root\"]/main/div[1]/div/div[2]/div/button[2]/span[2]")
//    WebElement standardbtn;
//
//    @FindBy(name="workEmail")
//    WebElement username;
//
//    @FindBy(name="password")
//    WebElement password;
//
//    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/button")
//    WebElement submit;
////page factory
//    public LoginPage() {
//        WebDriver driver = null;
//        PageFactory.initElements(driver, this);
//    }
//       //Actions
//
//
//    public static void login(String un, String pwd){
//        standardbtn.click();
//        username.sendKeys("nandkumar.babar@steerlean.com");
//        password.sendKeys("Babar@99");
//        submit.click();
//
//    }
//
//
//
//
//}
