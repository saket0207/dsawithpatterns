package com.dsa.slidingwindow;

public class MaxSumSubArrGFG {

    public int maxSubArraySum(int[] arr, int k) {
        // Code here

        int i = 0, j = 0, sum = 0, maxSum = 0;
        while(j < k){
            sum += arr[j++];


        }
        int n = arr.length;
        if(sum > maxSum){
            maxSum = sum;
        }

        while(j < n){
            sum = sum - arr[i] + arr[j];
            if(sum > maxSum){
                maxSum = sum;
            }
            i++;
            j++;

        }
        return maxSum;
    }

    public static void main(String[] args) {

        int [] arr = {100, 200, 300, 400};
        int k = 2;
        MaxSumSubArrGFG maxSumSubArr = new MaxSumSubArrGFG();
        System.out.println(maxSumSubArr.maxSubArraySum(arr, k));
    }
}
