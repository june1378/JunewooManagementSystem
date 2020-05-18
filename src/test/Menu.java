package test;

import java.util.Scanner;

import exception.BeverageFormatException;

public abstract class Menu implements Menuinput {
	protected Menukind kind= Menukind.중식;
	protected int ordernumber;
	protected String foodname;
	protected int foodprice;
	protected String beverage;
	
	public Menu() {
	}
	
	public Menu(Menukind kind) {
		this.kind = kind;
	}
    
	public Menu(int ordernumber, String foodname) {
		
		this. ordernumber = ordernumber;   
		this. foodname = foodname;
	}

	// 생성자에서 number 없어도 기본 정보가 되는거다
	public Menu(int ordernumber, String foodname, int foodprice) {
		this. ordernumber = ordernumber;   
		this. foodname = foodname;
		this. foodprice = foodprice;
		
	}
	
    public Menu(Menukind kind, int ordernumber, String foodname, int foodprice, String beverage) {
		this. kind = kind;
		this. ordernumber = ordernumber;   
		this. foodname = foodname;
		this. foodprice = foodprice;
		this. beverage = beverage;
	}
	
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

	public void setBeverage(String beverage) throws BeverageFormatException {
		if(!beverage.contains("요") && !beverage.equals("") ) {
			throw new BeverageFormatException();
		}
		this.beverage = beverage;
	}

	
	public abstract void printInfo();
	
	public void setMenuordernumber( Scanner input) {
    	System.out.println("ordernumber");
		int number=input.nextInt(); // 왜 ordernumber 안받지?
		this.setOrdernumber(number);
    }
    
    public void setMenufoodname( Scanner input) {
    	System.out.println("foodname");
		String foodname=input.next();
		this.setFoodname(foodname);
	}
    public void setMenufoodprice( Scanner input) {
    	System.out.println("foodprice");
		int foodprice=input.nextInt();
		this.setFoodprice(foodprice);
	}
    public void setMenubeverage( Scanner input) {
    	String beverage = "";
    	while (!beverage.contains("요")) {
    	    System.out.println("beverage");
		    beverage=input.next();
		    try {
			    this.setBeverage(beverage);
		    } catch (BeverageFormatException e) {
			    System.out.println("Incorrect Beverage Format. Put the beverage that contains 요");
		    }
    	}
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
	        try {
				this.setBeverage(beverage);  //여기 오류 뜨는데
			} catch (BeverageFormatException e) {
				
			}
			
				
			   
	}
	
	public String getkind() {
		String skind = "none";
		switch(this.kind) {
		case 중식:
			skind = "중.";
			break;
		case 양식:
			skind = "양.";
			break;
		case 한식:
			skind = "한.";
			break;
		default:
		}
		return skind;
	
		
	}
}
	
	
	 


