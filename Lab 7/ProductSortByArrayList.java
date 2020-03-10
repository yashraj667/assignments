package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductSortByArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements you want to insert");

		int range = sc.nextInt();
		System.out.println("Enter Elements");
		for (int i = 0; i < range; i++) {
			String s = sc.next();
			al.add(s);
		}
		Collections.sort(al);
		for (String elements : al) {
			System.out.println(elements);
		}

	}

}
