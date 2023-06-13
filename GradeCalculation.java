import java.util.Scanner;

public class NotHesaplama {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. notunuzu girin: ");
		int note1 = scan.nextInt();
		
		System.out.println("2. notunuzu girin: ");
		int note2 = scan.nextInt();
		
		System.out.println("3. notunuzu girin: ");
		int note3 = scan.nextInt();
		
		int result = (note1+note2+note3)/3;
		
		if(result >=90) {
			System.out.println("A");
		}else if(result >= 80 && result <90) {
			System.out.println("B");
		}else if(result >=60 && result <80) {
			System.out.println("C");
		}else if(result >= 50 && result <60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	
	
	


}
