package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public Properties pro;
	
	
	public void browserlaunch() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		File f =new File("src/test/resources/properties/app.properties");
		
		FileInputStream input=new FileInputStream(f);
		
		pro =new Properties();
		
		pro.load(input);
		
		pro.getProperty("Browser").equalsIgnoreCase("chrome");
		
		
		driver.get(pro.getProperty("Url"));
		
		
		driver.manage().window().maximize();
		
		
		
		
		

	}
}
