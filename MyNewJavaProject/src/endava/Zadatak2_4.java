package endava;
import java.util.Random;
import java.util.Scanner;


public class Zadatak2_4 {

	public static int sabiranje(int a, int b) {
		
		return a+b;
	}
	public static int oduzimanje(int a, int b) {
		
		return a-b;
	}
	public static int mnozenje(int a, int b) {
		
		return a*b;
	}
	public static double deljenje(int a, int b) {
		
		return (double)a/b;
	}
	
	public static void main(String[] args) {
		
		int a, b;
		char operacija;
		double rezultat;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva cela broja: ");
		
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println("Unesite slovo za operaciju za koju zelite da bude izvrsena. ('s'-sabiranje, 'o'-oduzimanje, 'm'-mnozenje, 'd'-deljenje)");
		
		while(true) {
		operacija = input.next().charAt(0);
		
	
		if(operacija == 'd' && b == 0) {
			System.out.println("Ne moze se deliti nulom.");
			return;
		}
		
		switch(operacija) {
		
		case 's':
			rezultat=sabiranje(a, b);
			System.out.println("Rezultat je: " +rezultat+ ".");
			break;
			
		case 'o':
			rezultat=oduzimanje(a, b);
			System.out.println("Rezultat je: " +rezultat+ ".");
			break;
			
		case 'm':
			rezultat=mnozenje(a, b);
			System.out.println("Rezultat je: " +rezultat+ ".");
			break;
			
		case 'd':
			rezultat=deljenje(a, b);
			System.out.println("Rezultat je: " +rezultat+ ".");
			break;
			
			default:
				return;
		
		}
		}
		
	}
}
