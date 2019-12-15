package endava;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Zadatak1_1 {

	public static void main(String[] args) {
		
		int n;
		int broj;
		int diff;
		
		Random rand = new Random();
		n = rand.nextInt(50)+1;
		
		System.out.println(n);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite jedan ceo pozitivan broj u opsegu od 1 do 50");
		
		broj = input.nextInt();
		diff = Math.abs(n-broj);
		
		if(broj==n) {
			System.out.println("Neverovatno! Pogodili ste tacan broj!");
		}
		if(diff<=5 && diff != 0) {
			System.out.println("Dobar pokusaj, bili sta jako blizu.");
		}
		if(diff>5) {
			System.out.println("Vise srece sledeci put...");
		}
	}
}
