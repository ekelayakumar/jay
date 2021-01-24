package org.main2;

import org.base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pom.Search;
import org.pom.booking;
import org.pom.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mainsteps2 extends baseclass {
	WebDriver driver;
	 login log;
	 Search se;
	 booking book;
	 org.pom.Button bu;
	@Given("user is on the adactin page by chrome")
	public void user_is_on_the_adactin_page_by_chrome() {
	  driver= getDriver();
	  loadUrl("https://adactinhotelapp.com/");
	}
	@When("user should be enter the {string} and {string}")
	public void user_should_be_enter_the_and(String string, String string2) {
	    log=new login();
	    log.log(string, string2);
	}
	@When("user move on nextpage and enter the vaild values {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_move_on_nextpage_and_enter_the_vaild_values(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
	    se=new Search();
	    se.search(s1, s2, s3, s4, s5, s6, s7, s8, s8);
	}
	@When("user click a search ,select  and continoue buttons")
	public void user_click_a_search_select_and_continoue_buttons() {
	 bu=new org.pom.Button();
	 bu.button();      
	}
	@When("user insert the vaild details {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_insert_the_vaild_details(String fn, String ln, String add, String Cn, String Ct, String mon, String ye, String cv) throws InterruptedException {
		 book=new booking();
		 book.book(fn, ln, add, Cn, Ct, mon, ye, cv);
	
		 Thread.sleep(5000);
		   WebElement order = driver.findElement(By.id("order_no"));
		   String att = order.getAttribute("value");
		   System.out.println(att);
		}
	@Then("user should  be verify the success massage and order no")
	public void user_should_be_verify_the_success_massage_and_order_no() throws InterruptedException {
		System.out.println("success");   	   
	}
}
