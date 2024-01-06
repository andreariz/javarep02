package myPackage02;

import java.util.Scanner;

public class Asterischi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=0; i<num;i++)
		{
			for (int l=0;l<=i ;l++)
				System.out.print("*");
			System.out.println("");
		}

	}

}
