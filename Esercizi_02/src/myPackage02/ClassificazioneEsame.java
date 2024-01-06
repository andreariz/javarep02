package myPackage02;

import java.util.Scanner;

public class ClassificazioneEsame {

	public static void main(String[] args) {
		
		System.out.println("inserisci voti in lettere\nO=ottimo -> 10\nB=buono -> 8\nS=sufficiente -> 6\nI=insufficiente -> 4");
		
		int somma=0;
		double avg;
		for(int stud=0; stud<10; stud++)
		{
			Scanner scanner=new Scanner(System.in);
			char voto=scanner.next().charAt(0);
			switch(voto) {
			  case 'O':
			    somma+=10;
				  
				  break;
			  case 'B':
			    somma+=8;
				  break;
			  case 'S':
				  somma+=6;
			    break;
			  case 'I':
				  somma+=4;
			    break;
			  default:
			    // code block
				  System.out.println("Value not allowed!");
				  stud--;
			}
			
		}
		avg=(double)somma/(double)10;
		System.out.println("La media vale: "+avg);
		
	}

}
