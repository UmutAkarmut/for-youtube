import java.util.Scanner;

public class KacSayiGirdin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int negatif = 0;
		int negatifCount = 0;
		int pozitif = 0;
		int pozitifCount = 0;
		int sayi ;
		int newSayi =0;
		
		
		do {
			System.out.println("sayi gir: ");
			sayi =scan.nextInt();
			if(sayi < 0 ) {
				negatif += sayi;
				negatifCount++;
			}else {
				pozitif +=sayi;
				pozitifCount++;
			}
						
		}while( sayi != 0);
		System.out.println("negatif sayýlar adedi: "+ negatifCount + " negatif toplamý :"+ negatif +
				" pozitif sayýlar adedi: "+ (pozitifCount- 1 ) +" pozitif toplamý :"+ pozitif 	);

	
	}
	
	
	
	
	
	
	
}
