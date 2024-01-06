package myPackage02;

import java.util.Scanner;

public class IndovinaZero {

	public static void main(String[] args) {
		
		int num;
		System.out.println("dammi numeri, inserisci zero per uscire");
		Scanner scanner=new Scanner (System.in);
		do {
			num=scanner.nextInt();
		} while (num!=0);
		System.out.println("hai inserito zero, esco");
	}

}
