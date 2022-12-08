package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	public static void Userinput(WebElement element ,String value) {

		element.sendKeys(value);

	}

	public static void clickonelements(WebElement element) {
		element.click();

	}

	public static  void clear(WebElement element) {
		element.click();

	}

	public static  void IsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("to check whether webelement is enabled or not" +enabled);


	}

	public static  void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("to check whether webelement is enabled or not"+selected);

	}

	public static  void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("to check whether webelement is enabled or not"+displayed);

	}


	public static void sleep() throws InterruptedException {
		Thread.sleep(4000);

	}

	public static String gettext(WebElement element) {
		String text= element.getText();
		return text;

	}
	public static  WebDriver browserlaunch(String value) {

		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monica Gopi\\eclipse-workspace\\Adactincucumber"
					+ "\\driver\\chromedriver_win32 (2)\\chromedriver.exe");

			driver=new ChromeDriver();

		}else if (value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Monica Gopi\\\\eclipse-workspace\\\\Adactincucumber\"\r\n"
					+ "					+ \"\\\\driver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		driver.manage().window().maximize();

		return driver;
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();

	}

	public static  String gettitle() {
		String title = driver.getTitle();
		return title;

	}

	public static void launchurl(String url) {
		driver.get(url);

	}

	public static void getcurrenturl() {
		driver.getCurrentUrl();


	}

	public static void navigateto(String url) {

		driver.navigate().to(url);
	}

	public static void navigateforward() {
		driver.navigate().forward();

	}

	public static void navigateback() {
		driver.navigate().back();

	}
	public static void navigaterefresh() {
		driver.navigate().refresh();

	}

	public static void Clickonelementjs(WebElement elements) {

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,elements);
	}

	public static void capture(String name) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Monica Gopi\\eclipse-workspace\\Adactincucumber\\screenshot\\"+name+".png");
		FileUtils.copyFile(source, des);
	}

	public static void frameswitch(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void frames1() {
		driver.switchTo().parentFrame();

	}

	public static void sendkeysalert(String values) {
		driver.switchTo().alert().sendKeys(values);

	}

	public static  void popup(String options) {
		if (options.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}else if (options.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}

	}

	public static  void dropdownselect(WebElement element,String options,String value) {
		Select s=new Select(element);

		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);

		}else if (options.equalsIgnoreCase("index")) {
			int n= Integer.parseInt(value);
			s.selectByIndex(n);

		}

	} 

	public static void dropdowndeselect(WebElement element,String option,String value) {
		Select ss=new Select(element);
		if (option.equalsIgnoreCase("value")) {
			ss.deselectByValue(value);
		}else if (option.equalsIgnoreCase("text")) {
			ss.deselectByVisibleText(value);
		}else if (option.equalsIgnoreCase("index")) {
			int n= Integer.parseInt(value);
			ss.deselectByIndex(n);
		}else if (option.equalsIgnoreCase(value)) {
			ss.deselectAll();

		}

	}



}




