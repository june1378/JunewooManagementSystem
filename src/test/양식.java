package test;

import java.util.Scanner;

public class ��� extends TeenageMenu {
	
	public ���(Menukind kind) {
		super(kind); // super�� �� �����ڸ� ����
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
//���⼭ parent �ڵ� �����ѵ�, �ʿ���� �κ�(?)���� 