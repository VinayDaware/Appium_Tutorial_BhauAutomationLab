package com.appiumDay1;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Launch_App {

	private AppiumDriver driver;

	@BeforeTest
	public void setup() throws URISyntaxException, MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("paltformName", "Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
		capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");

		URI url = new URI("http://127.0.0.1:4723/wd/hub/");
		driver = new AndroidDriver(url.toURL(), capabilities);

		

	}

	@Test
	public void launch_app_in_device()
	{
	//	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Username']")).click();
	}

}
