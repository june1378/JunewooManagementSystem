package test;

public class Menu {
	
	String name;
	int price;
	int number;
	String side;
	String food;
	
	public Menu() {
	}
    
	public Menu(String name, int price) {
		
		this. name = name;   
		this. price = price;
		this. number = number;
	}

	// 생성자에서 number 없어도 기본 정보가 되는거다
	
	public Menu(String name, int price, int number) {
		
		this. name = name;    //this는 나의 객체의 란 의미를 가져
		this. price = price;
		this. number = number;
	}
	
	public void printInfo() {
		System.out.println("name:"+ name + "price:"+ price + "number"+ number);
	}
}
	 


