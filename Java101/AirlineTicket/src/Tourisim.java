import java.util.Scanner;
public class Tourisim {

	public static void main(String[] args) {
		
		int yas, mesafe;
		double tutar, yasindirimi = 0;

		Scanner inp = new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz: ");
		mesafe = inp.nextInt();
		System.out.print("Yaþýnýzý giriniz: ");
		yas = inp.nextInt();
		if(mesafe<0) System.out.println("Hatalý mesafe girdiniz");
		else if(yas<0) System.out.println("Hatalý yaþ girdiniz");
		
		if(yas<12 && yas>=0)  yasindirimi = 0.5;
		else if(yas>=12 && yas<=24) yasindirimi = 0.1;
		else if(yas>=65) yasindirimi = 0.3;
		tutar = mesafe * 0.1;
		double yasOrani = tutar * yasindirimi;
		double indirimlitutar = tutar - yasOrani;
		double GDindirimi = indirimlitutar * 0.2;
		
		
		
		System.out.print("Yolculuk tipi: 1=> Tek Yön, 2=> Gidiþ-Dönüþ");
		int tip = inp.nextInt();
		switch(tip)
		{
		case 1:
			System.out.println("Normal Tutar: "+tutar);
			System.out.println("Yaþ indirimi: "+(tutar*yasindirimi));
			System.out.println("Ýndirimli Tutar: "+(tutar-yasOrani));
			System.out.println("***Toplam tutar*** => "+indirimlitutar);
			break;
		case 2:
			System.out.println("Normal Tutar: "+tutar);
			System.out.println("Yaþ indirimi: "+(tutar*yasindirimi));
			System.out.println("Ýndirimli Tutar: "+(tutar-yasOrani));
			System.out.println("Gidiþ-Dönüþ indirimi: "+GDindirimi);
			System.out.println("***Toplam tutar*** =>"+(indirimlitutar-GDindirimi)*2);
		}
	}

}
