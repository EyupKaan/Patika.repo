import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		
		int r;
		double pi = 3.14, alan;
		
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Dairenin yar��ap�n� girin: ");
		r = inp.nextInt();
		
		alan = pi *(Math.pow(r, 2));
		System.out.println("Dairenin alan�: "+ alan);
		System.out.println("Dairenin �evresi: "+ (pi*r*2));
		
		double a;
		System.out.print("Alan�n� istedi�iniz dilimin merkez a��s�n� girin: ");
		a = inp.nextDouble();
		
		double alan_a = (pi*(r*r)*a) / 360;
		System.out.println("Girdi�iniz a��n�n alan�: "+ alan_a);
	}

}
