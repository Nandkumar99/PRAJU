package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/nandkumar/Documents/veryfylsystemtests/src/test/java/Feature"
        ,glue = {"Steps"},
//        tags={"@VeryFylLogin"},
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports" }, monochrome = true
)

public class Runner {

}
