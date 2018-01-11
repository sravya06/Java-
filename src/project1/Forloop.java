package project1;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=0;
		j=7;
		for(i=1; i<=j; i++)
		{
			if(j%i == 0)
			{
				count++;
			}
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
	
