package HELLO;
/*
public class arrayrepeated {
	  public static void main(String[] args) 
	    {
	        RepeatElement repeat = new RepeatElement();
	        int arr[] = {4, 2, 4, 5, 2, 3, 1};
	        int arr_size = arr.length;
	        repeat.printRepeating(arr, arr_size);
	    }

		 void printRepeating(int arr[], int size) 
		    {
		        int i, j;
		        System.out.println("Repeated Elements are :");
		        for (i = 0; i < size; i++) 
		        {
		            for (j = i + 1; j < size; j++) 
		            {
		                if (arr[i] == arr[j]) 
		                    System.out.print(arr[i] + " ");
		            }
		        }
		    }
		 
		  
		
	}*/

public class arrayrepeated {
	  public static void main(String[] args) 
	    {
	        int[] my = {1, 2, 5, 5, 6, 6, 7, 2};
	 
	        for (int i = 0; i < my.length-1; i++)
	        {
	            for (int j = i+1; j < my.length; j++)
	            {
	                if ((my[i] == my[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+my[j]);
	                }
	            }
	        }
	    }    
	}
