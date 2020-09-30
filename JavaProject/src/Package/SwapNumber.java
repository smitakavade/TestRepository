package Package;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=50;
		
		System.out.println("Before"+num1);
		System.out.println("Before"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("after"+num1);
		System.out.println("after"+num2);

	}

}
