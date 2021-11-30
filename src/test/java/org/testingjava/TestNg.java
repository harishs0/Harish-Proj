package org.testingjava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNg {
@BeforeClass

private void tc01() {
System.out.println("Before class;test01");

}
@BeforeMethod
private  void tc02() {
	System.out.println("Before method;test02");

}

@org.testng.annotations.Test

private void tc03() {
	System.out.println("test;main");
}
@AfterMethod

private void tc04() {
System.out.println("After Method;test04");

}

@AfterClass
private void tc05() {
	System.out.println("After class;test05");

}

}