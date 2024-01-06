package myPackage02;

public class TriangoloIsoscele {

	public static void main(String[] args) {
		
		int i;
		int l;
		for (i=0;i<=10; i++) {
			
			for(l=10;l>=i;l--)
			{
				System.out.print(" ");
			}
			for(l=0;l<=i;l++)
			{
				System.out.print("A");
			}
			for(l=1;l<=i;l++)
			{
				System.out.print("A");
			}
			
			
			
			System.out.println();
		}

	}

}
