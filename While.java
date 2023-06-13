import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	/*	System.out.println("Hesaplamak istediðiniz sayýyý giriniz : ");
		
		int number = scan.nextInt();

		
		int count = 0;
		while(number != 0) {
			number = number / 10;
			count++;
			
		}
		System.out.println("basamak sayýsý : "+ count);
		int a = 20;
		
		int math = (int) Math.log10(a);
		System.out.println(math);	
		
		*/
		
		
		//for (char harf = 'a'; harf <= 'z'; harf++) {
	      //      System.out.println(harf + " ");
	        //}
	        
		
		
		
	       
		System.out.println("sayý : ");
		int number = scan.nextInt();
		
		int newNumber = 0;
		int kalan = 0;
		
		while(number !=0) {
			
			kalan = number % 10;
			number /=10;
			
			newNumber = kalan * 10 ;
			
			
			
			
			
			
			
		}
		System.out.println(newNumber);
		
		
			
		

		
		
		 
	}
}
