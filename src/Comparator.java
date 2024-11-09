import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
	/*
	 * by using comparator interface we can define multiple sorting orders without
	 * changing the class but in comparable we can sort in single order if we want
	 * to change sorting order we have to change in class
	 */
	public static void main(String[] args) {

		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1, "mani", 12));
		list1.add(new Student(2, "kanta", 25));
		list1.add(new Student(3, "sai", 26));
		System.out.println(list1);
		System.out.println();

		// using age
		Collections.sort(list1, new MyCompartor());
		System.out.println(list1);
		System.out.println();

		// using name
		Collections.sort(list1, new secondComparator());
		System.out.println(list1);

		list1.stream().filter((ele) -> ele.getAge() > 20).forEach((ele1) -> System.out.println(ele1));
		System.out.println(list1);

	}

}

class MyCompartor implements java.util.Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getAge() - o1.getAge();
	}

}

class secondComparator implements java.util.Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getName().compareTo(o1.getName());
	}

}

class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Student() {

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

}
