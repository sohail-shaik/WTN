package loopsandstatements;

public class PrimeorNot {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		boolean flag=false;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(a +" is a prime number");
		}
		else {
			System.out.println(a +" is not a prime number");
		}
	}

}
