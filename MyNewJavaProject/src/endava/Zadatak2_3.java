package endava;

import java.util.Random;
import java.util.Scanner;

public class Zadatak2_3 {
	
	public static void main(String[] args) {
		
		int n;
		int broj;
		int diff;
		
		Random rand = new Random();
		n = rand.nextInt(50)+1;
		
		System.out.println(n);
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unosite brojeve sve dok ne pogodite broj ili dok ne budete blizu trezenog broja: ");
		while(true) {
			
			
			broj = input.nextInt();
			int pr = provera(n, broj);
			
			if(pr==0){
				System.out.println("Neverovatno! Pogodili ste tacan broj!");
				break;
			} 
			if(pr==1) {
				System.out.println("Dobar pokusaj, bili sta jako blizu.");
				 break;
			}
			if(pr==2) {
				System.out.println("Pokusajte ponovo.");
			}
		}
		
	}
		public static int provera(int n, int broj) {
			
			int diff = Math.abs(n-broj);
			
			if(diff==0)
				return 0;
			if(diff<5)
				return 1;
			
				return 2;
		}

}
