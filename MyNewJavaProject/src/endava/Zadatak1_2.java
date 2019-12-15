package endava;

import java.util.Scanner;

public class Zadatak1_2 {

	public static void main(String[] args) {
		
		int a, b;
		char operacija;
		float rezultat;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva cela broja: ");
		
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println("Unesite slovo za operaciju za koju zelite da bude izvrsena. ('s'-sabiranje, 'o'-oduzimanje, 'm'-mnozenje, 'd'-deljenje)");
		
		operacija = input.next().charAt(0);
		
		if(operacija == 'd' && b == 0) {
			System.out.println("Ne moze se deliti nulom.");
			return;
		}
		
		switch(operacija) {
			
			case 's':
				rezultat = a+b;
				break;
				
			case 'o':
				rezultat = a-b;
				break;
				
			case 'm':
				rezultat = a*b;
				break;
				
			case 'd':
				rezultat = (float)a/b;
				break;
				
				default:
					return;
	}
	
		System.out.println("Rezultat je: " + rezultat);
	}
}
