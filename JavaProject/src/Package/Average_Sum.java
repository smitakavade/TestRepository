package Package;

import java.util.Scanner;

public class Average_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<3;i++)
			System.out.println("Hello");
		    System.out.println("HI");
		    
	Scanner in=new Scanner(System.in);
       int a,b,sum;
       float avg;
       System.out.println("Please enter a");
       a=in.nextInt();
       System.out.println(("Please enter b"));
       b=in.nextInt();
              
       sum=a+b;
       System.out.println("sum is:"+sum);
       
      avg=((a+b)/2);
      System.out.println("avg without (float) is:"+avg);
       
      avg=(float)((a+b)/2);     
      System.out.println("avg with (float) is:"+avg);
	}

}
