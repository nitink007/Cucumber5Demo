package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    private void before() {
        System.out.println("from Before");
    }

    @BeforeStep
    private void setup() {
        System.out.println("from BeforeStep");
    }


}
