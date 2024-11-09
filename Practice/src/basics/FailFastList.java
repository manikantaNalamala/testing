package basics;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

	public static void main(String[] args) {

		// java.util.List<String> list = new ArrayList<>();
		//Concurrent modification exception ::it should clone and leave it so it can't loads
		java.util.List<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
			list.add("c");
		}
	}

}
