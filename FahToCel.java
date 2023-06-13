import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter number");
		
		
		int fahrToCel = input.nextInt();//-32*5/9

		System.out.println("Fahrein to Cel is: " + fahrToCel);  
	}
	
}
