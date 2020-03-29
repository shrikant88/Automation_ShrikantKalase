package com.gymondo.config;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class appiumBase {
    public AndroidDriver<AndroidElement> driver;
    
	@BeforeMethod
	public void appiumConfig() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "10");            //Android version.
		capabilities.setCapability("deviceName","emulator-5554");       //User Device name.
		capabilities.setCapability("platformName","Android");           //user device Platform name.
	    capabilities.setCapability("appPackage", "com.example.android.gymondoautomationtest");   // package name to recognize the application.
	    capabilities.setCapability("appActivity", "com.example.android.gymondoautomationtest.MainActivity"); //Launching app screen activity.
	    capabilities.setCapability("APP","./gymondo_Android/Gymondo_APK/app-debug.apk");  // Location of testing APK for installing the application on device.
	    driver = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities); //Create RemoteWebDriver instance and connect to the Appium server.
	}
	

}
