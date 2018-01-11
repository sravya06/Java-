package project1;

public class Whiledowhile {

	public static void main(String[] args)
	{
	
		int i=1,j,count=0;
		j=8;
		while(i<=j)
		{
			if(j%i == 0)
			{
				count++;
			}
			i++;
		}
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