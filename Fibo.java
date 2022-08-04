package application;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int x = sc.nextInt();

		System.out.println("Digite um limite para a sequencia: ");
		int n = sc.nextInt();

		int y = 0;
		for (int i = 0; i < n; i++) {
			x = x + y;
			y = x - y;
			System.out.println(x);
		}
	}
}
