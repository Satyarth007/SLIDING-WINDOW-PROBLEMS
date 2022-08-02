
public class maxSubarraySumOfSizeK {
	public static int maxWindowSumOfK(int arr[],int k) {
		int i=0;	// start
		int j=0;	//end
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		while(j<arr.length) {
			currSum+=arr[j];
			if(j-i+1<k) {          // window size will be ->  K = j-i+1
				j++;
			}
		else if(j-i+1==k) {
			maxSum=Math.max(maxSum, currSum);
			currSum-=arr[i];
			i++;
			j++;
		}
		
	}
		return maxSum;
	}

	public static void main(String[] args) {
		// BASIC SWT QUESTION 
		// In this we have an array in which we need to find the max sum of subarrays of array of particualr length .i.e window.
		int arr[]= {2,5,1,8,2,9,1};    // given array
		int k=3;			// window size 
		
		int maxSum=maxWindowSumOfK(arr,k);
		System.out.println(maxSum);  // max sum
	}

}
