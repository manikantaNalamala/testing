package forEachAndFilterExamples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListByLambda {

	public static void main(String[] args) {

		List<Employe> employess = EmployeDAO.getEmployes();

		//Collections.sort(employess, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		/*
		 * Collections.sort(employess, new Comparator<Employe>() {
		 * 
		 * @Override public int compare(Employe o1, Employe o2) { return (int)
		 * (o2.getSalary() - o1.getSalary()); } });
		 */
		
		employess.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach((t) -> System.out.println(t));    //pure lambda expression
		employess.stream().sorted(Comparator.comparing(emp ->emp.getSalary())).forEach((t) -> System.out.println(t));            //optimizing the Lambda expression
		employess.stream().sorted(Comparator.comparing(Employe::getAge)).forEach((t) -> System.out.println(t));                  //Method reference
		employess.stream().sorted((o1,o2) -> o1.getAge()-o2.getAge()).forEach((k)-> System.out.println(k));
	//	System.out.println(employess);

	}

}
