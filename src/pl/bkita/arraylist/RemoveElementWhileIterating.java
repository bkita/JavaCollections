package pl.bkita.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementWhileIterating {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Hello");
		names.add("You");
		names.add("Are");
		names.add("How");
		names.add("Hello");

		Iterator it = names.iterator();

		while (it.hasNext()) {
			if (it.next().equals("Hello"))
				it.remove();
		}
		
		System.out.println(names);

	}

}
