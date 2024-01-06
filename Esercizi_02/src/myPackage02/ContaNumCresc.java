package myPackage02;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ContaNumCresc {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int num=0;
		int tmp=0;
		int[] vect=new int[100];
		int cnt=0;
		int flag=0;
		System.out.println("inizializzo vettore");
		for(int l=0; l<vect.length && flag==0; l++) {
			tmp=num;
			System.out.print("scrivi numero: "+l+"\t -> ");
			num=scanner.nextInt();
			
			if(tmp<num)
			{
				vect[l]=num;
				cnt++;
			}
				else
				{
					flag=1;
					System.out.println("lunghezza vettore inserito: "+(cnt+1));
		}
			}
		
		
	}

}
