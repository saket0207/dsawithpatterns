package com.planetcode.dsa.twopointers;

import java.util.Arrays;

public class ThreeSumLC16 {

    public int threeSumClosest(int[] nums, int target) {

        //Question of Arrays
        //Find Triplet
        //sorting can help
        Arrays.sort(nums); //{-4, -1, 1, 2} target = 1
        // 1 + 4 = 5
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int resultSum = 0;
        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int lo = i + 1, hi = n - 1;
            while(lo < hi){

                int sum = nums[i] + nums[lo] + nums[hi];
                int diff = Math.abs(target - sum);
                if(diff < min){
                    min = diff;
                    resultSum = sum;
                }
                if(sum == target){
                    lo++;
                    hi--;
                }else if(sum < target){
                    lo++;
                }else{
                    hi--;
                }
            }
        }
        return resultSum;

    }

    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        ThreeSumLC16 sumLC16 = new ThreeSumLC16();
        System.out.println(sumLC16.threeSumClosest(nums, target));

    }
}
