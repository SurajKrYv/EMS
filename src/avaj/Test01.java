package avaj;

public class Test01 {

	public void great(){
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 t = new Test01();
		//t.great();
		
		
		//Greeting lambdaGreeting = ()-> System.out.print("hello world");
		
		Greeting innerClassGreeting = new Greeting(){
			public void perform(){
				System.out.println("Hello world!");
			}
		};
	}

}
