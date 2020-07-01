package loopsandstatements;

public class Gender_6 {
	public static void main(String[] args) {
		String s1=args[0];
		int a=Integer.parseInt(args[1]);
		if(s1.equals("female")) 
		{
				if(a>=1 && a<=58)
				{
					System.out.println("the percent of interest is 8.2%");
				}
				else if(a>=59 && a<=100)
				{
					System.out.println("the percent of interest is 9.2%");
				}
		}
		if(s1.equals("male")) 
		{
			if(a>=1 && a<=58)
			{
				System.out.println("the percent of interst is 8.4%");
			}
			else if(a>=59 && a<=100)
			{
				System.out.println("the percent of interest is 10.5%");
			}
		}
		if(!s1.equals("female") &&  !s1.equals("male"))
		{
			System.out.println("Invalid Gender");
		}
		if(a<1 && a>100)
		{
			System.out.println("Invalid age");
		}
	}
}

