package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
	
	List<Integer>list=new ArrayList<Integer>();
	list.add(3);
	list.add(2);
	list.add(11);
	list.add(4);
	list.add(6);
	list.add(7);
	Collections.sort(list);//sorted list
	System.out.println("the original list is ................."+list);
	
	List<Integer>list2=new ArrayList<Integer>();
	list2.add(1);
	list2.add(2);
	list2.add(8);
	list2.add(4);
	list2.add(9);
	list2.add(7);
	Collections.sort(list2);//sorted list2
	System.out.println("the original list of list2 is ......."+list2);

    list2.retainAll(list);
    System.out.println("the intersection of list and list2 is "+list2);
	
    
}}

//int[] array1 =new int[]  {3,2,11,4,6,7};// declared array 1
//int[] array2 = {1,2,8,4,9,7};   