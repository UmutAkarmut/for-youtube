import java.util.Scanner;

public class CylinderVolume {
	public static void main(String[] args) {
		
		

		
		Scanner scan = new Scanner(System.in);

		System.out.print("silindirin yüksekliğini girin: ");
		double yukseklik = scan.nextDouble();

		System.out.print("silindirin yarıçapını girin: ");
		double yaricap = scan.nextDouble();

		double hacim = Math.PI * Math.pow(yaricap, 2) * yukseklik;
		System.out.print("silindirin hacmi: " + hacim);
	}
	
	
	
	

}
