package org.pom;

import org.base.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button extends baseclass {
       public Button() {
		PageFactory.initElements(driver, this);
	}
       @FindBy(id="radiobutton_2")
		private WebElement select;
		
		@FindBy(id="continue")
		private WebElement continuebtn;

		public WebElement getSelect() {
			return select;
		}

		public WebElement getContinuebtn() {
			return continuebtn;
		}
		
		public void button() {
        btnClick(getSelect());
        btnClick(getContinuebtn());


		}
}
