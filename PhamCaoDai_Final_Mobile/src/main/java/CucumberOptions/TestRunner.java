package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        monochrome = true,
        //huong dan den file feature
        features = "src/main/java/Resource/Shoppe.feature",
//        features = {"classpath:src/main/java/Resource/LoginFB.feature"},
        //ten folder cua step definition
        glue = "StepDefinition",
        //tag muon run
        tags = "@shoppiness_TC_01",
        plugin = {
                "junit:target/reports/cucumber.xml",
                "junit:target/cucumber-reports/CucumberTestReport.json",
                "junit:target/cucumber-reports/cucumber-pretty",
                "junit:target/cucumber-reports/rerun.txt",
        }
)


public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.out.println("This is steps : setUpClass");
    }
    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runScenario(pickle.getPickle());
        System.out.println("This is steps : scenario");
    }
    @DataProvider
    public Object[][] scenarios() {
        System.out.println("This is steps : DataProvider");
        return testNGCucumberRunner.provideScenarios();

    }
    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
        System.out.println("This is steps : tearDownClass");
    }

}


