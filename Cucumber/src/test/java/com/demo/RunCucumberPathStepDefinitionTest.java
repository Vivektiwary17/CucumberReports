package com.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = { "src/test/resources/com/demo/CucumberPath.feature", glue = { "com/demo" })-> this is to run single feature file and below syntax is to run multiple feature if path is not given of features= "" then it will run all the feature file present in the folder and if feature is in other package it is compulsury to give the proper path otherwise it will not run 
@CucumberOptions(features = { "src/test/resources/com/demo/CucumberPath.feature","src/test/resources/com/demo/CucumberPath2.feature" }, glue = { "com/demo" })

public class RunCucumberPathStepDefinitionTest {

}

