package superAndThisKeyword;

public class ProtectedDemo {

	protected void abc()
	{
		System.out.println("I am protected method");
	}
	
	public static void main(String[] args) {
		
		ProtectedDemo pd = new ProtectedDemo();
		pd.abc();
		
	}

}
