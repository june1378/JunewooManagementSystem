package test;

import java.util.Scanner;

public class �߽� extends Menu {
	
	public �߽�(Menukind kind) {
		super(kind); // super�� �� �����ڸ� ����
	}
	
	public void getUserInput(Scanner input) {
		setMenuordernumber(input);
		setMenufoodname(input);
		setMenufoodprice(input);
		setMenubeverage(input);        
	  
	}
	
	public void printInfo() {
		String skind = getkind();
		System.out.println("kind"+ skind +"order number:"+ ordernumber + "food name:"+ foodname + "beverage"+ beverage );
	}

}
