package superAndThisKeyword;

public class childDemo extends parentDemo {
	
	String name = "this is Child demo class";
	
	public childDemo() {
		super();
		System.out.println("I am constructor of child Demo class");
		
	}
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am in get Data of Child Demo class");
	}

	public static void main(String[] args) {
	
		childDemo cd = new childDemo();
        cd.getStringData();
        cd.getData();
       
	}

}
