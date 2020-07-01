package loopsandstatements;

public class Reversenumbr_16 {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int rev=0;
		while(a!=0) {
			int rem = a % 10;
			rev = rev * 10 + rem ;
			a = a / 10;
		}
		System.out.println(rev);
	}

}
