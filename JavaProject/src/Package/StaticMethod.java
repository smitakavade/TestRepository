package Package;

public class StaticMethod {

	int age;
	String name;

	StaticMethod() {
		non_static_method();
		static_method();
		// return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod SM1 = new StaticMethod();

	}

	public void non_static_method()

	{
		System.out.println("NSM");
	}

	public void static_method()

	{
		System.out.println("SM");
	}

}
