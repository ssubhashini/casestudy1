package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/skeleton/casestudy1.feature",plugin="json:target\\JsonReport.json")
public class runtestme {

}
