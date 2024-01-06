package myPackage02;

import java.util.Scanner;

public class MediaNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("inserisci sequenza numeri positivi");
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum=0;
		double avg; 
		int cnt=0;
		do {
			num=scanner.nextInt();
			if(num>0)
			{
				sum+=num;
				cnt++;
			}
			else
				continue;
			
		} while (num>0);
		
		avg=(double)sum/(double)cnt;
		System.out.print("la media vale: "+avg);
		
		

	}

}
