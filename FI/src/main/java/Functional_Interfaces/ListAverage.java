package Functional_Interfaces;
import java.util.*;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ListAverage {
	public static final Logger LOGGER1=LogManager.getLogger(ListAverage.class);
		public static void main1()
		
		{
			
			Scanner sc1=new Scanner(System.in);
			LOGGER1.info("enter n:");
			try {	
			int n=sc1.nextInt();
			LOGGER1.info("enter "+n+" integers:");
			List<Integer> numbers=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				numbers.add(sc1.nextInt());
			}
			//sc1.close();
			
			
			float average=findAverage(numbers,(Integer i)->	 { Optional<Integer> opt=Optional.ofNullable(i); return opt.isPresent();} );
			LOGGER1.info("Average :"+average);
			}
			catch(Exception E)
			{
				LOGGER1.info("Enter a valid integer");//sc1.close();
			}
		}
		
		
		public static float findAverage(List<Integer> numbers,Predicate<Integer> p)
		{
			
			int sum=0;
			int count=0;
			for(Integer i: numbers)
			{
				if(p.test(i))
				{
					sum+=i;
					count+=1;
				}
			}
			if(count==0) 
				count=1;
			LOGGER1.info("sum: "+sum+"\ncount: "+count);
			return ((float)sum/count);
		}
}


