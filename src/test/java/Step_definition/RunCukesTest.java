package Step_definition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@Login, @Sales"},
        features = {"classpath:features/"},
        glue = { "classpath:Step_definition"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)

public class RunCukesTest {
}
