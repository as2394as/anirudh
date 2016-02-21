package tester;

import org.junit.Assert;

import code.Find;

public class Test {

	@org.junit.Test
	public void test1()
	{
		Find ob = new Find();
		Assert.assertTrue(ob.evenodd(2));
	}
	
}
