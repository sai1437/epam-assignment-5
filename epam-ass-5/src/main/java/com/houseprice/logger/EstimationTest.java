package com.houseprice.logger;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class EstimationTest {
	private Estimation es;

	@Before
	public void init()
	{
		es=new Estimation();
	}
	@Test
	public void test() {
		assertEquals(960000,es.housecost("standard",800),0.0f);
	}

}
