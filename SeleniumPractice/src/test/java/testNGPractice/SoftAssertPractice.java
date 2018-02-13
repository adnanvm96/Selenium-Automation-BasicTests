package testNGPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import referenceClassForTestNG.ClassUsedToReference;

public class SoftAssertPractice {

	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Running addition of two number ===> testsum");
		ClassUsedToReference addition = new ClassUsedToReference();
		int result = addition.sumNumbers(1, 2);
		sa.assertEquals(result, 1);
		System.out.println("Line after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("Line after assert 2"); //till here if u run the code then the code will pass only the correct assertions 
//but u will never know which assert has an error so for that we use the following line to know which assert is wrong 
		sa.assertAll();

	}
}
