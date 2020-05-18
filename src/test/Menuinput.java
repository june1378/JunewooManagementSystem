package test;

import java.util.Scanner;

import exception.BeverageFormatException;

public interface Menuinput {
	
	public int getOrdernumber();
	
	public void setOrdernumber(int ordernumber);
	
	public void setFoodname(String foodname);
	
	public void setFoodprice(int foodprice);
	
	public void setBeverage(String beverage) throws BeverageFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMenuordernumber(Scanner input);
	
	public void setMenufoodname(Scanner input);
	
	public void setMenufoodprice(Scanner input);
	
	public void setMenubeverage(Scanner input);
	

}
