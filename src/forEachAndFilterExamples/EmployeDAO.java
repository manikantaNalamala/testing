package forEachAndFilterExamples;

import java.util.ArrayList;
import java.util.List;

public class EmployeDAO {

	public static List<Employe> getEmployes() {
		List<Employe> employes = new ArrayList<>();
		employes.add(new Employe(1, "mani", 25, 7500));
		employes.add(new Employe(2, "kanta", 24, 5000));
		employes.add(new Employe(3, "sai", 23, 5500));
		employes.add(new Employe(4, "jothi", 45, 4500));
		employes.add(new Employe(5, "venka", 50, 3200));

		return employes;

	}

}
