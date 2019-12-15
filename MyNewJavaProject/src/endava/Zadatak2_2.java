package endava;
import java.util.Scanner;

public class Zadatak2_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		String ime_studenta;
		int br_poena;
		int i;
		int max_br_poena;
		String student_max="";
		
		System.out.println("Unesite broj studenata: ");
		n = input.nextInt();
		
		System.out.println("Unesite broj poena studenta i ime studenta: ");
		
		max_br_poena=0;
		
		for (i=0; i<n; i++) {
			
			br_poena = input.nextInt();
			ime_studenta = input.next();
		
			if(br_poena>max_br_poena) 
				
				
				max_br_poena=br_poena;
				student_max=ime_studenta;
			
		}
		System.out.println("Student " + student_max + " ima najvise poena, " + max_br_poena + ".");
		
	}
}
