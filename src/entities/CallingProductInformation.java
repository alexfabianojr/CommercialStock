package entities;
import database.DataBaseGetAndSet;

import java.util.Scanner;

public final class CallingProductInformation extends DataBaseGetAndSet {
	
	private Scanner sc = new Scanner(System.in);
	
	public void callingProductInformation () {

			System.out.println("Entre com o valor do codigo: ");
			int codeIn = sc.nextInt();
			System.out.println("Nome do produto: " + getProductName(codeIn));
			System.out.println("Preço do produto: " + getProductPrice(codeIn));
			System.out.println("Quantidade do produto em estoque: " + getQuantityOfTheProductInStock(codeIn));
		}
}

