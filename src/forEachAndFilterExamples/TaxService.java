package forEachAndFilterExamples;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	// Filter by stream API

	public static List<Employe> getFilterTax() {
		return EmployeDAO.getEmployes().stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.filter(emp -> emp.getAge() > 24).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(getFilterTax());

	}

}
