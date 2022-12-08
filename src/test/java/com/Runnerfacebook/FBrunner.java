package com.Runnerfacebook;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions
(features = "src\\test\\java\\com\\featurefb\\Facebook.feature",
glue="com.Stepdefitionfacebook" ,
plugin= {"pretty",
		"html:Reports/htmlReports.html",
		"json:Reports/jsonReports.json"})



public class FBrunner {
	
	 public static WebDriver driver;
	
	
    @BeforeClass
	public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monica Gopi\\eclipse-workspace\\Adactincucumber\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
        
        driver=new ChromeDriver();
        driver.manage().window().maximize();
	}
	@AfterClass
	public static  void teardown() {
		driver.close();

	}
	
}
