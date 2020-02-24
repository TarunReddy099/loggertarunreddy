package com.loglog.loglog;


import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;


class cost{
	cost() throws IOException{
		Logger logger = Logger.getLogger(App.class.getName());
		int total=0;
	BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
	

		 
	logger.info("Welcome to Epam Constructions\nPlease Select the type of material\n1.standard materials\n2.above standard materials\n3.high standard material\n4.Fully automated House");
	
	int m = Integer.parseInt(read.readLine());
	logger.info("enter the area of the house(In square feets)");
	
	int material=m;
	int area = Integer.parseInt(read.readLine());
	
	if(material==1) {
		 total=1200*area;
	}
	if(material==2) {
		 total=1500*area;
	}
	if(material==3) {
		 total=1800*area;
	}
	if(material==4) {
		 total=2500*area;
	}
	
	 logger.info("\nThe Estimated cost is "+total+" Rupees");
    
     logger.info("Cost estimated successfully");

	}
}
public class Construction {
	public static void main(String[] args) throws IOException
    { Logger logger = Logger.getLogger(Construction.class.getName());
    logger.info("Function Called");
      cost c =new cost();

    } 

}

