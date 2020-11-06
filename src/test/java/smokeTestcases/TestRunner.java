package smokeTestcases;

import java.io.FileReader;
import java.util.Properties;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(features="features" ,glue={"stepDefinition"},
format= {"pretty","html:C:target/logotest-html-report","json:target/logotest.json"
	},
	 monochrome= true
			)
 
public class TestRunner {
	

	     
}
