import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		
		int mat, fiz, tur, kim, muz;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik notu: ");
		mat = inp.nextInt();
		
		System.out.print("Fizik notu: ");
		fiz = inp.nextInt();
		
		System.out.print("T�rk�e notu: ");
		tur = inp.nextInt();
		
		System.out.print("Kimya notu: ");
		kim = inp.nextInt();
	
		System.out.print("M�zik notu: ");
		muz = inp.nextInt();
		
		int toplam = mat+fiz+tur+kim+muz;      
    	double ortalama = toplam /5;
    	boolean gecme = ortalama >=55;
	
        if((mat>=0 && mat<=100) && 
        		(fiz>=0 && fiz<=100) && 
        			(tur>=0 && tur<=100) &&
        				(kim>=0 && kim<=100) &&
        					(muz>=0 && muz<=100)) 
        {
        		System.out.println(gecme ? "Ortalaman�z: "+ortalama+" Tebrikler S�n�f� ge�tiniz :)":
        			"Ortalam�z: "+ortalama+" Malesef s�n�fta kald�n�z :(");	
        }
        else
        {
        	System.out.println("Hatal� not giri�i...(Notlar�n�z 0-100 aral���nda olmal�d�r)");
        }
	
	
	}
	
}
