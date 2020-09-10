//gfg- https://www.geeksforgeeks.org/length-largest-subarray-contiguous-elements-set-1/
//Idea is if max-min is equal to length of subarray and contains no duplicates, then each number must be contiguous.
//eg- 7 9 5 6 8 0 3, from 0 to 4, max(9)-min(5)=(4-0), max length is <j-i+1>(4-0+1) 
// time- O(n2), space O(1)

class LargestSubArray2 
{ 
	public static int findLength(int arr[], int n)
    {
     int count=0;
      for(int i=0; i<n-1; i++)
      {
        int min=arr[i], max=arr[i];
        for(int j=i+1; j<n; j++)
        {
          if(arr[j]>max)
            max=arr[j];
          else
            if(arr[j]<min)
              min=arr[j];
          if((max-min)==(j-i))
            count=(int)Math.max(count, (j-i+1));
        }
      }
        return count;
    }

	public static void main(String[] args) 
	{ 
		LargestSubArray2 large = new LargestSubArray2(); 
		int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45}; 
		int n = arr.length; 
		System.out.println("Length of the longest contiguous subarray is "
				+ large.findLength(arr, n)); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 
