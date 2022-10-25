package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Unit test for simple App.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "StepDefinition" }, plugin = { "pretty" })
class AppTest {
}
