package week3.day2;


	import java.util.ArrayList;
	import java.util.List;

		public class MissingElementInArray {
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(7);
			list.add(6);
			list.add(8);
			System.out.println(list);
			for (int i = list.get(0); i < list.size(); i++) {
				if (i!=list.get(i-1)) {
					System.out.println("Missing Element: " +i);
					break;
				}
				
			}
	 		}
	}
	