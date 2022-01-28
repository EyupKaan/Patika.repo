import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Program içinde kullanacaðým tutarý ve kdv deðiþkenini double olarak tanýmladým
		double tutar, kdv = 0.18;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tutar giriniz => ");
		tutar = input.nextDouble();
		// Girilecek tutar 1000 den aþaðýysa %18 KDV uyguladým
		// 0 dan büyük tutmamýn amacý yanlýþ tutar giriþine ve yanlýþ senaryoya karþý önlem almak
		if(tutar <= 1000 && tutar > 0) {
		
			double vergiTutari = tutar * kdv;
			System.out.print("KDV tutarý "+vergiTutari);
		
		}
		// Tutar 1000 den fazla ise %08 KDV uyguladým
		else if(tutar > 1000) {
			
			kdv = 0.08;
			double vergiTutari = tutar * kdv;
			System.out.print("KDV tutarý "+vergiTutari);
		}
		// 0 ve ya negatif bir tutar girilirse uyarý verir
		else if(tutar <= 0) {
			System.out.println("Yanlýþ tutar girdiniz!!");
		}
	
	}

}
