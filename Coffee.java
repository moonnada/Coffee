package test;
import java.util.ArrayList;
import java.util.Scanner;

import coffee.Coffee;
import coffee.CoffeeMocha;
import coffee.DarkChocolateMocha;
import coffee.PeppermintMocha;
import coffee.WhiteChocolateMocha;




interface HowToMakeDrink{
	public void prepare();
}

 public abstract class Coffee implements HowToMakeDrink{
	private String coffeeType;
	private double price;
	private String storeName;
	abstract void ingredient();



	//getter and setter functions//
public String getCoffeeType() {
	return coffeeType;
}

public void setCoffeeType(String coffeeType) {
	this.coffeeType = coffeeType;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getStoreName() {
	return storeName;
}

public void setStoreName(String storeName) {
	this.storeName = storeName;
}


public void prepare() {
	System.out.println("Coffee Type : " + coffeeType);
}
 }


//-----------Class of WhiteChocolateMocha--------------//
 
 class WhiteChocolateMocha extends Coffee{
	private String chocolateType;


public WhiteChocolateMocha(String coffeeType, double price, String storeName, String chocolateType) {
	setCoffeeType(coffeeType);
	setPrice(price);
	setStoreName(storeName);
	setChocolateType(chocolateType);
}


//override
public void prepare() {
	System.out.println("Coffee Type : " + getCoffeeType());
	System.out.println("\nIngredient: ");
	ingredient();
	System.out.println();
}

//override
void ingredient() {
	System.out.println("Coffee powder" + "\nMilk" + "\nSugar");
	System.out.println(getChocolateType());
}

public String getChocolateType() {
	return chocolateType;
}

public void setChocolateType(String chocolateType) {
	this.chocolateType = chocolateType;
}

 }

//-----------Class of DarkChocolateMocha--------------//
 
class DarkChocolateMocha extends Coffee{
	private String chocolateType;
	
	public DarkChocolateMocha(String coffeeType, double price, String storeName, String chocolateType) {
		setCoffeeType(coffeeType);
		setPrice(price);
		setStoreName(storeName);
		setChocolateType(chocolateType);
	}
	
	//override
	public void prepare() {
		System.out.println("Coffee Type : " + getCoffeeType());
		System.out.println("\nIngredient: ");
		ingredient();
		System.out.println();
	}
	
	//override
	void ingredient() {
		System.out.println("Coffee powder" + "\nMilk" + "\nSugar");
		System.out.println(getChocolateType());
	}
	
	public String getChocolateType() {
		return chocolateType;
	}

	public void setChocolateType(String chocolateType) {
		this.chocolateType = chocolateType;
	}
}


//-----------Class of CoffeeMocha--------------//

class CoffeeMocha extends Coffee{
	public CoffeeMocha(String coffeeType, double price, String storeName) {
		setCoffeeType(coffeeType);
		setPrice(price);
		setStoreName(storeName);
	}
	
	//override
	public void prepare() {
		System.out.println("Coffee Type : " + getCoffeeType());
		System.out.println("\nIngredient: ");
		ingredient();
		System.out.println();
	}
	
	//override
	void ingredient() {
		System.out.println("Coffee powder" + "\nMilk" + "\nSugar");
		
		
	}
	
	
}


//-----------Class of PeppermintMocha--------------//

class PeppermintMocha extends Coffee{
	private double peppermintSyrubAmount;
	
	public PeppermintMocha(String coffeeType, double price, String storeName, double peppermintSyrubAmount) {
		setCoffeeType(coffeeType);
		setPrice(price);
		setStoreName(storeName);
		setPeppermintSyrubAmount(peppermintSyrubAmount);
	}
	
	//override
	public void prepare() {
		System.out.println("Coffee Type : " + getCoffeeType());
		System.out.println("\nIngredient: ");
		ingredient();
		System.out.println("\nPeppermint Amount" + getPeppermintSyrubAmount());
		System.out.println();
	}
	
	//override
	void ingredient() {
		System.out.println("Coffee powder"+ "\nMilk"+ "\nSugar" + "\nPeppermint Syrup amout ");
		
	}
	
	public double getPeppermintSyrubAmount() {
		return peppermintSyrubAmount;
	}

	public void setPeppermintSyrubAmount(double peppermintSyrubAmount) {
		this.peppermintSyrubAmount = peppermintSyrubAmount;
	}	
}

public class menu{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice;
		ArrayList<Coffee> array = new ArrayList<Coffee>();
		
		while(true) {
			System.out.println("\n1.WhiteChocolateMocha" + "\n2.DarkChocolateMocha" + "\n3.CoffeeMocha" + "\n4.PeppermintMocha" + "\n5.Display" + "\n6.Exit");
			System.out.println("------------------------");
			System.out.print("Enter Choice: ");
			choice = scn.nextInt();
			switch(choice) {
			
			//WhiteChocolateMocha
			case 1:{
			System.out.print("Enter Price: $");
			double price = scn.nextDouble();
			System.out.print("Enter Store Name: ");
			String storeName = scn.next();
			System.out.print("Enter Chocolate Type: ");
			String chocolateType = scn.next();
			WhiteChocolateMocha wcm = new WhiteChocolateMocha("WhiteChocolateMocha", price, storeName, chocolateType);
			array.add(wcm);
			continue;
			}
			
			//DarkChocolateMocha
			case 2:{
				System.out.print("Enter Price: $");
				double price = scn.nextDouble();
				System.out.print("Enter Store Name: ");
				String storeName = scn.next();
				System.out.print("Enter Chocolate Type: ");
				String chocolateType = scn.next();
				DarkChocolateMocha dcm = new DarkChocolateMocha("DarkChocolateMocha", price, storeName, chocolateType);
				array.add(dcm);
				continue;
			}
			
			//CoffeeMocha
			case 3:{
				System.out.print("Enter Price: $");
				double price = scn.nextDouble();
				System.out.print("Enter Store Name: ");
				String storeName = scn.next();
				CoffeeMocha cm = new CoffeeMocha("CoffeeMocha", price, storeName);
				array.add(cm);
				continue;
			}
			
			//PeppermintMocha
			case 4:{
				System.out.print("Enter Price: $");
				double price = scn.nextDouble();
				System.out.print("Enter Store Name: ");
				String storeName = scn.next();
				System.out.print("Peppermint Syrub Amount: " );
				double peppermintSyrubAmount = scn.nextDouble();
				PeppermintMocha pmm = new PeppermintMocha("PeppermintMocha", price, storeName, peppermintSyrubAmount );
				array.add(pmm);
				continue;
			}
			case 5:{
				display(array);
				continue;
			}
			case 6:{
				System.out.println("Exit");
				break;
			}
			}
		}
	}
	
	private static void display(ArrayList<Coffee>array) {
		for(int i=0; i<array.size(); i++) {
			array.get(i).prepare();
			System.out.println("Price: $ "+ array.get(i).getPrice());
			array.get(i).ingredient();
			System.out.println("Store Name : " + array.get(i).getStoreName());
			System.out.println("\n\n");
			
		}
	}
	
}

       



