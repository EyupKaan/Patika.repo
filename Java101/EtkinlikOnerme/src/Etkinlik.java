import java.util.Scanner;

public class Etkinlik {

	public static void main(String[] args) {
		int derece;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Hava sýcaklýðýný giriniz: ");
		derece = inp.nextInt();
		
		if(derece < 5)
		{
			System.out.println("Kayak yapabilirsinz..");
		}
		else if(derece <= 25)
		{
			if(derece <= 15)
			{
				System.out.println("Sinemaya gidebilirsinz..");
			}
			if(derece >= 10)
			{
				System.out.println("Pikniðe gidebilirsiniz");
			}
		}
		else
		{
			System.out.println("Yüzmeye gidebilirsiniz..");
		}
				
	}

}
