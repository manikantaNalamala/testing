import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	// we can sort the collections using the comparable interface in single order if
	// we want to sort on other then we have to make change in class this limitation
	// leads to the less usage of comparable

	public static void main(String[] args) {
		List<Student1> list1 = new ArrayList<Student1>();
		list1.add(new Student1(1, "mani", 12));
		list1.add(new Student1(2, "kanta", 25));
		list1.add(new Student1(3, "sai", 26));
		System.out.println(list1);
		System.out.println();

		Collections.sort(list1);
		System.out.println(list1);

	}

}

class Student1 implements Comparable<Student1> {
	private int id;
	private String name;
	private int age;

	public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Student1() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student1 other) {
		return this.name.compareTo(other.name);
		// return Integer.compare(other.age, this.age);
	}
}
