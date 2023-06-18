

import java.util.Random;
import java.util.Scanner;

public class RandomArrayGenerator {
    public static void print(int[][] arr) {
    	
    	System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
        	System.out.print("[");
            for(int j =0; j < arr[i].length;j++) {
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
    

    public static int[][] generateRandomIntArrayMulti(int size, int from,int to) {
        int[][] array = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
        	
            for(int j = 0; j < size;j++ ) {
            	array[i][j] = from + random.nextInt(to - from);
            }
            
        }

        return array;
    }
    
    public static int[] generateRandomIntArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
        	
           
            array[i] =random.nextInt(100);
                 
        }

        return array;
    }
    public static void print(int[] arr) {
    	
    	System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
        	
            	System.out.print(arr[i] + " ");           
        }
        System.out.println("]");
    }
    
    
    public static void sumOfArray(int arr[]) {
    	double total = 0;
    	for(int i = 0;i <= arr.length;i++) {
    		total += i;
    	}
    	System.out.println("The total of the array is " + total);
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
