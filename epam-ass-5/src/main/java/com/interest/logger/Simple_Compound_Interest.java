package com.interest.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Simple_Compound_Interest {

	private static final Logger LOGGER =LogManager.getLogger(Simple_Compound_Interest.class);

	public float calculateSimpleInterest(double principal,double time,double rate) 
	{
		LOGGER.debug("entered into simple interest method");
		
		return (float) ((principal*time*rate)/100);
	
	}
	public float calculateCompoundInterest(double principal,double time,double rate) 
	{
		LOGGER.debug("entered into compound interest");
		return (float) ((float) principal * Math.pow(1.0+rate/100.0,time) - principal);
	
	}

}
