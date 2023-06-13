import java.util.Scanner;

public class DigitHesaplama {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0-1000 arasýnda Sayý girin ");
		
		int sayi = scan.nextInt();
		int bolum = sayi/100;
		int kalan = sayi/100;
		int kalan1 =sayi / 100 % 10;
		int bos = sayi % 10;
		int toplam =bolum+kalan;
		
		System.out.println(bolum+kalan1+bos);
		//System.out.println(
				
				//(sayi /1000) ?
						
						
				
				
				
		//		);
		
		
		
	}
}
