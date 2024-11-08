package org.mobile.bdd.run;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/mobile/bdd")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.mobile.bdd")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@important")
public class CucumberTest {
}
