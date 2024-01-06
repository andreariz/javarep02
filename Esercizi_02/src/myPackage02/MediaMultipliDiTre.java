package myPackage02;

import java.util.Scanner;

public class MediaMultipliDiTre {

	public static void main(String[] args) {
		
		
		System.out.println("quanti numeri vuoi inserire?");
		Scanner scanner=new Scanner(System.in);
		int n, sum=0;
		int cnt=0;
		int num=scanner.nextInt();
		System.out.println("inserisci i numeri");
		for(int i=0; i<num; i++)
		{
			n=scanner.nextInt();
			if (n%3==0)
			{
				sum+=n;
				cnt++;
			}
			
		}
		double avg=(double)sum/(double)cnt;
		System.out.println("hai inserito "+cnt+" valori divisibili per 3\nla media vale: "+avg);

	}

}
