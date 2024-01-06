package myPackage02;

public class Fibonacci100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long a=1;
		long b=0;
		
		System.out.println("Successione di Fibnonacci dei primi 100 numeri");
		for(int i=0;i<100;i++)
		{
			long c= a+b;
			
			
			
			System.out.println("# "+i+": "+c);
			b=a;
			a=c;
			
		}
		
	}

}
