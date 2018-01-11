package project1;

public class methodsexamplemain {

public static void main(String[] args) {
		
		methodsexample m1=new methodsexample();
		m1.a=20;
		m1.b=30;
	    int d = m1.add();
	    System.out.println(d);
	    m1.sub(99,77);
	    m1.mul();
	    d=m1.div(100,8);
	    System.out.println(d);
	}
}
