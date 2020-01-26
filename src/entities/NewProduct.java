package entities;

import java.util.Scanner;

import database.DataBaseGetAndSet;
import database.DataBaseVariables;

public final class NewProduct extends DataBaseGetAndSet {
	
	private Scanner sc = new Scanner(System.in);
	protected DataBaseVariables addNewProductsInDataBase;
	
	public void newProductToTheStock () {
		
		System.out.println("Product Name: ");
		newProductName = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Product Price: ");
		newProductPrice = sc.nextDouble();

		
		System.out.println("Quantity of the product in stock: ");
		newQuantityOfTheProductInStock = sc.nextInt();

		addNewProductsInDataBase = new DataBaseVariables(newProductName, newProductPrice, newQuantityOfTheProductInStock);
		dataBaseList.add(addNewProductsInDataBase);
	}
}
