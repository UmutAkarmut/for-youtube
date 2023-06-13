import java.util.Random;
import java.util.Scanner;

public class RandomCharacter {
		public static void main(String[] args) {
			next();
		}

	public static char next() {
		
		
		
		return next();
	}
	
	public static char next(char from, char to) {
		
		Random random = new Random();
        int range = to - from + 1;
        int ascii = random.nextInt(range) + from;
        return (char) ascii;
	}
	
	public static char nextLower() {
		
		return next('a','z');
	}
	
	public static char nextUpper() {
		return next('A','Z');
	}

}
