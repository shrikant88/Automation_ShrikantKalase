package com.gymondo.testcase;
import com.gymondo.pagelements.pageElements;
import com.sun.tools.javac.util.List;

import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Description;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.gymondo.config.appiumBase;


public class appTestcases extends appiumBase {
	
  
	@BeforeMethod @Description("Enter username and password for login process")
	public void userlogin() {
		  pageElements pageElements = new pageElements(driver);
   	      driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);        //Implicit Wait condition in case If application take time to display page
		  pageElements.usernameField.sendKeys(pageElements.userName);           // Entering user name 
		  pageElements.passwordField.sendKeys(pageElements.userPass);          // Entering user password
		  pageElements.loginButton.click();                                   // Clicking on login button
	}
	
	
	  @Test (priority = 1)@Description("Verify user login on home screen")
	  public void verifyloginTest() { 
	  pageElements pageElements = new pageElements(driver);
	  Assert.assertTrue(pageElements.searchButton.isDisplayed());              //Asserting search button to ensuring user proceed into the application
	  System.out.println("User has been verified successfully"); 
	  }
	 
	
	@Test(priority = 2) @Description("Verify search results")
	public void Searchtest() {
	    pageElements pageElements = new pageElements(driver);
		pageElements.searchtextField.sendKeys(pageElements.searchtext);          				//Click and enter text into search text field       
		pageElements.searchButton.click();														//Clicking on search button
	    Assert.assertEquals(pageElements.searchResults.getText(),pageElements.matchSearch); 	//Asserting actual search result with expected result
	    System.out.println("Search results are found and matched with text");
	    
	}
	
}