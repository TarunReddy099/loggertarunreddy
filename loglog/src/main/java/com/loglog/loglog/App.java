package com.loglog.loglog;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.selector.BasicContextSelector;
import org.apache.log4j.BasicConfigurator;

class calculate{
	calculate() throws IOException{
		Logger logger = Logger.getLogger(App.class.getName());
    	
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	
		 
	logger.info("enter the value of principle amount");
	
	int p = Integer.parseInt(reader.readLine());
		 
	logger.info("enter the value of time period(in years)");

	int t = Integer.parseInt(reader.readLine());
		 
	logger.info("enter the rate of interest(in %)");
	
    double r = Integer.parseInt(reader.readLine());
		 
	logger.info("Choose \n1.Simple Interest\n2.Compound Interest");
	
	int type = Integer.parseInt(reader.readLine());
		 
		 
	 if(type==1) {
		 double sI= (p * t * r)/100;
		 logger.info("\nThe Intrest amount is "+sI+" Rupees");
	    
	     logger.info("Simple Intrest calculated");
	 }
	 else if(type==2){
			 logger.info("\nenter the no of times interest is compunded per year");
		
			 int n = Integer.parseInt(reader.readLine());
			 r=r/100;
			 double totalamountCi = p * Math.pow(1 + (r / n), n * t); 
			 
			 double cI=totalamountCi-p;
			 logger.info("\nThe interest amount is "+cI+" Rupees");
		    
		     logger.info("Compond Intrest calculated");
			 
	 }
	 else {
			 logger.info("*****INVALID SELECTION*****");
			
     }

	}
}
public class App 
{ 
	 

    public static void main( String[] args ) throws IOException 
    {   Logger logger = Logger.getLogger(App.class.getName());
    	
    	logger.info("Class Started");
    	calculate c=new calculate();
}
}