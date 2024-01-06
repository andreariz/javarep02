package myPackage02;
import java.util.*;
import java.math.*;

public class QQgatti {

	public static void main(String[] args) {
		
		
		char c;
		
		Scanner sc=new Scanner(System.in);
		final int size=44;
		char[] testo=new char[size];
		Scanner scanner= new Scanner(System.in);
		for(int k=0; k<testo.length;k++)
		{
			c=sc.next().charAt(0);	
			testo[k]=c;
		}
		
		for(int i=0; i<testo.length; i++)
		{
			
			if(i%6==0)
				System.out.println("");
			System.out.print(testo[i]);
			
		}
		
		
		

	}

}
