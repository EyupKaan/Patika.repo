import java.util.Scanner;
public class Divisible3nd4 {

	public static void main(String[] args) {

		int k, t = 0, avg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		k = sc.nextInt();
		
		System.out.print("These number divisible by 3 and 4 => ");
		for(int i=1; i<=k; i++) 
		{
			if(i%3==0 && i%4==0) {
				t += i;
				avg++;
				System.out.print(i+", ");
			}
		}
		System.out.println("\nTotal of numbers: "+t);
		System.out.println("Average of these numbers: "+t/avg);
	}

}
