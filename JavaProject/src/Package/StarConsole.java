package Package;

public class StarConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, star;
		for (row = 1; row <= 10; row++) {
			for (star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		char ch;
		for(ch='A';ch<='Z';ch++)
		{
			System.out.print(ch);
		}
	}

}
