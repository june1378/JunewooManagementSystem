package test;

import java.util.Scanner;

public class �ѽ� extends Menu {
	
	public �ѽ�(Menukind kind) {
		super(kind); // super�� �� �����ڸ� ����
	}
	
	public void getUserInput(Scanner input) {
		 System.out.println("order number:"); 
	        int ordernumber= input.nextInt(); 
	        this.setOrdernumber(ordernumber);
	        
	        System.out.println("food name:");
	        String foodname= input.next();
	        this.setFoodname(foodname);
	        
	        System.out.println("food price:"); 
	        int foodprice= input.nextInt();
	        this.setFoodprice(foodprice);
	        
	        char answer = 'x';
	        while (answer!= 'Y'&& answer != 'N')
	        {
	        	System.out.println("do you want to order a beverage? (Y/N)"); 
	            answer = input.next().charAt(0);
	            if(answer =='Y') {
	            	System.out.println("beverage:"); 
		            String beverage= input.next();
		            this.setBeverage(beverage);
		            break;
		        }
	            else if (answer =='N') {
	        	    this.setBeverage("");
	        	    break;
	            }
	            else {
	        	
	        }
	        
	}

 }
}



