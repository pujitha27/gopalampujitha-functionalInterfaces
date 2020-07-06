package Functional_Interfaces;
import java.util.*;
//import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FilterStrings {
	public static final Logger LOGGER1=LogManager.getLogger(FilterStrings.class);
	public static void main2()
	{
		Scanner sc2=new Scanner(System.in);
		try {
			
		
		
		List<String> strings=new ArrayList<String>();
		LOGGER1.info("enter n:");
		int n=sc2.nextInt();
		LOGGER1.info("enter "+n+" strings:");
		for(int i=0;i<n;i++)
		{
			strings.add(sc2.next());
		}
		//sc2.close();
		//List<String> NonEmptyStrings = filterEmptyStrings(strings, (String str) -> !str.isEmpty());
		List<String> stringsOfLength3_startingWitha=strings.stream()
																   .filter(str->!str.isEmpty() && str.startsWith("a") && str.length()==3)
																   .collect(Collectors.toList());
		
		LOGGER1.info("Strings starting with 'a' and with length 3 : "+stringsOfLength3_startingWitha);
		}
		catch(Exception E)
		{
			LOGGER1.info("Enter a valid 'n' value and valid set of strings");
			//sc2.close();
		}
	}
	
	/*public static List<String> filterEmptyStrings(List<String> strings, Predicate<String> p) {
	     List<String> nonEmptyStrings = new ArrayList<>();
	     
		 for (String s : strings) {
	       if(p.test(s)) {
	    	   nonEmptyStrings.add(s);
	       }
	    }
	  return nonEmptyStrings;
	  }*/

	
}
