package Package;

import java.util.Scanner;

public class LeapYear {

	private static int year;

	public static void main(String[] args) {
	
		int year;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter year");
		year=in.nextInt();
				
				if ((year %400==0)||(year %100 != 0 && year %4==0))
				{
				System.out.println(year+"Leap year");
				}
				else{
				System.out.println(year+"Not a Leap year");
				}
	}

}
