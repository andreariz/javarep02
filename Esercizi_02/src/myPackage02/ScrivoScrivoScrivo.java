package myPackage02;

import java.util.Scanner;

public class ScrivoScrivoScrivo {

	public static void main(String[] args) {
		
		//System.out.println("inserisci valore e messaggio da ripetere per n volte");
		
		System.out.println("inserisci numero: ");
		Scanner volteScanner=new Scanner(System.in);
		int n=volteScanner.nextInt();
		
		System.out.println("inserisci testo");
		Scanner testo=new Scanner(System.in);
		String str=new String();
		str= testo.next();
		
		
		
		if (n<0)
			System.out.println("errore");
		else
		{
			for(int i=0;i<n; i++)
				System.out.println(str);
		}
		

	}

}
