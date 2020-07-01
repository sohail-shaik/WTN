package loopsandstatements;

public class samelastdigit {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a%10==b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
		
}
