package com.practicaltest.question1;

import java.util.ArrayList;
import java.util.Collections;

public class Example {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();

		// Inserting elements in al
		al.add("TCS");
		al.add("Wipro");
		al.add("HCL");
		al.add("Atos syntel");
		
		System.out.println("ArrayList before Swap");
		for (String str : al)
			System.out.println(str + " ");

		// swap element at index 0(TCS) with element at index 3(Atos syntel)
		Collections.swap(al, 0, 3);

		System.out.println("ArrayList after Swap");
		for (String str : al)
			System.out.println(str + " ");
	}
}
