package com.stepdefinition;

import java.io.IOException;

import com.library.Baseclass;
import com.pager.Apoprotin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Protinstep extends Baseclass {
	public Apoprotin ap;

	@Given("the user has launch the application")
	public void the_user_has_launch_the_application() throws IOException {
		browserlaunch();

	}

	@When("the user is to be scroll down this page")
	public void the_user_is_to_be_scroll_down_this_page() {
		ap = new Apoprotin(driver);

		ap.scroll();
	}

	@When("the user click the diabetes care")
	public void the_user_click_the_diabetes_care() throws InterruptedException {
		Thread.sleep(2000);
		ap.diabetes();

	}

	@Then("it should be displayed diabetes page")
	public void it_should_be_displayed_diabetes_page() {

	}

	@When("the user click the brands")
	public void the_user_click_the_brands() throws InterruptedException {
		Thread.sleep(3000);
		ap.clickbrands();

	}

	@When("the user is to scroll down this brand")
	public void the_user_is_to_scroll_down_this_brand() throws InterruptedException {
		Thread.sleep(2000);
		ap.scrolldown1();

	}

	@When("the user click the checkbox D-portin")
	public void the_user_click_the_checkbox_D_portin() throws InterruptedException {
		Thread.sleep(2000);
		ap.clickcheckbox();
	}

	@When("the user is to be scroll up this page")
	public void the_user_is_to_be_scroll_up_this_page() throws InterruptedException {
		Thread.sleep(2000);
		ap.scrollup();
	}

	@When("the user click the chocolate powder")
	public void the_user_click_the_chocolate_powder() throws InterruptedException {
		Thread.sleep(2000);
		ap.product();

	}

	@Then("it should be displayed addcart page")
	public void it_should_be_displayed_addcart_page() {

	}

	@When("the user click the add to cart")
	public void the_user_click_the_add_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		ap.addtocart();
	}

	@When("the user click the addtocart icon")
	public void the_user_click_the_addtocart_icon() throws InterruptedException {
		Thread.sleep(2000);
		ap.addcarticon();

	}

	@Then("it should be displayed cart page")
	public void it_should_be_displayed_cart_page() {

	}

	
	@Then("it should be displayed login page")
	public void it_should_be_displayed_login_page() {
	   
	}


}
