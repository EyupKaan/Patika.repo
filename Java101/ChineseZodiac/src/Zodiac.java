import java.util.Scanner;
public class Zodiac {

	public static void main(String[] args) {
		int birthday;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Do�um y�l�n�z� giriniz: ");
		birthday = inp.nextInt();
		
		if(birthday%12==0) System.out.println("�in Zodya��nda burcunuz: Maymun");
		else if(birthday%12==1) System.out.println("�in zodya��nda burcunuz: Horoz");
		else if(birthday%12==2) System.out.println("�in zodya��nda burcunuz: K�pek");
		else if(birthday%12==3) System.out.println("�in zodya��nda burcunuz: Domuz");
		else if(birthday%12==4) System.out.println("�in zodya��nda burcunuz: Fare");
		else if(birthday%12==5) System.out.println("�in zodya��nda burcunuz: �k�z");
		else if(birthday%12==6) System.out.println("�in zodya��nda burcunuz: Kaplan");
		else if(birthday%12==7) System.out.println("�in zodya��nda burcunuz: Tav�an");
		else if(birthday%12==8) System.out.println("�in zodya��nda burcunuz: Ejderha");
		else if(birthday%12==9) System.out.println("�in zodya��nda burcunuz: Y�lan");
		else if(birthday%12==10) System.out.println("�in zodya��nda burcunuz: At");
		else if(birthday%12==11) System.out.println("�in zodya��nda burcunuz: Koyun");

	}

}
