package com.demo.jenkinsfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, format = {"json:target/cucumber-report/cucumber.json",
        "html:target/cucumber-report"},
        features = "classpath:features")
public class RunAllFeatures {

}
