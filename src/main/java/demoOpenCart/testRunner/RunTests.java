package demoOpenCart.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/demoOpenCart/features",
        glue = {"demoOpenCart/stepdefinitions"},
        plugin = {"pretty", "html:target/htmlReport.html"},
        tags = "@tag"
)
public class RunTests {}
