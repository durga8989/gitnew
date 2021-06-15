package cucumberOptions;



import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions",tags="@SeleniumTest",strict=true,monochrome=true,
		plugin={"pretty","html:target/cucumber-html-report","json:target/cucumber.json",
				"junit:target/cukes.xml"}
		)
public class testRunner {

}
