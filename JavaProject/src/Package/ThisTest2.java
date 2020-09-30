package Package;

public class ThisTest2 {
int i, j;
static int k;
static ThisTest2 st4;
ThisTest2(int i, int j)
{this.i=i;
this.j=j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=2;
		//ThisTest2 st5;
		 ThisTest2 st2=new ThisTest2(2,3);
		ThisTest2 st3=new ThisTest2(4,5);
		System.out.println(st4+" "+k);
	}

}
