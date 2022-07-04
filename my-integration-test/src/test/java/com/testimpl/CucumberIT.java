package com.testimpl;

import com.myapp.MyApplication;
import io.cucumber.core.options.Constants;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.platform.suite.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameters({
        @ConfigurationParameter(key = GLUE_PROPERTY_NAME,
                value = "com.generictest, com.testimpl"),
        @ConfigurationParameter(key = Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")})
@CucumberContextConfiguration
@SpringBootTest(classes = {MyApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CucumberIT {
}
