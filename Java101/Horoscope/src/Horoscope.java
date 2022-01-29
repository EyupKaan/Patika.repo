import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {

		int month, day;
		String horoscope = "";
		boolean isError = false;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Do�dunuz ay (Rakam olarak): ");
		month = inp.nextInt();
		System.out.print("Do�du�unuz g�n (Rakam olarak): ");
		day = inp.nextInt();
		
		if(month == 1)
		{
			if(day>=1 && day<=31)
			{				
				if(day<22) horoscope = "O�lak";
				else horoscope = "Kova";
			}
			else isError = true;
		}
		
		else if(month == 2)
		{
			if(day>=1 && day<=28)
			{
				if(day<20) horoscope = "Kova";
				else horoscope = "Bal�k";
			}
			else isError = true;
		}
		
		else if(month == 3)
		{
			if(day>=1 && day<=31)
			{
				if(day<21) horoscope = "Bal�k";
				
				else horoscope = "Ko�";
			}
			else isError = true;	
		}
		
		else if(month == 4)
		{
			if(day>=1 && day<=30)
			{
				if(day<21) horoscope = "Ko�";
				else horoscope = "Bo�a";	
			}
			else isError = true;	
		}
		
		else if(month == 5)
		{
			if(day>=1 && day<=31)
			{
				if(day<22) horoscope = "Bo�a";
				else horoscope = "�kizler";	
			}
			else isError = true;
		}
		
		else if(month == 6)
		{
			if(day>=1 && day<=30)
			{
				if(day<23) horoscope = "�kizler";
				else horoscope = "Yenge�";
			}
			else isError = true;
		}
		
		else if(month == 7)
		{
			if(day>=1 && day<=31)
			{
				if(day<23) horoscope = "Yenge�";
				else horoscope = "Aslan";		
			}
			else isError = true;
		}
		
		else if(month == 8)
		{
			if(day>1 && day<=31)
			{
				if(day<23) horoscope = "Aslan";
				else horoscope = "Ba�ak";
			}
			else isError = true;
		}
		
		else if(month == 9)
		{
			if(day>=1 && day<=30)
			{
				if(day<23)  horoscope = "Ba�ak";
				else horoscope = "Terazi";
			}
			else isError = true;
		}
		
		else if(month == 10)
		{
			if(day>=1 && day<=31)
			{
				if(day<23) horoscope = "Terazi";
				else horoscope = "Akrep";
			}
			else isError = true;
		}
		
		else if(month == 11)
		{
			if(day>=1 && day<=30)
			{
				if(day<22) horoscope = "Akrep";
				else horoscope = "Yay";
			}
			else isError = true;
		}
		
		else if(month == 12)
		{
			if(day>=1 && day<=31)
			{
				if(day<22) horoscope = "Yay";
				else horoscope = "O�lak";
			}
			else isError = true;
		}
		
		if(isError) System.out.println("Hatal� Giri� Yapt�n�z");
		else System.out.println("Burcunuz: "+ horoscope);
		
	}	

}



