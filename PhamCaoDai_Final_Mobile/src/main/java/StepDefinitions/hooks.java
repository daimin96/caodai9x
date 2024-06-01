package StepDefinitions;

import Core.AppiumBase;
import Functions.common;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.net.MalformedURLException;

public class hooks extends AppiumBase {
    @Before
    public void beforeHooks() throws MalformedURLException {
        System.out.println("This is beforeHooks");
//        setup();
    }
    @After
    public void afterHooks(Scenario scenario) throws IOException {
        common common = new common();
        System.out.println("This is afterHooks");
        if (scenario.isFailed()) {
            System.out.println("This is testcase failed");
//            common.capturingScreenshots("calculator.png");
        }
        teardown();
    }

}