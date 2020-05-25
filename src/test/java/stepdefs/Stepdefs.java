package stepdefs;

import io.cucumber.java.en.Given;

public class Stepdefs {

    @Given("User enters {string} into {string} field")
    public void userEntersIntoField(String arg0, String arg1) {
        System.out.println("arg0: "+arg0+" arg1: "+arg1);
    }

    @Given("Login user into {string} application")
    public void loginUserIntoApplication(String arg0) {
        System.out.println("Application: "+arg0);
    }
}
