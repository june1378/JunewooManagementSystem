package test;

import java.util.Scanner;

public class 한식 extends TeenageMenu {
	
	public 한식(Menukind kind) {
		super(kind); // super은 위 생성자를 뜻함
	}
	
	public void getUserInput(Scanner input) {
		setMenuordernumber(input);
		setMenufoodname(input);
		setMenufoodprice(input); // 나중에 추가했는데 혹시 모르니 7주차 실습 마지막 참조
		setMenubeverage(input);    
	        	
	        

 }
	
	}



