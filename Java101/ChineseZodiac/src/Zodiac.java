import java.util.Scanner;
public class Zodiac {

	public static void main(String[] args) {
		int birthday;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Doðum yýlýnýzý giriniz: ");
		birthday = inp.nextInt();
		
		if(birthday%12==0) System.out.println("Çin Zodyaðýnda burcunuz: Maymun");
		else if(birthday%12==1) System.out.println("Çin zodyaðýnda burcunuz: Horoz");
		else if(birthday%12==2) System.out.println("Çin zodyaðýnda burcunuz: Köpek");
		else if(birthday%12==3) System.out.println("Çin zodyaðýnda burcunuz: Domuz");
		else if(birthday%12==4) System.out.println("Çin zodyaðýnda burcunuz: Fare");
		else if(birthday%12==5) System.out.println("Çin zodyaðýnda burcunuz: Öküz");
		else if(birthday%12==6) System.out.println("Çin zodyaðýnda burcunuz: Kaplan");
		else if(birthday%12==7) System.out.println("Çin zodyaðýnda burcunuz: Tavþan");
		else if(birthday%12==8) System.out.println("Çin zodyaðýnda burcunuz: Ejderha");
		else if(birthday%12==9) System.out.println("Çin zodyaðýnda burcunuz: Yýlan");
		else if(birthday%12==10) System.out.println("Çin zodyaðýnda burcunuz: At");
		else if(birthday%12==11) System.out.println("Çin zodyaðýnda burcunuz: Koyun");

	}

}
