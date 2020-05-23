package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @BeforeStep
    private void setup() {
        System.out.println("from BeforeStep");
    }

    @Before
    private void before() {
        System.out.println("from Before");
    }

}
