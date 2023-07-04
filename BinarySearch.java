pblic class BinarySearch{

public static int binarySearch(int[] arr, int key) {
    	
    	if(key == arr[arr.length / 2]) return arr.length / 2;
    	else {
    		if(key > arr[arr.length / 2]) {
    			for(int i = arr.length/2; i < arr.length; i++) if(key == arr[i]) return i;
    		}else {
    			for(int i = arr.length / 2; i <= 0; i--) if(key == arr[i]) return i;		
    		}
    	} 	    	   	
    	return -1;
    }
}
