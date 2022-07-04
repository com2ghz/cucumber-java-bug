package com.testimpl;

import com.generictest.GenericCucumberStepDef;
import io.cucumber.java.en.Given;

public class StepDefB {
    private final GenericCucumberStepDef genericCucumberStepDef;

    public StepDefB(GenericCucumberStepDef genericCucumberStepDef) {
        this.genericCucumberStepDef = genericCucumberStepDef;
    }

    @Given("Hello i am in StepDefB")
    public void helloImStepDefB() {
        System.out.println("PrintStep B");
    }
}
