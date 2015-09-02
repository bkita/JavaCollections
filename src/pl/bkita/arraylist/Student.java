package pl.bkita.arraylist;

import java.util.Comparator;

public class Student {

	private int id;
	private String firstName;
	private String lastName;

	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static Comparator<Student> firstNameComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getFirstName().compareTo(s2.getFirstName());
		}

	};

	public static Comparator<Student> lastNameComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getLastName().compareTo(s2.getLastName());
		}
	};

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

}
