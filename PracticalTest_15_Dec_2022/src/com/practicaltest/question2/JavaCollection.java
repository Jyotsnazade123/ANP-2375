package com.practicaltest.question2;

import java.util.ArrayList;
import java.util.List;

public class JavaCollection {

	public static void main(String[] args) {
		List<String> Stringslist = new ArrayList<String>();
		Stringslist.add("Audi");
		Stringslist.add("BMW");
		Stringslist.add("Bugatti");
		Stringslist.add("Ford");
		Stringslist.add("Honda");
		Stringslist.add("Hyundai");

		// Print the list
		System.out.println(Stringslist);

		// Now insert at the first position of the list
		Stringslist.add(0, "Ferrari");

		// Print the list
		System.out.println(Stringslist);
	}
}
