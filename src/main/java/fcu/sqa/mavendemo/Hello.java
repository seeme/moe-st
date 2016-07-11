package fcu.sqa.mavendemo;

public class Hello {

	public String sayHello(String name) {
		return "Hi " + name + "!";
	}
	
	public static void main(String[] args) {

		Hello hello = new Hello();
		System.out.println(hello.sayHello("Sammy"));

	}

}
