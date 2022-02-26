package comparable.com.dkh;

import java.util.Arrays;
import java.util.Comparator;

public class ClientMain {
	public static void main(String[] args) {

		String names[] = { "A", "D", "P", "R", "SK" };
		System.out.println("BEFORE SORTING DATA..");
		for (String name : names) {
			System.out.println("the name is " + name);
		}
		Arrays.sort(names, (a, b) -> a.compareTo(b));
		Arrays.sort(names, String::compareToIgnoreCase);

		System.out.println("After sorting ");
		for (String name : names) {
			System.out.println(name);
		}

		Person ar[] = new Person[5];
		Person p1 = new Person(10, "Enand", "Maurya");
		Person p2 = new Person(20, "Dnand", "Naurya");
		Person p3 = new Person(30, "monoi", "Oaurya");
		Person p4 = new Person(40, "Cnand", "Paurya");
		Person p5 = new Person(50, "banand", "Qaurya");
		ar[0] = p1;
		ar[1] = p2;
		ar[2] = p3;
		ar[3] = p4;
		ar[4] = p5;
		System.out.println("before sorting ..");
		for (Person p : ar) {
			System.out.println("the sort array is :" + p);
		}

		Arrays.sort(ar, Comparator.comparing(Person::getFirstname));
		System.out.println("AFTER SORTING");
		for (Person pp : ar) {
			System.out.println(pp);
		}
	}
}
