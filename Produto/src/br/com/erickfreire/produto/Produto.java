package br.com.erickfreire.produto;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		int valor1, valor2, valor3, resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula o produto de três valores: \n");
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		valor2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		valor3 = entrada.nextInt();
		
		resultado = valor1 * valor2 * valor3;
		
		System.out.printf("%nResultado Final do Produto é: %d%n", resultado);


	}

}
