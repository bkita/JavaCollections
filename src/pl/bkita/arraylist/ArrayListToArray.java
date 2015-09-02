package pl.bkita.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	
	public static void main(String[] args) {
				
		List<String> names = new ArrayList<String>();

		names.add("Hello");
		names.add("You");
		names.add("Are");
		names.add("How");
		names.add("Hello");
		
		String[] array = names.toArray(new String[names.size()]);
		
		for (String element : array) {
			System.out.println(element);
		}
	}

}
