import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2;
		int ebob = 0, ekok = 0;
		int i = 1, k=1;
		
		System.out.print("Number 1: "); 
		n1 = sc.nextInt(); 
		System.out.print("Number 2: ");
		n2 = sc.nextInt();
		
		while( i < n1) {
			if(n1%i == 0 && n2%i == 0) {
				ebob = i;
			}
			i++;
		}
		System.out.println("EBOB => "+ebob);
		
		while(k>0) {
			
			k++;
			if(k%n1==0 && k%n2==0) {
				ekok = k;
				break;
			}
		}
		
		System.out.println("EKOK => "+ekok);
	
	}

}
