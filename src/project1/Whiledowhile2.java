package project1;

public class Whiledowhile2 {

	public static void main(String[] args) 
	{
	
		int i=1,j,count=0;
		j=5;
		do
		{
			if(j%i == 0)
			{
				count++;
			}
			i++;
		}while(i<=j);
		if (count == 2)
		{
			System.out.println("j is Prime no.");
		}
		else if(count>2)
		{
			System.out.println("j is not prime no.");
		}
	}

}