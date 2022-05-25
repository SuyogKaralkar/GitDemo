package Suyog.newproject;

import org.testng.annotations.Test;

public class test3 {
@Test
public void personalLoan() {
	System.out.println("Personal loan");
}
@Test(dependsOnMethods= {"personalLoan"})
public void educationalLoan() {
	System.out.println("educationalloan");
	
}
}
