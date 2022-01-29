import java.util.Scanner;

public class Hesap_makinesi {
	public static void main(String[] args) {
		
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayýyý girin: ");
		n1 = input.nextInt();
		
		System.out.print("Ýkinci sayýyý girin: ");
		n2 = input.nextInt();
		
		System.out.println("1- Toplama\n2- Çýkarma\n3- Çarpma\n4-Böylme");
		System.out.println("Ýþlem seçiniz: ");
		select = input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println(n1+" + "+n2+" = "+(n1+n2));
			break;
		case 2:
			System.out.println(n1+" - "+n2+" = "+(n1-n2));
			break;
		case 3:
			System.out.println(n1+" X "+n2+" = "+(n1*n2));
			break;
		case 4:
			System.out.println(n1+" / "+n2+" = "+(n1/n2));
			break;
		}
	}
	
}
