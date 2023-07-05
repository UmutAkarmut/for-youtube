public class BeforeEvenOdds{

public static void swap(int[] arr,int fromIndex,int toIndex) {
		int temp = arr[toIndex];
		arr[toIndex] = arr[fromIndex];
		arr[fromIndex] = temp;
		
	}
    
    public static void beforeEvenOdds(int arr[]) {
    	
    	int evenCount = 0;
    	int oddCount = arr.length - 1;
    	while(evenCount < oddCount){
    		int value = arr[evenCount];
    		if(value % 2 == 0) {
    			evenCount++;
    		}else {
    			swap(arr, evenCount, oddCount);
    			oddCount--;
    		}
    	}
    	
    	
    }
}
