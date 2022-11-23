package methods;
class A{
	
	public void car() {
		System.out.println("car started with zero pra");
	}	
	public void car(int i) {
		System.out.println("car started with one int par");
	}
	public void car(int a,int b) {
		int c=a+b;
		System.out.println(c);
		System.out.println("car started with two pra a,b int");
	}
	public void car(String s) {;
		String s1="vijay";
		
		System.out.println("car started with String ");
		System.out.println(s1+" "+s);
	}
	
}
public class MethodOverloding {

	public static void main(String[] args) {
		A a = new A();
		a.car();
        a.car("kumar");
        a.car(2, 4);
	}

}
