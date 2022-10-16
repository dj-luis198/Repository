package com.daniel.farias.repository.repository;

import base.Base;
import io.cucumber.java.en.*;
import pages.Example;


public class StepDefinitions extends Base{

	@Given("an example scenario")
    public void anExampleScenario() {
		Example.clickOnSingIn();
    	//Assertions.assertEquals(0, "url");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
