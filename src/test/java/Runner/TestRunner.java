package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue= {"stepDefinition"},
plugin= {"html:target/cucumber-html-reports"}
)
public class TestRunner {

	
	

}
