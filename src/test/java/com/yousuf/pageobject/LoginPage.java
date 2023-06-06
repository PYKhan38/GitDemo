package com.yousuf.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yousuf.constants.Constants;

public class LoginPage {	
	
	private static LoginPage LoginInstance;
	
	private LoginPage() {		
		
	}
	public static LoginPage getInstance() {
		
		if(LoginInstance==null) {
			
			LoginInstance=new LoginPage();
		}
		return LoginInstance;
	}
	
	@FindBy(id = "txtUsername")

	private WebElement USERNAME;

	@FindBy(id = "txtPassword")

	private WebElement PASSWORD;

	@FindBy(id = "btnLogin")

	private WebElement LOGIN_BUTTON;	
	

	public void enterUSERNAME(String userName) {
		
		 USERNAME.sendKeys(userName);;
	}

	public void enterPASSWORD(String pwd) {
		
		PASSWORD.sendKeys(pwd);;
	}

	public void enterLOGIN_BUTTON() {
		
		LOGIN_BUTTON.click();
	}

	


}
