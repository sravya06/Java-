package project1;

public class methodsexample {

	int a,b,c;
	public int add()  //int- indicates returns Integer values
	{
		c = a+b;
		//System.out.println("vale of Addition is : "+c);
		return c;    // Return-- is a Keyword
	
	}
	
	public void sub(int x,int y)
	{
		c=x-y;
		System.out.println("substraction is : "+c);
	}
	public void mul()  //without args & without return type
	{
		c= a*b;
		System.out.println("multiplication is :" +c);
	}
	public int div(int x,int y)//with return type &with args
	{
		c=x/y;
		return c;
	}
}