import java.util.Scanner;

public class VKI_hesaplama {
	
	public static void main(String[] args) {
		
		double boy, kg;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu giriniz(Örn. 1,75): ");
		boy = inp.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz(kg. cinsinden): ");
		kg = inp.nextDouble();
		
		double vki = kg / (boy * boy);
		System.out.println("Vücut kitle indeksiniz: "+ vki);
		
	}
	
}
