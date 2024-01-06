package myPackage02;

import java.util.Scanner;

public class CharToAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size=11;
		Scanner scanner=new Scanner(System.in);
		char[] vac= new char[size]; // \0?
		//Scrivere un programma che stampi 10 caratteri (letti da tastiera) ed i relativi codici ASCII.
		for(int i=0; i<size;i++)
		
		{
			vac[i]=scanner.next().charAt(0);
			
			
		}
		
		for(int i=0; i<size;i++)
		{
			System.out.println("#"+i+" "+vac[i]+" -> "+ (int)vac[i]);
			
			
		}
	}

}
