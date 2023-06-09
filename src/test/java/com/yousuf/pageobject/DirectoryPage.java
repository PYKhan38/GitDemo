package com.yousuf.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	
private static DirectoryPage DirectoryInstance;
	
	private DirectoryPage() {		
		
	}
	public static DirectoryPage getInstance() {
		
		if(DirectoryInstance==null) {
			
			DirectoryInstance=new DirectoryPage();
		}
		return DirectoryInstance;
	}		

	@FindBy(id= "searchDirectory_job_title")
	
	private WebElement JOB_TITLE;

	@FindBy(id = "searchBtn")
	
	private WebElement SEARCH;
	
	
	@FindBy(xpath = "//ul/li/b")
	
	private WebElement NAME;
	
	
	

	public WebElement getJOB_TITLE() {
		
		return JOB_TITLE;
	}
	public WebElement getSEARCH() {
		
		return SEARCH;
	}
	public WebElement getNAME() {
		
		return NAME;
	}
	

	
}
