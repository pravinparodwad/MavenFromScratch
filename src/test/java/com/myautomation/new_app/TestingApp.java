package com.myautomation.new_app;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.framework.Browser;
import com.framework.UiElement;
import com.framework.WebAutomator;
import com.test.BaseTest;

public class TestingApp{
	@BeforeSuite
	public void test1() {
		System.out.println("before suite");
//		auto = new WebAutomator(Browser.CHROME);
//		auto.goTo(getConf().getAPP_URL());
	}
	
	@Test
	public void actualtestMethod() {
		System.out.println("Running actual test annotation");
//		UiElement formsElement = auto.findUiElement("xpath=//h5[.='Forms']");
//		formsElement.printInfo();
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("after suite");
	}

}
