package pl.bkita.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {

		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
		List<String> cities = new ArrayList<String>(Arrays.asList(citynames));

		for (String city : cities) {
			System.out.println(city);
		}
	}

}
