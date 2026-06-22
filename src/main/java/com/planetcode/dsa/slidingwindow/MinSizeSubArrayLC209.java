package com.planetcode.dsa.slidingwindow;

public class MinSizeSubArrayLC209 {

    public int minSubArrayLen(int target, int[] arr) {

        int i = 0, j = 0, currentSum = 0, len = 0, minLen = Integer.MAX_VALUE, n = arr.length;

        while(j < n){
            currentSum += arr[j];
            while(currentSum >= target){
                minLen = Math.min(minLen, j - i + 1);
                currentSum -= arr[i++];
            }
            j++;
        }
        return minLen == Integer.MAX_VALUE ? 0: minLen;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        MinSizeSubArrayLC209 lc209 = new MinSizeSubArrayLC209();
        System.out.println(lc209.minSubArrayLen(target, nums));
    }
}
