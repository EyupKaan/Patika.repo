import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		
		int r;
		double pi = 3.14, alan;
		
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Dairenin yarýçapýný girin: ");
		r = inp.nextInt();
		
		alan = pi *(Math.pow(r, 2));
		System.out.println("Dairenin alaný: "+ alan);
		System.out.println("Dairenin çevresi: "+ (pi*r*2));
		
		double a;
		System.out.print("Alanýný istediðiniz dilimin merkez açýsýný girin: ");
		a = inp.nextDouble();
		
		double alan_a = (pi*(r*r)*a) / 360;
		System.out.println("Girdiðiniz açýnýn alaný: "+ alan_a);
	}

}
