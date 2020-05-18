package test;

import java.util.InputMismatchException;
import java.util.Scanner; // 강의에는 이게 없는데 가능한가?

public class MenuManagement {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		Menumanager Menumanager = new Menumanager(input);
		
		selectMenu(input, Menumanager);
		
		}
	
	public static void selectMenu(Scanner input, Menumanager Menumanager) {
		int num = -1;
		while (num!=5) {
			try {
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
		    catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				num=-1;			
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





