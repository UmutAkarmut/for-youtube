import java.util.Scanner;

public class Samples {

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("1. sayýyý girin: ");
        int sayi1 = scan.nextInt();

        System.out.println("2. sayýyý girin: ");
        int sayi2 = scan.nextInt();

        System.out.println("3. sayýyý girin: ");
        int sayi3 = scan.nextInt();

        int enKucuk, orta, enBuyuk;

        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            enKucuk = sayi1;
            if (sayi2 <= sayi3) {
                orta = sayi2;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi2;
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            enKucuk = sayi2;
            if (sayi1 <= sayi3) {
                orta = sayi1;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi1;
            }
        } else {
            enKucuk = sayi3;
            if (sayi1 <= sayi2) {
                orta = sayi1;
                enBuyuk = sayi2;
            } else {
                orta = sayi2;
                enBuyuk = sayi1;
            }
        }

        System.out.println("Sýralama: " + enKucuk + " < " + orta + " < " + enBuyuk);
        
        
        
        Scanner kb = new Scanner(System.in);
        System.out.println("sayý: ");
        int number = scan.nextInt();
        
        
        int kalan = 0;
        int yeni =0;
        
        
        
        while(number != 0) {
        	
        	kalan = number % 10;
        	yeni = yeni * 10 + kalan;
        	
        	number /= 10;
        	
        }
        
        System.out.println("Tersten yazýlýþý : "+ yeni);
        */
        Scanner scan2 = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi2 = scan2.nextInt();
        int sayac = 0;
        int asal;
         
        for(int i = 2; i < sayi2; i++)
        {
            if((sayi2 % i == 0)) {
                sayac++;
                System.out.println("sayý : " + sayi2);
            }
            if(sayac == 0) {
                System.out.println(sayi2 + " Asal bir sayidir.");
       
            }
        }
        
        
       
        
        
        
        
    	   
    		
    	  
    	        Scanner scanner = new Scanner(System.in);

    	        System.out.print("Bir sayý girin: ");
    	        int sayi = scanner.nextInt();

    	        for (int i = 1; i <= sayi*2-1; i += 2) {
    	            for (int j = 1; j <= sayi*2-1-i ; j+=2) {
    	                System.out.print(" ");
    	            }
    	            for (int k = 1; k <= i; k++) {
    	                System.out.print("*");

    	            }
    	            System.out.println();
    	        }

    	        for (int i = sayi*2-1 - 2; i >= 1; i -= 2) {
    	            for (int j = 1; j <= sayi*2-1 - i; j += 2) {
    	                System.out.print(" ");
    	            }
    	            for (int j = 1; j <= i; j++) {
    	                System.out.print("*");
    	            }
    	            System.out.println();
    	        }
    	        
    	        
    	        
    	        
    	        Scanner scan4 = new Scanner(System.in);
    	       
    	        System.out.println("height : ");
    	        int height = scan4.nextInt();
    	        
    	        System.out.println("width : ");
    	        int width = scan4.nextInt();
    	        
    	        for(int i = 0; i <= height;i++) {
    	        	
    	        	
    	        	
    	        }
    	        Scanner kb = new Scanner(System.in);
    	        System.out.println("sayý: ");
    	        int number = kb.nextInt();
    	        
    	        
    	        int kalan = 0;
    	        int yeni =0;
    	        
    	        
    	        
    	        while(number != 0) {
    	        	
    	        	kalan = number % 10;
    	        	yeni = yeni * 10 + kalan;
    	        	
    	        	number /= 10;
    	        }
    	        System.out.println(yeni);
    	        
    	        
    	        
    	        
    	        
    	        
    	        
        
    }

}
