package StepDefinitions;

import Utils.BaseDriver;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void before(){

        System.out.println("Scenario Started!");
    }

    @After
    public void after(){

        BaseDriver.quitDriver();
    }
}
