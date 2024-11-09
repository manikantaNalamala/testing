package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<Employe> employes = new ArrayList<>();
		employes.add(new Employe(1, "mani", 23, 25000));
		employes.add(new Employe(2, "kanta", 24, 2200));
		employes.add(new Employe(3, "sai", 25, 2568));
		employes.add(new Employe(4, "nalamala", 45, 8989));
		employes.add(new Employe(5, "jayho", 48, 21212));

		//Collections.sort(employes, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

		for (Employe employe : employes) {
			//System.out.println(employe);
		}
		
		//employes.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);
		//employes.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
		//employes.stream().sorted(Comparator.comparing(Employe::getSalary)).forEach(System.out::println);
		
		employes.stream().sorted(Comparator.comparing(Employe::getAge).reversed()).forEach(System.out::println);
	}
}

class Employe {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employe(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
