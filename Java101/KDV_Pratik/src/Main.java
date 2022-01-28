import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Program i�inde kullanaca��m tutar� ve kdv de�i�kenini double olarak tan�mlad�m
		double tutar, kdv = 0.18;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tutar giriniz => ");
		tutar = input.nextDouble();
		// Girilecek tutar 1000 den a�a��ysa %18 KDV uygulad�m
		// 0 dan b�y�k tutmam�n amac� yanl�� tutar giri�ine ve yanl�� senaryoya kar�� �nlem almak
		if(tutar <= 1000 && tutar > 0) {
		
			double vergiTutari = tutar * kdv;
			System.out.print("KDV tutar� "+vergiTutari);
		
		}
		// Tutar 1000 den fazla ise %08 KDV uygulad�m
		else if(tutar > 1000) {
			
			kdv = 0.08;
			double vergiTutari = tutar * kdv;
			System.out.print("KDV tutar� "+vergiTutari);
		}
		// 0 ve ya negatif bir tutar girilirse uyar� verir
		else if(tutar <= 0) {
			System.out.println("Yanl�� tutar girdiniz!!");
		}
	
	}

}
