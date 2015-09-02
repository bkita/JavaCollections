package pl.bkita.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortCustomObject {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(0, "Mike", "Tyson"));
		students.add(new Student(1, "Evander", "Hollyfield"));
		students.add(new Student(2, "Rocky", "Marsiano"));
		students.add(new Student(3, "Albert", "Sosnowski"));
		
		Collections.sort(students, Student.firstNameComparator);
		System.out.println(students);
		
		Collections.sort(students, Student.lastNameComparator);
		System.out.println(students);
	}

}
