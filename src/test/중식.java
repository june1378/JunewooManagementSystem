package test;

import java.util.Scanner;

public class 중식 extends Menu {
	
	public 중식(Menukind kind) {
		super(kind); // super은 위 생성자를 뜻함
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
