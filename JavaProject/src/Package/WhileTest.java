package Package;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		//WhileTest wt=new WhileTest();
		while (makedecision(i)) {
			i = i * i;
			System.out.println();
		}//code will not run as method is static
	}

	public static boolean makedecision(int i) {
		if (i % 3 == 0)
			return true;
		else
			return false;

	}
}
