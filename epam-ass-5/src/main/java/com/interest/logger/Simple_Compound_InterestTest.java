package com.interest.logger;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class Simple_Compound_InterestTest {

	private Simple_Compound_Interest interest;
	
	@Before
	public void init()
	{
		interest=new Simple_Compound_Interest();
	}
	@Test
	public void test() {
		
		assertEquals(576.0f,interest.calculateSimpleInterest(1200,2,24.0),0.0f);
	}
	@Test
	public void test2() {
		
		assertEquals(828.0,interest.calculateCompoundInterest(1200,2,30),0.0f);
	}

}
