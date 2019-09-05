//Zhe Lei
//CST8110 - Introduction to Programming
//Assignment 3
//Dr. Rejaul Chowdhury

import java.util.Scanner;

public class Names {
	Scanner input = new Scanner(System.in);
	// creating variables
	static int currentSize;
	static String names[];
	int size;
	
	// no-arg constructor initializes string array names with a size of 10
	public Names() {
		names = new String[10];
	}
	
	// parameterized constructor initialized string array names with a specified size
	public Names(int size) {
		this.size=size;
		currentSize=0;
		
	}
	
	// insertNames method checks whether the array is full
	public void insertNames() {
		if (currentSize<names.length) {
			System.out.println("Enter name: ");
			String name=input.next();
			names[currentSize]=name;
			currentSize++;
		}else {
			System.err.println("Array is full, cannot add any more names");
		}
	}
	
	//printNames() prints all names in the array
	public void printNames() {
		int currentSize=0;
		if (names.length == 0) {
			System.err.println("No elements in the array");
		}else {
		System.out.println("Names in the array\r\n" + 
				"==================");
		for (;currentSize<names.length;currentSize++) {
		System.out.println(names[currentSize]);
		}
		}
	}
	
	//searchNames() method get the name to be searched
	public int searchName(String searchname) {
		// assign integer variable location to -1
		int location=-1;
		// if names[currentSize].equals(searchname), which means the name is found in the array, assign currentSize to location
		for (int currentSize=0;currentSize<names.length;currentSize++)
			if (names[0] == null) {
				System.err.println("No names in the array");
				break;
			}else if (names[currentSize].equals(searchname));
					location=currentSize;
			
			// return statement of the method
			return location;
		}
			
	//findNumOfOccrrences() method
	public static int findNumOfOccrrences(String searchname2) {
		// create a varible count with value of 0
		int count=0;
		// using a for loop to check every item in the array, if the name to be searched occured in the array, increment count by 1 at a time
		for (int currentSize=0;currentSize<names.length;currentSize++) 
			if (names[currentSize].equals(searchname2)) {
				count++;
			}
		// return statement of the method
		return count;
	}

	

}// end of class
