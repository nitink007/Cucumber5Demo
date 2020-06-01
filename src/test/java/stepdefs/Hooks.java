package stepdefs;

import io.cucumber.java.*;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("from Before scenario");
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        System.out.println("from BeforeStep");
//        System.out.println(scenario.getSteps());
        System.out.println();
    }

    @After
    public  void afterScenario() {
        System.out.println("from after scenario");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("from afterStep");
    }


}
