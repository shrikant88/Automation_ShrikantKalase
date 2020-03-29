package com.gymondo.pagelements;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import jdk.nashorn.internal.runtime.arrays.AnyElements;

public class pageElements{
	
	public AndroidDriver<AndroidElement> driver;
	public pageElements(AndroidDriver<AndroidElement> driver) {
	this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);   // The PageFactory Class is an extension to the Page Object design pattern. It is used to initialize the elements of the Page Object or instantiate the Page Objects itself. It is used to initialize elements of a Page class without having to use 'FindElement' or 'FindElements'.
	}
	
	 @AndroidFindBy(id ="com.example.android.gymondoautomationtest:id/editText")   // User Name text field element ID. 
	 public AndroidElement usernameField;
	 
	 @AndroidFindBy(id= "com.example.android.gymondoautomationtest:id/editText2")  // Password text field element ID.
	 public AndroidElement passwordField;
     
	 @AndroidFindBy(id="com.example.android.gymondoautomationtest:id/button")      // Login button element ID.
	 public AndroidElement loginButton;
 
     @AndroidFindBy(id="com.example.android.gymondoautomationtest:id/editTxtSearch")  // Home screen - Search text field element ID.
     public AndroidElement searchtextField;
   
     @AndroidFindBy(id="com.example.android.gymondoautomationtest:id/btnSearch")  // Home screen - Search button field element ID.
     public AndroidElement searchButton;
     
     @AndroidFindBy(xpath="//android.widget.TextView[@text='573 - Awesome']")    //Home screen - Search results element x path identifier.
     public AndroidElement searchResults;
     
     
     public String userName ="automation@gymondo.de";  //
     public String userPass ="automation";
     public String searchtext="Awesome";
     public String matchSearch ="573 - Awesome";

     
     
	
     
     
     
     

}
