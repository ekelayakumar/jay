package org.pom;

import org.base.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends baseclass {
	public Search() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement NoRoom;
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNoRoom() {
		return NoRoom;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void search(String location, String hotel , String room , String Noroom , String checkIn , String checkOut , String adult , String child , String submit ) {
		
		type(getLocation(), location);
		type(getHotel(), hotel);
		type(getRoom(), room);
		type(getNoRoom(), Noroom);
		type(getCheckIn(), checkIn);
		type(getCheckOut(), checkOut);
		type(getAdult(), adult);
		type(getChild(), child);
		btnClick(getSubmit());
		
		
}
}

