
public class NumberUtil {
	public static void main(String[] args) {
		System.out.println(maxInt(11, 9));
		System.out.println(minInt(4, 11));
		
		int[] numbers = new int[2];
		System.out.println(numbers);
		
	}
	
	public static int maxInt(int i, int j) {
		return i > j ? i : j ;
	}
	
	public static int minInt(int i, int j) {
		return i < j ? i : j ;
	}
}
