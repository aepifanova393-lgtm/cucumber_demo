package com.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void printBefore(Scenario scenario) {
        System.out.println("Название сценария: " + scenario.getName());
    }

    @After
    public void printAfter(Scenario scenario) {
        System.out.println("Статус сценария: " + scenario.isFailed() );
    }
}
