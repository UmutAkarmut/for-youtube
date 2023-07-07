 public static int[] frequenciesAlphabet(char[] arr) {   	
    	int[] frequencies = new int[26];
    	for(int i = 0; i < arr.length; i++) 
    		++frequencies[arr[i] - 'a']; 
    	 return frequencies;
    
    
    }
    
    public static void printCharFrequencies(int[] arr) {
    	for(int i = 0; i < arr.length; i++) {
    		if(i % 10 == 0)System.out.println();
    		System.out.printf("%c (%d) -- ", i + 'a' ,arr[i]);
    	}
    }
    public static char next(char from, char to) {
    	return (char)(from + (Math.random() * (to - from + 1))); 
    }
    public static char nextLowerChar() {
    	return next('a', 'z'); 
    }
    
    public static char[] generateCharArray(int size) {
    	char[] chars = new char[size];
    	for(int i = 0; i < size; i++) 
    		chars[i] = nextLowerChar();
    	return chars;
    }
    
    public static void print(char[] arr) {
    	System.out.print("[");
    	for(int i = 0; i < arr.length; i++) {
    		if(i != arr.length-1) {
    			System.out.print(arr[i] + " , ");
    		}else {
    			System.out.print(arr[i]);
    		}
    	}
    	System.out.println("]");
    }
   
