package project1;

public class First 
{
	
	public static int multiply(int a ,int b, int c)
	{
		int result= a * b * c;
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a method
	    int a,b=10,c;
		a=20;c=50;
		final int money=120;
		System.out.println("Addition of a,b is" +(a+b));//30
		System.out.println(money);
		System.out.println(c);
		
		//condition blocks
		if (a>b)
		{
	System.out.println("A is a Big Number");
		}
	else 
	{
		System.out.println("B is a big number");
		}
	
		//Loop blocks
		
		// create object and access methods
	
		int x = multiply(10,20,50);
	    System.out.println(x);
	
	    for(int s=0; s<=10; s++) {
	    	System.out.println(s);
	    }
	    
	    
	}
}

