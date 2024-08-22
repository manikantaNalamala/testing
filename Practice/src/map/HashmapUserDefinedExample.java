package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapUserDefinedExample {

	public static void main(String[] args) {

		Map<Integer, Employea> students = new HashMap<>();
		Employea e1 = new Employea("kalpana", "chava", 85);
		Employea e2 = new Employea("kalpana", "ravi", 89);
		students.put(5, e1);
		students.put(5, e2);
		students.put(1, new Employea("Mani", "kanta", 23));
		students.put(2, new Employea("venkat", "rao", 50));
		students.put(1, new Employea("Mani", "kanta", 23));

		System.out.println(students.values() + "----" + students.keySet());

		for (Map.Entry<Integer, Employea> entries : students.entrySet()) {

		}

		Set<Map.Entry<Integer, Employea>> entree = students.entrySet();

		Iterator<Map.Entry<Integer, Employea>> it1 = entree.iterator();
		while (it1.hasNext()) {
			Map.Entry<Integer, Employea> entry = it1.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		/*
		 * for (Map.Entry<Integer, Employea> entries : students.entrySet()) {
		 * System.out.println(entries.getKey()); System.out.println(entries.getValue());
		 * }
		 * 
		 * Set<Map.Entry<Integer, Employea>> entries = students.entrySet();
		 * Iterator<Map.Entry<Integer, Employea>> iter = entries.iterator(); while
		 * (iter.hasNext()) { Map.Entry<Integer, Employea> entry = iter.next();
		 * System.out.println(entry.getKey()); System.out.println(entry.getValue()); }
		 */
	}
}

class Employea {

	private String firstname;
	private String lastName;
	private int age;

	public Employea(String firstName, String lastName, int age) {
		super();
		this.firstname = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employea [firstname=" + firstname + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
