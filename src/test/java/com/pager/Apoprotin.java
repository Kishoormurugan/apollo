package com.pager;

import org.apache.poi.ss.formula.functions.Address;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.Baseclass;
import com.reusesable.seleniumutilities;

public class Apoprotin extends Baseclass {
	public seleniumutilities si;

	public Apoprotin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Popular Lab Tests']")
	WebElement scrolldown;
	@FindBy(xpath = "//h3[text()='Diabetes Care']")
	WebElement clickdiabetescare;
	@FindBy(xpath = "//h2[text()='Brands']")
	WebElement clickbrands;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement scrolldown1;
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	WebElement clickcheckbox;
	@FindBy(xpath = "//h1[text()='Diabetic']")
	WebElement scrollup;
	@FindBy(xpath = "//p[text()='D Protin Chocolate Powder, 500 gm']")
	WebElement clickproduct;
	@FindBy(xpath = "//button[text()='Add To Cart']")
	WebElement clickaddtocartbutton;
	@FindBy(xpath = "//a[@class='Header_icon___ocd6 Header_cart__Juw0v icon-cart_icon']")
	WebElement clickaddcarticon;
	/*
	 * @FindBy(className = "close") WebElement closepopup;
	 * 
	 * @FindBy(xpath = "//div[@class='CartCta_checkoutBtn__B9OyM']") WebElement
	 * clickaddress;
	 */

	public void scroll() {
		si = new seleniumutilities(driver);
		si.scrolldown(scrolldown);

	}

	public void diabetes() {
		si.toclick(clickdiabetescare);

	}

	public void clickbrands() throws InterruptedException {
		Thread.sleep(4000);
		si.toclick(clickbrands);

	}

	public void scrolldown1() throws InterruptedException {
		Thread.sleep(4000);
		si.scrolldown(scrolldown1);

	}

	public void clickcheckbox() throws InterruptedException {
		Thread.sleep(4000);
		si.toclick(clickcheckbox);

	}

	public void scrollup() throws InterruptedException {
		Thread.sleep(4000);
		si.scrollup(scrollup);

	}

	public void product() throws InterruptedException {
		Thread.sleep(4000);
		si.toclick(clickproduct);

	}

	public void addtocart() throws InterruptedException {
		Thread.sleep(4000);
		si.toclick(clickaddtocartbutton);

	}

	public void addcarticon() {
		si.toclick(clickaddcarticon);

	}
	
	 

}
