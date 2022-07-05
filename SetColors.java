package week3.day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SetColors{
		public static void main(String[] args) {
					
		LinkedHashSet<Object> set1 = new LinkedHashSet<>();
			
		set1.add("red");
		set1.add("green");
		set1.add("blue ");
		set1.add("yellow");
		set1.add("brown");
						
		System.out.println("the original order is " +set1);
	    	//change from Set to List
        	List<Object>list=new ArrayList<>(set1);
	    	
	        for(int i = list.size()-1;i>=0;i--) {
					
		System.out.println("the reverse order is :" + list.get(i));}
			
			
		 }
		}
		 
			 
			
			
			
			
		
	




