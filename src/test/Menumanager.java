package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Menumanager {
	ArrayList<Menu> menues = new ArrayList<Menu>();
	Scanner input;
	Menumanager(Scanner input){
		this.input= input;
	}
		
    public  void addfood() {
    	int kind = 0;
    	 Menu menu;
    	while (kind!=1 && kind !=2) {
    		System.out.println("1 for �߽�");
     	    System.out.println("2 for ���");
     	    System.out.println("3 for �ѽ�");
    	    System.out.println("select num for menu kind among 1, 2, 3:"); 
    	    kind= input.nextInt();
    	    if(kind==1) {
    	    	menu = new Menu(Menukind.�߽�);
    	    	menu.getUserInput(input);
    	    	menues.add(menu);
    	    	break;
    		
    	    }
    	    else if (kind ==2) {
    	        menu = new ���(Menukind.���); 
    	        menu.getUserInput(input); 
    	        menues.add(menu);
    	    	break;
    		
    	    }
    	    else if (kind ==3) {
    	        menu = new �ѽ�(Menukind.�ѽ�);  
    	        menu.getUserInput(input); 
    	        menues.add(menu);
    	    	break;
    		
    	    }
    	    else {
    	    	System.out.println("select num for menu kind among 1, 2, 3:");
    		
    	    }
    	}	
    }
    
    public  void deletefood() {
	    
        System.out.println("order number:"); 
        int ordernumber= input.nextInt();
        int index=-1;
        for (int i = 0; i<menues.size(); i++) {
        	if (menues.get(i).getOrdernumber() == ordernumber) {
        		index = i;
        		break;
        	}
        	
        }
        if(index>=0) {
        	menues.remove(index);
        	System.out.println(ordernumber+"���� ����");
        	
        }
        else {
			System.out.println("���� �ֹ� ���� �ȵƾ�");
			return;
        }
        
    }

    public  void editfood() {        
        System.out.println("order number:"); 
        int ordernumber= input.nextInt();
        for (int i = 0; i<menues.size(); i++) {
        	Menu menu= menues.get(i);
            if (menu.getOrdernumber() == ordernumber) {
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
    				System.out.println("ordernumber");
    				int number=input.nextInt(); // �� ordernumber �ȹ���?
    				menu.setOrdernumber(ordernumber);
    			}
    			else if (num==2) {
    				System.out.println("foodname");
    				String foodname=input.next();
    				menu.setFoodname(foodname);
    			}	
    			else if (num==3) {
    				System.out.println("foodprice");
    				int foodprice=input.nextInt();
    				menu.setFoodprice(foodprice);
    			}	
    			else if (num==4) {
    				System.out.println("beverage");
    				String beverage=input.next();
    				menu.setBeverage(beverage);
    			}	
    			else {
    				continue;
    			}
    		}
    	}
    }
}
    
    public  void viewfoods() {
    	System.out.println("������ �ֹ�:"+ menues.size());
        for (int i = 0; i<menues.size(); i++) {
        	menues.get(i).printInfo();
        	
        	
        }
        
       }
    }
    
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	ArrayList<Menu> Menues = new ArrayList<Menu>();//arraylist�� menu�� list�� �����
//	Scanner input;
//	Menumanager(Scanner input){
//		this.input= input; // input�� ��� �޼ҽ����� ��� �����ϰ�
//				
//	}
//	
//	public void addName() {
//		
//		System.out.print("ordernumber");
//		int number=input.nextInt();
//		System.out.print("Food name");
//		String name  =input.next();
//		System.out.println("Side");
//		String side  =input.next();
//		
//		Menu Menu = new Menu(name, number ); // menu���� name price number side food �Ȱ��ƾߵ�
//		Menues.add(Menu);
//	
//	}
//	//int number= 0;
//    public  void addNumber() {
//		
//		System.out.print("ordernumber");
//		int ordernumber=input.nextInt();
//		System.out.print("Number");
//		int number=input.nextInt();
//		//if (Menu.number == ordernumber) {
//			System.out.println("the number to be added is"+ number);
//	
//		}
//
//	//}
//    public  void addPrice() {
//		
//		System.out.print("ordernumber");
//		int ordernumber=input.nextInt();
//		//if (Menu.number == ordernumber) {
//		System.out.print("Price");
//			int price=input.nextInt();
//			System.out.println("the price to be added is"+  price*ordernumber);  //*number �ϰ��µ�
//		}
//    //}
//	public  void deleteName() {
//		
//		System.out.print("ordernumber");
//		int ordernumber=input.nextInt();
//		int index = -1;
//		for (int i = 0; i<Menues.size(); i++) {
//			if (Menues.get(i). number == ordernumber) {
//				index = i;
//				break;
//			}	
//		}
//		if(index>=0) {
//			Menues.remove(index);
//			System.out.println("the name" + ordernumber + "is deleted");
//		}
//		else {
//			System.out.println("the food name has not been registered");
//			return;
//			
//		}
//		
//	}
//	
//	
//    public void deleteNumber() {
//		
//		System.out.print("ordernumber");
//		int ordernumber=input.nextInt();
//		int index = -1;
//		for (int i = 0; i<Menues.size(); i++) {
//			if (Menues.get(i).get number() == ordernumber) { // ���⼭ ���� �߳� 29���� 8�к��� 
//				index = i;
//				break;
//			}	
//		}
//		if(index>=0) {
//			Menues.remove(index);
//			System.out.println("the number" + ordernumber + "is deleted");
//		}
//		else {
//			System.out.println("the food number has not been registered");
//			return;
//			
//		}
//		
//	}
//	
//	public  void deletePrice() {
//		System.out.print("ordernumber");
//		int ordernumber=input.nextInt();
//		int index = -1;
//		for (int i = 0; i<Menues.size(); i++) {
//			if (Menues.get(i).number == ordernumber) {
//				index = i;
//				break;
//			}	
//		}
//		if(index>=0) {
//			Menues.remove(index);
//			System.out.println("the price" + ordernumber + "is deleted");
//		}
//		else {
//			System.out.println("the food price has not been registered");
//			return;
//			
//		}
//	}
//	
//	public  void edit() {
//		
//		System.out.print("ordernumber");
//		int ordernumber=input.nextInt();
//		for (int i = 0; i<Menues.size(); i++) {
//			Menu Menu = Menues.get(i);
//			if (Menu.number == ordernumber) {
//				int num = 5;
//				while (num!=9) {
//					System.out.println("** food Info edit menu**");
//					System.out.println("1. edit name");
//					System.out.println("2. edit price");
//					System.out.println("3. edit number");
//					System.out.println("4. Edit");
//					System.out.println("5. View");
//					System.out.println("6. Exit");
//					System.out.println("Select one number between 1 - 9:");
//					num= input.nextInt(); ///////
//					if (num==1) {
//					System.out.print("Order number");
//					Menu.number=input.nextInt();
//			        
//				    }
//					else if (num==2) {
//					System.out.print("Food name");
//					Menu.name  =input.next();
//					
//				    }	
//					else if (num==3) {
//					System.out.println("sidemenu");
//					Menu.side  =input.next();
//					}
//					else if (num==4) {
//					}	
//					else if (num==5) {
//					}
//					else if (num==6) {
//					}	
//					else if (num==7) {
//					}
//					else if (num==8) {
//					}
//					else {
//						continue;
//					}//if
//				}// while
//				break;
//			}//if	
//		}//for
//	}
//
//	public void viewMenues() {
//		
////		System.out.print("Order number");
////		int ordernumber=input.nextInt();
//		for (int i = 0; i<Menues.size(); i++) {
//			Menues.get(i).printInfo();
//
//		}
//			
//	}
//}




