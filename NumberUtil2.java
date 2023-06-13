
public class NumberUtil2 {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(4544));
	}
	
	
	
	public static boolean isPalindrome(int sayi) {
		
		return sayi == reverse(sayi);
	}
	
	public static int reverse(int sayi) {
		
		int reversed = 0;
		while(sayi != 0) {
			reversed = reversed * 10 + sayi %10;
			sayi /= 10;
		}
		return reversed;
		
	}
}
