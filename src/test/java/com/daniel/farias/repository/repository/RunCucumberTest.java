package com.daniel.farias.repository.repository;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.daniel.farias.repository/repository")
public class RunCucumberTest {
}
