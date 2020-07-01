package loopsandstatements;


public class posneg {
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++)
		{
			int temp=Integer.parseInt(args[i]);
			if(temp==0)
			{
				System.out.println(temp+" is neither negative nor positive");
			}
			else if(temp>0)
			{
				System.out.println(temp+" is positive");
			}
			else {
				System.out.println(" An integer number as argument is expected");
			}
		}
	}

}
