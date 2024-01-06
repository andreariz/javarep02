package myPackage02;

public class DoubleTriang {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
				}
			
			System.out.print("    ");
			
			for (int p=6;p>=i; p--)
			{
				System.out.print(p-i+1);
				}
			
			System.out.println();
		}

	}

}
