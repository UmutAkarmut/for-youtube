import java.util.Scanner;

public class LoopsExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi: ");
		int number1 = scan.nextInt();
		System.out.println("sayi: ");
		int number2 = scan.nextInt();
		int bolenler = 0;		
		for(int i = 1; i <= number1 && i <= number2 ; i++) {
			if(number1 % i == 0 && number2 % i == 0) {
				if(i > bolenler) {
					bolenler = i;
					
				}
			}			
		}
		System.out.println(bolenler);
		
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Height :");
		int height = scan2.nextInt();
		
		System.out.println("width: ");
		int width = scan2.nextInt();
		int starCount = 0;
		int bosluk1 = 0;
		
		for(int i=1; i <= height ;i++ ) {
			System.out.print("|");
			OUTER_LOOP:
			for(int j =1; (j <= width); j++ ) {
				if(j == i) {
					System.out.print("*");
					starCount++;
					
					
				}
				
				System.out.print(" ");

			}
			
			System.out.println("|");
		}
	}
	
}
