package test;

import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num!=8) {
			System.out.println("1. Add the name of food");
			System.out.println("2. Add the price of food");
			System.out.println("3. Add the number of food");
			System.out.println("4. Delete the name of food");
			System.out.println("5. Delete the price of food");
			System.out.println("6. Delete the number of food");
			System.out.println("7. Edit");
			System.out.println("8. Exit");
			System.out.println("Select a number");
			num= input.nextInt();
			if (num==1) {
				addName();
			}
			else if (num==2) {
				addPrice();
			}	
			else if (num==3) {
				addNumber();
			}	
			else if (num==4) {
				deleteName();
			}	
			else if (num==5) {
				deletePrice();
			}	
			else if (num==6) {
				deleteNumber();
			}	
			else if (num==7) {
				edit();
			}	
		}
	}	
	public static void addName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		System.out.print("Food name");
		String foodname  =input.next();
		System.out.println(foodname);
		System.out.print("side menu");
		String sidemenu  =input.next();
		System.out.println(sidemenu);  //
	
	}
	public static void addPrice() {
		Scanner input = new Scanner(System.in);
		System.out.print("Order number");
		int ordernumber=input.nextInt();

	}
	public static void addNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Order number");
		int ordernumber=input.nextInt();

	}
	public static void deleteName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Order number");
		int ordernumber=input.nextInt();

	}
	public static void deletePrice() {
		Scanner input = new Scanner(System.in);
		System.out.print("Order number");
		int ordernumber=input.nextInt();

	}
	public static void deleteNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Order number");
		int ordernumber=input.nextInt();

	}
	public static void edit() {
		Scanner input = new Scanner(System.in);
		System.out.print("Order number");
		int ordernumber=input.nextInt();

	}
}


