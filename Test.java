
public class Test {

	public static void main(String[] args) {
		
		int[][] matrix = RandomArrayGenerator.generateRandomIntArrayMulti(3, 10, 20);
		RandomArrayGenerator.print(matrix);
		
		System.out.println();
		
		int [] arr = RandomArrayGenerator.generateRandomIntArray(10);
		RandomArrayGenerator.print(arr);
		RandomArrayGenerator.sumOfArray(arr);
		
	}

}
