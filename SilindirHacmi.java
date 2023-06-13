import java.util.Scanner;

public class SilindirHacmi {
	public static void main(String[] args) {
		
		

		
		Scanner scan = new Scanner(System.in);

		System.out.print("silindirin yüksekliðini girin: ");
		double yukseklik = scan.nextDouble();

		System.out.print("silindirin yarýçapýný girin: ");
		double yaricap = scan.nextDouble();

		double hacim = Math.PI * Math.pow(yaricap, 2) * yukseklik;
		System.out.print("silindirin hacmi: " + hacim);
	}
	
	
	
	

}
