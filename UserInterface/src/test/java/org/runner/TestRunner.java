package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/thinusstanley/eclipse-workspace/UserInterface/src/test/resources", 
glue = "org.stepdef", 
tags = {"@smoke" }, 
dryRun = true, 
monochrome = true)

public class TestRunner {

}
