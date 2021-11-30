package org.testingjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupingtest {
@Test(groups="@smoke")
private void tco1() {
Assert.assertTrue(false);
	System.out.println("method:o1");
}

@Test(groups="@reg",  dependsOnGroups="@smoke",alwaysRun=true)
private void tco2() {

	System.out.println("method:o2");
}


@Test(groups="@smoke")
private void tco3() {

	System.out.println("method:o3");

}

@Test(groups="@sanity")
private void tco4() {

	System.out.println("method:o4");
}	

@Test(groups="@reg",  dependsOnGroups="@smoke",alwaysRun=false)
private void tco5() {

	System.out.println("method:o5");	
	
}
	
@Test(groups="@sanity")
private void tco6() {

	System.out.println("method:o6");	
	
}	
	

@Test(groups="@smoke")
private void tco7() {

	System.out.println("method:o7");	
	
}}	