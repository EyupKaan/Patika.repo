import java.util.Scanner;

public class VKI_hesaplama {
	
	public static void main(String[] args) {
		
		double boy, kg;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu giriniz(�rn. 1,75): ");
		boy = inp.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz(kg. cinsinden): ");
		kg = inp.nextDouble();
		
		double vki = kg / (boy * boy);
		System.out.println("V�cut kitle indeksiniz: "+ vki);
		
	}
	
}
