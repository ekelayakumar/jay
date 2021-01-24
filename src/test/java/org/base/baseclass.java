package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Project3Base\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public boolean isHidden(WebElement element) {
		return element.isDisplayed();
	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	public List<String> dropDownAllOptions(WebElement element) {
		List<String> alloptions = new ArrayList();
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement eachoption : options) {
			String text = eachoption.getText();
			alloptions.add(text);
		}
		return alloptions;
	}

	public String dropDownFirstSelectedOption(WebElement element) {
		return new Select(element).getFirstSelectedOption().getText();
	}

	public String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public void quitApp() {
		driver.quit();
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void selectDatabyText(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);
	}

	public void selectDatabyIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public void selectDatabyVlaue(WebElement element, String data) {
		new Select(element).selectByValue(data);

	}

	public void btnClick(WebElement element) {
		if (isHidden(element) && isEnabled(element)) {
			element.click();

		}

	}

	public void type(WebElement element, String data) {
		if (isHidden(element) && isEnabled(element)) {
			element.sendKeys(data);
		}
	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void loadUrl(String url) {
		driver.get(url);
		maximize();
		implicitWait();
	}


}
