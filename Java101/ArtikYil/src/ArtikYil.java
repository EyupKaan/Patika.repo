import java.util.Scanner;
public class ArtikYil {

	public static void main(String[] args) {
		
		int year;
		boolean artik = false;
		Scanner input = new Scanner(System.in);

        System.out.print("Y�l giriniz: ");
        year = input.nextInt();

        if (year % 400 == 0) artik = true; 
        else if (year % 4 == 0 && year % 100 != 0) artik = true;
        
        System.out.println(artik ? year + " bir art�k y�ld�r." : year + " bir art�k y�l de�ildir.");

	}

}
