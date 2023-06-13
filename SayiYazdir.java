import java.util.Scanner;

public class SayiYazdir {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("sayı: ");
		
		int number = scan.nextInt();
		
		while(number > 0) {
			
			System.out.print(number+ ", ");
			number--;
		}

	}

}
