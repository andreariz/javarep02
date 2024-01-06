package myPackage02;

import java.util.Scanner;

public class Conteggio {

	public static void main(String[] args) {
		
		System.out.println("inserisci un numero maggiore o uguale a zero");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(num<0)
			System.out.println("errore");
		else
		{
			for(int i=0;i<=num;i++)
				System.out.print(i+" ");
		}

	}

}
