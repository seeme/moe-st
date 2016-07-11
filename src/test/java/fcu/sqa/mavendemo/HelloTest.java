package fcu.sqa.mavendemo;

import org.junit.Assert;
import org.junit.Test;


public class HelloTest {
	
	@Test
	public void testSayHello() {
		Hello hello = new Hello();
		String expected = "Hello Sammy!";
		String actual = hello.sayHello("Sammy");
		Assert.assertEquals(expected, actual);
	}

}
