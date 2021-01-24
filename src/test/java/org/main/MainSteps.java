package org.main;

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

public class MainSteps extends baseclass  {
	WebDriver driver;
	@Given("user is on the adactin page by chrome")
	public void user_is_on_the_adactin_page_by_chrome() {
	  driver= getDriver();
	  loadUrl("https://adactinhotelapp.com/");
	}

	@When("user should be enter the {string} and {string}")
	public void user_should_be_enter_the_and(String string, String string2) {
	    login log=new login();
	    WebElement user = log.getUser();
	    type(user, string);
	    WebElement pass = log.getPass();
	    type(pass, string2);
	    log.getLogin().click();
	}
	@When("user move on nextpage and enter the vaild values {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_move_on_nextpage_and_enter_the_vaild_values(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
	   Search se=new Search();
	   WebElement location = se.getLocation();
	   type(location, s1);
	   WebElement hotel = se.getHotel();
	   type(hotel, s2);
	   WebElement room = se.getRoom();
	   type(room, s3);
	   WebElement noRoom = se.getNoRoom();
	   type(noRoom, s4);
	   WebElement checkIn = se.getCheckIn();
	   type(checkIn, s5);
	   WebElement checkOut = se.getCheckOut();
	   type(checkOut, s6);
	   WebElement adult = se.getAdult();
	   type(adult, s7);
	   WebElement child = se.getChild();
	   type(child, s8);
	   WebElement submit = se.getSubmit();
	   submit.click();
	}

	@When("user click a search ,select  and continoue buttons")
	public void user_click_a_search_select_and_continoue_buttons() {
	org.pom.Button bu=new org.pom.Button();
	        WebElement select = bu.getSelect();
	        select.click();
	        
	        WebElement con = bu.getContinuebtn();
	        con.click();
	}

	@When("user insert the vaild details {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_insert_the_vaild_details(String fn, String ln, String add, String Cn, String Ct, String mon, String ye, String cv) throws InterruptedException {
	  
		booking book=new booking();
		WebElement fname = book.getFname();
		type(fname, fn);
		
		WebElement lname = book.getLname();
		type(lname, ln);
		
		WebElement address1 = book.getAddress();
		type(address1, add);
		
		WebElement cardNo = book.getCardNo();
		type(cardNo, Cn);
		
		WebElement cardType = book.getCardType();
		type(cardType, Ct);
		
		WebElement month = book.getMonth();
		type(month, mon);
		
		WebElement year = book.getYear();
		type(year, ye);
		
		WebElement cvv2 = book.getCVV();
		type(cvv2, cv);
		
		WebElement book2 = book.getBook();
		book2.click();
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
