import java.util.Scanner;

public class Hesap_makinesi {
	public static void main(String[] args) {
		
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci say�y� girin: ");
		n1 = input.nextInt();
		
		System.out.print("�kinci say�y� girin: ");
		n2 = input.nextInt();
		
		System.out.println("1- Toplama\n2- ��karma\n3- �arpma\n4-B�ylme");
		System.out.println("��lem se�iniz: ");
		select = input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println(n1+" + "+n2+" = "+(n1+n2));
			break;
		case 2:
			System.out.println(n1+" - "+n2+" = "+(n1-n2));
			break;
		case 3:
			System.out.println(n1+" X "+n2+" = "+(n1*n2));
			break;
		case 4:
			System.out.println(n1+" / "+n2+" = "+(n1/n2));
			break;
		}
	}
	
}
