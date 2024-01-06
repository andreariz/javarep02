package myPackage02;
import java.util.*;

public class Tabellina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stampo tabellina, dammi un numero: ");
		Scanner scanner=new Scanner(System.in);
		int val=scanner.nextInt();
		tabellina(val);
	}
	
	public static void tabellina(int a)
	{
		System.out.println("tabellina del: "+a);
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
	}

}
