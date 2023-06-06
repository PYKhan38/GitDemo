package com.yousuf.step_def;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.yousuf.constants.Constants;
import com.yousuf.drivermanager.DriverManager;
import com.yousuf.pageobject.DirectoryPage;
import com.yousuf.pageobject.HomePage;
import com.yousuf.pageobject.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyCEONameStepDef {		
	
	private static final Logger LOGGER=LogManager.getLogger("Practice");
	
	@Given("the user is logged in successfully and is on Home Page")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() throws Exception {		
		
		DriverManager.getDriver().get(Constants.APP_URL);
		
		LoginPage.getInstance().enterUSERNAME(Constants.UserName);
		
		LoginPage.getInstance().enterPASSWORD(Constants.Password);
		
		LoginPage.getInstance().enterLOGIN_BUTTON();		  
		
		 String url=DriverManager.getDriver().getCurrentUrl();
		 
		 if(url.contains("dashboard")) {
			 
			 LOGGER.info("the user is logged in successfully and is on Home Page");
		 }		
	}

	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
		
		HomePage.getInstance().enterDirectory();
		
		LOGGER.info("the user clicks on the directory option from the Menu bar");		
	}

	@And("the user selects the job title as {string} from the drop down {string}")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String string, String string2) {
		
		Select sj= new Select(DirectoryPage.getInstance().getJOB_TITLE());
		
		sj.selectByVisibleText("jobTitle");		
			
		LOGGER.info("the user selects the job title as {string} from the drop down {string}");
	}

	@And("clicks the search button")
	public void clicks_the_search_button() {		
		
		DirectoryPage.getInstance().getSEARCH().click();
		
		LOGGER.info("clicks the search button");
	}

	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String expectedName) {
		
		String actualName=DirectoryPage.getInstance().getNAME().getText();
		
		if (actualName.equalsIgnoreCase(expectedName)) {
			
		LOGGER.info("the user should see the CEO name as {string}");
		}
	}

	

}
