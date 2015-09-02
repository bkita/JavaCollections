package pl.bkita.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Tom");
		names.add("Jerry");
		names.add("Mike");

		System.out.println(names);
		System.out.println(names.contains("Tom"));
		System.out.println(names.get(1));

		// sort
		Collections.sort(names);
		System.out.println("Sorted: " + names);

		Collections.sort(names, Collections.reverseOrder());
		System.out.println("Reverse Sorted: " + names);

		// add - remove
		names.add(0, "Gordon");
		System.out.println(names);

		names.remove("Tom");
		System.out.println(names);

		names.remove(0);
		System.out.println(names);

		// loops
		for (String name : names) {
			System.out.println(name);
		}

		Iterator it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
