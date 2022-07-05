package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicates {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
	Collections.sort(list);
	System.out.println(list);
Set<Integer>set=new LinkedHashSet<>(list);
set.addAll(list);
System.out.println("Created list without duplicate values ");
for (Integer x : set)
    System.out.println(x);
	
	

	}

}
