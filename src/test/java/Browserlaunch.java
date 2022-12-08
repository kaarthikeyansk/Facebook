

import java.awt.event.ActionEvent;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Browserlaunch {
	public static void main(String[] args) throws InterruptedException {
		
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monica Gopi\\eclipse-workspace\\Seleniumpractise\\src\\SEP\\chromedriver.exe");
	        
	       WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();


	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	 Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jack");
      
      WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
      lastname.sendKeys("sparrow");
      
      WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
      email.sendKeys("jsjs@gmail.com");
      
      driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("jsjs@gmail.com");
      
      WebElement pw = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
      pw.sendKeys("qwerty");
      WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
      Select num=new Select(day);
      num.selectByValue("8");
      WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
      Select m=new Select(month);
      m.selectByValue("11");
      
     WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
     Select y=new Select(year);
     y.selectByValue("1998");
     
     
     WebElement g = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
    g.click();
     
     
     WebElement sign = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
     sign.click();
      
      
      
	}}