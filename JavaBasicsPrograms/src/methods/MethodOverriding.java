package methods;

class Parent {
	public void m1() {
		System.out.println("from parent m1()");
	}

	public void m1(int a) {
		System.out.println("from parent m1(int i)");
	}

	public void m2() {
		System.out.println("from parent m2()");
	}
}

class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("from child class m1()");
	}

	@Override
	public void m1(int a) {
		System.out.println("from child class m1(int a)");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m1(2);
		child.m2();
	}
}