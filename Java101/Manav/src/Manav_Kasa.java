import java.util.Scanner;

public class Manav_Kasa {

	public static void main(String[] args) {
		
		double armut, elma, domates, muz, patlican, tutar;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Armut Ka� Kilo? : ");
		armut = inp.nextDouble();
		
		System.out.print("Elma Ka� Kilo? : ");
		elma = inp.nextDouble();
		
		System.out.print("Domates Ka� Kilo? : ");
		domates = inp.nextDouble();
	
		System.out.print("Muz Ka� Kilo? : ");
		muz = inp.nextDouble();
		
		System.out.print("Patl�can Ka� Kilo? : ");
		patlican = inp.nextDouble();
		
		tutar = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
		
		System.out.println("Toplam tutar: "+ tutar);
		
	}
	
}
