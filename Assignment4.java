//Zhe Lei
//CST8110 - Introduction to Programming  section 314
//Assignment 3
//Dr. Rejaul Chowdhury

import java.util.Scanner;

public class Assignment4 {

;	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int option;
		int size;
		// getting input of string array size from the user 
		System.out.println("Enter string array size: ");
		size=input.nextInt();
		
		// creating an object n1
		Names n1= new Names(size);
		
		// create a menu  
		do { // do while loop to loop the menu
			System.out.println("Operations on Names");
			System.out.println("===================");
			System.out.println("1. Enter a name");
			System.out.println("2. Print all names");
			System.out.println("3. Search a name");
			System.out.println("4. Number of occurrences of a name");
			System.out.println("5. Exit");
			System.out.println("Enter your option: ");
			option=input.nextInt();
		// switch statement to get the options	
		switch(option) { 
		case 1:
			n1.insertNames();
			break;
		case 2:
			n1.printNames();
			break;
		case 3:
			// getting the name to be searched from the user
			String searchname;
			System.out.println("Enter the name to be searched:");
			searchname=input.next();
			//print the correct output based on the return statement from searchName() method
			int flag = n1.searchName(searchname);
			if(flag != -1) {
				System.out.println(searchname+" is found in index "+ flag);
			}else{
				System.err.println("No names in the array");
			}
			break;
		case 4:
			// getting the name to be searched from the user
			System.out.println("Enter the name to be searched:");
			String searchname2=input.next();
			// assign the return value of Names.findNumOfOccrrences(searchname2) to a variable called totalcount
			int totalcount=Names.findNumOfOccrrences(searchname2);
			//print the output based on the return statement from Names.findNumOfOccrrences(searchname2) method
			if (totalcount != 0) {
				System.out.println(searchname2+" occurred "+totalcount+" times.");
			}else if (totalcount == 0){
				System.out.println(searchname2+" not found in the array.");
			}
			
			break;
		case 5:
			System.out.println("Good Bye.... Have a nice day!");
			break;
		default:
			System.err.println("Invalid option, try again!");
			
		}
		// the condition of the do while loop is while(option !=5)
		} while (option != 5);
		
		
		}// end of main

}// end of class
