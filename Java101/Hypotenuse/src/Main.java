import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int k1, k2;
		double hyp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Kenar --> ");   // 1. Kenar�n girdisi
		k1 = input.nextInt();
		
		System.out.print("2. Kenar --> ");   // 2. Kenar�n girdisi
		k2 = input.nextInt();
		
		hyp = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2)); // Math s�n�f�ndan sqrt() karek�k almak i�in
		System.out.println("Hipoten�s = "+ hyp);            // pow(x, y) x'in y kuvveti olarak kullanarak  
		                                                    // kenaralar�n karesi al�nm���r
		
		
		int alan = (k1 * k2) / 2;                           // Dik ��gende dik kenarlar�n �arp�m�n�n
		System.out.println("��genin alan� "+alan+" br^2");  // yar�s� alan� vermektedir.
		
		
	}

}
