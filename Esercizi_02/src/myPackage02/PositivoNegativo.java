package myPackage02;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		int num;
		int prev=0, succ=0, flag=0;
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("inserisci valori positivi seguiti da negativi\n0 per uscire");
		prev=scanner.nextInt();
		do {
			num=scanner.nextInt();
			
			if(prev*num<=0)
			{}
			else
				flag=1;
			prev=num;
			
		
		} while (num!=0);
		if(flag==1)
		{
			System.out.println("NO");
		}
		else
			System.out.println("OKAY");
		

	}

}
