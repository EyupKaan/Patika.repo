import java.util.Scanner;
public class NotOrt {

	public static void main(String[] args) {
		 
		Scanner inp = new Scanner(System.in);
		
		int mat , fizik, kimya, biyoloji, turkce, sosyal;
		
		System.out.print("Matematik notu; ");
		mat = inp.nextInt();
		
		System.out.print("Fizik notu: ");
		fizik = inp.nextInt();
		
		System.out.print("Kimya notu: ");
		kimya = inp.nextInt();
		
		System.out.print("Biyoloji notu: ");
		biyoloji = inp.nextInt();
		
		System.out.print("Türkçe notu: ");
		turkce = inp.nextInt();
		
		System.out.print("Sosyal notu: ");
		sosyal = inp.nextInt();
		inp.close();
		
		int toplam = (mat + fizik + kimya + biyoloji + turkce + sosyal);
		double ortalama = toplam / 6.0;
		System.out.println("Ortalamanız => "+ ortalama);
		
		
		boolean gecme = (ortalama >= 60);
		System.out.println(gecme ? "Sınıfı Geçti" : "Sınıfta Kaldı");
		
	}
}
