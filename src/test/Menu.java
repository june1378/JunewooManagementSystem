package test;

import java.util.Scanner;

public class Menu {
	protected int ordernumber;
	protected String foodname;
	protected int foodprice;
	protected String beverage;
	
	
	public Menu() {
	}
    
	public Menu(int ordernumber, String foodname) {
		
		this. ordernumber = ordernumber;   
		this. foodname = foodname;
	}

	// 생성자에서 number 없어도 기본 정보가 되는거다
	
    public Menu(int ordernumber, String foodname, int foodprice, String beverage) {
		
		this. ordernumber = ordernumber;   
		this. foodname = foodname;
		this. foodprice = foodprice;
		this. beverage = beverage;
	}
    
	protected Menukind kind= Menukind.중식;
	public Menukind getKind() {
		return kind;
	}

	public void setKind(Menukind kind) {
		this.kind = kind;
	}

	public int getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getFoodprice() {
		return foodprice;
	}

	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}

	public String getBeverage() {
		return beverage;
	}

	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}

	
	public void printInfo() {
		System.out.println("order number:"+ ordernumber + "food name:"+ foodname + "beverage"+ beverage );
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
	        
	        System.out.println("beverage:"); 
	        String beverage= input.next();
	        this.setBeverage(beverage);
	}
}
	
	
	 


