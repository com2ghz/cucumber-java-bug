package com.generictest;

import io.cucumber.java.en.Given;

public class GenericCucumberStepDef {

    @Given("Hello i am in StepDefA")
    public void helloImStepDefA() {
        System.out.println("PrintStep A");
    }
}
