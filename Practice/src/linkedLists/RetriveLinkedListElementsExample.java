package linkedLists;
/* How to get the first element in the LinkedList
 * How to get the last element in the LinkedList
 * How to get the element at a given index in the linked-list
 * How to remove the first element in the LinkedList
 * How to remove the last element in the LinkedList
 * How to remove the first occurrence of given  element in the LinkedList
 * How to clear all elements in linkedList
 * How to get all the elements from linked-list 
 * */

import java.util.LinkedList;

public class RetriveLinkedListElementsExample {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Mango");
		fruits.add("grape");
		fruits.add("papaya");
		fruits.add("guva");

		// first element
		System.out.println(fruits.getFirst());
		// last element
		System.out.println(fruits.getLast());
		// get element at specified index
		System.out.println(fruits.get(2));
		// remove first element
		System.out.println(fruits.removeFirst() + fruits);
		// remove last element
		System.out.println(fruits.removeLast() + fruits);
		// remove element at specified index
		System.out.println(fruits.remove(1) + fruits);

		fruits.add("Mango");
		fruits.add("grape");
		fruits.add("papaya");
		fruits.add("guva");
		System.out.println(fruits + " ''");

		System.out.println(fruits.removeFirstOccurrence("grape"));
		System.out.println(fruits);
		// to clear
		fruits.clear();
		System.out.println("after clearing - " + fruits);
		
	}

}
