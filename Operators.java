import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		/*
		 * +
		 * -
		 * *
		 * %
		 */
	
	//int a=45-21;
	//byte a1=72;
	//byte a2=52;
	//int result=a1-a2;
	
	//byte multiply=5;
	//byte multiply2=7;
	//int resultMultiply=multiply*multiply2;
	//int mod=+(-10%4);
	//System.out.println(mod);
	
	
	
	
	//int operand1=10;
	//int operand2=4;
	
	
	//perand1*=operand2;
	//operand1-=operand2;o
	//operand1 += operand2;
	//System.out.println(operand1);
	
	//Scanner scan = new Scanner(System.in);
	//System.out.println("Can you convert Fahrein to celcium? ");
	//int cell =scan.nextInt();
	//double fahrToCell=(cell-32)/1.8;
	//System.out.println("My fahr is "+fahrToCell);
	
	
	
		
		
		
		long a = Long.MAX_VALUE;
		long b =-63;
		long result = a << b;
		System.out.println(result);
		
		
	Scanner newScan = new Scanner(System.in);
	System.out.println("sayý girin: ");
	int number1 = newScan.nextInt();
	System.out.println("sayý girin: ");
	int number2 = newScan.nextInt();
	boolean bval = number1 > number2;
	System.out.println("first number greater than second number [ "+bval+" ]");	
	
	boolean bval2 = number1 >= number2;
	System.out.println("first number greater or equal than second number [ "+bval2+" ]");
	
	boolean bval3 = number1 < number2;
	System.out.println("first number less than second number [ "+bval3+ "]");	
	
	boolean bval4 = number1 <= number2;
	System.out.println("first number less or equal than second number [ "+bval+" ]");	
	
	
	
	
	System.out.println(Float.POSITIVE_INFINITY <= 5.0);
	
	
	
	
	
	
	
	


	}
	
}
