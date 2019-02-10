import java.util.Scanner;
public class Bubblesort {

	public static void main(String[] args) {
		int a, h, u, swap;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input number of integers to sort");
	    a = in.nextInt();
	 
	    int array[] = new int[a];
	 
	    System.out.println("Enter " + a + " integers");
	  for (h = 0; h < a; h++) {
	      array[h] = in.nextInt();
	    }
	    for (h = 0; h < ( a - 1 ); h++) {
	      for (u = 0; u < a - h - 1; u++) {
	        if (array[u] > array[u+1]) /* For descending order use < */
	        {
	          swap       = array[u];
	          array[u]   = array[u+1];
	          array[u+1] = swap;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of numbers:");
	 
	    for (h = 0; h < a; h++)
	      System.out.println(array[h]);
	  }
		     
	 

	}


