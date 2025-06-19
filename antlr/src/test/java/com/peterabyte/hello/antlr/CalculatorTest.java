package com.peterabyte.hello.antlr;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "pretty",
        },
        glue = { "com.peterabyte.hello.antlr" }
)
public class CalculatorTest {
}

