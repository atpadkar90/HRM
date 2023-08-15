package Listener;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayerPack.BaseClasss;
import junit.framework.Assert;

public class Demo1 extends BaseClasss {
	
	
	@BeforeTest
	
	public void setUp()
	{
		initilization();
	}
	
	
	@Test
	
	public void m1()
	{
		Assert.assertEquals(12, 12);
	}
	
@Test
	
	public void m2()
	{
		Assert.assertEquals("gmail", "gmail");
	}


}
