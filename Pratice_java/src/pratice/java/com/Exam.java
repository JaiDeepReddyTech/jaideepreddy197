package pratice.java.com;
class Exam1{
	int a=30;
	Exam1(int a){
		this.a=a;
	}
    public void dis(){
        System.out.println(a);
    }
}
class Exam2 extends Exam1{
		Exam2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
		int b;
	void dem() {
		System.out.println(b);
	}
	
}
class Exam {
    public static void main(String[] args) {
        Exam1 t=null;
        t.dis();
    }
}