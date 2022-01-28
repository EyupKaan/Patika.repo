import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int k1, k2;
		double hyp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Kenar --> ");   // 1. Kenarýn girdisi
		k1 = input.nextInt();
		
		System.out.print("2. Kenar --> ");   // 2. Kenarýn girdisi
		k2 = input.nextInt();
		
		hyp = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2)); // Math sýnýfýndan sqrt() karekök almak için
		System.out.println("Hipotenüs = "+ hyp);            // pow(x, y) x'in y kuvveti olarak kullanarak  
		                                                    // kenaralarýn karesi alýnmýþýr
		
		
		int alan = (k1 * k2) / 2;                           // Dik üçgende dik kenarlarýn çarpýmýnýn
		System.out.println("Üçgenin alaný "+alan+" br^2");  // yarýsý alaný vermektedir.
		
		
	}

}
