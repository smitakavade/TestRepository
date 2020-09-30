package Package;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
    
		Scanner in=new Scanner(System.in)	;
		
		int f0,f1=0,f2=1,n;
		
		System.out.println("Pls enter number");
		n=in.nextInt();
		
		for (int i=0;i<=n;i++) {
			System.out.println(f2);
			f0=f1;
			f1=f2;
			f2=f0+f1;
			
		}


	}

}
