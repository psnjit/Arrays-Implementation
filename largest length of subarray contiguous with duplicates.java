/* Java program to find length of the largest subarray which has 
all contiguous elements but the array may contain duplicates*/

//https://www.geeksforgeeks.org/length-largest-subarray-contiguous-elements-set-2/

//idea is to go like length of largest subarray which can be arranged like contiguous but use a hashset to make sure that duplicates are not there in the subarray

// time- O(n2), space O(n)

import java.util.*; 

class Main 
{ 
	// This function prints all distinct elements 
	static int findLength(int arr[], int n) 
	{ 
      int count=0;
		for(int i=0; i<n-1; i++)
        {
          HashSet<Integer> hs= new HashSet<>();
          hs.add(arr[i]);
          int max=arr[0];
          int min=arr[0];
          for(int j=i+1; j<n; j++)
          {
            if(hs.contains(arr[j]))
               break;
            hs.add(arr[j]);
            if(arr[j]<min)
               min=arr[j];
             else
               if(arr[j]>max)
               max=arr[j];
               if((max-min) == (j-i))
               	count=(int)Math.max(count, (j-i+1));
           }
         }  
      return count;
	} 

	// Driver method to test above method 
	public static void main (String[] args) 
	{ 
	int arr[] = {10, 12, 12, 10, 10, 11, 10}; 
	System.out.println("Length of the longest contiguous subarray is " + 
						findLength(arr, 7)); 
	} 
} 
