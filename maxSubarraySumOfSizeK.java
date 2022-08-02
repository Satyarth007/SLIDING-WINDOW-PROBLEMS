
public class maxSubarraySumOfSizeK {
	public static int maxWindowSumOfK(int arr[],int k) {
		int i=0;
		int j=0;
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		while(j<arr.length) {
			currSum+=arr[j];
			if(j-i+1<k) {
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
		// TODO Auto-generated method stub
		int arr[]= {2,5,1,8,2,9,1};
		int k=3;
		int maxSum=maxWindowSumOfK(arr,k);
		System.out.println(maxSum);
	}

}
