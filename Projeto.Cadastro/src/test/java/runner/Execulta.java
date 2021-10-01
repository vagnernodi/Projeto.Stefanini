package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
     features = "./CDA.feature",
     glue = "teste",
     tags = "@Desafio",
     plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
     dryRun = false,
     monochrome = true
     )

public class Execulta {	
}
