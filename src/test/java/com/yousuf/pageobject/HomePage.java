package com.yousuf.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {	
	
private static HomePage HomeInstance;
	
	private HomePage() {		
		
	}
	public static HomePage getInstance() {
		
		if(HomeInstance==null) {
			
			HomeInstance=new HomePage();
		}
		return HomeInstance;
	}	
	
	@FindBy(linkText="Directory")
	
	private WebElement Directory;

	public void enterDirectory() {
		
		Directory.click();
	}

}
