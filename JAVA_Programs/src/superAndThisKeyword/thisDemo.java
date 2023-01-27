package superAndThisKeyword;

public class thisDemo {
	
	int a = 3;
	
	public int getData() {
		
		int a = 4;
		int b= a+this.a;
		System.out.println(a);
		System.out.println(b);
		return b;
		
	}

	public void secondMethod()
	{
		int a = 8;
		int c = a + getData();
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		
		thisDemo td = new thisDemo();
		//td.getData();
		td.secondMethod();

	}

}
