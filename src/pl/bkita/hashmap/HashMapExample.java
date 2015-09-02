package pl.bkita.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> namesMap = new HashMap<Integer, String>();

		namesMap.put(2, "Bartek");
		namesMap.put(3, "Natalia");
		namesMap.put(0, "Asia");
		namesMap.put(4, "Jola");
		namesMap.put(5, "Zenek");
		namesMap.put(6, "Alibaba");
		namesMap.put(1, "Antek");
		
		Map<Integer, String> sortedMap = sortByValue(namesMap);
		
		for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			System.out.println(entry.getValue());
		}
		
	}

	private static Map sortByValue(Map map) {

		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(
				map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1,
					Entry<Integer, String> o2) {

				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();

		for (Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}
}
