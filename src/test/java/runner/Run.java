package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
//     EXECUTE O CENARIO
		
		tags = "@Executa",
		
		
		
		
		
		
		features = "src/test/resources/Features",
		glue = "steps",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:report/report.html"}
		
		
		)




public class Run {

}
