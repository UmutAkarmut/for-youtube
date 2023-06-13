import java.util.Scanner;

public class WithIFELSE {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("b: ");
		double b = scan.nextDouble();
		
		System.out.println("a: ");
		double a = scan.nextDouble();
		
		System.out.println("c: ");
		double c = scan.nextDouble();
		 
		double delta = Math.pow(b, 2)-4*a*c;
		
		if(delta > 0) {
			double x1 = (-b+(delta*1/2))/2*a;
			double x2= (-b-(delta*1/2))/2*a;
			System.out.println("x1: "+x1+" x2: "+x2);
			
			
		}else if(delta ==0) {
			double x = (-b)/(2*a);
			
		}else {
			System.out.println("reel sayý kök yok");
		}
		
	}
}
