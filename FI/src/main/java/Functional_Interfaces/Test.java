package Functional_Interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
	public static final Logger LOGGER1=LogManager.getLogger(Test.class);
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		try {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		LOGGER1.info("1. Finding average of given list of numbers: ");
		LOGGER1.info("2. Filtering Strings - Starting with 'a' and of length 3: ");
		LOGGER1.info("3. Finding palindromes from the given set of strings: ");
		LOGGER1.info("4. Exit");
		LOGGER1.info("Enter your choice : ");
		
		int i;
		
		i=Integer.parseInt(reader.readLine());
		do {
			
			
		switch(i) {
		case 1:
			LOGGER1.info("Finding average of given list of numbers: ");
			ListAverage.main1();
			break;
			
		case 2:
			LOGGER1.info("Filtering Strings - Starting with 'a' and of length 3: ");
			FilterStrings.main2();
			break;
			
		case 3:
			LOGGER1.info("Finding palindromes from the given set of strings: ");
			FindPalindromes.main3();
			break;
		
			
		default:  
			LOGGER1.info("Enter a valid choice!");
		}
		LOGGER1.info("1. Finding average of given list of numbers: ");
		LOGGER1.info("2. Filtering Strings - Starting with 'a' and of length 3: ");
		LOGGER1.info("3. Finding palindromes from the given set of strings: ");
		LOGGER1.info("4. Exit");
		LOGGER1.info("Enter your choice : ");
		i=Integer.parseInt(reader.readLine());
		}while(i!=4);
		LOGGER1.info("Exit!!!");
		reader.close();
		}
		catch(Exception e) {
			LOGGER1.info("Enter valid information!!!");
		}
	}

}
