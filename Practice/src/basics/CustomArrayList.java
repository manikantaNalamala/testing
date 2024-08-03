package basics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {

	// here we can restrict the Array list from allowing the duplicates.

	@Override
	public boolean add(Object e) {
		if (this.contains(e)) {
			return false;
		}
		return super.add(e);
	}

	public static void main(String[] args) {

		CustomArrayList list = new CustomArrayList();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);
		System.out.println(list);
		Set<String> set = new LinkedHashSet<>();
		set.add("123");
	}

}
