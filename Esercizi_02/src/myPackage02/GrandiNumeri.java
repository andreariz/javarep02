package myPackage02;
import java.lang.Math;

public class GrandiNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt0=0;
		int cnt1=0;
		for(int i=0; i<1000;i++)
		{
			double rnd=Math.random();
			int res=(int) Math.round(rnd);
			if(res==0)
				cnt0++;
			else
				cnt1++;
		}
		System.out.println("0 uscito # "+cnt0+"\n"+"1 uscito # "+ cnt1);
		
	}

}
