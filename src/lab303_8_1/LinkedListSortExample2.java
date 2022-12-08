package lab303_8_1;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample2 {
	public static void main(String[] args) {
		// Create linked list

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("A");
		linkedList.add("C");
		linkedList.add("B");
		linkedList.add("D");

		// Unsorted
		System.out.println(linkedList);

		// 1. Sort the list
		Collections.sort(linkedList);

		// Sorted
		System.out.println(linkedList);

		// 2. Custom sorting
		Collections.sort(linkedList, Collections.reverseOrder());

		// Custom sorted
		System.out.println(linkedList);
	}
}
