import java.util.Scanner;

public class UcDigitliPalindrome {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		
		System.out.print("sayý girin: ");
		int isPalindrome = scan.nextInt();
		
		int n1 = isPalindrome / 100 ;
		int n3 = isPalindrome % 10 ;
		
		
		if(n1==n3 ) {
			System.out.println("palindrome");
		}else {
			System.out.println("not  palindrome");
		}
		*/
		
		/*int i = 2;
		 switch(i) {
		 
		 
		 case 1:{
			 System.out.println("1");
			 break;
			 
		 }
		
		
		 case 3:{
			 System.out.println("2");
			 break;
		 }
		 default : {
			 System.out.println("default");
			 break;
			 
		 }
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("harf giriniz: ");
		
		String c = scan.nextLine();
		
		switch(c) {
		case "a":{
			System.out.println("ünlü harf");
			break;
		}
		case "e":{
			System.out.println("ünlü harf");
			break;
		}
		case "i":{
			System.out.println("ünlü harf");
			break;
		}
		case "o":{
			System.out.println("ünlü harf");
			break;
		}
		case "u":{
			System.out.println("ünlü harf");
			break;
		}
		case "I":{
			System.out.println("ünlü harf");
			break;
		}
		default : {
			System.out.println("ünsüz harf.");
			break;
			
		}
		case "ý" : {
			System.out.println("ingiliz alfabesinde karþýlýðý yoktur: "+c);
			break;
		}
		case "ö": {
			System.out.println("ingiliz alfabesinde karþýlýðý yoktur: "+c);
			break;
		}
		case "ü": {
			System.out.println("ingiliz alfabesinde karþýlýðý yoktur: "+c);
			break;
		}
		case "ð": {
			System.out.println("ingiliz alfabesinde karþýlýðý yoktur: "+c);
			break;
		}
		case "ç": {
			System.out.println("ingiliz alfabesinde karþýlýðý yoktur: "+c);
			break;
		}
		case "þ": {
			System.out.println("ingiliz alfabesinde karþýlýðý yoktur: "+c);
			break;
		}
		
		
 
		 }
	}

}
