package com.ramaselvathangamm.maheshsan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
	private String name;
	private int birthYear;
	private int expiryYear;

	Person(String name, int birthYear, int expiryYear) {
		this.name = name;
		this.birthYear = birthYear;
		this.expiryYear = expiryYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

}

public class PersonIsAlive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Person> totalPerson = new ArrayList<Person>();

		totalPerson.add(new Person("Rama Selva Thangam", 1970, 2040));
		totalPerson.add(new Person("Ramesh Kannan", 1982, 2046));
		totalPerson.add(new Person("Muthu Pradeesh", 1975, 2047));
		totalPerson.add(new Person("Ram Kumar", 1999, 2060));
		totalPerson.add(new Person("Veeriya Perumal", 2000, 2065));
		totalPerson.add(new Person("Sam Prakash", 2002, 2076));

		System.out.print("Enter the Year : ");
		int year = scan.nextInt();
		scan.nextLine();
		int count = 0;
		for (Person p : totalPerson) {
			boolean isAlive = year >= p.getBirthYear() && year <= p.getExpiryYear();
			if (isAlive) {
				count++;
				System.out.println(count + ". " + p.getName());

			}

		}
		System.out.println("Persons Alive " + count);
	}

}
