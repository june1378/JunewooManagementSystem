package test;

import java.util.Scanner;

import exception.BeverageFormatException;

public interface Menuinput {
	
	public int getOrdernumber();
	
	public void setOrdernumber(int ordernumber);
	
	public String getFoodname();
	
	public void setFoodname(String foodname);
	
	public int getFoodprice();
	
	public void setFoodprice(int foodprice);
	
	public void setBeverage(String beverage) throws BeverageFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMenuordernumber(Scanner input);
	
	public void setMenufoodname(Scanner input);
	
	public void setMenufoodprice(Scanner input);
	
	public void setMenubeverage(Scanner input);

	public Object getBeverage(); //Menuview에 있는 row.add(si.getBeverage()); 땜에 추가
	
}
