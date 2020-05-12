package test;

import java.util.Scanner;

public class 양식 extends TeenageMenu {
	
	public 양식(Menukind kind) {
		super(kind); // super은 위 생성자를 뜻함
	}
	
	
	public void getUserInput(Scanner input) {
		 setMenuordernumber(input);
		 setMenufoodname(input);
	     setMenufoodprice(input);   
	     setMenubeverage(input);   
	        
	        
//	        char answer = 'x';
//	        while (answer!= 'Y'&& answer != 'N')
//	        {
//	        	System.out.println("do you want to order a beverage? (Y/N)"); 
//	            answer = input.next().charAt(0);
//	            if(answer =='Y') {
//	            	setMenubeverage(input);
//		            break;
//		        }
//	            else if (answer =='N') {
//	        	    this.setBeverage("");
//	        	    break;
//	            }
//	            else {
//	        	
//	        }
//	        
//	}
//	        setMenufoodprice(input);
//
  }
	
	public void printInfo() {
		String skind = getkind();
		System.out.println("kind"+ skind +"order number:"+ ordernumber + "food name:"+ foodname + "beverage"+ beverage );
	}
	
	
}
//여기서 parent 코드 부족한데, 필요없는 부분(?)ㅇㅇ 