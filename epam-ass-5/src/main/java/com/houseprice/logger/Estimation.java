package com.houseprice.logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Estimation {
	Materials m;
	double cost;
	private static final Logger LOGGER =LogManager.getLogger(Estimation.class);
	public double housecost(String material,double area) {
		if(material=="standard")
		{
			 m=new Standard();
			 LOGGER.info("entered into standard");
		}
		if(material=="above")
		{
			m=new AboveStandard();
			 LOGGER.info("entered into above standard");

		}
		if(material=="high")
		{
			m=new HighStandard();
			 LOGGER.info("entered into high standard");

		}
		if(material=="automated")
		{
			m=new HighStandard_Automated();
			 LOGGER.info("entered into automated");

		}
		LOGGER.info("the total cost required");
		cost=area*m.getmaterial();
		return cost;
	}

	
}
