package linkedLists;

import java.util.LinkedList;

//add()
// add(2, element)

//addFirst() -from deque interface
//addLast()

public class CreateLinkedList {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Mango");
		fruits.add("grape");
		fruits.add("papaya");
		fruits.add("guva");

		System.out.println("intial Linkedlist are :" + fruits);

		// Adding element at particular/specified position in linked-list
		fruits.add(1, "Watermelon");
		System.out.println("After adding  Linkedlist are :" + fruits);

		// Adding element at the start of the linked-list
		fruits.addFirst("blueberry");
		System.out.println("After adding at first Linkedlist are :" + fruits);

		// Adding element at the end of the linked-list
		fruits.addLast("banana");
		System.out.println("After adding at end Linkedlist are :" + fruits);
	}

}
