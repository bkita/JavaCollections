package pl.bkita.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("Bartek");
		names.add("Asia");
		names.add("Antek");
		names.add("Bartek");
		names.add("Ala");
		names.add("Ola");
		names.add("Tola");

		Set<String> uniqueNames = new TreeSet<String>(names);

		for (String name : uniqueNames) {
			System.out.println(name);
		}

	}
}
