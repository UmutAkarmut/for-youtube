

import java.util.Arrays;
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
    
    
    public static boolean search(int[] arr , int key) {
    	
    	for(int i =0; i < arr.length;i++) 
    		if(arr[i] == key) return true;
    	return false;
    }
    
    
  //  public static int[] generateRandomIntArray(int[] arr) {
    	
    	
    	
    	//return ;
    //}
    
    public static int maxInt(int[] arr) {
    	
    	int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    
    public static int[] sort(int[] arr) {
    	
    	for(int i = 0 ; i < arr.length;i++) {
    		 int minIdx = i;
             int min = arr[i];
    		for(int j = i+1; j < arr.length; j++) {
    			if(min > arr[j]) {
    				min = arr[j];
    				minIdx = j;
    			}
    		}
    		if(minIdx != i) {
    			arr[minIdx] = arr[i];
    			arr[i] = min;
    		}
    		
    	}
        
        
        return arr;
    }
    
    public static void binarySearch(int[] arr, int key) {
    	for(int i = 0; i < arr.length; i++) {
    		if(key == arr.length / 2 ) {
    			System.out.println("eþleþme doðru...");
    		}else {
    			
    		}
    	}
    	
    }
    
    public static void println(int[] arr) {
    	
    	System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
        	
            	System.out.print(arr[i] + " ");           
        }
        System.out.println("]");
    }
    
    
    public static void reverseArray(int[] arr) {
    	int[] reversedArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }

        System.out.print("Dizinin tersten yazýlýþý: ");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    
    }
    /*
     * for(int i = 0; i < arr.length; i++) {
    		if(arr[i] > arr[i + 1]) {
        		return true;
        	}else if(arr[i] < arr[i + 1]) {
        		return true;
        	}
    	}
    	return false;
     */
    
   /* public static boolean isSort(int[] arr) {
    	int sortCount = 0;
    	for(int i = 0; i < arr.length; i++) {
    		
    		for(int j = i+1; j < arr.length;j++) {
    		if(arr[i] > arr[j]) {
    			
    			System.out.println(sortCount);
    			System.out.println("arri"+arr[i]);
    			System.out.println("arrj"+arr[j]);
    			sortCount++;
    			arr[i] = arr[j];
    			
    			
    		}else break;

    	}
 	
    }
    	return sortCount == arr.length-1 ? true : false;
    	
    }
*/
    public static boolean isSmallToLarge(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        return true; 
    }
    
    public static boolean isLargeToSmall(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
            	
                return false; 
            }
        }
        return true; 
    }
    
    public static void isCheckSort(int arr[]) {
    	if(isLargeToSmall(arr) == true) System.out.println("büyükten küçüðe sýralý");
    	else if(isSmallToLarge(arr) == true) System.out.println("küçükten büyüðe sýralý");
    	else System.out.println("sýralý deðil");
    }




}
    
    
    
    
    
    
    
    
    
    
    
    

