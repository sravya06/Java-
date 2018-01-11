package project1;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country ="India";
		String region ="South";
		String state ="Andhra";
		String area= "coastal Area";
		
		if(country=="India")
		{
			if(region == "South")
			{
				if(state == "Andhra")
				{
					if(area == "coastal Area")
					{
						System.out.println("He is from Andhra costal part of India");
					}
					else
					{
						System.out.println("not from costal area of Andhra");
					}
				}
				else
				{
					
					System.out.println("He dont belong to Andhra");
				}
			}
			else
			{
				System.out.println("Not from South");
			}
			
		}
		else	
		{
			System.out.println("Not from India");
		}
	}

	}