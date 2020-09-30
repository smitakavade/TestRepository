package Package;

public class ThisTest {

	int age;
	String name;


	ThisTest(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest t1 = new ThisTest(17, "A");
		ThisTest t2 = new ThisTest(13, "B");
		ThisTest t3 = new ThisTest(14, "C");

		t3 = t2;// 13, B
		t2 = t1;//17, A
		t1 = t3;//Current t3 has 13, B
		System.out.println(t1.age);//13
		System.out.println(t2.age);//17
		System.out.println(t3.age);//13
	}

}
