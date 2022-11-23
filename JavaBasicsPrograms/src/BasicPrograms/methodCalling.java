package BasicPrograms;

class Demo1 {

	public void setName(String s) {
		System.out.println(s);
	}

	public static void m1() {
		System.out.println("calling m1 method");
	}
}

public class methodCalling {

	public static void main(String[] args) {
		
		m2();
		Demo1 d=new Demo1();	
		d.setName("kumar");//d=new Demo1()
		Demo1.m1();

	}

	public static void m2() {
		System.out.println("calling from m2");
	}
}
