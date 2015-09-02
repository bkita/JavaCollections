package pl.bkita.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListToTreeSet {
	
	public static void main(String[] args) {
		
		List<String>names = new ArrayList<String>();
		
		names.add("Hello");
		names.add("You");
		names.add("Are");
		names.add("How");
	    names.add("Hello");
	    
	    // Need to sort and remove duplicates.
	    
	    Set<String> uniqueNames = new TreeSet<String>(names);
	    
	    for (String name : uniqueNames) {
			System.out.println(name);
		}
		
	}

}
