import java.util.Scanner;

public class GunHesaplama {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[0-6] arasý sayý giriniz: " );
		
		byte number = scan.nextByte();
		
		switch(number % 7) {
		
		case 0:{
			System.out.println("pazartesi "+"haftaiçi");
			break;
		}
		case 1:{
			System.out.println("salý "+"haftaiçi");
		}
		case 2:{
			System.out.println("çarþamba "+"haftaiçi");
		}
		case 3:{
			System.out.println("perþembe "+"haftaiçi");
		}
		case 4:{
			System.out.println("cuma "+"haftaiçi");
			break;
		}
		case 5:{
			System.out.println("cumartesi "+"haftasonu");
		}
		case 6:{
			System.out.println("pazar "+"haftasonu");
		}
		
		
		
		}
		
		
	}

}
