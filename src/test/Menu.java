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

	// �����ڿ��� number ��� �⺻ ������ �Ǵ°Ŵ�
	
	public Menu(String name, int price, int number) {
		
		this. name = name;    //this�� ���� ��ü�� �� �ǹ̸� ����
		this. price = price;
		this. number = number;
	}
	
	public void printInfo() {
		System.out.println("name:"+ name + "price:"+ price + "number"+ number);
	}
}
	 


