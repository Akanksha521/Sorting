


public class Insertionsort {
	 void sort(int arr[]) 
	    { 
	        int a = arr.length; 
	        for (int i=1; i<a; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	  
	          
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        } 
	    } 
	  
	   
	    static void printArray(int arr[]) 
	    { 
	        int a = arr.length; 
	        for (int i=0; i<a; ++i) 
	            System.out.print(arr[i] + " "); 
	  
	        System.out.println(); 
	    } 
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6}; 
		  
        Insertionsort ob = new Insertionsort();         
        ob.sort(arr); 
         System.out.println("sorted array:");
        printArray(arr); 
	}

}


