package test;

import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Menumanager Menumanager = new Menumanager(input);
		
		int num = -1;

		while (num!=5) {
			System.out.println("1.Add food");
			System.out.println("2.Delete food");
			System.out.println("3.Edit food");
			System.out.println("4.View foods");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 ~ 5:");
			num= input.nextInt(); 
			if (num==1) {
				Menumanager.addfood();
			}
			else if (num==2) {
				Menumanager.deletefood();
			}	
			else if (num==3) {
				Menumanager.editfood();
			}	
			else if (num==4) {
				Menumanager.viewfoods();
			}	
			else {
				continue;
			}
		}
	}
}





