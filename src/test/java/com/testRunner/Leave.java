package com.testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resourcesUI\\Leave.feature")
public class Leave extends AbstractTestNGCucumberTests {
@Override
@DataProvider(parallel=false)
public  Object[][] scenarios(){
	return super.scenarios();
}
}
