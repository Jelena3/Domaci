package endava;
import java.util.Scanner;

public class Zadatak2_1 {

	public static void main(String[] args) {
		
		int a;
		int b; 
		int i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite dva cela broja: ");
		
		a = input.nextInt();
		b = input.nextInt();
		
		
		i=a+1;
		while(i<b) {
			
			if(i%2==0)
				System.out.println(i);
			i++;
		}
		
	}
	
}
