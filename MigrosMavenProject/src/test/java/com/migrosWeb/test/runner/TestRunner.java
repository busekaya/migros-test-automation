package com.migrosWeb.test.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import com.migrosWeb.test.main.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



@CucumberOptions(
		glue = {"com/migrosWeb/test/stepdefs"}, 
		tags= {"@test"},
		plugin = {"html:target/cucumber-reports/cucumber-pretty","json:target/json-cucumber-reports/default/cukejson.json",
		"testng:target/testng-cucumber-reports/cuketestng.xml" }, 
		features = {"src/test/resources/features"})

public class TestRunner extends BaseClass{


	private TestNGCucumberRunner testNGCucumberRunner;
    
	 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {  
	 
      testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());


  }  
    @Test(groups = "cucumber", description = "Run All Tests", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
    	
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
       testNGCucumberRunner.finish();
    }
    
  

    @BeforeSuite(alwaysRun = true)
	public void setUp() throws Exception {
		openBrowser();
		maximizeWindow();
		implicitWait(30);
		deleteAllCookies();
		setEnv();
	}
}
