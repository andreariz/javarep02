package myPackage02;

import java.util.Scanner;

public class GiocoCarta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.println("insert choices");
		choice(scanner.nextLine(), scanner.nextLine());
		
		
	}

	public static void choice(String s1, String s2)
	{
		
		
		String op1=new String("forbice");
		String op2=new String("carta");
		String op3=new String("sasso");
		if((s1.equals(op1) && s2.equals(op2)) || (s1.equals(op2) && s2.equals(op1)))
		{
			System.out.println("Forbice vince carta");
		}
		
		if((s1.equals(op2) && s2.equals(op3)) || (s1.equals(op3) && s2.equals(op2)))
		{
			System.out.println("carta vince su sasso");
		}
		
		
		if((s1.equals(op3) && s2.equals(op1)) || (s1.equals(op1) && s2.equals(op3)))
		{
			System.out.println("sasso vince su forbici");
		}
		
		
	}
}
