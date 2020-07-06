package Functional_Interfaces;



import java.util.*;
import java.util.Scanner;
//import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



	class Checker{
		static boolean isPalindrome(String str){
			return str.trim().equals(new StringBuilder(str).reverse().toString().trim());
		}
			
		
	}
    public class FindPalindromes {
    	public static final Logger LOGGER1=LogManager.getLogger(FindPalindromes.class);
		public static void main3()
		{
			Scanner sc3=new Scanner(System.in);
			try {
			
			List<String> strings=new ArrayList<String>();
			LOGGER1.info("enter n:");
			int n=sc3.nextInt();
			LOGGER1.info("enter "+n+" strings:");
			for(int i=0;i<n;i++)
			{
				strings.add(sc3.next());
			}
			//sc3.close();
			//Predicate<String> p=Checker::check;
			//Predicate<String> isEmpty=str->! str.trim().isEmpty();
			List<String> palindromes=strings.stream()
											.filter(str->! str.trim().isEmpty())
											.filter(Checker::isPalindrome)
											.collect(Collectors.toList());
			LOGGER1.info("palindromes : "+palindromes);
			}
			
			catch(Exception E)
			{
				LOGGER1.info("Enter a valid 'n' value and valid set of strings ");
				//sc3.close();
			}
		}
		
	}


