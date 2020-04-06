package test;

import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		
		 
		Scanner input = new Scanner(System.in);
		Menumanager Menumanager = new Menumanager(input);
		
		int num = 5;

		while (num!=9) {
			System.out.println("1. Add the name of food");
			System.out.println("2. Add the price of food");
			System.out.println("3. Add the number of food");
			System.out.println("4. Delete the name of food");
			System.out.println("5. Delete the price of food");
			System.out.println("6. Delete the number of food");
			System.out.println("7. Edit");
			System.out.println("8. View");
			System.out.println("9. Exit");
			System.out.println("Select one number between 1 - 9:");
			num= input.nextInt(); ///////
			if (num==1) {
				Menumanager.addName();
			}
			else if (num==2) {
				Menumanager.addPrice();
			}	
			else if (num==3) {
				Menumanager.addNumber();
			}	
			else if (num==4) {
				Menumanager.deleteName();
			}	
			else if (num==5) {
				Menumanager.deletePrice();
			}	
			else if (num==6) {
				Menumanager.deleteNumber();
			}	
			else if (num==7) {
				Menumanager.edit();					
			}
			else if (num==8) {
				Menumanager.view();	
			 
				continue;
			}
		}
	}
}	

