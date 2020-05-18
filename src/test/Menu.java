package test;

import java.util.Scanner;

import exception.BeverageFormatException;

public abstract class Menu implements Menuinput {
	protected Menukind kind= Menukind.�߽�;
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

	// �����ڿ��� number ��� �⺻ ������ �Ǵ°Ŵ�
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
		if(!beverage.contains("��") && !beverage.equals("") ) {
			throw new BeverageFormatException();
		}
		this.beverage = beverage;
	}

	
	public abstract void printInfo();
	
	public void setMenuordernumber( Scanner input) {
    	System.out.println("ordernumber");
		int number=input.nextInt(); // �� ordernumber �ȹ���?
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
    	while (!beverage.contains("��")) {
    	    System.out.println("beverage");
		    beverage=input.next();
		    try {
			    this.setBeverage(beverage);
		    } catch (BeverageFormatException e) {
			    System.out.println("Incorrect Beverage Format. Put the beverage that contains ��");
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
				this.setBeverage(beverage);  //���� ���� �ߴµ�
			} catch (BeverageFormatException e) {
				
			}
			
				
			   
	}
	
	public String getkind() {
		String skind = "none";
		switch(this.kind) {
		case �߽�:
			skind = "��.";
			break;
		case ���:
			skind = "��.";
			break;
		case �ѽ�:
			skind = "��.";
			break;
		default:
		}
		return skind;
	
		
	}
}
	
	
	 


