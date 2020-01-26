package application;

import java.util.Scanner;
import entities.CallingProductInformation;
import entities.NewProduct;

public class AppBody {
		
		private static Scanner sc = new Scanner(System.in);
		private static NewProduct goingToNewProductClass = new NewProduct();
		private static CallingProductInformation goingToGetTheInformation = new CallingProductInformation();

		
		private static boolean loopState = true;
		private static int switchMakingTheChoose;
	
		public static void executingAppBody () {
		
		System.out.println("Bem-Vindo ao sistema de controle de estoque!");
		
		do {
			System.out.println("Escolha qual operação realizar");
			System.out.println("1 - Para cadastrar novo produto");
			System.out.println("2 - Para verificar Status (informações) do produto");
			System.out.println("0 - Para encerrar o programa");
			switchMakingTheChoose = sc.nextInt();
			
			switch (switchMakingTheChoose) {
				case 0:
					System.exit(switchMakingTheChoose);
					break;
				case 1:
					goingToNewProductClass.newProductToTheStock();
					break;
				case 2:
					goingToGetTheInformation.callingProductInformation();
					break;
				}
		} while (loopState);
	}
}
