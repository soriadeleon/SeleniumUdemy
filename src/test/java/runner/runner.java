package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




public class runner {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/feature",
            glue = "steps"

    )

    public class Runner {

    }
}
