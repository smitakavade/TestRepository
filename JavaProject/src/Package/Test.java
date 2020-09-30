package Package;

import java.util.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		
	String str= "I will eat 2 burgers 23 fries & 1.25 cokes l8r";
	}

	public String replaceInts(String str) {

		String str1 = str;
		str1.replaceAll("[0-9]", "*");
 System.out.println(str1);
		return str1;

	}
	
}