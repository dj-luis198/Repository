package com.daniel.farias.repository.repository;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Base{
	
	@Before
	public void setUp() {
		
		init();	
	}
	
	@After
	public void tearDown(Scenario scenario) throws IOException {
			if (scenario.isFailed()) {
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
				scenario.attach(fileContent, "image/png", "image" + scenario.getId());
		}
	quit();
		
	}	
}
