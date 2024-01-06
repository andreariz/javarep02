package myPackage02;

import java.util.Scanner;

public class ToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("scrivi una serie di caratteri");
		final int size=5;
		char[] seq=new char[size];
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<seq.length;i++)
		{
			seq[i]=scanner.next().charAt(0);
		}
		String str=new String(seq);
		System.out.println("Stringa in maiuscolo: "+ str.toUpperCase());
		

	}

}
