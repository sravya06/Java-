package project1;

public class palindrome {

	public static void main(String[] args) 
	{
		int r,sum=0,temp;    
		  int n=151;
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r; 
		   n=n/10;  
		  }    
		  if(temp==sum)   
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		
	}

}

/*n=151     temp=151
151>0  ???? true
151%10 ==1    ===r
sum=0
sum=0*10)+1 ---1
n/10---151/10----15----n


n-15
15>0  ?????? true
		15%10 ===5 ---r
		sum=1
		sum=(1*10)+5 ---15
		n/10--15/10---1
	
		n=1
		1>0   ????? true
1%10 ---1-----r
sum=15
sum=(15*10)*/

