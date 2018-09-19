package application;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {
	TestClass testClass = new TestClass();


	@Test
	public void itPassesTheTest(){
		Assert.assertTrue(testClass.returnTrue());
	}

}