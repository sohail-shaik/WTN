package loopsandstatements;

public class PrimeRange_13 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		for(int i=2;i<b;i++)
		{
			if(a%i==0)
			{
				a++;
			}
			else 
			{
				System.out.println(a);
			}
		}
	}

}
