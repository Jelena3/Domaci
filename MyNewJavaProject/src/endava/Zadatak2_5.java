package endava;

import java.util.Scanner;
import java.util.Arrays;

public class Zadatak2_5 {
	
	public static void main(String[] args) {
		
		int n;
		int x;
		int[] niz;
		int i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite neki proizvoljan broj x: ");
		x = input.nextInt();
		
		System.out.println("Unesite broj clanova niza: ");
		n = input.nextInt();
		niz = new int[n];
		
		System.out.println("Unesite clanove niza: ");
		
		for (i=0; i<n; i++) {
			
			niz[i] = input.nextInt();
		}
		
		Arrays.sort(niz);
		
		boolean tacan_broj=false;
		for(i=0; i<n; i++) {
			
			if(niz[i]==x) 
				 tacan_broj=true;
		}
		
			if(tacan_broj==true) 
				System.out.println("Niz sadrzi broj x=" +x);
			else 
				System.out.println("Niz ne sadrzi broj x=" +x);
			
		
		System.out.println("Prvih pet clanova niza: ");
		for(i=0; i<5; i++) {
			
			if(i<4)
			System.out.print(niz[i] + ",");
			else
				System.out.println(niz[4] + ".");
		}
	}

}
