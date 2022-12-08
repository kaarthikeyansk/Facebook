package com.Stepdefitionfacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Runnerfacebook.FBrunner;
import com.baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FBstepdef extends Baseclass{
	 static WebDriver driver =FBrunner.driver;
	
	@Given("user Launch The Web Application")
	public void user_launch_the_web_application() throws InterruptedException {
		launchurl("https://www.facebook.com/");
		// driver.get("https://www.facebook.com/");
		 WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		 clickonelements(findElement);
		// findElement.click();
		 Thread.sleep(2000);
			
	    
	 }

	@When("user Giving First Name And Last Name And Email Id")
	public void user_giving_first_name_and_last_name_and_email_id() {
		 WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Userinput(fname,"jack");
		 //.sendKeys("jack");
	      
	      WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	      Userinput(lastname, "sparrow");
	    //  lastname.sendKeys("sparrow");
	      
	      WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	      Userinput(email, "jsjjs@gmail.com");
	    //  email.sendKeys("jsjs@gmail.com");
	      
	  //    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("jsjs@gmail.com");
	      
	      WebElement pw = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	      
	      Userinput(pw, "qwerty");
	      //pw.sendKeys("qwerty");
	 }

	@When("user Giving Date Of Birth And Selecting Gender")
	public void user_giving_date_of_birth_and_selecting_gender() {
		 WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		 
		 dropdownselect(day, "value", "8");
		 
//	      Select num=new Select(day);
//	      num.selectByValue("8");
//	      WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
//	      Select m=new Select(month);
//	      m.selectByValue("11");
//	      
	     WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
	     dropdowndeselect(year, "value", "1998");
//	     
//	     Select y=new Select(year);
//	     y.selectByValue("1998");
//	     
	 }

	@Then("user Clicking The Signup Button")
	public void user_clicking_the_signup_button() {
		 WebElement g = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		 clickonelements(g);
		  //  g.click();
		     
		     
		     WebElement sign = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		     clickonelements(sign);
		    // sign.click();
	     
	 }
}
