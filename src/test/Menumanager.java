package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Menumanager {
	ArrayList<Menu> Menues = new ArrayList<Menu>();//arraylist는 menu의 list를 만들어
	Scanner input;
	Menumanager(Scanner input){
		this.input= input; // input을 모든 메소스에서 사용 가능하게
				
	}
	
	public void addName() {
		Menu Menu = new Menu();
		System.out.print("ordernumber");
		Menu.number=input.nextInt();
		System.out.print("Food name");
		Menu.name  =input.next();
		System.out.println("Side");
		Menu.side  =input.next();
		Menues.add(Menu);
	
	}
	//int number= 0;
    public  void addNumber() {
		
		System.out.print("ordernumber");
		int ordernumber=input.nextInt();
		System.out.print("Number");
		int number=input.nextInt();
		//if (Menu.number == ordernumber) {
			System.out.println("the number to be added is"+ number);
	
		}

	//}
    public  void addPrice() {
		
		System.out.print("ordernumber");
		int ordernumber=input.nextInt();
		//if (Menu.number == ordernumber) {
		System.out.print("Price");
			int price=input.nextInt();
			System.out.println("the price to be added is"+  price*ordernumber);  //*number 하고픈데
		}
    //}
	public  void deleteName() {
		
		System.out.print("ordernumber");
		int ordernumber=input.nextInt();
		int index = -1;
		for (int i = 0; i<Menues.size(); i++) {
			if (Menues.get(i).number == ordernumber) {
				index = i;
				break;
			}	
		}
		if(index>=0) {
			Menues.remove(index);
			System.out.println("the name" + ordernumber + "is deleted");
		}
		else {
			System.out.println("the food name has not been registered");
			return;
			
		}
		
	}
	
	
    public void deleteNumber() {
		
		System.out.print("ordernumber");
		int ordernumber=input.nextInt();
		int index = -1;
		for (int i = 0; i<Menues.size(); i++) {
			if (Menues.get(i).number == ordernumber) {
				index = i;
				break;
			}	
		}
		if(index>=0) {
			Menues.remove(index);
			System.out.println("the number" + ordernumber + "is deleted");
		}
		else {
			System.out.println("the food number has not been registered");
			return;
			
		}
		
	}
	
	public  void deletePrice() {
		System.out.print("ordernumber");
		int ordernumber=input.nextInt();
		int index = -1;
		for (int i = 0; i<Menues.size(); i++) {
			if (Menues.get(i).number == ordernumber) {
				index = i;
				break;
			}	
		}
		if(index>=0) {
			Menues.remove(index);
			System.out.println("the price" + ordernumber + "is deleted");
		}
		else {
			System.out.println("the food price has not been registered");
			return;
			
		}
	}
	
	public  void edit() {
		
		System.out.print("ordernumber");
		int ordernumber=input.nextInt();
		for (int i = 0; i<Menues.size(); i++) {
			Menu Menu = Menues.get(i);
			if (Menu.number == ordernumber) {
				int num = 5;
				while (num!=9) {
					System.out.println("** food Info edit menu**");
					System.out.println("1. edit name");
					System.out.println("2. edit price");
					System.out.println("3. edit number");
					System.out.println("4. Edit");
					System.out.println("5. View");
					System.out.println("6. Exit");
					System.out.println("Select one number between 1 - 9:");
					num= input.nextInt(); ///////
					if (num==1) {
					System.out.print("Order number");
					Menu.number=input.nextInt();
			        
				    }
					else if (num==2) {
					System.out.print("Food name");
					Menu.name  =input.next();
					
				    }	
					else if (num==3) {
					System.out.println("sidemenu");
					Menu.side  =input.next();
					}
					else if (num==4) {
					}	
					else if (num==5) {
					}
					else if (num==6) {
					}	
					else if (num==7) {
					}
					else if (num==8) {
					}
					else {
						continue;
					}//if
				}// while
				break;
			}//if	
		}//for
	}

	public void viewMenues() {
		
//		System.out.print("Order number");
//		int ordernumber=input.nextInt();
		for (int i = 0; i<Menues.size(); i++) {
			Menues.get(i).printInfo();

		}
			
	}
}




