package org.pom;

import org.base.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booking extends baseclass {
       
		public booking() {
			PageFactory.initElements(driver, this);
}
		@FindBy(id="radiobutton_0")
		private WebElement select;
		
		@FindBy(id="continue")
		private WebElement continuebtn;
		
		@FindBy(id="first_name")
		private WebElement Fname;
		
		@FindBy(id="last_name")
	    private WebElement Lname;
		
		@FindBy(id="address")
		private WebElement address;
		
		@FindBy(id="cc_num")
		private WebElement CardNo;
		
		@FindBy(id="cc_type")
		private WebElement CardType;
		
		@FindBy(id="cc_exp_month")
		private WebElement Month;
		
		@FindBy(id="cc_exp_year")
		private WebElement Year;
		
		@FindBy(id="cc_cvv")
		private WebElement CVV;
		
		@FindBy(id="book_now")
		private WebElement book;

		

		public WebElement getFname() {
			return Fname;
		}

		public WebElement getLname() {
			return Lname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCardNo() {
			return CardNo;
		}

		public WebElement getCardType() {
			return CardType;
		}

		public WebElement getMonth() {
			return Month;
		}

		public WebElement getYear() {
			return Year;
		}

		public WebElement getCVV() {
			return CVV;
		}

		public WebElement getBook() {
			return book;
		}
		
		public void book(String Fname, String Lname, String address, String CardNo, String CardType, String Month, String Year, String CVV) {
			type(getFname(), Fname);
			type(getLname(), Lname);
			type(getAddress(), address);
			type(getCardNo(), CardNo);
			type(getCardType(), CardType);
			type(getMonth(), Month);
			type(getYear(), Year);
			type(getCVV(), CVV);
			btnClick(getBook());
			
			

		}
}
