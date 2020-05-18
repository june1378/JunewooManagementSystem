package test;

import java.util.Scanner;

import exception.BeverageFormatException;

public abstract class TeenageMenu extends Menu {
	
	public TeenageMenu(Menukind kind) {
		super(kind); // super은 위 생성자를 뜻함
	}
	
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getkind();
		System.out.println("kind"+ skind +"order number:"+ ordernumber + "food name:"+ foodname + "beverage"+ beverage );
	}
	
	public void setMenubeverage(Scanner input) {
        char answer = 'x';
        while (answer!= 'Y'&& answer != 'N')
        {
        	System.out.println("do you want to order a beverage? (Y/N)"); 
            answer = input.next().charAt(0);
            try {
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
            catch(BeverageFormatException e) {
            	System.out.println("Incorrect Beverage Format. Put the beverage that contains 요");
            }
        }	
	}
}


