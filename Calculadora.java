package exercicios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Insira o primeiro n�mero: ");
		int num1 = ler.nextInt();
		
		System.out.printf("Insira o segundo n�mero: ");
		int num2 = ler.nextInt();
		
		System.out.printf("Selecione o tipo de opera��o: ");
		System.out.println("\n1) Adi��o");
		System.out.println("2) Subtra��o");
		System.out.println("3) Multiplica��o");
		System.out.println("4) Divis�o");
		int type = ler.nextInt();
		
		switch (type) {
		case 1:
			System.out.println("\nResultado: " + (num1 + num2));
			break;
		case 2:
			System.out.println("\nResultado: " + (num1 - num2));
			break;
		case 3:
			System.out.println("\nResultado: " + (num1 * num2));
			break;
		case 4:
			System.out.println("\nResultado: " + (num1 / num2));
			break;
			default:
				System.out.println("Opera��o n�o encontrada!");
		}
		ler.close();
	}
}
