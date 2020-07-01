package loopsandstatements;

public class Palindrome_18 {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int rev=0;
		int temp=a;
		while(a!=0) {
			int rem = a % 10;
			rev = rev * 10 + rem ;
			a = a / 10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
			System.out.println(temp+" is not a palindrome");
	}


}
