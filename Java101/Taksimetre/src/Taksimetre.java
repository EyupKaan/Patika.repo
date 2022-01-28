import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		
		double acilis = 10;
		double km, tutar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Mesafeyi giriniz (KM cinsinden) --> ");
		km = input.nextDouble();
		
		tutar = acilis + (km * 2.2);
		
		boolean kisamesafe = tutar <=20.0;
		
		System.out.println(kisamesafe ? "Kısamesafe = 20 TL" : "Yolculuk ücreti =>"+tutar+" TL");
		
	}

}
