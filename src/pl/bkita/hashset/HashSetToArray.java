package pl.bkita.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("Bartek");
		names.add("Asia");
		names.add("Antek");
		names.add(null);
		names.add(null);
		names.add("Bartek");

		String[] arrNames = names.toArray(new String[names.size()]);

		for (String name : arrNames) {
			System.out.println(name);
		}

	}

}
