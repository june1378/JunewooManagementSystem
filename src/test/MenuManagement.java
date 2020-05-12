package test;

import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Menumanager Menumanager = new Menumanager(input);
		
		int num = -1;
		while (num!=5) {
			viewMenu();
			num= input.nextInt();
			switch (num) {
			case 1:
				Menumanager.addfood();
				break;
			case 2:
				Menumanager.deletefood();
				break;
			case 3:
				Menumanager.editfood();
				break;
			case 4:
				Menumanager.viewfoods();
				break;
			default:
				continue;
			}
			
	    	}
		}
	
	
	public static void viewMenu() {
		System.out.println("1.Add food");
		System.out.println("2.Delete food");
		System.out.println("3.Edit food");
		System.out.println("4.View foods");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 ~ 5:");
	}
	
	
}





