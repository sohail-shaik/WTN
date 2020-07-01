package loopsandstatements;

public class Checkcmdarg {
	public static void main(String[] args) {
		
		if(args.length==0) {
			System.out.println("No values");
		}
		else {
			for(String i : args) {
				if(i==args[0]) {
					System.out.print(i);
				}
				else {
				System.out.println(","+i);
				}
			}
			
			
		}
	}

}
