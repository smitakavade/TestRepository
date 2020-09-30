package Package;

import java.util.Scanner;

public class Maxofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    
    int a,b,c;    
    System.out.print("Please enetr a");
    a=in.nextInt();    
    System.out.print("Please enetr b");
    b=in.nextInt();
    System.out.print("Please enetr c");
    c=in.nextInt();
    
    if (a>b && a>c)
    {
    	System.out.print("a is grater");	
    }else if (b>a && b>c) {
    	System.out.print("b is grater");	
    }else
    	System.out.print("c is grater");	
	}

}
