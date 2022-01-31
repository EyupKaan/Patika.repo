import java.util.Scanner;

public class Polindrom {
	
	static int reverseNumber(int num) {
		
		int temp = num, revNum = 0, lastDig;
		while(temp!= 0) {
			
			lastDig = temp % 10;
			
			revNum = (revNum * 10) + lastDig;
			
			temp /= 10;
	
		}
		
		
		
		return revNum;
	}
	
	
	public static void main(String[] args) {

		
		int poli;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Is a Polindrom Number ? => ");
		poli = sc.nextInt();
		
		if(reverseNumber(poli) == poli) System.out.println("Yes, it is a Polindrom Number..");
		else System.out.println("No, it is not a Polindrom Number");
	}

}
