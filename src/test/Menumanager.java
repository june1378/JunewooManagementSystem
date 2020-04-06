package test;

import java.util.Scanner;

public class Menumanager {
	Menu Menu;
	Scanner input;
	Menumanager(Scanner input){
		this.input= input; // input을 모든 메소스에서 사용 가능하게
				
	}
	
	public void addName() {
		Menu = new Menu();
		System.out.print("Order number");
		Menu.number=input.nextInt();
		System.out.print("Food name");
		Menu.name  =input.next();
		System.out.println("sidemenu");
		Menu.side  =input.next();//
	
	}
	public  void addPrice() {
		
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		if (Menu.number == ordernumber) {
			System.out.println("the price to be added is"+ ordernumber);
		}

	}
	public  void addNumber() {
		
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		if (Menu.number == ordernumber) {
			System.out.println("the number to be added is"+ ordernumber);
		}
    }
	public  void deleteName() {
		
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		if (Menu ==null) {
			System.out.println("the food name has not been registered");
			return;
		}
		if (Menu.number == ordernumber) {
			Menu=null;
			System.out.println("the name is deleted");
		}


	}
	public  void deletePrice() {
		
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		if (Menu ==null) {
			System.out.println("the food price has not been registered");
			return;
		}
		if (Menu.number == ordernumber) {
			Menu=null;
			System.out.println("the price is deleted");
		}


	}
	public void deleteNumber() {
		
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		if (Menu ==null) {
			System.out.println("the number has not been registered");
			return;
		}
		if (Menu.number == ordernumber) {
			Menu=null;
			System.out.println("the number is deleted");
		}


	}
	public  void edit() {
		
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		if (Menu.number == ordernumber) {
			System.out.println("the food to be edited is"+ ordernumber);
		}

	}

	public void view() {
		
		System.out.print("Order number");
		int ordernumber=input.nextInt();
		if (Menu.number == ordernumber) {
			Menu.printInfo();
		}	
	}
}




