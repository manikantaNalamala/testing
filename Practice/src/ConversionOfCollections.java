import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConversionOfCollections {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("mani");
		list1.add("kanta");
		list1.add("sai");

		IntStream.range(0, list1.size()).forEach((ele) -> System.out.println(ele + " - " + list1.get(ele)));

		System.out.println(list1 + " " + list1.getClass());
		System.out.println();

		// List to set
		Set<String> set1 = new HashSet<String>(list1);
		System.out.println(set1);

		// list to map
		Map<String, Integer> map1 = list1.stream().collect(Collectors.toMap(item -> item, item -> list1.indexOf(item)));
		System.out.println(map1 + " " + map1.getClass());

		// set to list
		List<String> list2 = new ArrayList<String>(set1);
		System.out.println(list2 + " " + list2.getClass());
		
		//set to map
		//set1.stream().collect(Collectors.toMap(item -> item, item->set1.))

	}

}
