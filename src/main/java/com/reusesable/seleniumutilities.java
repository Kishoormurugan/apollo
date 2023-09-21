package com.reusesable;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.library.Baseclass;

public class seleniumutilities  extends Baseclass{
	public seleniumutilities(WebDriver driver) {
		this.driver=driver;
		
	}
	public void toclick(WebElement element) {
		element.click();
		
	}

	public void enterthevalu(WebElement Element, String value) {
		Element.sendKeys(value);
		
	}
	
	public void robert(WebElement element) throws AWTException  {
		 
		
		Robot r = new Robot();
		
		
		r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		
		
		
	
	}
	public void dropdown(WebElement element) {
		Select drop =new Select(null);
		drop.selectByIndex(2);
	

	}
	public void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		

	}
	public void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
		
	

}
