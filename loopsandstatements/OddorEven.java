package loopsandstatements;

public class OddorEven {
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++) {
		int a=Integer.parseInt(args[i]);
		if(a%2==0)
		{
			System.out.println(a + " is even number");
		}
		else {
			System.out.println(a +" is odd number");
			}
		}
	}
	
}
