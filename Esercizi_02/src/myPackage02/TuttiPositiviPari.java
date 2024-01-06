package myPackage02;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// uso di flag per stampa il no in caso in cui non siano tutti positivi e pari
		int flag=0;
		
		
		System.out.println("quanti numeri vuoi inserire? ");
		Scanner scanner=new Scanner(System.in);
		int nNumeri=scanner.nextInt();
		System.out.println("Inserisci "+nNumeri+" da tasiera");
		Scanner numeri=new Scanner(System.in);
		for(int i=0;i<nNumeri;i++) 
		{
			int num=numeri.nextInt();
			if((num>0) && (num%2==0))
			{
				continue;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("NO");
		else
			System.out.println("Tutti positivi e pari :)");
	}

}
