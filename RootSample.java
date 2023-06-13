import java.util.Scanner;

public class RootSample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Denklemin köklerini sýrasý ile veriniz. ilk olarak \"b\" : ");
		double b = scan.nextInt();
		
		System.out.println("ikinci olarak \"a\" : ");
		double a =scan.nextInt();
		
		System.out.println("Son olarak \"c\" : ");
		double c = scan.nextInt();
		
		double determinant = ( b*b )-(4*a*c);
		
		double kok1 = (-b+(determinant*1/2))/2*a;
		double kok2= (-b-(determinant*1/2))/2*a;
		
		System.out.println(" determinant : "+ determinant);
		System.out.print (
				(determinant>0) ?  (" kok 1: "+ kok1 + "kok 2: " + kok2+"ffff")
				:
				(determinant==0) ?
					("x1 = x2 = "+(-b)/2*a)
				:
					"reel yok"
		
		
		);
		

	}

}
