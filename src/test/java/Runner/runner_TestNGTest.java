package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class runner_TestNGTest {

    @CucumberOptions(
            features = "src/test/resources/feature",
            glue = {"stepDef"},
            plugin = {"pretty", "html:target/BigProject_Report.html"},
            tags = " "
        )

    public static class run extends AbstractTestNGCucumberTests {}
}
