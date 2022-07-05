package week3.day2;

import java.util.HashMap;
import java.util.*;
import java.io.*;

public class MostDuplicate {
	 static void characterCount(String inputString)
	    {
	{
		  // Creating an HashMap
	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	 char[] str = inputString.toCharArray();


     // checking each char of strArray
     for (char c : str) {
         if (map.containsKey(c)) {

             // If char is present in map,
             // incrementing it's count by 1
             map.put(c, map.get(c) + 1);
         }
         else {

             // If char is not present in map,
             // putting this char to map with 1 as it's value
             map.put(c, 1);
         }
     }

     // Printing the map
     for (Map.Entry entry : map.entrySet()) {
         System.out.println(entry.getKey() + " " + entry.getValue());
     }
     int maxCount = 0; 
     char result = 0 ; 
     
     for (Map.Entry entry : map.entrySet()) {
        
    	 if((int)entry.getValue() > maxCount) 
    	 {
    		 maxCount = (int) entry.getValue(); 
    		 result =  (char) entry.getKey(); 
    	 }
     }
     System.out.println(" The most duplicate in  string 'abbbaba' is :   " + result) ; 
     
	}
 }

 // Driver Code
 public static void main(String[] args)
 {
     String s = "abbbaba";
     
     characterCount(s);
     
    			
		}
	}
	
