package arrayLists;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class CustomArrayList extends ArrayList {

	/**
	 * here we are rusticating the list from allowing duplicates
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object e) {
		if (this.contains(e)) {
			return false;
		}
		return super.add(e);

	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		CustomArrayList list1 = new CustomArrayList();
		list1.add("mani");
		list1.add("sai");
		list1.add("mani");
		list1.add("kanta");
		System.out.println(list1);

		// for each using stream
		list1.stream().sorted().forEach((ele) -> {
			System.out.println("the list is " + ele);
		});

	}
}
