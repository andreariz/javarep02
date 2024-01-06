package myPackage02;

import java.util.Scanner;

public class ContinuaFino {

	public static void main(String[] args) {
		
		int sum=0;
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci valori: ");
		do {
			
			num=scanner.nextInt();
			if((num<0 && num%2==0) || (num>0 && num%3==0))
			{
				sum+=num;
				System.out.print("altro numero: ");
			}
			else {
				
				System.out.println("trovato valore non okay, see ya!");
			}
			
		} while ((num<0 && num%2==0) || (num>0 && num%3==0));
		System.out.print("Somma vale: "+ sum);
	}

}
