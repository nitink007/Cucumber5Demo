package stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class TestRunner {

    @RunWith( Cucumber.class )
    @CucumberOptions(plugin = {"pretty"},
                    glue = {"stepdefs"}
    )

    public class RunCucumberTest
    {

    }
}
