package com.lazerycode.selenium.StepRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/nandkumar/Documents/veryfylsystemtests/Cucumber/src/test/java/com/lazerycode/selenium/Feature",
glue = "Stepdefinations")

public class TestRunner {
}
