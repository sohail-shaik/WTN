package loopsandstatements;

public class UpperLower_7 {
	public static void main(String args[]) {
		String s=args[0];
		char ch=s.charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println(s.toUpperCase());
		}
		else
		{
			System.out.println(s.toLowerCase());
		}
	}
	
}
