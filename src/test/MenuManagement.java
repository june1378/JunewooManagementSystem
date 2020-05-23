package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner; // 강의에는 이게 없는데 가능한가?

import Log.EventLogger;

public class MenuManagement {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Menumanager Menumanager = getObject("Menumanager.ser");
		if(Menumanager == null) {
			Menumanager = new Menumanager(input); 
		}
		else {
			Menumanager.setScanner(input);
		}
				
		
		selectMenu(input, Menumanager);
		putObject(Menumanager, "Menumanager.ser");
		
		}
	
	public static void selectMenu(Scanner input, Menumanager Menumanager) {
		int num = -1;
		while (num!=5) {
			try {
			    viewMenu();
			    num= input.nextInt();
			    switch (num) {
			    case 1:
				    Menumanager.addfood();
				    logger.log("add a food");
				    break;
			    case 2:
				    Menumanager.deletefood();
				    logger.log("delete a food");
				    break;
			    case 3:
				    Menumanager.editfood();
				    logger.log("edit a food");
				    break;
			    case 4:
				    Menumanager.viewfoods();
				    logger.log("view a list of food");
				    break;
			    default:
				    continue;
			}
		  }
		    catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				num=-1;			
			}
				
	    }
		
	}
	
	public static void viewMenu() {
		System.out.println("1.Add food");
		System.out.println("2.Delete food");
		System.out.println("3.Edit food");
		System.out.println("4.View foods");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 ~ 5:");
	}
	
	public static Menumanager getObject(String filename) {
		Menumanager Menumanager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			Menumanager = (Menumanager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return Menumanager;
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
		return Menumanager;
		
	}
	
	public static void putObject(Menumanager Menumanager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(Menumanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}


}





