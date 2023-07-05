public class MergeInOrder{
public static int[] mergeInOrder(int[] arr1, int[] arr2) {
    	
    	int[] merged = new int[arr1.length + arr2.length];
    	int arr1Idx = 0;
    	int arr2Idx = 0;
    	int mergedIdx = 0;
    	
    	while(arr1Idx < arr1.length && arr2Idx < arr2.length) {
    		int value1 = arr1[arr1Idx];
    		int value2 = arr2[arr2Idx];
    	
    		if(value1 < value2) {
    			merged[mergedIdx] = value1;
    			arr1Idx++;  			
    			mergedIdx++;
    		}else {
    			merged[mergedIdx] = value2;			
    			arr2Idx++;
    			mergedIdx++;
    		}
    	
    	}
    	while(arr1Idx < arr1.length) {
    		merged[mergedIdx++] = arr1[arr1Idx++];
    	}
    	while(arr2Idx < arr2.length) {
    		merged[mergedIdx++] = arr2[arr2Idx++];
    	}
    	
    	return sort(merged);
    }
}
