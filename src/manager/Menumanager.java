package manager;

import java.awt.Menu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import test.Menuinput;
import test.Menukind;
import test.양식;
import test.중식;
import test.한식;

public class Menumanager implements Serializable {
	/**
	 * 
	 */ 
	public void setScanner(Scanner input) {
		    this.input = input;
		}
	private static final long serialVersionUID = 3319592367446804777L;
	
	ArrayList<Menuinput> menues = new ArrayList<Menuinput>();
	Scanner input;
	Menumanager(Scanner input){
		this.input= input;
	}
	
		
 


	public  void addfood() {
    	int kind = 0;
    	 Menuinput menuinput;
    	while (kind < 1 || kind>3) {
    		try {
    		    System.out.println("1 for 중식");
     	        System.out.println("2 for 양식");
     	        System.out.println("3 for 한식");
    	        System.out.println("select num for menu kind among 1, 2, 3:"); 
    	        kind= input.nextInt();
    	        if(kind==1) {
    	    	    menuinput = new 중식(Menukind.중식);
    	    	    menuinput.getUserInput(input);
    	    	    menues.add(menuinput);
    	    	    break;
    		
    	        }
    	        else if (kind ==2) {
    	            menuinput = new 양식(Menukind.양식); 
    	            menuinput.getUserInput(input); 
    	            menues.add(menuinput);
    	    	    break;
    		
    	        }
    	        else if (kind ==3) {
    	            menuinput = new 한식(Menukind.한식);  
    	            menuinput.getUserInput(input); 
    	            menues.add(menuinput);
    	    	    break;
    		
    	        }
    	        else {
    	    	    System.out.println("select num for menu kind among 1, 2, 3:");
    		
    	        }
    		}
    		catch(InputMismatchException e) {
    			System.out.println("please put an integer between 1 and 3");
				if (input.hasNext()) {
					input.next();
				}
				kind=-1;
    			
    		}
    	}	
    }
    
    public  void deletefood() {
	
        System.out.println("order number:"); 
        int ordernumber= input.nextInt();
        int index= findindex(ordernumber);
        removefromMenu(index, ordernumber);
    }
    
    public int findindex(int ordernumber) {
    	int index=-1;
        for (int i = 0; i<menues.size(); i++) {
        	if (menues.get(i).getOrdernumber() == ordernumber) {
        		index = i;
        		break;
        	}	
        }
        return index;
    }
    
    public int removefromMenu(int index, int ordernumber) {
    	if(index>=0) {
        	menues.remove(index);
        	System.out.println(ordernumber+"음식 삭제");
        	return 1;
        	
        }
        else {
			System.out.println("음식 주문 아직 안됐어");
			return -1;
        }
    	
    }

    public  void editfood() {        
        System.out.println("order number:"); 
        int ordernumber= input.nextInt();
        for (int i = 0; i<menues.size(); i++) {
        	Menuinput menu= menues.get(i);
            if (menu.getOrdernumber() == ordernumber) {
        	int num = -1;
    		while (num!=5) {
    			viewEditMenu();
    			num= input.nextInt();
    			switch(num) {
    			case 1:
    				menu.setMenuordernumber(input);
    				break;
    			case 2:
    				menu.setMenufoodname(input);
    				break;
    			case 3:
    				menu.setMenufoodprice(input);
    				break;
    			case 4:
    				menu.setMenubeverage(input);
    				break;
    			default:
    				continue;
    			}
    				}
    	}
    }
}
    
    public  void viewfoods() {
    	System.out.println("접수된 주문:"+ menues.size());
        for (int i = 0; i<menues.size(); i++) {
        	menues.get(i).printInfo();
        	
        }
        
       }
    public int size() {
    	return menues.size();
    }
    
    public Menuinput get(int index) {
    	return (Menuinput) menues.get(index); // 강의는 Menu인데
    }
    
    public void viewEditMenu() {
    	System.out.println("1.Add food");
		System.out.println("2.Delete food");
		System.out.println("3.Edit food");
		System.out.println("4.View foods");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 ~ 5:");
    }
    
    }
    


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	ArrayList<Menu> Menues = new ArrayList<Menu>();//arraylist는 menu의 list를 만들어
//	Scanner input;
//	Menumanager(Scanner input){
//		this.input= input; // input을 모든 메소스에서 사용 가능하게
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
//		Menu Menu = new Menu(name, number ); // menu에서 name price number side food 똑같아야돼
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
//			System.out.println("the price to be added is"+  price*ordernumber);  //*number 하고픈데
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
//			if (Menues.get(i).get number() == ordernumber) { // 여기서 오류 뜨네 29강의 8분부터 
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




