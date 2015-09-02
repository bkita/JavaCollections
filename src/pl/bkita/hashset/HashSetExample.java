package pl.bkita.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("Bartek");
		names.add("Asia");
		names.add("Antek");
		names.add(null);
		names.add(null);
		names.add("Bartek");

		System.out.println(names);

		// Delete all
		// names.clear();

		// Iterate
		for (String name : names) {
			System.out.println(name);
		}

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			if (it.next() == null)
				it.remove();
		}
		
		System.out.println(names);
		
	}
}
