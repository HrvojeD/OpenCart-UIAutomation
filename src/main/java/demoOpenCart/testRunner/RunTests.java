package demoOpenCart.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/*
 - Reports are generated in the .html format and save in the resources/html_report/
as the htmlReport.html

 - Uncomment tags property and specify the scenario tag uf only specific scenarios need to be run
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/demoOpenCart/features",
        glue = {"demoOpenCart/stepdefinitions"},
        plugin = {"pretty", "html:resources/html_report/htmlReport.html"}
        //tags = "@tag"
)
public class RunTests {}
