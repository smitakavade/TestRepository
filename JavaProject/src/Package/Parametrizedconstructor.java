package Package;

public class Parametrizedconstructor {
	int i;

	Parametrizedconstructor(int i) {
		i = i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parametrizedconstructor p = new Parametrizedconstructor(7);
		System.out.println(p.i);// Local copy of variable has default value zero

	}

}
