package org.testingjava;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvder extends libglobal {
	
	@Test(dataProvider="mydatas")
	
public void tco1(String s,String s1) {
	getDriver();
launchbrowser("https://www.facebook.com/");
WebElement username = xpath("//*[@id=\"email\"]");
textsender(username,s);
WebElement password = xpath("//*[@id=\"pass\"]");
textsender(password                                                                             ,s1);

System.out.println("Harish redone");
System.out.println("Harish redone");
System.out.println("Harish redone");

}

@DataProvider(name="mydatas")

public Object[][]  getDatas() {
	return new Object[][] {
		{"jack","12345"},{"hari","6789"},{"bala","0987"}};

		
}}




	
